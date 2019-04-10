package com.boot2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot2.service.TestService;

@RestController
@RequestMapping("test")
public class TestController {
    
	@Autowired
	private TestService testService;
	
	//hahahahss
	@RequestMapping("test")
	public String test(@RequestBody String isWho){
		return isWho+"调用service"+"this is service a method return"+testService.getUserName();
	}
}
