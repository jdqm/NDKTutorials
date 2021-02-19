package com.jdqm.ndktutorials.jni;

public class JNIReferenceType extends BaseOperation{

    public native String callNativeStringArray(String[] strArray);

    @Override
    public void invoke() {

    }
}
