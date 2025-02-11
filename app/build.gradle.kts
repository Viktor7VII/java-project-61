plugins {
    id 'java'
    id 'application'
    id 'checkstyle'
}

group 'hexlet.code'
version '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.8.1'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.8.1'
}

application {
    mainClass = 'hexlet.code.App'
}

test {
    useJUnitPlatform()
}

compileJava {
    options.release = 20
}

run {
    standardInput(System.in)
}