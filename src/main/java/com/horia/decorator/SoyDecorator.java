package com.horia.decorator;

public class SoyDecorator extends CondimentsDecorator {

	private double cost = .15;
	private BeverageComponent beverage;

	public SoyDecorator(BeverageComponent _beverage) {
		description = "Soy";
		beverage = _beverage;
	}

	@Override
	public String getDescription() {
		return description +", " +beverage.getDescription();
	}

	@Override
	public double cost() {
		return cost + beverage.cost();
	}

}
