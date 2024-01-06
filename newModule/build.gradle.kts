import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.22"
    application
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

application {
    mainClass.set("MainKt")
}
dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}
tasks.test {
    useJUnitPlatform()
}
repositories {
    mavenCentral()
}
kotlin {
    jvmToolchain(17)
}
tasks.jar {
    manifest {
        attributes["Main-Class"] = "MainKt"
    }
}
tasks.shadowJar {
    archiveClassifier.set("")
}


