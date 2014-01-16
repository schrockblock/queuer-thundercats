package com.demo.queuer.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.demo.queuer.R;
import com.demo.queuer.adapters.FeedAdapter;
import com.demo.queuer.models.Project;
import com.demo.queuer.views.EnhancedListView;

import java.util.ArrayList;

/**
 * Created by eschrock on 1/15/14.
 */
public class FeedActivity extends ActionBarActivity {
    private FeedAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        ArrayList<Project> projects = new ArrayList<Project>(20);
        for (int i = 0; i < 20; i++){
            projects.add(new Project(i, "Project " + i));
        }

        EnhancedListView listView = (EnhancedListView)findViewById(R.id.lv_projects);
        adapter = new FeedAdapter(this, projects);
        listView.setAdapter(adapter);

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
                Toast.makeText(FeedActivity.this, "Clicked on item " + adapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });

        listView.enableSwipeToDismiss();
        listView.enableRearranging();
    }
}
