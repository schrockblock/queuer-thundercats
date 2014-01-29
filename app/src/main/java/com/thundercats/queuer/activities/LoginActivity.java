package com.thundercats.queuer.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.thundercats.queuer.R;
import com.thundercats.queuer.constants.Server;
import com.thundercats.queuer.interfaces.LoginManagerCallback;
import com.thundercats.queuer.managers.LoginManager;

public class LoginActivity extends ActionBarActivity implements LoginManagerCallback {

    private final String ACTIVITY_TITLE = "Login";
    private final String LOGIN_PREFS_FILE_NAME = "login";
    private final String LOGIN_PREFS_USERNAME_KEY = "username";
    private final String LOGIN_PREFS_PASSWORD_KEY = "password";
    private final String LOGIN_PREFS_REMEMBER_KEY = "remember";
    EditText user;
    EditText pass;
    Button login;


    /**
     * Shows/hides the progress bar.
     * @param shown Whether or not the progress bar is shown.
     */
    private void showProgressBar(boolean shown) {
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        if (shown) progressBar.setVisibility(View.VISIBLE);
        else progressBar.setVisibility(View.INVISIBLE);
    }

    /**
     * Indicate to the user (by showing the progress bar) that the Volley request has been created.
     */
    public void startedRequest() {
        showProgressBar(true);
    }

    private boolean checkEditText(EditText edit) {
        return edit.getText().length() == 0;
    }

    void updateButtonState() {
        if(checkEditText(user) || checkEditText(pass)) login.setEnabled(false);
        else login.setEnabled(true);
    }


    private class LocalTextWatcher implements TextWatcher {
        public void afterTextChanged(Editable s) {
            updateButtonState();
        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    }


    /**
     * Indicate to the user that the login operation has terminated.
     * @param successful Whether the login was successful.
     */
    public void finishedRequest(boolean successful) {
        if (successful) {
            // TODO SHOW THE NEXT SCREEN (WHICH WE DON'T HAVE) and stop the request queue
        }
        else {
            showProgressBar(false);
            final TextView textView = (TextView) findViewById(R.id.progress_text);
            textView.setVisibility(View.VISIBLE);
            textView.setText("Login unsuccessful. Try again.");
        }
    }

    public void buttonClicked(View v){

        Intent newIntent = new Intent(this, CreateAccountActivity.class);
        startActivity(newIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(ACTIVITY_TITLE);

        user = (EditText) findViewById(R.id.et_username);
        pass = (EditText) findViewById(R.id.et_password);
        final CheckBox remember = (CheckBox) findViewById(R.id.cb_remember);

        login = (Button) findViewById(R.id.btn_login);

        final Button createAccount = (Button) findViewById(R.id.btn_create_account);

        //monitor EditText fields for entered text
        TextWatcher watcher = new LocalTextWatcher();
        user.addTextChangedListener(watcher);
        pass.addTextChangedListener(watcher);

        //updates button based on input from TextWatcher
        updateButtonState();



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String username = user.getText().toString();
                final String password = pass.getText().toString();
                final TextView textView = (TextView) findViewById(R.id.progress_text);

                if (remember.isChecked()) {
                    SharedPreferences preferences = getSharedPreferences(LOGIN_PREFS_FILE_NAME, MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putBoolean(LOGIN_PREFS_REMEMBER_KEY, true);
                    editor.putString(LOGIN_PREFS_USERNAME_KEY, username);
                    editor.putString(LOGIN_PREFS_PASSWORD_KEY, password);
                    editor.commit();
                }
                LoginManager manager = LoginManager.getInstance();
                manager.setCallback(LoginActivity.this, LoginActivity.this);
                try {
                    showProgressBar(true);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("Logging in...");
                    manager.login(username, password, Server.QUEUER_SESSION_URL);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // If we are "remembering", then fill in the fields
        SharedPreferences preferences = getSharedPreferences(LOGIN_PREFS_FILE_NAME, MODE_PRIVATE);
        if (preferences.getBoolean(LOGIN_PREFS_REMEMBER_KEY, false)){
            user.setText(preferences.getString(LOGIN_PREFS_USERNAME_KEY, ""));
            pass.setText(preferences.getString(LOGIN_PREFS_PASSWORD_KEY, ""));
            remember.setChecked(true);
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
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
            View rootView = inflater.inflate(R.layout.fragment_login, container, false);
            return rootView;
        }
    }

}
