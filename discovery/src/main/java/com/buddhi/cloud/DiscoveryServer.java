package com.buddhi.cloud;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
@EnableAdminServer
public class DiscoveryServer {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServer.class, args);
	}

}
