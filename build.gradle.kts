plugins {
    id("java")
    alias(libs.plugins.gitSemVer)
}

group = "it.unibo.smartgh"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.vertx.core)
    implementation(libs.vertx.web)
    implementation(libs.vertx.web.client)
    implementation(libs.vertx.mqtt)
    testImplementation(libs.junit.api)
    testRuntimeOnly(libs.junit.engine)
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}