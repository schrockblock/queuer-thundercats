package com.thundercats.queuer.models;

/**
 * A class that Gson converts to Json, which is then wrapped in a JSONObject.
 * Created by kmchen1 on 1/22/14.
 */
public class LoginModel {

    private final String user;
    private final String pass;

    public String getPass() {
        return pass;
    }

    public String getUser() {
        return user;
    }

    public LoginModel(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }


}
