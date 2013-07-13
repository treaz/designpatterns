package com.horia.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballRemote extends Remote {
	
	public int getCount() throws RemoteException;
	public State getState() throws RemoteException;
	public String getLocation() throws RemoteException;

}
