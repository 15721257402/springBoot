package com.boot2.service;

import com.boot2.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	@Autowired
	private UserMapper userMapper;
	
      public String getUserName(){
		  System.out.print("初次提交2222");
		  System.out.print("2");
		  return userMapper.selectByPrimaryKey(1).getUserName();
      }
}
