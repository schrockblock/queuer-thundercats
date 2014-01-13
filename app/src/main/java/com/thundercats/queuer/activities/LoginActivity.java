package com.thundercats.queuer.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.volley.*;
import com.android.volley.toolbox.Volley;
import com.thundercats.queuer.R;
import com.thundercats.queuer.managers.LoginManager;
import com.thundercats.queuer.interfaces.LoginManagerCallback;

public class LoginActivity extends ActionBarActivity implements LoginManagerCallback {

    public RequestQueue requestQueue;

    public RequestQueue getRequestQueue() {
        return requestQueue;
    }

    /**
     * Create Volley request queue.
     */
    public void startedRequest() {
        this.requestQueue = Volley.newRequestQueue(this);
    }

    /**
     *
     * @param successful
     */
    public void finishedRequest(boolean successful) {
        if (successful) {
            // SHOW THE NEXT SCREEN (WHICH WE DON'T HAVE)
        }
        else {
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
            progressBar.setVisibility(View.INVISIBLE);
            final TextView textView = (TextView) findViewById(R.id.progress_text);
            textView.setVisibility(View.VISIBLE);
            textView.setText("Login unsuccessful. Try again.");
        }
        requestQueue.stop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = (Button) findViewById(R.id.btn_login);
        final EditText user = (EditText) findViewById(R.id.et_username);
        final EditText pass = (EditText) findViewById(R.id.et_password);
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        final TextView textView = (TextView) findViewById(R.id.progress_text);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginManager manager = LoginManager.getInstance();
                manager.setCallback(LoginActivity.this);
                try {
                    progressBar.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("Logging in...");
                    manager.login(user.getText().toString(), pass.getText().toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

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
        switch (item.getItemId()) {
            case R.id.action_settings:
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
            View rootView = inflater.inflate(R.layout.fragment_login, container, false);
            return rootView;
        }
    }

}
