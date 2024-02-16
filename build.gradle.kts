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
    implementation("org.seleniumhq.selenium:selenium-java:4.17.0")
    implementation("org.seleniumhq.selenium:selenium-chrome-driver:4.17.0")
    implementation("org.seleniumhq.selenium:selenium-devtools-v120:4.17.0")

    implementation("org.testng:testng:7.8.0")

    implementation("org.slf4j:slf4j-api:2.0.9")
    testImplementation("org.slf4j:slf4j-reload4j:2.0.9")
    implementation("org.apache.logging.log4j:log4j-core:2.22.0")

    testImplementation("io.qameta.allure:allure-testng:2.22.2")
    testImplementation("io.qameta.allure:allure-java-commons:2.22.2")
    testImplementation("io.qameta.allure:allure-assertj:2.22.2")
    testImplementation("io.qameta.allure:allure-rest-assured:2.22.2")
    testImplementation("io.qameta.allure:allure-commandline:2.22.2")
    testImplementation("org.aspectj:aspectjweaver:1.9.21")

    implementation("org.apache.logging.log4j:log4j-core:2.17.1")    //todo


}


tasks.test {
    useTestNG()
}


