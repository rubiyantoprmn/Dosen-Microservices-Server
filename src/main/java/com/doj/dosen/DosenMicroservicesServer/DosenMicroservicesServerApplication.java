package com.doj.dosen.DosenMicroservicesServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
public class DosenMicroservicesServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DosenMicroservicesServerApplication.class, args);
	}
}
