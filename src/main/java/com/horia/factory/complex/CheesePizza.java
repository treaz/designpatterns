package com.horia.factory.complex;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory chicagoPizzaIngredientFactory= null;
	
	public CheesePizza(PizzaIngredientFactory type) {
		chicagoPizzaIngredientFactory = type;
	}
	public void prepare() {
		System.out.println("preparing "+name);
		dough=chicagoPizzaIngredientFactory.createDough();
		sauce=chicagoPizzaIngredientFactory.createSauce();
		cheese=chicagoPizzaIngredientFactory.createCheese();
		
	}

	public void bake() {
		// TODO Auto-generated method stub
		
	}

	public void cut() {
		// TODO Auto-generated method stub
		
	}

	public void box() {
		// TODO Auto-generated method stub
		
	}

}
