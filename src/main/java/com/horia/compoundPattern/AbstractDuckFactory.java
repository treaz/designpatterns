package com.horia.compoundPattern;

/**
 * abstract factory pattern
 * @author Horia Constantin
 *
 */
public abstract class AbstractDuckFactory {

	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedHeadDuck();
	public abstract Quackable createRubberDuck();
	public abstract Quackable createDuckCall();
	
}
