package com.horia.factory.complex;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new CheesePizza(null);
		} else if (type.equals("pepperoni")) {
			return new PeperroniPizza(null);
		} else if (type.equals("clam")) {
			return new ClamPizza(null);
		} else if (type.equals("veggie")) {
			return new VeggiePizza(null);
		} else {
			return null;
		}
	}

}
