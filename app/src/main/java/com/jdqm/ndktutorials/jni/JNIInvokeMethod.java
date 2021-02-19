package com.jdqm.ndktutorials.jni;

import com.jdqm.ndktutorials.thread.ICallbackMethod;
import com.jdqm.ndktutorials.thread.IThreadCallback;

public class JNIInvokeMethod extends BaseOperation {
    @Override
    public void invoke() {

    }

    public native void nativeCallback(ICallbackMethod mICallbackMethod );
    public native void nativeThreadCallback(IThreadCallback mIThreadCallback);
}
