/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_synthbot_audioplugin_vst_vst2_JVstHost2 */

#ifndef _Included_com_synthbot_audioplugin_vst_vst2_JVstHost2
#define _Included_com_synthbot_audioplugin_vst_vst2_JVstHost2
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_synthbot_audioplugin_vst_vst2_JVstHost2
 * Method:    loadPlugin
 * Signature: (Ljava/lang/String;)J
 */
JNIEXPORT jlong JNICALL Java_com_synthbot_audioplugin_vst_vst2_JVstHost2_loadPlugin
  (JNIEnv *, jclass, jstring);

/*
 * Class:     com_synthbot_audioplugin_vst_vst2_JVstHost2
 * Method:    unloadPlugin
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_com_synthbot_audioplugin_vst_vst2_JVstHost2_unloadPlugin
  (JNIEnv *, jclass, jlong);

/*
 * Class:     com_synthbot_audioplugin_vst_vst2_JVstHost2
 * Method:    getVstVersion
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_synthbot_audioplugin_vst_vst2_JVstHost2_getVstVersion
  (JNIEnv *, jclass, jlong);

#ifdef __cplusplus
}
#endif
#endif
