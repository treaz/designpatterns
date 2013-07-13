package com.horia.factory.complex;

public class ClamPizza extends Pizza {

PizzaIngredientFactory pizzaIngredientFactory= null;
	
	public ClamPizza(PizzaIngredientFactory type) {
		pizzaIngredientFactory = type;
	}
	
	@Override
	public void prepare() {
		System.out.println("preparing "+name);
		pizzaIngredientFactory.createCheese();
		pizzaIngredientFactory.createClam();
		pizzaIngredientFactory.createDough();
		pizzaIngredientFactory.createSauce();
		
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
