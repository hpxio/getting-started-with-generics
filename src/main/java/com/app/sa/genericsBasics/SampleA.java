
package com.app.sa.genericsBasics;

/**
 * Generic Class of Typed Parameter T
 */
public class SampleA< T > {

    // Typed class variable //
    T param;

    public SampleA ( ) {
        // Call nothing //
    }

    public SampleA ( T obj ) {
        param = obj;
    }

    // Show Type Value //
    /**
     * @return the param
     */
    public T getParam ( ) {
        return param;
    }

    /**
     * @param param
     *            the param to set
     */
    public void setParam ( T param ) {
        this.param = param;
    }

    /**
     * @return Name of the Type class
     */
    public String showObjectType ( ) {
        return param.getClass ( ).getName ( );
    }

}