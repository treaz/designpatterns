package com.horia.decorator;

public class WhipDecorator extends CondimentsDecorator {

	double cost = .10;
	BeverageComponent beverage;

	public WhipDecorator(BeverageComponent _beverage) {
		description = "Whip";
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
