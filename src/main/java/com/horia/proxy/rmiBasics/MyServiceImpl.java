package com.horia.proxy.rmiBasics;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyServiceImpl extends UnicastRemoteObject implements MyService {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6909312611971059337L;

	protected MyServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello(){
		return "Hello";
	}

	
	public static void main(String[] args) {
		try {	
		MyService service = new MyServiceImpl();
			
				Naming.rebind("hello", service);
			} catch (MalformedURLException | RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
