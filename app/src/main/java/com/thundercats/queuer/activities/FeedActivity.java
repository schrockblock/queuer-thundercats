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
import android.widget.Toast;

import com.thundercats.queuer.R;
import com.thundercats.queuer.adapters.FeedAdapter;
import com.thundercats.queuer.models.Project;
import com.thundercats.queuer.views.EnhancedListView;

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
                Project project = (Project) data.getParcelable(Project.INTENT_KEY);
                adapter.add(project);
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
            case R.id.action_add_project:
                // The Intent for going to the "Create New Project" screen
                Intent intent = new Intent(FeedActivity.this, CreateProjectActivity.class);
                // FeedAdapter must be passed since it's used for getNextID();
                intent.putExtra(FeedAdapter.INTENT_KEY, adapter);
                startActivityForResult(intent, CREATE_PROJECT_REQUEST);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * Sets the menu.
     *
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
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(ACTIVITY_TITLE);

        EnhancedListView listView = (EnhancedListView) findViewById(R.id.lv_projects);
        adapter = new FeedAdapter(this);
        listView.setAdapter(adapter);

        /*
        TODO When you dismiss a project, you are really dismissing the project's first task.
         */
        listView.setDismissCallback(new EnhancedListView.OnDismissCallback() {
            @Override
            public EnhancedListView.Undoable onDismiss(EnhancedListView listView, final int position) {
                Toast.makeText(FeedActivity.this, "Clicked on item " + adapter.getItem(position), Toast.LENGTH_SHORT).show();
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
                Intent intent = new Intent(FeedActivity.this, ProjectActivity.class);
                intent.putExtra("project_id", adapter.getItemId(position));
                startActivity(intent);
            }
        });

        listView.enableSwipeToDismiss();
        listView.enableRearranging();
    }


}
