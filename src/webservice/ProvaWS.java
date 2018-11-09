/**
 * ProvaWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public interface ProvaWS extends java.rmi.Remote {
    public webservice.ResponseMovimento ottieniMovimento() throws java.rmi.RemoteException, webservice.Exception;
    public boolean inserisciTipoMovimenti(webservice.RequestTipoMovimenti arg0) throws java.rmi.RemoteException, webservice.Exception;
    public webservice.ResponseConto ottieniContiCorrenti() throws java.rmi.RemoteException;
    public boolean inserisciContoCorrente(webservice.RequestContoCorrente arg0) throws java.rmi.RemoteException, webservice.Exception;
    public boolean inserisciMovimento(webservice.RequestMovimento arg0) throws java.rmi.RemoteException, webservice.Exception;
}
