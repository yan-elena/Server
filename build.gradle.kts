plugins {
    id("java")
    id("org.danilopianini.git-sensitive-semantic-versioning-gradle-plugin") version "0.3.24"
    //alias(libs.plugins.gitSemVer)
}

group = "it.unibo.smartgh"
version = "1.0-SNAPSHOT"

var vertx = "4.3.3"
var junit = "5.8.1"

repositories {
    mavenCentral()
}
allprojects{
    apply(plugin = "java")
    apply(plugin = "org.danilopianini.git-sensitive-semantic-versioning-gradle-plugin")
    dependencies {
        implementation("io.vertx:vertx-core:$vertx")
        implementation("io.vertx:vertx-web:$vertx")
        implementation("io.vertx:vertx-web-client:$vertx")
        implementation("io.vertx:vertx-mqtt:$vertx")
        testImplementation("org.junit.jupiter:junit-jupiter-api:$junit")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junit")
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}