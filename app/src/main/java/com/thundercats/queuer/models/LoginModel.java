package com.thundercats.queuer.models;

/**
 * A class that Gson converts to Json, which is then wrapped in a JSONObject.
 * Created by kmchen1 on 1/22/14.
 */
public class LoginModel {

    private final String username;
    private final String password;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public LoginModel(String user, String pass) {
        this.username = user;
        this.password = pass;
    }


}
