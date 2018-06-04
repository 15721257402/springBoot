package com.boot.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer  
@SpringBootApplication  
public class EurekaServerApplication {  
  
    
    public static void main(String[] args) {  
    	SpringApplication boot=new SpringApplication(EurekaServerApplication.class);
//    	boot.setAdditionalProfiles("application-dev.properties");
        boot.run(args);  
    }  
}  
