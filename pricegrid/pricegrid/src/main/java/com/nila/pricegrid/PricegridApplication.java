package com.nila.pricegrid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.nila.pricegrid.domain")
public class PricegridApplication {

	public static void main(String[] args) {
		SpringApplication.run(PricegridApplication.class, args);
	}

}
