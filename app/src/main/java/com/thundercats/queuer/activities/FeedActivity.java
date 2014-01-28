package com.thundercats.queuer.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import com.thundercats.queuer.R;
import com.thundercats.queuer.adapters.FeedAdapter;
import com.thundercats.queuer.database.ProjectDataSource;
import com.thundercats.queuer.database.TaskDataSource;
import com.thundercats.queuer.models.Project;
import com.thundercats.queuer.models.Task;
import com.thundercats.queuer.views.EnhancedListView;

import java.util.ArrayList;

/**
 * Created by kmchen1 on 1/15/14.
 */
public class FeedActivity extends ActionBarActivity {

    private final String ACTIVITY_TITLE = "Projects";

    static final int CREATE_PROJECT_REQUEST = 0;

    private FeedAdapter adapter;

    /**
     * @param requestCode  The request code that is attached to the Intent that launches the
     *                     {@link com.thundercats.queuer.activities.CreateProjectActivity}.
     * @param resultCode   Either {@link android.app.Activity#RESULT_OK} or
     *                     {@link android.app.Activity#RESULT_CANCELED}.
     * @param intentResult The intent that is passed back from the called activity.
     * @see com.thundercats.queuer.activities.FeedActivity#onOptionsItemSelected(android.view.MenuItem)
     */
    protected void onActivityResult(int requestCode, int resultCode, Intent intentResult) {
        if (requestCode == CREATE_PROJECT_REQUEST) {
            if (resultCode == RESULT_OK) {
                Bundle data = intentResult.getExtras();
                Project project = data.getParcelable(Project.INTENT_KEY);
                //don't need following since project already written to DB in CreateProjectActivity
                //adapter.add(project);
                syncFeedAdapterWithDatabase();
            }
        }
    }

    /**
     * Handles presses on action bar items.
     * Calls a switch statement on all ids in the menu that was set in
     * {@link com.thundercats.queuer.activities.FeedActivity#onCreateOptionsMenu(android.view.Menu)}.
     *
     * @param item The selected item.
     * @return True since an item was selected.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_create_project:
                // The Intent for going to the "Create New Project" screen
                Intent intent = new Intent(FeedActivity.this, CreateProjectActivity.class);
                startActivityForResult(intent, CREATE_PROJECT_REQUEST);
                return true;
            case R.id.action_wipe_database:
                deleteAllProjects();
                deleteAllTasks();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /** Deletes all tasks. */
    private void deleteAllTasks() {
        TaskDataSource dataSource = new TaskDataSource(this);
        dataSource.open();
        dataSource.deleteAllTasks();
        dataSource.close();
    }

    /** Deletes all projects, resets the adapter, and refreshes screen. */
    private void deleteAllProjects() {
        ProjectDataSource dataSource = new ProjectDataSource(this);
        dataSource.open();
        dataSource.deleteAllProjects();
        dataSource.close();

        adapter = new FeedAdapter(this, new ArrayList<Project>());
        refreshNoProjectsWarning();
    }

    /** Re-initializes adapter with {@code Project}s in the database. */
    private void syncFeedAdapterWithDatabase() {
        print("syncing");
        ProjectDataSource projectDataSource = new ProjectDataSource(this);
        projectDataSource.open();
        ArrayList<Project> projects = projectDataSource.getAllProjects();
        projectDataSource.close();
        adapter = new FeedAdapter(this, projects);
        ((EnhancedListView) findViewById(R.id.lv_projects)).setAdapter(adapter);
        refreshNoProjectsWarning();
    }

    /**
     * Sets the menu.
     *
     * @param menu The menu.
     * @return True, since the menu is displayed.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.feed, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * Shows/hides the warning depending on whether there are visible projects.
     */
    private void refreshNoProjectsWarning() {
        // We either show the TextView or the ListView, but not both
        TextView warning = (TextView) findViewById(R.id.tv_warning_no_projects);
        EnhancedListView listView = (EnhancedListView) findViewById(R.id.lv_projects);
        if (adapter.isEmpty()) {
            warning.setVisibility(View.VISIBLE);
            listView.setVisibility(View.GONE);
        }
        else {
            warning.setVisibility(View.GONE);
            listView.setVisibility(View.VISIBLE);
        }
    }

    /**
     * What happens when this activity is created.
     *
     * @param savedInstanceState If the activity is being re-initialized after
     *                           previously being shut down then this Bundle
     *                           contains the data it most recently supplied in
     *                           onSaveInstanceData(Bundle). Otherwise, it is null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(ACTIVITY_TITLE);

        print("onCreate");
        syncFeedAdapterWithDatabase();

        EnhancedListView listView = (EnhancedListView) findViewById(R.id.lv_projects);
        listView.setAdapter(adapter);

        // If there are no projects left, show warning
        refreshNoProjectsWarning();

        listView.setDismissCallback(new EnhancedListView.OnDismissCallback() {
            @Override
            public EnhancedListView.Undoable onDismiss(EnhancedListView listView, final int position) {
                final Project project = adapter.getItem(position);
                adapter.remove(position);
                return new EnhancedListView.Undoable() {
                    @Override
                    public void undo() {
                        adapter.insert(project, position);
                    }
                };
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                projectClicked(adapter.getItem(position));
            }
        });

        listView.enableSwipeToDismiss();
        listView.enableRearranging();
    }

    /** Calls new activity. Passes project via Intent. */
    private void projectClicked(Project project) {
        Intent intent = new Intent(FeedActivity.this, ProjectActivity.class);
        intent.putExtra(Project.INTENT_KEY, project);
        printDiagnostics(project);
        startActivity(intent);
    }

    /** Prints a {@code Project}'s fields for diagnosis. */
    private void printDiagnostics(Project project) {
        String d = "Title: " + project.getTitle() + "\n"
                + "LocalID: " + project.getLocalId() + "\n"
                + "ServerID: " + project.getId() + "\n"
                + "Color: " + project.getColor() + "\n"
                + "Created: " + project.getCreated_at() + "\n"
                + "Updated: " + project.getUpdated_at();
        print(d);
    }

    @Override
    protected void onResume() {
        super.onResume();
        adapter.notifyDataSetChanged();
    }

    private void print(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}
