package com.demo.queuer.activities;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.demo.queuer.R;
import com.demo.queuer.managers.LoginManager;
import com.demo.queuer.interfaces.LoginManagerCallback;

public class LoginActivity extends ActionBarActivity implements LoginManagerCallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = (Button)findViewById(R.id.btn_login);
        final EditText user = (EditText)findViewById(R.id.et_username);
        final EditText pass = (EditText)findViewById(R.id.et_password);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginManager manager = new LoginManager();
                manager.setCallback(LoginActivity.this, LoginActivity.this);
                try {
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
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void startedRequest() {

    }

    @Override
    public void finishedRequest(boolean successful) {
        if (successful){
            startActivity(new Intent(this, FeedActivity.class));
        }
    }
}
