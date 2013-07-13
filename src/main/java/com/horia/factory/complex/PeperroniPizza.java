package com.horia.factory.complex;

public class PeperroniPizza extends Pizza {

	PizzaIngredientFactory pizzaIngredientFactory = null;
	
	public PeperroniPizza(PizzaIngredientFactory apizzaIngredientFactory) {
		pizzaIngredientFactory = apizzaIngredientFactory;
	}

	public void prepare() {
		System.out.println("preparing "+name);
		dough=pizzaIngredientFactory.createDough();
		sauce=pizzaIngredientFactory.createSauce();
		pepperoni=pizzaIngredientFactory.createPepperoni();
		
	}
}
