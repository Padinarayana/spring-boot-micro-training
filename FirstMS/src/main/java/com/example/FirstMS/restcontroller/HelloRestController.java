package com.example.FirstMS.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstMS.RestResource.UserRestController;

@RestController
public class HelloRestController {
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(HelloRestController.class);
	@GetMapping("/hello")
	public String getmsg() {
		LOGGER.info("Hello method call.");
		return "Hello World";
	}
	
	@GetMapping("/hello/{name}")
	public String getUser(@PathVariable String name)  {
		LOGGER.info("Hello method with dynamic call.");
		return "hello "+name+"!";
	}
	
}
