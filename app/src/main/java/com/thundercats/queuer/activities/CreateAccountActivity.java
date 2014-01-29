package com.thundercats.queuer.activities;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.thundercats.queuer.R;
import com.thundercats.queuer.constants.Server;
import com.thundercats.queuer.interfaces.LoginManagerCallback;
import com.thundercats.queuer.managers.LoginManager;


public class CreateAccountActivity extends ActionBarActivity implements LoginManagerCallback {

    private final String ACTIVITY_TITLE = "Create Account";
    private EditText user;
    private EditText pass;
    private Button createAccount;

    private void setEnabledFields(boolean enabled) {
        user.setEnabled(enabled);
        pass.setEnabled(enabled);
    }

    /**
     * Shows/hides the progress bar.
     *
     * @param shown Whether or not the progress bar is shown.
     */
    private void showProgressBar(boolean shown) {
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        if (shown) progressBar.setVisibility(View.VISIBLE);
        else progressBar.setVisibility(View.INVISIBLE);
    }

    private void showProgressLabel(boolean shown) {
        final TextView textView = (TextView) findViewById(R.id.progress_text);
        if (shown) textView.setVisibility(View.VISIBLE);
        else textView.setVisibility(View.INVISIBLE);
    }

    private void setProgressLabel(String s) {
        ((TextView) findViewById(R.id.progress_text)).setText(s);
    }

    /**
     * Returns true if the EditText is empty, false otherwise.
     */
    private boolean isEmpty(EditText edit) {
        return edit.getText().length() == 0;
    }

    /**
     * Enables/disables the Create Account Button depending on whether the user
     * has entered input in both fields.
     */
    private void updateButtonState() {
        if (isEmpty(user) || isEmpty(pass)) createAccount.setEnabled(false);
        else createAccount.setEnabled(true);
    }

    /**
     * Calls updateButtonState after each keystroke.
     */
    private class LocalTextWatcher implements TextWatcher {
        public void afterTextChanged(Editable s) {
            updateButtonState();
        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(ACTIVITY_TITLE);

        user = (EditText) findViewById(R.id.et_username);
        pass = (EditText) findViewById(R.id.et_password);
        createAccount = (Button) findViewById(R.id.btn_create_account);

        //monitor EditText fields for entered text
        TextWatcher watcher = new LocalTextWatcher();
        user.addTextChangedListener(watcher);
        pass.addTextChangedListener(watcher);

        //updates button based on input from TextWatcher
        updateButtonState();

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //startedRequest
                final String username = user.getText().toString();
                final String password = pass.getText().toString();
                LoginManager newAccountManager = LoginManager.getInstance();
                newAccountManager.setCallback(CreateAccountActivity.this, CreateAccountActivity.this);
                try {
                    newAccountManager.login(username, password, Server.QUEUER_CREATE_ACCOUNT_URL);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.create_account, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_create_account, container, false);
            return rootView;
        }
    }

    @Override
    public void startedRequest() {
        setEnabledFields(false);
        showProgressBar(true);
        showProgressLabel(true);
        setProgressLabel("Creating an account...");
    }

    public void finishedRequest(boolean successful) {
        setEnabledFields(true);
        showProgressBar(false);
        if (successful) setProgressLabel("SUCCESS");
        else setProgressLabel("Failed to create account!");
    }


}
