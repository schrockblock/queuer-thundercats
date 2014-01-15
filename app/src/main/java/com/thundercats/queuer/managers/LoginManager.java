package com.thundercats.queuer.managers;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.thundercats.queuer.GsonRequest;
import com.thundercats.queuer.activities.LoginActivity;
import com.thundercats.queuer.interfaces.LoginManagerCallback;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/**
 * Created by kmchen1 on 1/7/14.
 */
public class LoginManager {

    /**
     * The singleton LoginManager.
     */
    private static final LoginManager instance = new LoginManager();

    /**
     * The Volley request queue.
     */
    private static RequestQueue requestQueue;

    /**
     * The callback (i.e., the LoginActivity).
     */
    private LoginManagerCallback callback;

    /**
     * Private constructor. Cannot publicly instantiate LoginManager since it's a singleton.
     */
    private LoginManager() {}

    /**
     * Returns the singleton LoginManager.
     * @return The singleton LoginManager.
     */
    public static LoginManager getInstance() {
        return instance;
    }

    /**
     * Sets the callback.
     * @param callback The callback.
     */
    public void setCallback(LoginManagerCallback callback) {
        this.callback = callback;
        // TODO this makes a new RequestQueue on each button click...
        requestQueue = Volley.newRequestQueue(((Activity) callback).getApplicationContext());
    }

    /**
     * Logs the user in.
     * @param username The entered username.
     * @param password The entered password.
     * @throws Exception If the callback is null.
     */
    public void login(String username, String password) throws Exception {
        if (callback == null) throw new Exception("Null callback");
        callback.startedRequest();
        authenticate(username, password);
    }

    /**
     * A class that Gson converts to Json, which is then wrapped in a JSONObject.
     */
    private class LoginAttempt {
        private final String user, pass;
        private LoginAttempt(String user, String pass) {
            this.user = user;
            this.pass = pass;
        }
    }

    /**
     * Returns a JSONObject given a username and password.
     * @param username The entered username.
     * @param password The entered password.
     * @return A JSONObject given a username and password.
     */
    private JSONObject createJSONObject(String username, String password) {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(new Gson().toJson(new LoginAttempt(username, password)));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    /**
     * <p>A class to asynchronously log the user in.</p>
     * <p>Params: Three Strings (username, password, and server URL) in that order.</p>
     * <p>Progress: Void. Progress is not published.</p>
     * <p>Result: Boolean. True if login was successful, false otherwise.</p>
     */
    private class LoginTask extends AsyncTask<String, Void, Boolean> {
        /**
         * Empty method. Nothing happens on pre-execution.
         */
        protected void onPreExecute() {}

        /**
         * The bulk of the computation. Tries to log into the server.
         * @param info A triple (username, password, server URL) in that order.
         * @return True if the GET operation succeeded, false otherwise.
         */
        protected Boolean doInBackground(String... info) {
            if (info.length != 3)
                throw new IllegalArgumentException("Only give 3 args: user, pass, server");

            final String user = info[0];
            final String pass = info[1];
            final String server = info[2];

            URL url = null;
            try {
                url = new URL(server);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            if (url == null) return false; // if we can't make URL, we failed.

            // CREATE JSON
            JSONObject jsonObject = createJSONObject(user, pass);

            if (jsonObject == null) {
                try {
                    authenticatedUnsuccessfully();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return false;
            }

            // CREATE LISTENERS
            Response.Listener listener = createListener();
            Response.ErrorListener errorListener = createErrorListener();

            // ADD TO REQUEST QUEUE
            JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, server, jsonObject, listener, errorListener) {
                protected Response<JSONObject> parseNetworkResponse(NetworkResponse response) {
                    // TODO
                    return null;
                }
            };
            // TODO think about a tag for requests - request.setTag("cats");
            requestQueue.add(request);
            requestQueue.start();

            if (isCancelled()) return false;
            return true;
        }

        /**
         * Empty method. Progress is not published.
         * @param progress
         */
        protected void onProgressUpdate(Void... progress) {}

        /**
         * Logs whether we logged in successfully or not.
         * @param successful Whether the login was successful.
         */
        protected void onPostExecute(Boolean successful) {
            if (successful) Log.d("LoginActivity", "You logged in!");
            else Log.d("LoginActivity", "You failed to log in!");
        }
    }

    /**
     * Calls {@link LoginManager#authenticatedSuccessfully()} if the login was successful
     * or {@link LoginManager#authenticatedUnsuccessfully()} if the login was unsuccessful.
     * @param username The entered username.
     * @param password The entered password.
     */
    private void authenticate(String username, String password) {
        // GET URL
        String url = ((LoginActivity) callback).getServer();
        // Launch asynchronous task.
        LoginTask loginTask = new LoginTask();
        loginTask.execute(username, password, url);

        try {
            Boolean success = loginTask.get();
            // We logged in!
            if (success) {
                try {
                    authenticatedSuccessfully();
                } catch (Exception exception) {}
            }
            // We did not log in!
            else {
                try {
                    authenticatedUnsuccessfully();
                } catch (Exception exception) {}
            }
        }
        // Computation was cancelled. Could not log in!
        catch (CancellationException e) {
            try {
                authenticatedUnsuccessfully();
            } catch (Exception exception) {}
        }
        // Computation threw an exception. Could not log in!
        catch (ExecutionException e) {
            Log.d("LoginManager", "Computation threw an exception.");
            try {
                authenticatedUnsuccessfully();
            } catch (Exception exception) {}
        }
        // Current thread was interrupted while waiting. Could not log in!
        catch (InterruptedException e) {
            Log.d("LoginManager", "LoginTask thread was interrupted.");
            try {
                authenticatedUnsuccessfully();
            } catch (Exception exception) {}
        }
    }

    /**
     * Calls {@link com.thundercats.queuer.activities.LoginActivity#finishedRequest(boolean)}.
     * @throws Exception If the callback is null.
     */
    private void authenticatedSuccessfully() throws Exception {
        if (callback == null) throw new Exception("Null callback");
        callback.finishedRequest(true);
    }

    /**
     * Calls {@link com.thundercats.queuer.activities.LoginActivity#finishedRequest(boolean)}.
     * @throws Exception If the callback is null.
     */
    private void authenticatedUnsuccessfully() throws Exception {
        if (callback == null) throw new Exception("Null callback");
        callback.finishedRequest(false);
    }

    /**
     * Creates a listener for the JsonObjectRequest.
     * @return A listener for the JsonObjectRequest.
     */
    private Response.Listener createListener() {
        return new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("LoginActivity", "Success Response: " + response.toString());
            }
        };
    }

    /**
     * Creates an error listener for the JsonObjectRequest.
     * @return An error listener for the JsonObjectRequest.
     */
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
