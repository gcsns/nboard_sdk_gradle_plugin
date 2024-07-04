package com.gamechangesns.nboard_sdk_gradle_plugin
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project

class ServicesPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.android.buildFeatures.dataBinding = true
        project.android.compileOptions.sourceCompatibility JavaVersion.VERSION_1_8
        project.android.compileOptions.targetCompatibility JavaVersion.VERSION_1_8
        project.android.aaptOptions.noCompress ".dict"
        project.repositories {repository->
            flatDir {
                dirs 'libs'
            }
        }

        project.dependencies {
            implementation(name:'gc_nboard_sdk', ext:'aar')
            implementation 'androidx.appcompat:appcompat:1.2.0'
            implementation 'androidx.constraintlayout:constraintlayout:2.0.4'
            //dynamic permissions
            implementation "com.karumi:dexter:6.2.0"
            //firebase
            implementation "com.google.firebase:firebase-core:17.3.0"
            //implementation "com.google.firebase:firebase-crashlytics:17.2.2"
            implementation "com.google.firebase:firebase-ml-vision:24.0.2"
            implementation "com.google.firebase:firebase-ml-vision-object-detection-model:19.0.4"
            implementation "com.google.firebase:firebase-ml-vision-face-model:20.0.0"

            //detect faces
            implementation "com.amazonaws:aws-android-sdk-rekognition:2.10.0"
            implementation "com.squareup.okhttp3:okhttp:4.7.2"
            implementation "com.amazonaws:aws-android-sdk-s3:2.10.0"
            implementation 'com.jakewharton.timber:timber:4.7.1'
            implementation 'com.github.jdsingh:papertrail-timber:1.0.3'
            api 'com.theartofdev.edmodo:android-image-cropper:2.8.0'
            implementation "androidx.camera:camera-core:1.0.0-beta11"
            implementation "androidx.camera:camera-camera2:1.0.0-beta11"
            implementation "androidx.camera:camera-lifecycle:1.0.0-beta11"
            implementation "androidx.camera:camera-view:1.0.0-alpha18"
            implementation "androidx.camera:camera-extensions:1.0.0-alpha18"

            implementation 'org.greenrobot:eventbus:3.2.0' //EventBus
            implementation 'com.github.tdebatty:java-string-similarity:v1.2.1'
            implementation 'com.github.beyka:androidtiffbitmapfactory:0.9.8.7'
            implementation 'com.squareup.retrofit2:converter-jackson:2.9.0'
            implementation 'com.squareup.retrofit2:adapter-rxjava2:2.8.1'
            implementation 'com.squareup.okhttp3:logging-interceptor:4.6.0'
            implementation 'com.squareup.retrofit2:retrofit:2.9.0'
            implementation 'com.jakewharton.picasso:picasso2-okhttp3-downloader:1.1.0'
        }
    }
}
