package com.horia.factory.complex;

public class NYPizzaStore extends PizzaStore {
	PizzaIngredientFactory pizzaIngredientFactory = null;
	
	public NYPizzaStore() {
		pizzaIngredientFactory = new NYPizzaIngredientFactory();
	}
	
	@Override
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
