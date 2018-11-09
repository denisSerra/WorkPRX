/**
 * ProvaWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class ProvaWSServiceLocator extends org.apache.axis.client.Service implements webservice.ProvaWSService {

    public ProvaWSServiceLocator() {
    }


    public ProvaWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProvaWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProvaWSPort
    private java.lang.String ProvaWSPort_address = "http://localhost:8080/Contocorrente/ProvaWS";

    public java.lang.String getProvaWSPortAddress() {
        return ProvaWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProvaWSPortWSDDServiceName = "ProvaWSPort";

    public java.lang.String getProvaWSPortWSDDServiceName() {
        return ProvaWSPortWSDDServiceName;
    }

    public void setProvaWSPortWSDDServiceName(java.lang.String name) {
        ProvaWSPortWSDDServiceName = name;
    }

    public webservice.ProvaWS getProvaWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProvaWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProvaWSPort(endpoint);
    }

    public webservice.ProvaWS getProvaWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservice.ProvaWSServiceSoapBindingStub _stub = new webservice.ProvaWSServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getProvaWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProvaWSPortEndpointAddress(java.lang.String address) {
        ProvaWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservice.ProvaWS.class.isAssignableFrom(serviceEndpointInterface)) {
                webservice.ProvaWSServiceSoapBindingStub _stub = new webservice.ProvaWSServiceSoapBindingStub(new java.net.URL(ProvaWSPort_address), this);
                _stub.setPortName(getProvaWSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ProvaWSPort".equals(inputPortName)) {
            return getProvaWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice/", "ProvaWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice/", "ProvaWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProvaWSPort".equals(portName)) {
            setProvaWSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
