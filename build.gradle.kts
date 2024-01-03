plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.seleniumhq.selenium:selenium-java:4.15.0")
    implementation("org.seleniumhq.selenium:selenium-chrome-driver:4.15.0")
    implementation("org.seleniumhq.selenium:selenium-devtools-v120:4.16.0")

    testImplementation("org.testng:testng:7.8.0")

    implementation("org.slf4j:slf4j-api:2.0.9")
    testImplementation("org.slf4j:slf4j-reload4j:2.0.9")
    implementation("org.apache.logging.log4j:log4j-core:2.22.0")
}

tasks.test {
    useTestNG()
}