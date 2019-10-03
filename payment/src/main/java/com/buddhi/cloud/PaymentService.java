package com.buddhi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class PaymentService {

	public static void main(String[] args) {
		SpringApplication.run(PaymentService.class, args);
	}

	@GetMapping("/")
	public String getPayment(){
		return "payment 1";
	}
}
