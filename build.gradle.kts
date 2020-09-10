import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.0"
}
group = "me.af"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    implementation("io.javalin:javalin:3.6.0")
    implementation("org.slf4j:slf4j-simple:1.7.30")
    implementation("me.liuwj.ktorm:ktorm-core:3.0.0")
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}