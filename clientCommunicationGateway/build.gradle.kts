plugins {
    id("java")
}

group = "it.unibo.smartgh"
version = "0.1.0-archeo+47042ec"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))
    testImplementation(project(":greenhouseService"))
    testImplementation(project(":brightnessService"))
    testImplementation(project(":operationService"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "it.unibo.smartgh.clientCommunicationGateway.ClientCommunicationServiceLauncher"
    }
}