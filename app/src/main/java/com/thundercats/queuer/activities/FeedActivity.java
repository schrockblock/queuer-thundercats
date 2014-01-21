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

import com.thundercats.queuer.R;
import com.thundercats.queuer.adapters.FeedAdapter;
import com.thundercats.queuer.models.Project;
import com.thundercats.queuer.views.EnhancedListView;

import java.util.ArrayList;

/**
 * Created by kmchen1 on 1/15/14.
 */
public class FeedActivity extends ActionBarActivity {

    static final int CREATE_PROJECT_REQUEST = 0;

    private FeedAdapter adapter;

    /**
     *
     * @param requestCode
     * @param resultCode Either {@link android.app.Activity#RESULT_OK} or
     *                      {@link android.app.Activity#RESULT_CANCELED}.
     * @param intentResult
     */
    protected void onActivityResult(int requestCode, int resultCode, Intent intentResult) {
        if (requestCode == CREATE_PROJECT_REQUEST) {
            if (resultCode == RESULT_OK) {
                Bundle data = intentResult.getExtras();
                Project project = (Project) data.getParcelable(Project.INTENT_KEY);
                adapter.add(project);
            }
        }
    }

    /**
     * Handles presses on action bar items.
     * Calls a switch statement on all ids in the menu that was set in
     * {@link com.thundercats.queuer.activities.FeedActivity#onCreateOptionsMenu(android.view.Menu)}.
     * @param item The selected item.
     * @return True since an item was selected.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_add_project:
                startActivityForResult(
                   new Intent(FeedActivity.this, CreateProjectActivity.class),
                        CREATE_PROJECT_REQUEST
                );
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * Sets the menu.
     * @param menu The menu.
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.feed, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * What happens when this activity is created.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Projects");

        ArrayList<Project> projects = new ArrayList<Project>(20);
        for (int i = 0; i < 20; i++) {
            projects.add(new Project(i, "Project " + i));
        }

        EnhancedListView listView = (EnhancedListView) findViewById(R.id.lv_projects);
        adapter = new FeedAdapter(this, projects);
        listView.setAdapter(adapter);

        /*
        TODO When you dismiss a project, you are really dismissing the project's first task.
         */
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
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(FeedActivity.this, ProjectActivity.class);
                intent.putExtra("project_id", adapter.getItemId(position));
                startActivity(intent);
            }
        });

        listView.enableSwipeToDismiss();
        listView.enableRearranging();
    }


}
