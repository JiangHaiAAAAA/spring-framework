package com.hikvision.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;


@Component
public class UserDao implements InitializingBean {

	@Autowired
	private ClassDao classDao;

	public UserDao() {
		System.out.println("userDao shichuhua");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(" afterPropertiesSet 生命周期回调方法");
	}

	/**
	 * bean生命周期的回调方法
	 * 有三种实现方式
	 * 1，类实现 InitializingBean接口，然后重写 afterPropertiesSet
	 * 2，xml文件中配置init-method方法
	 * 3，使用@PostConstruct注解
	 * 多个生命周期回调方法同时存在时，调用顺序为 3 1 2
	 */
	@PostConstruct
	public void postConstruct(){
		System.out.println("PostConstruct 注解 调用生命周期的回调方法");
	}


	public void say() {
		System.out.println("我是dao的say");
	}

	public ClassDao getClassDao() {
		return classDao;
	}
}
