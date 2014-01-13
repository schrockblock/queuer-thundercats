package com.thundercats.queuer.managers;

import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.thundercats.queuer.GsonRequest;
import com.thundercats.queuer.activities.LoginActivity;
import com.thundercats.queuer.interfaces.LoginManagerCallback;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kmchen1 on 1/7/14.
 */
public class LoginManager {

    private final String SERVER = "http://queuer-rndapp.rhcloud.com/api/v1/session";

    // Eager instantiation
    private static final LoginManager instance = new LoginManager();

    private LoginManager() {

    }

    public static LoginManager getInstance() {
        return instance;
    }

    private LoginManagerCallback callback;

    public void setCallback(LoginManagerCallback callback) {
        this.callback = callback;
    }

    public void login(String username, String password) throws Exception {
        if (callback == null) throw new Exception("Null callback");
        callback.startedRequest();
        authenticate(username, password);
    }

    private void authenticate(String username, String password) {
        // CREATE LISTENERS
        Response.Listener listener = createListener();
        Response.ErrorListener errorListener = createErrorListener();

        // CREATE HEADERS MAP
        Map<String,String> map = new HashMap<String, String>();
        map.put("username", username);
        map.put("password", password);

        // CREATE REQUEST
        ((LoginActivity) callback).getRequestQueue().add(new GsonRequest(SERVER, String.class, map, listener, errorListener));
    }

    private void authenticatedSuccessfully() throws Exception {
        if (callback == null) throw new Exception("Null callback");
        callback.finishedRequest(true);
    }

    private void authenticatedUnsuccessfully() throws Exception {
        if (callback == null) throw new Exception("Null callback");
        callback.finishedRequest(false);
    }

    private Response.Listener createListener() {
        return new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("LoginActivity", "Success Response: " + response.toString());
            }
        };
    }

    private Response.ErrorListener createErrorListener() {
        return new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                if (error.networkResponse != null) {
                    Log.d("LoginActivity", "Error Response code: " + error.networkResponse.statusCode);
                }
            }
        };
    }


}
