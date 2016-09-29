package com.tanagent.brian.audiocaptureapp;

import android.util.Log;

/**
 * Created by Brian on 9/29/2016.
 */
public class AppLog {
    private static final String APP_TAG = "AudioRecorder";

    public static int logString(String message) {
        return Log.i(APP_TAG, message);
    }
}
