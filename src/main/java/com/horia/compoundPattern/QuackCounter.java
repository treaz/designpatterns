package com.horia.compoundPattern;

/**
 * decorator pattern
 * @author Horia Constantin
 *
 */
public class QuackCounter implements Quackable {

	private Quackable quakable;
	private static int countQuacks = 0;

	public QuackCounter(Quackable quakable) {
		this.quakable = quakable;
	}

	@Override
	public void quack() {
		quakable.quack();
		countQuacks++;
		notifyObservers();
	}

	public static int getQuacks() {
		return countQuacks;
	}

	@Override
	public void notifyObservers() {
		quakable.notifyObservers();
		
	}

	@Override
	public void registerObservers(Observer duck) {
		quakable.registerObservers(duck);
		
	}

}
