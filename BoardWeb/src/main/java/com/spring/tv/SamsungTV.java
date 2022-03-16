package com.spring.tv;

public class SamsungTV implements TV{
	public SamsungTV() {
		System.out.println("===> SamsungTV 객체생성");
	}
	public void powerOn() {
		System.out.println("SamsungTV---전원켜기");
	}

	public void powerOff() {
		System.out.println("SamsungTV---전원끄기");
	}

	public void volumeUp() {
		System.out.println("SamsungTV---소리 키우기.");

	}

	public void volumeDown() {
		System.out.println("SamsungTV---소리 줄이기.");
	}
}
