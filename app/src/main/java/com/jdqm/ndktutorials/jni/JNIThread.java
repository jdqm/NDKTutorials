package com.jdqm.ndktutorials.jni;

public class JNIThread extends BaseOperation {

    @Override
    public void invoke() {
        createNativeThread();
        createNativeThreadWithArgs();
        joinNativeThread();
    }

    public native int createNativeThread();

    public native int createNativeThreadWithArgs();

    public native void joinNativeThread();

}