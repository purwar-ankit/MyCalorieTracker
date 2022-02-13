apply {
    from("$rootDir/base-module.gradle")
}

dependencies {
    //dependencies defined here will only be used in this module
    "implementation"(project(Modules.core))
 }