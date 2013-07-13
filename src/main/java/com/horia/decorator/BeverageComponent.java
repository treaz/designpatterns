package com.horia.decorator;

public abstract class BeverageComponent {

	String description = "Unknown berevage";
	String size = "unknown size";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
