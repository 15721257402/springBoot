package com.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.boot"})
@MapperScan(basePackages={"com.boot.dao"})
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class ServiceStart {
	public static void main(String[] args) {
        SpringApplication.run(ServiceStart.class, args);
    }
}
