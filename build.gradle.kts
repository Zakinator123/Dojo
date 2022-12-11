plugins {
    id("java")
}

group = "org.dojo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
