plugins {
    java
    jacoco
}

group = "it.unibo.smartgh"
version = "0.1.0"

jacoco {
    toolVersion = "0.8.8"
    reportsDirectory.set(layout.buildDirectory.dir("customJacocoReportDir"))
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(project(":common"))
    testImplementation(project(":clientCommunicationGateway"))
    testImplementation(project(":brightnessService"))
    testImplementation(project(":humidityService"))
    testImplementation(project(":soilMoistureService"))
    testImplementation(project(":temperatureService"))
    testImplementation(project(":operationService"))
    testImplementation("org.skyscreamer:jsonassert:1.5.1")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "it.unibo.smartgh.greenhouse.GreenhouseServiceLauncher"
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.jacocoTestReport {
    reports {
        xml.required.set(false)
        csv.required.set(false)
        html.outputLocation.set(layout.buildDirectory.dir("jacocoHtml"))
    }
}

