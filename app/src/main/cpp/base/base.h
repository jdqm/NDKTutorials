//
// Created by Jdqm on 2021/2/13.
//

#include <android/log.h>
#include <jni.h>

#ifndef NDKTUTORIALS_BASE_H
#define NDKTUTORIALS_BASE_H

#define LOG_TAG "JDQM_JNI"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO,LOG_TAG,__VA_ARGS__)
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG,LOG_TAG,__VA_ARGS__)
#define LOGW(...) __android_log_print(ANDROID_LOG_WARN,LOG_TAG,__VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR,LOG_TAG,__VA_ARGS__)
#endif //NDKTUTORIALS_BASE_H
