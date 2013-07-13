package com.horia.decorator;

public class EspressoComponent extends BeverageComponent {

	double cost = 1.99;
	
	public EspressoComponent() {
		description = "Espresso";
	}
	
	public double cost() {
		return cost;
	}

	public String getDescription() {
		return description;
	}
}
