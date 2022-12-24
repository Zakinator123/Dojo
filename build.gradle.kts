plugins {
    id("java")
}

group = "org.dojo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
