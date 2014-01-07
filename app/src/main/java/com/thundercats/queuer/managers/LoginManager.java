package com.thundercats.queuer.managers;

/**
 * Created by kmchen1 on 1/7/14.
 */
public class LoginManager {

    private LoginManagerCallback callback;

    public void setCallback(LoginManagerCallback callback) {
        this.callback = callback;
    }

    /**
     * Logs in the user.
     * @param username The username.
     * @param password The password.
     * @throws Exception if callback is null.
     */
    public void login(String username, String password) throws Exception {
        if (callback == null) throw new Exception("Null callback");
        callback.startedRequest();
        authenticate(username, password);
    }

    private void authenticate(String username, String password) {

    }

    private void authenticatedSuccessfully() throws Exception {
        if (callback == null) throw new Exception("Null callback");
        callback.finishedRequest(true);
    }

    private void authenticatedUnsuccessfully() throws Exception {
        if (callback == null) throw new Exception("Null callback");
        callback.finishedRequest(false);
    }


}
