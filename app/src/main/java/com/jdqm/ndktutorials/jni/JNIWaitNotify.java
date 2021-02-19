package com.jdqm.ndktutorials.jni;

public class JNIWaitNotify extends BaseOperation {
    @Override
    public void invoke() {
        waitNativeThread();
        notifyNativeThread();
    }

    public native void  waitNativeThread();

    public native void  notifyNativeThread();
}
