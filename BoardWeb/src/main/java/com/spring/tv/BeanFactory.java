package com.spring.tv;

public class BeanFactory {
	//3. beanName�� �ش��ϴ� ��ü�� �����Ͽ� ����
	public Object getBean(String beanName) {
		if(beanName.contentEquals("samsung")) {
			return new SamsungTV();
		}else if(beanName.equals("lg")) {
			return new LgTV();
		}
		
		return null;
	}
}
