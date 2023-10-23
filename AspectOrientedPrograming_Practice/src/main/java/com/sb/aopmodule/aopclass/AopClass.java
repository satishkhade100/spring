package com.sb.aopmodule.aopclass;

import java.util.List;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.sb.aopmodule.model.Student;


@Aspect
@Component
public class AopClass {


	// import aop depedancy
	
	
	
	
	/*
	 * Before advice: Advice that runs before a join point but that does not have the ability to prevent execution flow proceeding to the join point (unless it throws an exception).
	   After returning advice: Advice to be run after a join point completes normally (for example, if a method returns without throwing an exception).
	   After throwing advice: Advice to be run if a method exits by throwing an exception.
       After (finally) advice: Advice to be run regardless of the means by which a join point exits (normal or exceptional return).
       Around advice: Advice that surrounds a join point such as a method invocation. This is the most powerful kind of advice. Around advice can perform custom behavior before and after the method invocation. 
       It is also responsible for choosing whether to proceed to the join point or to shortcut the advised method execution by returning its own return value or throwing an exception.*/
	
	
	
	Logger logger=LoggerFactory.getLogger(AopClass.class);
	
	@Before(value = "execution(public * com.sb.aopmodule.controller.HomeController.getstudata())")
	public void firstmethodexecution()
	{
		
		System.out.println("@Before advice: excecutes before method calling in Homecontroller..if exception occur or not");
		logger.info("Firstmethod execution of myclass");
		
	}
	
	
	@After(value = "execution(public * com.sb.aopmodule.controller.HomeController.getstudata())")
	public void secondmethodexecution()
	{
		System.out.println("@After advice: excecutes after method calling in Homecontroller..if exception occur or not");
	//	logger.debug("sencond mehod ex");
	}
	

	@AfterThrowing(value = "execution(public * com.sb.aopmodule.controller.HomeController.getstudata())")
	public void thirdmethodexecution()
	{
		//will work before exception
		System.out.println("@AfterThrowing: executing if exception throwing in getstudata method in home controller");
	//	logger.debug("sencond mehod ex");
	
		
	}
	
	@Around(value = "execution(public * com.sb.aopmodule.controller.HomeController.getstudata())")
	public void fourthmethodexecution()
	{
		
		System.out.println("@Around: Advice invoked ");
		//to understand more advice comment fourthmethodexecution()

	
	}
	
	
	@AfterReturning(value = "execution(public * com.sb.aopmodule.controller.HomeController.getstudata())")
	public void fifthmethodexecution()
	{
		
		System.out.println("@AfterReturning:  advice invoked if method executes normally i.e. HomeController.getstudata())");
	
	}
	
	
	
	
	
	
	
	
	
	
}
