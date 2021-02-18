//
// Created by Jdqm on 2021/2/13.
//

#include <jni.h>
#include <base.h>
#include <cstdio>
#include <jvm.h>

jstring getMessage(JNIEnv *env, jobject job) {
    return env->NewStringUTF("This is message from C++");
}

jint plus(JNIEnv *env, jobject job, int x, int y) {
    return x + y;
}

/**
 * Java层的getNativeString()与native层的getMessage()绑定
 * Java层的sum()与native层的plus()绑定
 */
static JNINativeMethod gMethods[] = {
        {"getNativeString", "()Ljava/lang/String;", (void *) getMessage},
        {"sum",             "(II)I",                (void *) plus},
};

int registerNativeMethods(JNIEnv *env, const char *name,
                          const JNINativeMethod *methods,
                          jint nMethods) {
    jclass jclass1 = env->FindClass(name);
    if (jclass1 == nullptr) {
        return JNI_FALSE;
    }

    if (env->RegisterNatives(jclass1, gMethods, nMethods) < 0) {
        return JNI_FALSE;
    }

    return JNI_OK;
}

JNIEXPORT int JNICALL JNI_OnLoad (JavaVM *vm , void *reserved) {
    JNIEnv *env;
    if (vm->GetEnv(reinterpret_cast<void **>(&env), JNI_VERSION_1_6) != JNI_OK) {
        return JNI_FALSE;
    }
    registerNativeMethods(env, "com/jdqm/ndktutorials/jni/JNIDynamicLoad", gMethods, sizeof(gMethods) / sizeof(gMethods[0]));

    LOGD("jni onLoad call");
    return JNI_VERSION_1_6;
}