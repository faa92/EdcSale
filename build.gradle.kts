plugins {
    id("java")
    id("io.qameta.allure") version "2.11.2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.seleniumhq.selenium:selenium-java:4.18.1")
    implementation("org.seleniumhq.selenium:selenium-chrome-driver:4.18.1")
    implementation("org.seleniumhq.selenium:selenium-devtools-v120:4.18.1")

    implementation("org.testng:testng:7.8.0")

    implementation("org.slf4j:slf4j-api:2.0.9")
    implementation("org.slf4j:slf4j-reload4j:2.0.9")
    implementation("org.apache.logging.log4j:log4j-core:2.22.0")
    implementation("org.apache.logging.log4j:log4j-core:2.17.1")

    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")

    implementation("org.apache.commons:commons-collections4:4.4")
    implementation(dependencyNotation = "com.opencsv:opencsv:5.7.1")


}


tasks.test {
    useTestNG()
}


