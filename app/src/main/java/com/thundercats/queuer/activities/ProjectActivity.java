package com.thundercats.queuer.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.thundercats.queuer.R;
import com.thundercats.queuer.adapters.FeedAdapter;
import com.thundercats.queuer.adapters.ProjectAdapter;
import com.thundercats.queuer.database.ProjectDataSource;
import com.thundercats.queuer.database.TaskDataSource;
import com.thundercats.queuer.models.Project;
import com.thundercats.queuer.models.Task;
import com.thundercats.queuer.views.EnhancedListView;

import java.util.ArrayList;
import java.util.Date;

/**
 * The screen that displays all of the user's {@link com.thundercats.queuer.models.Task}s
 * for a given {@link com.thundercats.queuer.models.Project}.
 * Created by kmchen1 on 1/19/14.
 */
public class ProjectActivity extends ActionBarActivity {

    private final String CHANGE_COLOR_DIALOG_TITLE = "Change Project Color";
    private final String ADD_TASK_DIALOG_TITLE = "New Task";
    private final String EDIT_TASK_DIALOG_TITLE = "Edit Task";
    private final String WARN_DIALOG_TITLE = "Warning";

    /** The {@code Project} that dictates this Activity. */
    private Project project;

    /** The server ID of the {@code Project} that dictates this Activity. */
    private int project_id;

    /** The adapter that controls the list of {@code Task}s under the {@code Project}. */
    private ProjectAdapter adapter;

    // provides list of items for ActionBar drop-down
    private SpinnerAdapter mSpinnerAdapter;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.project, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_add_task:
                showAddTaskDialog();
                return true;
            case R.id.action_change_color:
                showChangeColorDialog();
                return true;
            case R.id.action_hide_project:
                project.setHidden(true);
                NavUtils.navigateUpFromSameTask(this);
                return true;
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            default:
                return true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        // Get project from Intent
        project = getIntent().getParcelableExtra(Project.INTENT_KEY);
        project_id = project.getId();

        // action bar. displays project number. up navigation enabled.
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(project.getTitle());
        actionBar.setDisplayHomeAsUpEnabled(true);

        syncProjectAdapterWithDatabase();

        /*
        // TODO attempting to create ActionBar drop-down
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
        mSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.action_list, R.layout.simple_spinner_dropdown_item);
        actionBar.setListNavigationCallbacks(mSpinnerAdapter, new ActionBar.OnNavigationListener() {
            @Override
            public boolean onNavigationItemSelected(int i, long l) {
                String s = (String) mSpinnerAdapter.getItem(i);
                Toast.makeText(ProjectActivity.this, s, Toast.LENGTH_LONG).show();
                return true;
            }
        });
        Toast.makeText(this, "Project " + project_id + ": " + project.getTitle(), Toast.LENGTH_LONG).show();
        */

        EnhancedListView listView = (EnhancedListView) findViewById(R.id.lv_tasks);
        listView.setAdapter(adapter);

        listView.setDismissCallback(new EnhancedListView.OnDismissCallback() {
            @Override
            public EnhancedListView.Undoable onDismiss(EnhancedListView listView, final int position) {
                final Task task = adapter.getItem(position);
                task.setFinished(true, getApplicationContext());
                syncProjectAdapterWithDatabase();
                //adapter.notifyDataSetChanged();
                return new EnhancedListView.Undoable() {
                    @Override
                    public void undo() {
                        task.setFinished(false, getApplicationContext());
                        syncProjectAdapterWithDatabase();
                        //adapter.notifyDataSetChanged();
                    }
                };
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                showEditTaskDialog(adapter.getItem(position));
            }
        });

        listView.enableSwipeToDismiss();
        listView.enableRearranging();
    }

    /**
     * Re-initializes the adapter with {@code Task}s in the database.
     */
    private void syncProjectAdapterWithDatabase() {
        TaskDataSource taskDataSource = new TaskDataSource(this);
        taskDataSource.open();
        ArrayList<Task> unfinishedTasks = taskDataSource.getUnfinishedTasks(project_id);
        ArrayList<Task> tasks = taskDataSource.getTasks(project_id);
        taskDataSource.close();
        adapter = new ProjectAdapter(this, unfinishedTasks, tasks);
        ((EnhancedListView) findViewById(R.id.lv_tasks)).setAdapter(adapter);
        refreshNoTasksWarning();
    }

    /**
     * Shows/hides the warning depending on whether there are visible projects.
     * Either show the TextView or the ListView, but not both.
     */
    private void refreshNoTasksWarning() {
        TextView warning = (TextView) findViewById(R.id.tv_warning_no_projects);
        EnhancedListView listView = (EnhancedListView) findViewById(R.id.lv_tasks);
        if (adapter.isEmpty()) {
            warning.setVisibility(View.VISIBLE);
            listView.setVisibility(View.GONE);
        } else {
            warning.setVisibility(View.GONE);
            listView.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Pops up a dialog for user to change color.
     * Called from an action bar item being selected.
     */
    private void showChangeColorDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle(CHANGE_COLOR_DIALOG_TITLE);
        View layout = getLayoutInflater().inflate(R.layout.dialog_change_colors, null);
        final Spinner spinner = (Spinner) layout.findViewById(R.id.spinner_change_color);
        alertDialogBuilder
                .setCancelable(true)
                .setView(layout)
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                String color = spinner.getSelectedItem().toString();
                            }
                        })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    /**
     * Pops up the dialog for user to edit a task.
     * Called when user clicks on a task.
     * @param clickedTask The task that was clicked.
     */
    private void showEditTaskDialog(final Task clickedTask) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle(EDIT_TASK_DIALOG_TITLE);
        View layout = getLayoutInflater().inflate(R.layout.dialog_edit_task, null);
        final EditText taskTitle = (EditText) layout.findViewById(R.id.task_name);
        alertDialogBuilder
                .setCancelable(true)
                .setView(layout)
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                String name = taskTitle.getText().toString();
                                if (name.isEmpty()) {
                                    showWarningDialog("Task must have a name.");
                                    return;
                                }
                                clickedTask.setName(name, getApplicationContext());
                            }
                        })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    /**
     * Pops up the dialog for user to add a task.
     * Called from an action bar item being selected.
     */
    private void showAddTaskDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle(ADD_TASK_DIALOG_TITLE);
        final View layout = getLayoutInflater().inflate(R.layout.dialog_new_task, null);
        final EditText taskTitle = (EditText) layout.findViewById(R.id.task_name);
        alertDialogBuilder
                .setCancelable(true)
                .setView(layout)
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                String name = taskTitle.getText().toString();
                                if (name.isEmpty()) {
                                    showWarningDialog("Task must have a name.");
                                    return;
                                }
                                Task task = new Task(getApplicationContext(), name, project_id, 0);
                                adapter.insert(task, 0);
                                syncProjectAdapterWithDatabase();
                                refreshNoTasksWarning();
                            }
                        })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    /**
     * Shows user a dialog, reminding them to fill out all fields with appropriate values.
     */
    private void showWarningDialog(String warning) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle(WARN_DIALOG_TITLE);
        View layout = getLayoutInflater().inflate(R.layout.dialog_blank, null);
        alertDialogBuilder
                .setMessage(warning)
                .setView(layout)
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {}
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }


}