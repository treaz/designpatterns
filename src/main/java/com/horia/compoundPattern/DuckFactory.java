package com.horia.compoundPattern;

public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedHeadDuck() {
		return new RedHeadDuck();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

}
