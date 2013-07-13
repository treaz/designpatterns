package com.horia.adapter;

public class TurkeyAdapter implements DuckTarget {

	private Turkey turkey;
	
	public TurkeyAdapter(Turkey aTurkey) {
		turkey=aTurkey;
	}
	
	@Override
	public void fly() {
		for (int i=0; i<5;i++) {
			turkey.fly();
		}

	}

	@Override
	public void quack() {
		turkey.gobble();

	}

}
