package com.horia.state.second;

public class SoldState implements State {

	public SoldState(GumballMachine gm) {
		super();
		this.gm = gm;
	}

	GumballMachine gm;

	@Override
	public void insertQuarter() {
		System.out
				.println("wait to receiveyour order before inserting another coin");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("cannot eject during sale");

	}

	@Override
	public void turnCrank() {
		System.out.println("turning 2x gives you only 1 gumball");

	}

	@Override
	public void dispense() {
		gm.releaseBall();
		if (gm.getCount() > 0) {
			gm.setState(gm.getNoQuarterState());
		} else {
			gm.setState(gm.getSoldOutState());
		}

	}

}
