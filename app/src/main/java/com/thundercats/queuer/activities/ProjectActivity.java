package com.thundercats.queuer.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import com.thundercats.queuer.R;
import com.thundercats.queuer.adapters.ProjectAdapter;
import com.thundercats.queuer.models.Task;
import com.thundercats.queuer.views.EnhancedListView;

import java.util.ArrayList;

/**
 * The screen that displays all of the user's {@link com.thundercats.queuer.models.Task}s
 * for a given {@link com.thundercats.queuer.models.Project}.
 * Created by kmchen1 on 1/19/14.
 */
public class ProjectActivity extends ActionBarActivity {

    private Project project;

    /**
     * The project's ID.
     */
    private int project_id;

    /**
     * The list of tasks.
     */
    private ArrayList<Task> tasks = new ArrayList<Task>();

    /**
     * The project's base adapter. A rearrangement listener. Controls the list of tasks.
     */
    private ProjectAdapter adapter;

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater;
        inflater = getMenuInflater();
        inflater.inflate(R.menu.project, menu);
        return super.onCreateOptionsMenu(menu);
    }


    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        // Get the project ID from the Intent. IDs default to -1 if not provided.
        project_id = getIntent().getIntExtra("project_id", -1);

        project = getIntent().get;

        // Set the action bar to display the project number.
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Project " + project_id);



        EnhancedListView listView = (EnhancedListView) findViewById(R.id.lv_tasks);
        adapter = new ProjectAdapter(this, tasks);
        listView.setAdapter(adapter);

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

        listView.enableSwipeToDismiss();
        listView.enableRearranging();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_add_task) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            // set title
            alertDialogBuilder.setTitle("New Task");

            View layout = getLayoutInflater().inflate(R.layout.new_task, null);

            final EditText taskTitle = (EditText)layout.findViewById(R.id.task);

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
                                }
                            })
                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {}
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
            return true;
        }
        else if (id == R.id.action_change_color) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

                alertDialogBuilder.setTitle("Change Colors");

                View layout = getLayoutInflater().inflate(R.layout.change_colors, null);



                Spinner spinner = (Spinner)findViewById(R.id.spinner_change_color);

                 alertDialogBuilder
                    //.setMessage(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)))
                    .setCancelable(true)
                    .setView(layout)
                    .setPositiveButton("Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    String color = spinner.getSelectedItem().toString();

                                    task.setProject_id(project_id);
                                    tasks.add(0, task);
                                    adapter.notifyDataSetChanged();
                                }
                            })
                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {}
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
            return true;





        }

        return super.onOptionsItemSelected(item);
    }
}