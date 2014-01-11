package com.demo.queuer.interfaces;

/**
 * Created by eschrock on 1/7/14.
 */
public interface LoginManagerCallback {
    public void startedRequest();
    public void finishedRequest(boolean successful);
}
