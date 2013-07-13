package com.horia.templateMethod;

public abstract class CaffeineBewerage {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	boolean customerWantsCondiments() {
		return true;
	}

	abstract void addCondiments();

	abstract void brew();

	private void pourInCup() {
		System.out.println("pouring in cup");
		
	}

	private void boilWater() {
		System.out.println("boiling water");
	}
}
