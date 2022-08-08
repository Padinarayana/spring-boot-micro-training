package com.example.configclient;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientApplication {

	@Value(("${my-property}"))
    private String myProperty;
    @Value(("${your-property}"))
    private String yourProperty;
 
    @GetMapping("/properties")
    public Map<String, String> getProperties() {
        Map<String, String> propertyMap = new HashMap<>();
        propertyMap.put("myProperty", myProperty);
        propertyMap.put("yourProperty", yourProperty);
 
        return propertyMap;
    }
	
	public static void main(String[] args) {
		
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}
