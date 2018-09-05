/**
 * DemoImpService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public interface DemoImpService extends javax.xml.rpc.Service {
    public java.lang.String getDemoImpPortAddress();

    public ws.Demo getDemoImpPort() throws javax.xml.rpc.ServiceException;

    public ws.Demo getDemoImpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
