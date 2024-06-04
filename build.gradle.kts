tasks.withType<GradleBuild> {
    dependsOn(gradle.includedBuilds.forEach{ it.task("build") })
}
