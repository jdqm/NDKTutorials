package com.jdqm.ndktutorials.jni;

import android.util.Log;

public class JNIException extends BaseOperation {
    private static final String TAG = "JNIException";

    @Override
    public void invoke() {

//        try {
//            doit();
//        } catch (Exception error) {
//            Log.i(TAG, error.getMessage());
//        }

//        try {
//            nativeThrowException();
//        }catch (Exception error){
//            Log.i(TAG, error.getMessage());
//        }
//
        nativeInvokeJavaException();

    }


    private native void doit() throws IllegalArgumentException;

    private native void nativeThrowException() throws IllegalArgumentException;

    /**
     * Native 代码调用 Java 时发生了异常，并不会处理
     */
    private native void nativeInvokeJavaException();

    /**
     * 由 Native 来调用该函数，由于 除数为 0 ，引发异常，在 Native 代码中清除这次异常
     *
     * @return
     */
    private int operation() {
        return 2 / 0;
    }

    /**
     * Native 调用  Java 方方法时，导致异常了并不会立即终止 Native 方法的执行
     *
     * @throws NullPointerException
     */
    private void callback() throws NullPointerException {
        throw new NullPointerException("CatchThrow.callback by Native Code");
    }

}