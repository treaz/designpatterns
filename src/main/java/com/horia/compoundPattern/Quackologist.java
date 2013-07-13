package com.horia.compoundPattern;

public class Quackologist implements Observer {

	@Override
	public void update(QuackObservable duck) {
		System.out.println("quckologist:"+duck+" quacked");
	}

}
