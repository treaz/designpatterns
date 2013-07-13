package com.horia.proxy;

public class SoldOutState implements State {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6868318328992510159L;

	public SoldOutState(GumballMachine gm) {
		super();
		this.gm = gm;
	}

	private transient GumballMachine gm;
	
	@Override
	public void insertQuarter() {
		System.out.println("cannot insert coin, machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("cannot eject coin, machine is sold out");

	}

	@Override
	public void turnCrank() {
		System.out.println("cannot sell, machine is sold out");

	}

	@Override
	public void dispense() {
		System.out.println("cannot dispense, machine is sold out");

	}

}
