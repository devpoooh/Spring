package com.spring.tv;

public class LgTV implements TV {
	public LgTV() {
		System.out.println("===> LgTV)객체생성");
	}
	public void powerOn() {
		System.out.println("LgTV---전원 켜기");
	}

	public void powerOff() {
		System.out.println("LgTV---전원끄기.");
	}

	public void volumeUp() {
		System.out.println("LgTV---소리 키우기");

	}

	public void volumeDown() {
		System.out.println("LgTV---소리 줄이기.");
	}
}
