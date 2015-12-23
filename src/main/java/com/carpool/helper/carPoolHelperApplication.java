package com.carpool.helper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({ "com.carpool.controller", "com.carpool.helper",
"com.carpool.beans" })
public class carPoolHelperApplication {

	public static void main(String[] args) {
		SpringApplication.run(carPoolHelperApplication.class, args);
		System.out.println("CarPool Application Started");
	}

}
