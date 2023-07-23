plugins {
	java
	id("org.springframework.boot") version "3.1.0"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "com.kodilla"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.jetbrains:annotations:24.0.0")
	implementation("junit:junit:4.13.1")
	implementation("au.com.dius:pact-jvm-provider-spring_2.12:3.6.15")
	implementation("au.com.dius:pact-jvm-provider-spring_2.12:3.6.15")
	implementation("au.com.dius:pact-jvm-provider-spring_2.12:3.6.15")
	implementation("au.com.dius:pact-jvm-provider-spring_2.12:3.6.15")
	implementation("au.com.dius:pact-jvm-provider-spring_2.12:3.6.15")
	implementation("au.com.dius:pact-jvm-provider-spring_2.12:3.6.15")
	testImplementation("junit:junit:4.13.1")
	testImplementation(project(mapOf("path" to ":kodilla-stream")))
	runtimeOnly("com.mysql:mysql-connector-j:8.1.0")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
