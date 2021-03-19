package com.hikvision;

import com.hikvision.config.config;
import com.hikvision.dao.ClassDao;
import com.hikvision.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {


	public static void main(String[] args) {

		//ApplicationContext ac = new AnnotationConfigApplicationContext(config.class);

		AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext();
		//关闭循环依赖
		//ac.setAllowCircularReferences(false);
		ac.register(config.class);
		ac.refresh();


		UserDao c = (UserDao) ac.getBean(UserDao.class).getClassDao().getUserDao();

		ClassDao cc = (ClassDao) ac.getBean("classDao");
		c.say();
	}
}
