package com.horia.compoundPattern;

public class MallardDuck implements Quackable {

	public MallardDuck() {
		super();
		this.observable = new Observable(this);
	}

	Observable observable;

	@Override
	public void quack() {
		System.out.println("Quack");
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
