package com.horia.decorator;

public class HouseBlendComponent extends BeverageComponent {

	double cost = .89;
	
	public HouseBlendComponent() {
		description = "HouseBlend";
	}
	
	public double cost() {
		return cost;
	}

	public String getDescription() {
		return description;
	}
}
