package de.codecentric.boot.admin.example.customui;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class CustomUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomUiApplication.class, args);
	}

}
