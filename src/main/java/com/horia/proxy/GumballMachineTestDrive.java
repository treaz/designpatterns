package com.horia.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {

	public static void main(String[] args) throws RemoteException {
		int count =0;
		
		if (args.length<2) {
			System.out.println("2 args");
			System.exit(1);
		}
		
		count = Integer.parseInt(args[1]);
		GumballMachine gumballMachine = new GumballMachine(args[0], count );
		
		try {
			Naming.rebind("gm", gumballMachine);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
