package com.horia.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballRemote{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2776288667741993311L;
	public State soldOutState;
	public State noQuarterState;
	public State hasQuarterState;
	public State soldState;
	public State winnerState;

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	@Override
	public State getState() {
		return state;
	}

	private State state = soldOutState;
	private int count = 0;
	private int promo = 0;
	private String location;

	public int getPromo() {
		return promo;
	}

	public void setPromo(int promo) {
		this.promo = promo;
	}

	public GumballMachine(String location, int count) throws RemoteException {
		super();
		this.count = count;
		this.location = location;
		noQuarterState = new NoQuarterState(this);
		soldOutState = new SoldOutState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);

		if (count > 0) {
			state = noQuarterState;
		}
	}

	@Override
	public String toString() {
		return "GumballMachine [state=" + state + ", count=" + count + "]";
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		if (state.equals(soldState) || state.equals(winnerState)) {
			state.dispense();
		}
	}

	public void dispense() {
		state.dispense();
	}

	public void setState(State state) {
		this.state = state;

	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int getCount() {
		return count;
	}

	public void releaseBall() {
		System.out.println("releaseing ball");

	}
	
	public void refill(int newCount) {
		count = newCount;
		state = noQuarterState;
	}

	@Override
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
