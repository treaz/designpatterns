package com.horia.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		DuckTarget duck = new MallardDuck();
		Turkey turkey = new WildTurkeyAdaptee();
		DuckTarget adaptedTurkey = new TurkeyAdapter(turkey);
		duck.fly();
		duck.quack();
		
		adaptedTurkey.fly();
		adaptedTurkey.quack();
		
	}
}
