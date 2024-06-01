plugins {
    alias(libs.plugins.kotlin.jvm)
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
