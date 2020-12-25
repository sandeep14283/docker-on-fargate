package com.aws.docker.fargate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@RestController
public class FargateApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FargateApplication.class, args);
	}

	@GetMapping("/")
	public String getApp(){
          return "You have accessed the application !";
		}
		
		@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(FargateApplication.class);
    }

}
