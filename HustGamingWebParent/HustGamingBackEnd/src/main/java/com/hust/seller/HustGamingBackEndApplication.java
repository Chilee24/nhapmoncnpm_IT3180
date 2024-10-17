package com.hust.seller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan()
public class HustGamingBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(HustGamingBackEndApplication.class, args);
	}

}
