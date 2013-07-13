package com.horia.proxy.rmiBasics;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyServiceClient {
	public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
		MyService service = (MyService) Naming.lookup("rmi://127.0.0.1/hello");
		System.out.println(service.sayHello());
	}
}
