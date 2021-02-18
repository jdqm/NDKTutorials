package com.jdqm.ndktutorials;

public class JNIDynamicLoad {
    static {
        System.loadLibrary("base-lib");
    }

    public native int sum(int a, int b);

    public native String  getNativeString();
}
