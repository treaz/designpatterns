package com.horia.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitor {

	GumballRemote gm;
	
	public GumballMonitor(GumballRemote gm2) {
		this.gm=gm2;
	}
	
	public void report() throws MalformedURLException, RemoteException, NotBoundException {
		
		
		System.out.println("location: "+gm.getLocation());
		System.out.println("gumballs: "+gm.getCount());
		System.out.println("state: "+gm.getState());
	}
}
