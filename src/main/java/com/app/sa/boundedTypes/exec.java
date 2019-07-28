
package com.app.sa.boundedTypes;

public class exec {

    private static SampleA< Integer > member = new SampleA<> ( );

    /*
     * After applying bound checking this becomes invalid //
     * private static SampleA< String > ghost = new SampleA<> ( );
     */


    public static void main ( String[] args ) {

        member.setAnnId ( 344 );
        member.setAnnId ( 435345 );
        member.setAnnId ( 3423467 );
        member.listAnn ( );

        /*
         * ghost.setAnnId ( "3947" );
         * ghost.setAnnId ( "27365" );
         * ghost.listAnn ( );
         */
    }

}
