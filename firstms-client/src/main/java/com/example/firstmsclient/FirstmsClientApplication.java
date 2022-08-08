package com.example.firstmsclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class FirstmsClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstmsClientApplication.class, args);
	}

}
