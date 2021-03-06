package com.horia.state.second;

public class WinnerState implements State {

	public WinnerState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	GumballMachine gumballMachine;

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
		System.out.println("WINNER!!!");
		gumballMachine.releaseBall();
		// if (gumballMachine.getCount() == 0) {
		// gumballMachine.setState(gumballMachine.getSoldOutState());
		// } else {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldOutState());
			// }
		}
	}

}
