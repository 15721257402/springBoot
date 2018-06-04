package com.boot;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="boot-service")
public interface TestInterface {
	
	@RequestMapping(value = "/test/test",method = RequestMethod.GET)
	public String test(String isWho);
}
