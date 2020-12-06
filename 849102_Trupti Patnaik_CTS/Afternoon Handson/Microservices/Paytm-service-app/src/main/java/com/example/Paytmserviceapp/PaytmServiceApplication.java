package com.example.Paytmserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PaytmServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaytmServiceApplication.class, args);
	}

}