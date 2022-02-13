apply {
    from("$rootDir/compose-module.gradle")
}

dependencies {
    //dependencies defined here will only be used in this module
    "implementation"(project(Modules.core))
    "implementation"(project(Modules.trackerDomain))

    "implementation"(Coil.coilCompose)



}