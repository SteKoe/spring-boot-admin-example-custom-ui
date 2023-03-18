plugins {
	java
	id("org.springframework.boot") version "3.0.4"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "de.codecentric.boot.admin.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

extra["springBootAdminVersion"] = "3.0.2"

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-webflux")
	implementation("de.codecentric:spring-boot-admin-starter-server")
	implementation("de.codecentric:spring-boot-admin-starter-server")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

dependencyManagement {
	imports {
		mavenBom("de.codecentric:spring-boot-admin-dependencies:${property("springBootAdminVersion")}")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}