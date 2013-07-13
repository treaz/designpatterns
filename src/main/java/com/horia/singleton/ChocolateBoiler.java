package com.horia.singleton;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler instance;
	
	private ChocolateBoiler() {
	}
	
	public static ChocolateBoiler getInstance() {
		if (null == instance) {
			instance = new ChocolateBoiler();
		}
		return instance;
	}
	
}
