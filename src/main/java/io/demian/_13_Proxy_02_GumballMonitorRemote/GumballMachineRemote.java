package io.demian._13_Proxy_02_GumballMonitorRemote;

import java.rmi.*;

import io.demian._13_Proxy_02_GumballMonitorRemote.State.State;
 
public interface GumballMachineRemote extends Remote {
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
