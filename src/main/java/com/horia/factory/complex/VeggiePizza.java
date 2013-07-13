package com.horia.factory.complex;

public class VeggiePizza extends Pizza {

	PizzaIngredientFactory pizzaIngredientFactory = null;
	
	public VeggiePizza(PizzaIngredientFactory apizzaIngredientFactory) {
		pizzaIngredientFactory=apizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		dough=pizzaIngredientFactory.createDough();
		sauce=pizzaIngredientFactory.createSauce();
		veggies=pizzaIngredientFactory.createVeggies();
		
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		
	}

}
