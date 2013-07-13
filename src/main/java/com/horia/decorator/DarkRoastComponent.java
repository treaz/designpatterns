package com.horia.decorator;

public class DarkRoastComponent extends BeverageComponent {

	double cost = .99;
	
	public DarkRoastComponent() {
		description = "DarkRoast";
	}
	
	public double cost() {
		return cost;
	}

	public String getDescription() {
		return description;
	}
}
