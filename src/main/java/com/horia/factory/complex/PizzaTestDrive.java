package com.horia.factory.complex;

public class PizzaTestDrive {

	public static void main(String[] args) {
		NYPizzaStore mypizza = new NYPizzaStore();
		mypizza.orderPizza("cheese");
		
		ChicagoPizzaStore chicagoPizza = new ChicagoPizzaStore();
		chicagoPizza.orderPizza("cheese");
	}
}
