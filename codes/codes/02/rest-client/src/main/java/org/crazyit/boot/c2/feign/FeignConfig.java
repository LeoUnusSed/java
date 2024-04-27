package org.crazyit.boot.c2.feign;

import org.springframework.context.annotation.Bean;

import feign.Feign;
import feign.gson.GsonDecoder;

public class FeignConfig {

	@Bean
	public PersonClient personClient() {
		return Feign.builder()
				.decoder(new GsonDecoder())
				.target(PersonClient.class, "http://localhost:8080/");
	}
}
