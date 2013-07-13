package com.horia.compoundPattern;

/**
 * adapter pattern
 * @author Horia Constantin
 *
 */
public class GooseAdapter implements Quackable {

	private Goose goose;
	Observable observable;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}
	
	
	@Override
	public void quack() {
		goose.honk();
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
