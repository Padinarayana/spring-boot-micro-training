package com.example.firstmsclient.api;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class UserClientResource {

	 private static final Logger LOGGER = LoggerFactory.getLogger(UserClientResource.class);
	    @Autowired
	    private RestTemplate restTemplate;
	    
	    @GetMapping("/hello-client")
	    @HystrixCommand(fallbackMethod ="getClientHelloFromFallback" )
	    public String getClientHello() {
	        LOGGER.info("about to call userms");
	        return restTemplate.getForObject("http://firstms/hello", String.class);
	    }
	    
	    private  String getClientHelloFromFallback() {
	        LOGGER.info("Falling Back");
	        return "Coming from the fallback";
	    }
	    
	    
	    @GetMapping("/users-client")
	    @HystrixCommand(fallbackMethod = "getClientUsersFromFallback")
	    public List getClientUsers() {
	        LOGGER.info("about to call users");
	        return restTemplate.getForObject("http://firstms/users", List.class);
	    }
	    
	    
	    public List getClientUsersFromFallback() {
	    	LOGGER.info(" FallBack method for getUsers ");
                 List l=new ArrayList<>();
                 l.add("coming from fallback getClientUsers Method");
	    	return l;
	    }
	    
}
