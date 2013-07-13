package com.horia.templateMethod;

public class Coffee extends CaffeineBewerage {

	@Override
	void addCondiments() {
		System.out.println("adding sugar and cream");
	}

	@Override
	void brew() {
		System.out.println("making coffee");
	}

}
