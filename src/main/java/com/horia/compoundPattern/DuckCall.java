package com.horia.compoundPattern;

public class DuckCall implements Quackable {

	public DuckCall() {
		super();
		this.observable = new Observable(this);
	}

	Observable observable;
	
	@Override
	public void quack() {
		System.out.println("kwak");

	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
		
	}

	@Override
	public void registerObservers(Observer duck) {
		observable.registerObservers(duck);
		
	}

}
