package com.jdqm.ndktutorials.jni;

public class JNIProductAndConsumerThread extends BaseOperation {

    @Override
    public void invoke() {
        startProductAndConsumerThread();
    }

    public native void  startProductAndConsumerThread();

    public native void  endProductAndConsumerThread();
}
