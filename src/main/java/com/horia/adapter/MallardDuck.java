package com.horia.adapter;

public class MallardDuck implements DuckTarget {

	@Override
	public void fly() {
		System.out.println("duck flying");

	}

	@Override
	public void quack() {
		System.out.println("quacking");

	}

}
