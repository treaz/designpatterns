package com.horia.compoundPattern;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
	
	List<Quackable> quackables = new ArrayList<>();
	
	public void add(Quackable quack) {
		quackables.add(quack);
	}

	@Override
	public void quack() {
		for (Quackable quackie:quackables) {
			quackie.quack();
		}
//		notifyObservers();
	}

	@Override
	public void notifyObservers() {
//		for (Quackable quackie:quackables) {
//			quackie.notifyObservers();
//		}
	}

	@Override
	public void registerObservers(Observer duck) {
		for (Quackable quackie:quackables) {
			quackie.registerObservers(duck);
		}
		
	}
}
