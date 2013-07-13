package com.horia.factory.simple;

public class PizzaStore {
	
	private SimplePizzaFactory factory;
	
	public PizzaStore() {
		factory = new SimplePizzaFactory();
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
