/**
 * PersonServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.2  Built on : May 02, 2016 (05:55:18 BST)
 */
package ir.moke.soap.stubs.person;


/**
 *  PersonServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class PersonServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public PersonServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public PersonServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getName method
     * override this method for handling normal response from getName operation
     */
    public void receiveResultgetName(
        PersonServiceStub.GetNameResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getName operation
     */
    public void receiveErrorgetName(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getFamily method
     * override this method for handling normal response from getFamily operation
     */
    public void receiveResultgetFamily(
        PersonServiceStub.GetFamilyResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getFamily operation
     */
    public void receiveErrorgetFamily(java.lang.Exception e) {
    }
}
