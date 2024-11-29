plugins {
    id("io.micronaut.library") version "4.4.4"
}

version = "0.1"
group = "org.example"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("io.micronaut.test:micronaut-test-junit5")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    testImplementation("io.github.nahuel92:wiremock-micronaut:1.8.4")
}

java {
    sourceCompatibility = JavaVersion.toVersion("21")
    targetCompatibility = JavaVersion.toVersion("21")
}


graalvmNative.toolchainDetection = false

micronaut {
    version.set("4.7.1")
    testRuntime("junit5")
}
