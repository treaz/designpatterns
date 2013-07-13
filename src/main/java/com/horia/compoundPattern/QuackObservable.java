package com.horia.compoundPattern;

public interface QuackObservable {

	public void notifyObservers();

	public void registerObservers(Observer duck);

}
