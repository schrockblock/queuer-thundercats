package com.thundercats.queuer.activities;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.EditText;

import com.thundercats.queuer.R;


public class CreateAccountActivity extends ActionBarActivity {
    EditText user;
    EditText pass;
    Button createAccount;

    private boolean checkEditText(EditText edit) {
        return edit.getText().length() == 0;
    }

    void updateButtonState() {
        if(checkEditText(user) || checkEditText(pass)) createAccount.setEnabled(false);
        else createAccount.setEnabled(true);
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        user = (EditText) findViewById(R.id.et_username);
        pass = (EditText) findViewById(R.id.et_password);
        createAccount = (Button) findViewById(R.id.btn_create_account);

        //monitor EditText fields for entered text
        TextWatcher watcher = new LocalTextWatcher();
        user.addTextChangedListener(watcher);
        pass.addTextChangedListener(watcher);

        //updates button based on input from TextWatcher
        updateButtonState();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.create_account, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
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

}
