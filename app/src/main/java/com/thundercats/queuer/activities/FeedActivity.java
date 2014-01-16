package com.thundercats.queuer.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import com.thundercats.queuer.R;
import com.thundercats.queuer.adapters.FeedAdapter;
import com.thundercats.queuer.models.Project;

import java.util.ArrayList;

/**
 * Created by kmchen1 on 1/15/14.
 */
public class FeedActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        ArrayList<Project> projects = new ArrayList<Project>(20);
        for (int i = 0; i < 20; i++) {
            projects.add(new Project(i, "Project " + i));
        }

        ListView listView = (ListView) findViewById(R.id.lv_projects);
        listView.setAdapter(new FeedAdapter(this));
    }


}
