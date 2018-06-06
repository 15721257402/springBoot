package com.boot.web.controller;

import org.boot.utils.mq.ActiveMqSendUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.TestInterface;
@Controller
@RequestMapping("/web")
public class WebController {
	
    @Autowired
    private TestInterface testservice;
     
    
    @RequestMapping("/web/index")
    @ResponseBody
   public String index(){
    	ActiveMqSendUtils.addMailToMailQueue("我是邮件内容");
    	ActiveMqSendUtils.addSmsToSmsQueue("我是短信内容");
	   return testservice.test("web");
   }
}
