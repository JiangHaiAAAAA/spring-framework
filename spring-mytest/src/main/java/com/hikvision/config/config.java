package com.hikvision.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.hikvision")
@EnableAspectJAutoProxy
public class config {

	public config(){
		System.out.println("config 初始化");
	}

	public void say(){
		System.out.println("hhhhh");
	}
}
