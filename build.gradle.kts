plugins {
	java
	id("org.springframework.boot") version "3.1.4"
	id("io.spring.dependency-management") version "1.1.3"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	implementation("org.springframework.cloud:spring-cloud-starter-gateway:4.0.7")
	implementation("org.springframework.boot:spring-boot-starter-oauth2-client:3.1.4")


}

tasks.withType<Test> {
	useJUnitPlatform()
}
