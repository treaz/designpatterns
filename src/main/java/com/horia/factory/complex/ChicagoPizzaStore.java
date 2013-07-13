package com.horia.factory.complex;

public class ChicagoPizzaStore extends PizzaStore {

	PizzaIngredientFactory pizzaIngredientFactory = null;

	public ChicagoPizzaStore() {
		pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
	}
	
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new CheesePizza(pizzaIngredientFactory);
		} else if (type.equals("pepperoni")) {
			return new PeperroniPizza(pizzaIngredientFactory);
		} else if (type.equals("clam")) {
			return new ClamPizza(pizzaIngredientFactory);
		} else if (type.equals("veggie")) {
			return new VeggiePizza(pizzaIngredientFactory);
		} else {
			return null;
		}
	}

}
