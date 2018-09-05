/**
 * PrductWsImpServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.produc.wsServer;

public class PrductWsImpServiceLocator extends org.apache.axis.client.Service implements ws.produc.wsServer.PrductWsImpService {

    public PrductWsImpServiceLocator() {
    }


    public PrductWsImpServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PrductWsImpServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PrductWsImpPort
    private java.lang.String PrductWsImpPort_address = "http://localhost:4800/ws/produc/wsServer/productWsImp";

    public java.lang.String getPrductWsImpPortAddress() {
        return PrductWsImpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PrductWsImpPortWSDDServiceName = "PrductWsImpPort";

    public java.lang.String getPrductWsImpPortWSDDServiceName() {
        return PrductWsImpPortWSDDServiceName;
    }

    public void setPrductWsImpPortWSDDServiceName(java.lang.String name) {
        PrductWsImpPortWSDDServiceName = name;
    }

    public ws.produc.wsServer.ProductWs getPrductWsImpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PrductWsImpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPrductWsImpPort(endpoint);
    }

    public ws.produc.wsServer.ProductWs getPrductWsImpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.produc.wsServer.PrductWsImpPortBindingStub _stub = new ws.produc.wsServer.PrductWsImpPortBindingStub(portAddress, this);
            _stub.setPortName(getPrductWsImpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPrductWsImpPortEndpointAddress(java.lang.String address) {
        PrductWsImpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.produc.wsServer.ProductWs.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.produc.wsServer.PrductWsImpPortBindingStub _stub = new ws.produc.wsServer.PrductWsImpPortBindingStub(new java.net.URL(PrductWsImpPort_address), this);
                _stub.setPortName(getPrductWsImpPortWSDDServiceName());
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
        if ("PrductWsImpPort".equals(inputPortName)) {
            return getPrductWsImpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://wsServer.produc.ws/", "PrductWsImpService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://wsServer.produc.ws/", "PrductWsImpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PrductWsImpPort".equals(portName)) {
            setPrductWsImpPortEndpointAddress(address);
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
