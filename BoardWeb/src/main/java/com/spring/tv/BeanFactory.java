package com.spring.tv;

public class BeanFactory {
	//3. beanName에 해당하는 객체를 생성하여 리턴
	public Object getBean(String beanName) {
		if(beanName.contentEquals("samsung")) {
			return new SamsungTV();
		}else if(beanName.equals("lg")) {
			return new LgTV();
		}
		
		return null;
	}
}
