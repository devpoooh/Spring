package com.spring.tv;

public class TVUser {
	public static void main(String[] args) {
		//��ü�� �����ϴ� Ŭ���� ����
		BeanFactory factory = new BeanFactory(); //1. ��ü ����
		//2. getBean() �޼��� ȣ��
		TV tv = (TV) factory.getBean(args[0]); //"samsung" or "lg" args�� run as���� �˱Ը�Ʈ ���� �� ����. *(��÷)����
		//4. (���Ϲ���)��ü�� �̿��Ͽ� ����
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();	
	}
}

/*
 * �ƱԸ�Ʈ �ֱ�
 * ���콺 ��Ŭ�� - run as - run configurations - arguments�� �� �Է� - run
 * */