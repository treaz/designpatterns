package com.horia.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MonitorTestDrive {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		GumballRemote gm = (GumballRemote) Naming.lookup("rmi://127.0.0.1/gm");
		GumballMonitor gmon = new GumballMonitor(gm);
		gmon.report();
	}
}
