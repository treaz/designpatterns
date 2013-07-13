package com.horia.compoundPattern;

public class RubberDuck implements Quackable {

	public RubberDuck() {
		super();
		this.observable = new Observable(this);
	}

	Observable observable;
	
	@Override
	public void quack() {
		System.out.println("squeak");
		notifyObservers();
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
