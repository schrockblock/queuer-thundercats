package com.thundercats.queuer.managers;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

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
import com.thundercats.queuer.models.LoginModel;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.Iterator;

/**
 * Created by kmchen1 on 1/7/14.
 */
public class LoginManager {

    /**
     * Used in {@link com.thundercats.queuer.activities.CreateAccountActivity}
     * and {@link com.thundercats.queuer.activities.LoginActivity}, depending
     * on which server you want to access.
     */
    private String URL;

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

    /**
     * Returns the singleton LoginManager.
     *
     * @return The singleton LoginManager.
     */
    public static LoginManager getInstance() {
        return instance;
    }

    /**
     * Sets the callback.
     *
     * @param context  The context of the callback.
     * @param callback The callback.
     */
    public void setCallback(Context context, LoginManagerCallback callback) {
        this.callback = callback;
        this.context = context;
    }

    /**
     * Logs the user in.
     *
     * @param username The entered username.
     * @param password The entered password.
     * @throws Exception If the callback is null.
     */
    public void login(String username, String password, String URL) throws Exception {
        if (callback == null) throw new Exception("Null callback");
        this.URL = URL;
        callback.startedRequest();
        authenticate(username, password);
    }

    /**
     * Creates a listener for the JsonObjectRequest.
     *
     * @return A listener for the JsonObjectRequest.
     */
    private Response.Listener<JSONObject> createListener() {
        return new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    if (response.has("errors")) {
                        String s = "";
                        Iterator<String> keys = response.keys();
                        while (keys.hasNext()) {
                            s += keys.next() + ",";
                        }
                        Toast.makeText(context, s, Toast.LENGTH_LONG).show();
                        authenticatedUnsuccessfully();
                    } else {
                        authenticatedSuccessfully();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
    }

    /**
     * Creates an error listener for the JsonObjectRequest.
     *
     * @return An error listener for the JsonObjectRequest.
     */
    private Response.ErrorListener createErrorListener() {
        return new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                if (error.networkResponse != null) {
                    Log.d("LoginActivity", "Error Response code: " + error.networkResponse.statusCode);
                    Toast.makeText(context, "Error Response code: " + error.networkResponse.statusCode, Toast.LENGTH_LONG).show();
                }
                Toast.makeText(context, error.getMessage(), Toast.LENGTH_LONG).show();
                try {
                    authenticatedUnsuccessfully();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };
    }

    /**
     * Returns a JSONObject given a username and password.
     *
     * @param username The entered username.
     * @param password The entered password.
     * @return A JSONObject given a username and password.
     */
    private JSONObject createJSONObject(String username, String password) {
        JSONObject jsonObject = null;
        try {
            String json = new Gson().toJson(new LoginModel(username, password));
            jsonObject = new JSONObject(json);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    /**
     * Calls {@link LoginManager#authenticatedSuccessfully()} if the login was successful
     * or {@link LoginManager#authenticatedUnsuccessfully()} if the login was unsuccessful.
     *
     * @param username The entered username.
     * @param password The entered password.
     */
    private void authenticate(String username, String password) {

        ((QueuerApplication) context.getApplicationContext()).setRequestQueue(Volley.newRequestQueue(context));

        // Get server URL
        String server = URL;

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
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, server, jsonObject, listener, errorListener);
        /*
        {


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
        */
        ((QueuerApplication) context.getApplicationContext()).getRequestQueue().add(request);

    }

    /**
     * Calls {@link com.thundercats.queuer.activities.LoginActivity#finishedRequest(boolean)}.
     *
     * @throws Exception If the callback is null.
     */
    private void authenticatedSuccessfully() throws Exception {
        if (callback == null) throw new Exception("Null callback");
        callback.finishedRequest(true);
    }

    /**
     * Calls {@link com.thundercats.queuer.activities.LoginActivity#finishedRequest(boolean)}.
     *
     * @throws Exception If the callback is null.
     */
    private void authenticatedUnsuccessfully() throws Exception {
        if (callback == null) throw new Exception("Null callback");
        callback.finishedRequest(false);
    }


}
