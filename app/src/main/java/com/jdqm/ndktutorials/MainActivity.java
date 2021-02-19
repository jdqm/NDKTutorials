package com.jdqm.ndktutorials;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.jdqm.ndktutorials.jni.JNIAccessField;
import com.jdqm.ndktutorials.jni.JNIBasicTypes;
import com.jdqm.ndktutorials.jni.JNIDynamicLoad;
import com.jdqm.ndktutorials.jni.JNIReference;
import com.jdqm.ndktutorials.jni.JNIString;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());

        callJavaMethod();
        callJavaStaticMethod();

        //动态注册native方法
        JNIDynamicLoad dynamicLoad = new JNIDynamicLoad();
        Log.d(TAG, "getNativeString: " + dynamicLoad.getNativeString());
        Log.d(TAG, "1+2= " + dynamicLoad.sum(1, 2));

        //基本数据类型
        JNIBasicTypes jniBasicTypes = new JNIBasicTypes();
        jniBasicTypes.callNativeInt(10);
        jniBasicTypes.callNativeBoolean(false);

        //jstring
        JNIString jniString = new JNIString();
        jniString.reverseString("Hello str");

        //引用
        JNIReference jniReference = new JNIReference();
        jniReference.invoke();

        //访问类字段
        JNIAccessField accessField = new JNIAccessField();
        accessField.invoke();

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();


    public void sayHello() {
        Log.d(TAG, "Hello I am Java method.");
    }

    public static void staticSayHello() {
        Log.d(TAG, "Hello I am Java static method.");
    }

    public native void callJavaMethod();

    public static native void callJavaStaticMethod();
}