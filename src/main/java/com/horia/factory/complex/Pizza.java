package com.horia.factory.complex;


public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;
	
	abstract void prepare();

	void bake() {
		System.out.println("baking");
	}

	void cut() {
		System.out.println("cutting");
	}

	void box() {
		System.out.println("boxing");
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
