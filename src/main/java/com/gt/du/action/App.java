package com.gt.du.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	
	
	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "myConsumer.xml" });
		context.start();
		DemoAction demoAction = (DemoAction) context.getBean("demoAction"); // ��ȡԶ�̷������
		demoAction.start("xxx");
		
	}
	

}
