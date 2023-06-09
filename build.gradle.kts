plugins {
    java
    application
    idea
    alias(libs.plugins.springframework)
    alias(libs.plugins.flyway)
}

group = "ru.olga.prosta"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
    maven("https://jitpack.io")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(libs.spring.starter)
    implementation(libs.spring.web)
    implementation(libs.spring.security)
    implementation(libs.bundles.telegram)
    implementation(libs.bundles.data)
    implementation(libs.bundles.util)
    implementation(libs.okhttp)

    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)

    testCompileOnly(libs.lombok)
    testAnnotationProcessor(libs.lombok)
    testImplementation(libs.bundles.test)
}

tasks.withType<Test> {
    useJUnitPlatform()
}
