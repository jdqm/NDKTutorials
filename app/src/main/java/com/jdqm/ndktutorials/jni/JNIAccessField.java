package com.jdqm.ndktutorials.jni;

import android.util.Log;

import com.jdqm.ndktutorials.model.Animal;

/**
 * JNI访问类的字段
 */
public class JNIAccessField extends BaseOperation {
    private static final String TAG = "JNIAccessField";
    final Animal animal = new Animal("animal");
    static int num = 1;

    @Override
    public void invoke() {

        // 访问实例的字段
        accessInstanceFiled(animal);
        Log.d(TAG, "after access instance field,the name is " + animal.getName());

        // 访问静态类的字段
        accessStaticField(animal);
        Log.d(TAG, "after access static field,the num is " + Animal.num);

        staticAccessInstanceField();
        Log.d(TAG, "--staticAccessInstanceField--,the num is " + JNIAccessField.num);

        // 访问实例的方法
        callInstanceMethod(animal);
        // 访问静态类的方法
        callStaticMethod(animal);
    }

    private native int accessInstanceFiled(Animal animal);

    private native int accessStaticField(Animal animal);

    private native void callInstanceMethod(Animal animal);

    private native void callStaticMethod(Animal animal);

    public static native void staticAccessInstanceField();

}
