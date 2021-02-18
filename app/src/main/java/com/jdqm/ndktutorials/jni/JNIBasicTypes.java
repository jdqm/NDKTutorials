package com.jdqm.ndktutorials.jni;

public class JNIBasicTypes {
    static {
        System.loadLibrary("native-lib");
    }

    public native int callNativeInt(int num);

    public native byte callNativeByte(byte b);

    public native char callNativeChar(char ch);

    public native short callNativeShort(short sh);

    public native long callNativeLong(long l);

    public native float callNativeFloat(float f);

    public native double callNativeDouble(double d);

    public native boolean callNativeBoolean(boolean value);
}