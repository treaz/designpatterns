package com.horia.decorator;

public class StarbuzzCoffee {
	public static void main(String args[]) {
		BeverageComponent beverage = new EspressoComponent();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		BeverageComponent beverage2 = new DarkRoastComponent();
		beverage2 = new MochaDecorator(beverage2);
		beverage2 = new MochaDecorator(beverage2);
		beverage2 = new WhipDecorator(beverage2);
		System.out
				.println(beverage2.getDescription() + " $" + beverage2.cost());
		BeverageComponent beverage3 = new HouseBlendComponent();
		beverage3 = new SoyDecorator(beverage3);
		beverage3 = new MochaDecorator(beverage3);
		beverage3 = new WhipDecorator(beverage3);
		System.out
				.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}