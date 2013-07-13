package com.horia.proxy;

public class NoQuarterState implements State {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6739174209842224728L;
	private transient GumballMachine gm;
	
	public NoQuarterState(GumballMachine gm) {
		super();
		this.gm = gm;
	}	
	
	@Override
	public void insertQuarter() {
		System.out.println("coin received");
		gm.setState(gm.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("no coins inside");

	}

	@Override
	public void turnCrank() {
		System.out.println("no coins inside");
	}

	@Override
	public void dispense() {
		System.out.println("first insert coins");

	}

}
