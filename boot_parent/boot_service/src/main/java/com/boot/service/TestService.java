package com.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.UserMapper;

@Service
public class TestService {
	
	@Autowired
	private UserMapper userMapper;
	
      public String getUserName(){
		  System.out.print("初次提交");
		  System.out.print("再次提交2");
		  return userMapper.selectByPrimaryKey(1).getUserName();
      }
}
