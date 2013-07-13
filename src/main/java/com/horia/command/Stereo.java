package com.horia.command;

public class Stereo {

	private int volume =0;
	
	public void on() {
		System.out.println("stereo on");
	}
	
	public void off() {
		System.out.println("stereo off");
	}
	
	public void setCd() {
		System.out.println("stereo setCd");
	}
	
	public void setDvd() {
		System.out.println("stereo DVD");
	}
	public void setRadio() {
		System.out.println("stereo Radio");
	}
	
	public void setVolume(int aVolume) {
		volume=aVolume;
		System.out.println("stereo Volume:"+volume);
	}
}
