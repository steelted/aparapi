java ^
 -Djava.library.path=../../com.amd.aparapi.jni/dist ^
 -Dcom.amd.aparapi.executionMode=%1 ^
 -Dcom.amd.aparapi.enableProfiling=false ^
 -Dcom.amd.aparapi.enableVerboseJNI=false ^
 -classpath ../../com.amd.aparapi/dist/aparapi.jar;life.jar ^
 com.amd.aparapi.sample.life.Main


