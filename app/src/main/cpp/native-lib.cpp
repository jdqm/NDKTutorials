#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_jdqm_ndktutorials_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C"
JNIEXPORT void JNICALL
Java_com_jdqm_ndktutorials_MainActivity_callJavaMethod(JNIEnv *env, jobject thiz) {
    jclass jclazz = env->FindClass("com/jdqm/ndktutorials/MainActivity");
    jmethodID jmethodId = env->GetMethodID(jclazz, "sayHello", "()V");
    env->CallVoidMethod(thiz, jmethodId);
}

extern "C"
JNIEXPORT void JNICALL
Java_com_jdqm_ndktutorials_MainActivity_callJavaStaticMethod(JNIEnv *env, jclass clazz) {
    jclass jclazz = env->FindClass("com/jdqm/ndktutorials/MainActivity");
    jmethodID jmethodId = env->GetStaticMethodID(jclazz, "staticSayHello", "()V");
    env->CallStaticVoidMethod(jclazz, jmethodId);
}