package com.thundercats.queuer.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.thundercats.queuer.R;
import com.thundercats.queuer.adapters.FeedAdapter;
import com.thundercats.queuer.models.Project;
import com.thundercats.queuer.models.Task;

/**
 * Created by kmchen1 on 1/20/14.
 */
public class CreateProjectActivity extends ActionBarActivity {

    private final String ACTIVITY_TITLE = "Create a Project";
    private final String WARN_DIALOG_TITLE = "Warning";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_project);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(ACTIVITY_TITLE);
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
                //.setCancelable(true)
                .setView(layout)
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {}
                        });
                /*
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {}
                });
                */
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    /**
     * The user has pressed the Okay button.
     * First checks to see EditText widgets are not blank.
     * Then creates a new project and takes the user back to FeedActivity.
     * @param view The view that was pressed. For now, unused in this method.
     */
    public void okayButtonPressed(View view) {
        // Get strings from EditText widgets
        EditText et_projectName = (EditText) findViewById(R.id.et_project_name);
        EditText et_projectColor = (EditText) findViewById(R.id.et_project_color);
        String projectName = et_projectName.getText().toString();
        String projectColor = et_projectColor.getText().toString();

        // Ensure fields aren't empty
        if (projectName.isEmpty() || projectColor.isEmpty()) {
            showWarningDialog("Fields cannot be empty.");
            return;
        }

        // Ensure color is an int
        Integer color = null;
        try {
            color = Integer.parseInt(projectColor);
        } catch (NumberFormatException e) {
            showWarningDialog("Color field must be an int.");
            return;
        }

        // Set intent with data
        Intent result = new Intent();
        Toast.makeText(this, "Project " + projectName + ", " + color, Toast.LENGTH_LONG).show();
        result.putExtra(Project.INTENT_KEY, new Project(this, projectName, color));
        setResult(RESULT_OK, result);
        finish();
    }

    /**
     * Takes user back to FeedActivity.
     * @param view The view that was pressed. For now, unused in this method.
     */
    public void cancelButtonPressed(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }

}
