plugins {
    kotlin("jvm") version "1.5.30"
}

allprojects {
    group = "aws.sdk.kotlin.example"
    version = "0.7.0-alpha"

    repositories {
        mavenLocal()
        mavenCentral()
    }
}
