package com.horia.state;

public class GumballMachine {

	public final static int SOLD_OUT = 0;
	public final static int NO_QUARTER = 1;
	public final static int HAS_QUARTER = 2;
	public final static int SOLD = 3;

	private int state = SOLD_OUT;
	private int count = 0;

	public GumballMachine(int count) {
		super();
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}

	@Override
	public String toString() {
		return "GumballMachine [state=" + state + ", count=" + count + "]";
	}

	public void insertQuarter() {
		if (state == SOLD_OUT) {
			System.out.println("cannot insert coin, machine is sold out");
		} else if (state == HAS_QUARTER) {
			System.out.println("cannot insert 2 coins");
		} else if (state == NO_QUARTER) {
			System.out.println("coin received");
			state = HAS_QUARTER;
		} else if (state == SOLD) {
			System.out.println("wait to receiveyour order before inserting another coin");
		}
	}
	
	public void ejectQuarter() {
		if (state == SOLD_OUT) {
			System.out.println("cannot eject coin, machine is sold out");
		} else if (state == HAS_QUARTER) {
			state=NO_QUARTER;
			System.out.println("ejecting coin");
		} else if (state == NO_QUARTER) {
			System.out.println("no coins inside");
		} else if (state == SOLD) {
			System.out.println("cannot eject during sale");
		}
	}
	
	public void turnCrank() {
		if (state == SOLD_OUT) {
			System.out.println("cannot sell, machine is sold out");
		} else if (state == HAS_QUARTER) {
			state=SOLD;
			System.out.println("accepted turn");
			dispense();
			
		} else if (state == NO_QUARTER) {
			System.out.println("no coins inside");
		} else if (state == SOLD) {
			System.out.println("turning 2x gives you only 1 gumball");
		}
	}
	
	public void dispense() {
		if (state == SOLD_OUT) {
			System.out.println("cannot dispense, machine is sold out");
		} else if (state == HAS_QUARTER) {
			System.out.println("first turn crank");
		} else if (state == NO_QUARTER) {
			System.out.println("first insert coins");
		} else if (state == SOLD) {
			System.out.println("giving customer the gumball");
			count--;
			if (count>0) {
				state=NO_QUARTER;
			} else {
				state=SOLD_OUT;
			}
		}
	}
}
