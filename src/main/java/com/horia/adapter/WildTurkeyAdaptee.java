package com.horia.adapter;

public class WildTurkeyAdaptee implements Turkey {

	@Override
	public void gobble() {
		System.out.println("gobble");

	}

	@Override
	public void fly() {
		System.out.println("short fly");

	}

}
