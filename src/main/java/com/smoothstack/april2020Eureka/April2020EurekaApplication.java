package com.smoothstack.april2020Eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class April2020EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(April2020EurekaApplication.class, args);
	}

}
