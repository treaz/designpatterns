package com.horia.state.second;

import java.util.Random;

public class HasQuarterState implements State {

	Random randomWinner = new Random(System.currentTimeMillis());

	public HasQuarterState(GumballMachine gm) {
		super();
		this.gm = gm;
	}

	GumballMachine gm;

	@Override
	public void insertQuarter() {
		System.out.println("cannot insert 2 coins");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("ejecting coin");
		gm.setState(gm.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("accepted turn");
		if (randomWinner.nextInt(10) == 0 && gm.getCount() > 1) {
			gm.setState(gm.getWinnerState());
		} else {
			gm.setState(gm.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("first turn crank");

	}

}
