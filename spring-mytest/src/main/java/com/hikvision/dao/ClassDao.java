package com.hikvision.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassDao {

	@Autowired
	private UserDao userDao;

	public ClassDao(){
		System.out.println( "classDao chushihua");
	}

	public UserDao getUserDao(){
		System.out.println("getUserDao 方法");
		return userDao;
	}
}
