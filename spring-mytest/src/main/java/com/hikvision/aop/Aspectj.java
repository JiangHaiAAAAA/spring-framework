package com.hikvision.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aspectj {

	@Pointcut("execution(* com.hikvision.dao.UserDao.*(..))")
	public void pointCutExecution(){

	}

	@Before("pointCutExecution()")
	public  void before(){
		System.out.println("----aop 前置通知-------");
	}

	@After("pointCutExecution()")
	public void after(){
		System.out.println("----aop 后置通知----");
	}

	/*@Around("pointCutExecution()")
	public void around(){
		System.out.println("----around 环绕通知-----");
	}*/
}
