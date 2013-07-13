package com.horia.decorator;

public class DecafComponent extends BeverageComponent {

	double cost = 1.05;
	
	public DecafComponent() {
		description = "Decaf";
	}
	
	public double cost() {
		return cost;
	}

	public String getDescription() {
		return description;
	}
}
