package com.thundercats.queuer.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

import com.thundercats.queuer.R;
import com.thundercats.queuer.models.Project;

/**
 * Created by kmchen1 on 1/20/14.
 */
public class CreateProjectActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_project);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Create a Project");
    }

    /**
     * Shows user a dialog, reminding them to fill out all fields with appropriate values.
     */
    private void showDialog() {

    }

    /**
     * Checks to see textfields are not blank, creates new project, and takes user back to FeedActivity.
     * @param view
     */
    public void okayButtonPressed(View view) {
        // Get strings from EditText widgets
        EditText et_projectName = (EditText) findViewById(R.id.et_project_name);
        EditText et_projectColor = (EditText) findViewById(R.id.et_project_color);
        String projectName = et_projectName.getText().toString();
        String projectColor = et_projectColor.getText().toString();

        // Ensure fields aren't empty
        if (projectName.isEmpty() || projectColor.isEmpty()) {
            showDialog();
            return;
        }

        // Ensure color is an int
        Integer color = null;
        try {
            color = Integer.parseInt(projectColor);
        } catch (NumberFormatException e) {
            showDialog();
            return;
        }

        // Set intent with data
        Intent result = new Intent();
        result.putExtra(Project.INTENT_KEY_FOR_PROJECT_NAME, projectName);
        result.putExtra(Project.INTENT_KEY_FOR_PROJECT_COLOR, projectColor);
        setResult(RESULT_OK, result);
        finish();
    }

    /**
     * Takes user back to FeedActivity.
     * @param view
     */
    public void cancelButtonPressed(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }

}
