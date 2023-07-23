plugins {
	java
}

group = "com.kodilla"
version = "0.0.1-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
    implementation("org.webjars.bower:RWD-Table-Patterns:5.2.5")
	implementation("io.github.archimandrite:Entity:1.0.0")
	implementation("org.webjars.bower:RWD-Table-Patterns:5.2.5")
    implementation("au.com.dius:pact-jvm-provider-spring_2.12:3.6.15")
    implementation("au.com.dius:pact-jvm-provider-spring_2.12:3.6.15")
    implementation("au.com.dius:pact-jvm-provider-spring_2.12:3.6.15")
	implementation("au.com.dius:pact-jvm-provider-spring_2.12:3.6.15")
	implementation("au.com.dius:pact-jvm-provider-spring_2.12:3.6.15")
	implementation("au.com.dius:pact-jvm-provider-spring_2.12:3.6.15")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
