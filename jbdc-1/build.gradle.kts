plugins {
    id("java")
    application
}

group = "cc.ivanmin"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation("com.mysql:mysql-connector-j:9.3.0")
}

application {
    mainClass = "cc.ivanmin.JDBCMain"
}

tasks.test {
    useJUnitPlatform()
}