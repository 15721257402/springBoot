package com.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.UserMapper;

@Service
public class TestService {
	
	@Autowired
	private UserMapper userMapper;
	
      public String getUserName(){

      	System.out.print("dev提交");
		  System.out.print("dev再次提交");

		  System.out.print("dev提交2019-0103");
		  return userMapper.selectByPrimaryKey(1).getUserName();
      }
}
