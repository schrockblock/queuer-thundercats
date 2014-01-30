package com.demo.queuer.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

import com.demo.queuer.R;
import com.demo.queuer.adapters.FeedAdapter;
import com.demo.queuer.adapters.ProjectAdapter;
import com.demo.queuer.models.Project;
import com.demo.queuer.models.Task;
import com.demo.queuer.views.EnhancedListView;

import java.util.ArrayList;

/**
 * Created by eschrock on 1/17/14.
 */
public class ProjectActivity extends ActionBarActivity {
    private int project_id;
    private ArrayList<Task> tasks = new ArrayList<Task>();
    private ProjectAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        project_id = getIntent().getIntExtra("project_id",-1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Project " + project_id);

        EnhancedListView listView = (EnhancedListView)findViewById(R.id.lv_tasks);
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
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.project, menu);
        return true;
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
        return super.onOptionsItemSelected(item);
    }
}
