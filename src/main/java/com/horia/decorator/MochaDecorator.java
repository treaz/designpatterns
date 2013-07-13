package com.horia.decorator;

public class MochaDecorator extends CondimentsDecorator {

	double cost = .2;
	BeverageComponent beverage;

	public MochaDecorator(BeverageComponent _beverage) {
		description = "Mocha";
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
