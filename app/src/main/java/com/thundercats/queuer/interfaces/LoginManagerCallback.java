package com.thundercats.queuer.interfaces;

/**
 * A callback class to indicate to the user that a request has started or finished.
 * Created by kmchen1 on 1/7/14.
 */
public interface LoginManagerCallback {

    /**
     * Indicate to the user that a server request has started.
     */
    public void startedRequest();

    /**
     * Indicate to the user that a server request has finished.
     * @param successful Whether the request was successful or not.
     */
    public void finishedRequest(boolean successful);

}
