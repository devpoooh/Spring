package com.spring.tv;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		//1. spring �����̳� ���� (.xml�� �ε��Ͽ� �����Ѵ�.)
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. spring �����̳ʷκ��� �ʿ��� ��ü�� ��û�Ѵ�.
		TV tv= (TV)factory.getBean("tv"); //xml�� id�� ��û
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}