package com.jdqm.ndktutorials.model;

import android.util.Log;

public class Animal {
    private static final String TAG = "Animal";


    protected String name;

    public static int num = 0;

    public Animal(String name) {
        this.name = name;
    }


    public String getName() {
        Log.d(TAG,"call getName method");
        return this.name;
    }

    public int getNum() {
        return num;
    }

    // C++ 调用 Java 的实例方法
    public void callInstanceMethod(int num) {
        Log.d(TAG, "call instance method and num is " + num);
    }

    // C++ 调用 Java 的类方法
    public static String callStaticMethod(String str) {

        if (str != null) {
            Log.d(TAG, "call static method with " + str);
        } else {
            Log.d(TAG, "call static method str is null");
        }
        return "";
    }

    public static String callStaticMethod(String[] strs, int num) {
        Log.d(TAG, "call static method with string array " + num);
        if (strs != null) {
//            for (String str : strs) {
//                Log.d(TAG, "str in array is " + str+"");
//            }
            for (int i = 0; i <strs.length ; i++) {
                Log.d(TAG, "str in array is " + strs[i]+ i);
            }
        }
        return "";
    }

    public static void callStaticVoidMethod() {
        Log.d(TAG, "call static void method");
    }
}