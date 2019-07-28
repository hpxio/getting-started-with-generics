
package com.app.sa.boundedTypes;


import java.util.ArrayList;
import java.util.List;


// public class SampleA< T > {
public class SampleA< T extends Integer > {

    // New member info //
    private T object;


    // List of all the members //
    private List< Integer > annId = new ArrayList<> ( );

    public SampleA ( ) {
    }

    public SampleA ( T object, List< Integer > ann ) {
        this.object = object;
        this.annId = ann;
    }

    // Set passed member info //
    public void setAnnId ( T ann ) {
        annId.add ( ( Integer ) ann );
    }

    // List all members info from the list //
    public void listAnn ( ) {
        for ( Integer i : annId ) {
            System.out.println ( "List Contains :" + i );
        }
    }
}
