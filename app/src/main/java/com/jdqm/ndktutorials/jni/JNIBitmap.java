package com.jdqm.ndktutorials.jni;

import android.graphics.Bitmap;

public class JNIBitmap extends BaseOperation {

    @Override
    public void invoke() {

    }

    public native Bitmap callNativeMirrorBitmap(Bitmap bitmap);
}