package main;

import java.rmi.RemoteException;

import webservice.Exception;
import webservice.ProvaWSProxy;

public class ProvaMain {
	public static void main(String[]args) throws Exception, RemoteException {
		ProvaWSProxy provaWSProxy= new ProvaWSProxy();
		System.out.println(provaWSProxy.ottieniMovimento());
	}
}
