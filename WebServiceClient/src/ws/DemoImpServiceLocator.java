/**
 * DemoImpServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class DemoImpServiceLocator extends org.apache.axis.client.Service implements ws.DemoImpService {

    public DemoImpServiceLocator() {
    }


    public DemoImpServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DemoImpServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DemoImpPort
    private java.lang.String DemoImpPort_address = "http://localhost:4789/ws/demo";

    public java.lang.String getDemoImpPortAddress() {
        return DemoImpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DemoImpPortWSDDServiceName = "DemoImpPort";

    public java.lang.String getDemoImpPortWSDDServiceName() {
        return DemoImpPortWSDDServiceName;
    }

    public void setDemoImpPortWSDDServiceName(java.lang.String name) {
        DemoImpPortWSDDServiceName = name;
    }

    public ws.Demo getDemoImpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DemoImpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDemoImpPort(endpoint);
    }

    public ws.Demo getDemoImpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.DemoImpPortBindingStub _stub = new ws.DemoImpPortBindingStub(portAddress, this);
            _stub.setPortName(getDemoImpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDemoImpPortEndpointAddress(java.lang.String address) {
        DemoImpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.Demo.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.DemoImpPortBindingStub _stub = new ws.DemoImpPortBindingStub(new java.net.URL(DemoImpPort_address), this);
                _stub.setPortName(getDemoImpPortWSDDServiceName());
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
        if ("DemoImpPort".equals(inputPortName)) {
            return getDemoImpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws/", "DemoImpService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws/", "DemoImpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DemoImpPort".equals(portName)) {
            setDemoImpPortEndpointAddress(address);
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
