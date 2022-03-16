package com.spring.tv;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		//1. spring 컨테이너 구동 (.xml을 로딩하여 구동한다.)
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. spring 컨테이너로부터 필요한 객체를 요청한다.
		TV tv= (TV)factory.getBean("tv"); //xml의 id로 요청
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}