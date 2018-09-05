/**
 * ProductWs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.produc.wsServer;

public interface ProductWs extends java.rmi.Remote {
    public ws.produc.wsServer.Product findProduct() throws java.rmi.RemoteException;
    public ws.produc.wsServer.Product[] findAllProduct() throws java.rmi.RemoteException;
}
