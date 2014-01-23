package com.thundercats.queuer.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.thundercats.queuer.R;
import com.thundercats.queuer.adapters.ProjectAdapter;
import com.thundercats.queuer.models.Project;
import com.thundercats.queuer.models.Task;
import com.thundercats.queuer.views.EnhancedListView;

import java.util.ArrayList;

/**
 * The screen that displays all of the user's {@link com.thundercats.queuer.models.Task}s
 * for a given {@link com.thundercats.queuer.models.Project}.
 * Created by kmchen1 on 1/19/14.
 */
public class ProjectActivity extends ActionBarActivity {

    private final String CHANGE_COLOR_DIALOG_TITLE = "Change Project Color";
    private final String ADD_TASK_DIALOG_TITLE = "New Task";
    private final String EDIT_TASK_DIALOG_TITLE = "Edit Task";

    private Project project;
    private int project_id;
    private ArrayList<Task> tasks = new ArrayList<Task>();
    private ProjectAdapter adapter;

    /**
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        project = getIntent().getParcelableExtra(Project.INTENT_KEY);
        project_id = project.getId();

        // Set the action bar to display the project number.
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(project.getTitle());
        Toast.makeText(this, "Project " + project_id + ": " + project.getTitle(), Toast.LENGTH_LONG).show();

        EnhancedListView listView = (EnhancedListView) findViewById(R.id.lv_tasks);
        adapter = new ProjectAdapter(this, tasks);
        listView.setAdapter(adapter);

        refreshNoTasksWarning();

        listView.setDismissCallback(new EnhancedListView.OnDismissCallback() {
            @Override
            public EnhancedListView.Undoable onDismiss(EnhancedListView listView, final int position) {
                final Task task = adapter.getItem(position);
                adapter.remove(position);
                return new EnhancedListView.Undoable() {
                    @Override
                    public void undo() {
                        adapter.insert(task, position);
                    }
                };
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                showEditTaskDialog();
            }
        });

        listView.enableSwipeToDismiss();
        listView.enableRearranging();
    }

    /**
     * Shows/hides the warning depending on whether there are visible projects.
     */
    private void refreshNoTasksWarning() {
        // We either show the TextView or the ListView, but not both
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.project, menu);
        return true;
    }

    /**
     * Handles action bar item clicks.
     *
     * @param item The item selected.
     * @return True, since an item was selected.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_add_task:
                showAddTaskDialog();
                return true;
            case R.id.action_change_color:
                showChangeColorDialog();
                return true;
            default:
                return true;
        }
    }

    /**
     * Pops up a dialog for user to change color.
     * Called from an action bar item being selected.
     */
    private void showChangeColorDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        // set title
        alertDialogBuilder.setTitle(CHANGE_COLOR_DIALOG_TITLE);

        View layout = getLayoutInflater().inflate(R.layout.dialog_change_colors, null);

        final Spinner spinner = (Spinner) layout.findViewById(R.id.spinner_change_color);

        // set dialog message
        alertDialogBuilder
                //.setMessage(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)))
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
     */
    private void showEditTaskDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle(EDIT_TASK_DIALOG_TITLE);

        View layout = getLayoutInflater().inflate(R.layout.dialog_edit_task, null);

        final EditText taskTitle = (EditText) layout.findViewById(R.id.task);

        // set dialog message
        alertDialogBuilder
                //.setMessage(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)))
                .setCancelable(true)
                .setView(layout)
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Task task = new Task();
                                task.setName(taskTitle.getText().toString());
                                //adapter.notifyDataSetChanged();
                                //refreshNoTasksWarning();
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
     * Pops up the dialog for user to add a task.
     * Called from an action bar item being selected.
     */
    private void showAddTaskDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        // set title
        alertDialogBuilder.setTitle(ADD_TASK_DIALOG_TITLE);

        View layout = getLayoutInflater().inflate(R.layout.dialog_new_task, null);

        final EditText taskTitle = (EditText) layout.findViewById(R.id.task);

        // set dialog message
        alertDialogBuilder
                //.setMessage(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)))
                .setCancelable(true)
                .setView(layout)
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Task task = new Task();
                                task.setName(taskTitle.getText().toString());
                                task.setProject_id(project_id);
                                tasks.add(0, task);
                                adapter.notifyDataSetChanged();
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

}