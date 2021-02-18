package com.jdqm.ndktutorials.jni;

public class JNIReference extends BaseOperation {


    @Override
    public void invoke() {
//        errorCacheLocalReference();
//        cacheWithGlobalReference();
//        useWeakGlobalReference();
        print( errorCacheLocalReference(), cacheWithGlobalReference(), useWeakGlobalReference());

    }

    public native String errorCacheLocalReference();
    public native String cacheWithGlobalReference();
    public native String useWeakGlobalReference();
}
