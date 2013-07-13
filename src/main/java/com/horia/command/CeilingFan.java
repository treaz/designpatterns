package com.horia.command;

public class CeilingFan {

	public static final int HIGH = 3;
	public static final int MED = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	
	private String location;
	private int speed;
	
	
	public int getSpeed() {
		return speed;
	}

	public void high() {
		speed = HIGH;
		System.out.println("fan high");
	}
	
	public void med() {
		speed = MED;
		System.out.println("fan med");
	}
	
	public void low() {
		speed = LOW;
	}
	
	public void off() {
		speed = OFF;
		System.out.println("fan off");
	}
	
}
