//
// Created by Jdqm on 2021/2/13.
//


#ifndef NDKTUTORIALS_JVM_H
#define NDKTUTORIALS_JVM_H

#include "base.h"
#include "jni.h"

#ifdef __cplusplus
extern "C" {
#endif
void setJvm(JavaVM *jvm);


JavaVM *getJvm();
#ifdef __cplusplus
}
#endif

#endif //NDKTUTORIALS_JVM_H
