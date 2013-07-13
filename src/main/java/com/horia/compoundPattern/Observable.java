package com.horia.compoundPattern;

import java.util.ArrayList;
import java.util.List;

public class Observable implements QuackObservable {

	public Observable(QuackObservable duck) {
		super();
		this.duck = duck;
	}

	List<Observer> observers= new ArrayList<>();
	QuackObservable duck;
	
	
	
	@Override
	public void notifyObservers() {
		for(Observer observer:observers) {
			observer.update(duck);
		}

	}

	@Override
	public void registerObservers(Observer duck) {
		observers.add(duck);

	}

}
