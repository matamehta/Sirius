/**
 * EditService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sirius.client.win32.core.controls.edit;

public interface EditService extends javax.xml.rpc.Service {
    public java.lang.String getEditPortAddress();

    public org.sirius.client.win32.core.controls.edit.Edit getEditPort()
            throws javax.xml.rpc.ServiceException;

    public org.sirius.client.win32.core.controls.edit.Edit getEditPort(
            java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
