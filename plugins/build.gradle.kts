plugins {
    kotlin("jvm") version "1.9.24"
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        register("build-jvm") {
            id = "build-jvm"
            implementationClass = "com.github.sawafrolov.otuskotlin.plugins.BuildPluginJvm"
        }
        register("build-multiplatform") {
            id = "build-multiplatform"
            implementationClass = "com.github.sawafrolov.otuskotlin.plugins.BuildPluginMultiplatform"
        }
    }
}
