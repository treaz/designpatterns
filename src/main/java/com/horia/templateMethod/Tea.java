package com.horia.templateMethod;

public class Tea extends CaffeineBewerage {

	@Override
	void addCondiments() {
		System.out.println("adding lemon");

	}

	@Override
	void brew() {
		System.out.println("making tea");
	}

}
