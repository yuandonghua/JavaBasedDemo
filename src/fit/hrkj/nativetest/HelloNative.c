#include "hrkj_nativetest_HelloNative.h"
#include <stdio.h>

JNIEXPORT void JNICALL Java_hrkj_nativetest_HelloNative_sayHello(JNIEnv * env, jobject obj)
{
	printf("Hello,JNI");
}