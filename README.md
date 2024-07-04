# nboard_sdk_gradle_plugin
This plugin automatically adds dependencies related to CameraX.

Simply add these to project level build.gradle

buildscript {
  repositories {
    maven {
      url "https://plugins.gradle.org/m2/"
    }
  }
  dependencies {
    classpath "gradle.plugin.com.gamechangesns:nboard_sdk_gradle_plugin:1.0"
  }
}

apply plugin: "com.gamechangesns.nboard_sdk_gradle_plugin"
