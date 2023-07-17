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
	implementation("dev.the-fireplace:Erroring-Entity-Remover:1.0.2+1.18")
	implementation("dev.the-fireplace:Erroring-Entity-Remover:1.0.2+1.18")
	implementation("dev.the-fireplace:Erroring-Entity-Remover:1.0.2+1.18")
	implementation("io.github.andriamarosoa:Entity:1.0.0")
	implementation("org.webjars.bower:RWD-Table-Patterns:5.2.5")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
