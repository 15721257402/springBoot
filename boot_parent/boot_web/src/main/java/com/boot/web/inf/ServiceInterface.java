package com.boot.web.inf;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="boot-service")
public interface ServiceInterface {
		
		@RequestMapping(value = "/test/test",method = RequestMethod.GET)
		public String test(String isWho);

}
