package com.jdqm.ndktutorials.jni;

import android.util.Log;

public abstract class BaseOperation {
    private static final String TAG = "BaseOperation";

    static {
        System.loadLibrary("native-lib");
    }

    public abstract void invoke();

    public void print(Object... args) {
        if (args.length == 0) {
            return;
        }

        for (Object arg : args) {
            Log.d(TAG, "Java value is " + arg.toString() + "\n");
        }
    }
}