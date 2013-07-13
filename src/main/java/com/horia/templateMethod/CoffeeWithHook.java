package com.horia.templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBewerage {

	@Override
	void addCondiments() {
		System.out.println("adding sugar and cream");
	}

	@Override
	void brew() {
		System.out.println("making coffee");
	}
	
	boolean customerWantsCondiments() {
		if (getCustomerInput().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getCustomerInput() {
		String answer =null;
		System.out.println("do you want condiments? y/n");
		BufferedReader io = new BufferedReader(new InputStreamReader(System.in)) ;
		try {
			answer = io.readLine();
		} catch (IOException e) {
			return "no";
		}
		return answer;
	}
	
	

}
