package com.example.Assign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaServer
@RestController
//@EnableSwagger2
public class AssignApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignApplication.class, args);
	}
	@RequestMapping(value = "/eureka/")
	public String home() {
		return "Eureka Client application";
	}

}
