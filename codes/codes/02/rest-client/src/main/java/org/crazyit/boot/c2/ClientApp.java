package org.crazyit.boot.c2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ClientApp {

	public static void main(String[] args) {
		SpringApplication.run(ClientApp.class, args);
	}

}
