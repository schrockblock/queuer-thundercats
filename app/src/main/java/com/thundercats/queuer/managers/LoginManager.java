package com.thundercats.queuer.managers;

import android.content.Context;
import android.util.Log;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.thundercats.queuer.QueuerApplication;
import com.thundercats.queuer.R;
import com.thundercats.queuer.interfaces.LoginManagerCallback;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

/**
 * Created by kmchen1 on 1/7/14.
 */
public class LoginManager {

    /**
     * The context of the callback.
     */
    private Context context;

    /**
     * The singleton LoginManager.
     */
    private static final LoginManager instance = new LoginManager();

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
     * @param context The context of the callback.
     * @param callback The callback.
     */
    public void setCallback(Context context, LoginManagerCallback callback) {
        this.callback = callback;
        this.context = context;
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
     * Creates a listener for the JsonObjectRequest.
     * @return A listener for the JsonObjectRequest.
     */
    private Response.Listener<JSONObject> createListener() {
        return new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
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
                    try {
                        authenticatedUnsuccessfully();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
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
            String json = new Gson().toJson(new LoginAttempt(username, password));
            Log.d("LoginManager", json);
            jsonObject = new JSONObject(json);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    /**
     * Calls {@link LoginManager#authenticatedSuccessfully()} if the login was successful
     * or {@link LoginManager#authenticatedUnsuccessfully()} if the login was unsuccessful.
     * @param username The entered username.
     * @param password The entered password.
     */
    private void authenticate(String username, String password) {

        ((QueuerApplication) context.getApplicationContext()).setRequestQueue(Volley.newRequestQueue(context));

        // Get server URL
        String server = context.getString(R.string.server);

        // CREATE JSON
        JSONObject jsonObject = createJSONObject(username, password);
        if (jsonObject == null) {
            try {
                authenticatedUnsuccessfully();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // CREATE LISTENERS
        Response.Listener listener = createListener();
        Response.ErrorListener errorListener = createErrorListener();

        // ADD TO REQUEST QUEUE
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, server, jsonObject, listener, errorListener) {
            protected Response<JSONObject> parseNetworkResponse(NetworkResponse response) {
                try {
                    String json = new String(
                            response.data, HttpHeaderParser.parseCharset(response.headers));
                    return Response.success(
                            new Gson().fromJson(json, JSONObject.class), HttpHeaderParser.parseCacheHeaders(response));
                } catch (UnsupportedEncodingException e) {
                    return Response.error(new ParseError(e));
                } catch (JsonSyntaxException e) {
                    return Response.error(new ParseError(e));
                }
            }
        };
        ((QueuerApplication) context.getApplicationContext()).getRequestQueue().add(request);

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


}
