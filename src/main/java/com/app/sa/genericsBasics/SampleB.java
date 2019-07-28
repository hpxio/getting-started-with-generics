
package com.app.sa.genericsBasics;

public class SampleB< T, E > {

    private T object;

    private E reference;


    public SampleB ( ) {
    }

    public SampleB ( T object, E reference ) {
        this.object = object;
        this.reference = reference;
    }

    public T getObject ( ) {
        return object;
    }

    public void setObject ( T object ) {
        this.object = object;
    }

    public E getReference ( ) {
        return reference;
    }

    public void setReference ( E reference ) {
        this.reference = reference;
    }


    public void displayClass ( ) {
        System.out.println ( "Object:" + this.object );
        System.out.println ( "Reference:" + this.reference );
    }

    public void showClassName ( ) {
        System.out.println (
                "Object:" + object.getClass ( ).getName ( ) + "\nReference:" + reference.getClass ( ).getName ( ) );
    }

    @Override
    public String toString ( ) {
        return "\nSampleB{" + "object=" + object + ", reference=" + reference + '}';
    }
}
