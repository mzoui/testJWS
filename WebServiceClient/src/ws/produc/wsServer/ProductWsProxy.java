package ws.produc.wsServer;

public class ProductWsProxy implements ws.produc.wsServer.ProductWs {
  private String _endpoint = null;
  private ws.produc.wsServer.ProductWs productWs = null;
  
  public ProductWsProxy() {
    _initProductWsProxy();
  }
  
  public ProductWsProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductWsProxy();
  }
  
  private void _initProductWsProxy() {
    try {
      productWs = (new ws.produc.wsServer.PrductWsImpServiceLocator()).getPrductWsImpPort();
      if (productWs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productWs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productWs != null)
      ((javax.xml.rpc.Stub)productWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.produc.wsServer.ProductWs getProductWs() {
    if (productWs == null)
      _initProductWsProxy();
    return productWs;
  }
  
  public ws.produc.wsServer.Product findProduct() throws java.rmi.RemoteException{
    if (productWs == null)
      _initProductWsProxy();
    return productWs.findProduct();
  }
  
  public ws.produc.wsServer.Product[] findAllProduct() throws java.rmi.RemoteException{
    if (productWs == null)
      _initProductWsProxy();
    return productWs.findAllProduct();
  }
  
  
}