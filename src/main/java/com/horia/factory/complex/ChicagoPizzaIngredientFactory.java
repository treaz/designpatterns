package com.horia.factory.complex;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new Mozarella();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new Spinach(), new BlackOlives(), new EggPlant()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return new FrozenClam();
	}

}
