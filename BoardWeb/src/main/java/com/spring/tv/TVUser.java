package com.spring.tv;

public class TVUser {
	public static void main(String[] args) {
		//객체를 생성하는 클래스 생성
		BeanFactory factory = new BeanFactory(); //1. 객체 생성
		//2. getBean() 메서드 호출
		TV tv = (TV) factory.getBean(args[0]); //"samsung" or "lg" args는 run as에서 알규먼트 넣을 수 있음. *(별첨)참고
		//4. (리턴받은)객체를 이용하여 실행
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();	
	}
}

/*
 * 아규먼트 넣기
 * 마우스 우클릭 - run as - run configurations - arguments에 값 입력 - run
 * */