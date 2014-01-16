package com.thundercats.queuer;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by kmchen1 on 1/16/14.
 */
public class QueuerApplication extends Application {

    private RequestQueue requestQueue;

    public void setRequestQueue(RequestQueue requestQueue) {
        this.requestQueue = requestQueue;
    }

    public RequestQueue getRequestQueue() {
        if (requestQueue == null) requestQueue = Volley.newRequestQueue(this);
        return requestQueue;
    }


}
