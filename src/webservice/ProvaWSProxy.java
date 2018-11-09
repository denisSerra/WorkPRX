package webservice;

public class ProvaWSProxy implements webservice.ProvaWS {
  private String _endpoint = null;
  private webservice.ProvaWS provaWS = null;
  
  public ProvaWSProxy() {
    _initProvaWSProxy();
  }
  
  public ProvaWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initProvaWSProxy();
  }
  
  private void _initProvaWSProxy() {
    try {
      provaWS = (new webservice.ProvaWSServiceLocator()).getProvaWSPort();
      if (provaWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)provaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)provaWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (provaWS != null)
      ((javax.xml.rpc.Stub)provaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservice.ProvaWS getProvaWS() {
    if (provaWS == null)
      _initProvaWSProxy();
    return provaWS;
  }
  
  public webservice.ResponseMovimento ottieniMovimento() throws java.rmi.RemoteException, webservice.Exception{
    if (provaWS == null)
      _initProvaWSProxy();
    return provaWS.ottieniMovimento();
  }
  
  public boolean inserisciTipoMovimenti(webservice.RequestTipoMovimenti arg0) throws java.rmi.RemoteException, webservice.Exception{
    if (provaWS == null)
      _initProvaWSProxy();
    return provaWS.inserisciTipoMovimenti(arg0);
  }
  
  public webservice.ResponseConto ottieniContiCorrenti() throws java.rmi.RemoteException{
    if (provaWS == null)
      _initProvaWSProxy();
    return provaWS.ottieniContiCorrenti();
  }
  
  public boolean inserisciContoCorrente(webservice.RequestContoCorrente arg0) throws java.rmi.RemoteException, webservice.Exception{
    if (provaWS == null)
      _initProvaWSProxy();
    return provaWS.inserisciContoCorrente(arg0);
  }
  
  public boolean inserisciMovimento(webservice.RequestMovimento arg0) throws java.rmi.RemoteException, webservice.Exception{
    if (provaWS == null)
      _initProvaWSProxy();
    return provaWS.inserisciMovimento(arg0);
  }
  
  
}