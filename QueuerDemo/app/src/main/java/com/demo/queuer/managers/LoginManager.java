package com.demo.queuer.managers;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.demo.queuer.Constants;
import com.demo.queuer.QueuerApplication;
import com.demo.queuer.interfaces.LoginManagerCallback;
import com.demo.queuer.models.SignInModel;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by eschrock on 1/7/14.
 */
public class LoginManager {
    private Context context;
    private LoginManagerCallback callback;

    public void setCallback(Context context, LoginManagerCallback callback) {
        this.context = context;
        this.callback = callback;
    }

    public void login(String username, String password) throws Exception{
        if (callback == null) throw new Exception("Must supply a LoginManagerCallback");
        callback.startedRequest();
        authenticate(username, password);
    }

    private void authenticate(String username, String password){
        SignInModel model = new SignInModel(username, password);
        JSONObject signInJson = null;
        try {
            signInJson = new JSONObject(new Gson().toJson(model));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST,
                Constants.QUEUER_SESSION_URL,
                signInJson, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                // handle response (are there errors?)
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // deal with it
            }
        });

        ((QueuerApplication)context.getApplicationContext()).getRequestQueue().add(request);
    }

    private void authenticatedSuccessfully() throws Exception{
        if (callback == null) throw new Exception("Must supply a LoginManagerCallback");
        callback.finishedRequest(true);
    }

    private void authenticatedUnsuccessfully() throws Exception{
        if (callback == null) throw new Exception("Must supply a LoginManagerCallback");
        callback.finishedRequest(false);
    }
}
