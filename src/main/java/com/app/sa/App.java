
package com.app.sa;


import com.app.sa.genericsBasics.SampleA;
import com.app.sa.genericsBasics.SampleB;


/**
 * Hello world!
 */
public class App {

    // POINT-1:One Way to do it //
    final private static SampleA< Integer > obj1 = new SampleA<> ( );

    // POINT-2: --OR-- //
    final private static SampleA< String > obj2 = new SampleA<> ( "Hi" );

    // POINT-3: Another power of Generics - Error - Due to ClassCasting it shows compiler error //
    // final private static SampleA< String > obj3 = new SampleA< Double > ( 88.9 );

    // POINT-4: Generics always uses Reference types, Primitive types will fail //
    // final private static SampleA<int> obj4= new SampleA<int> ( 34 );


    /**
     * Generics in action.
     */
    private static void showGenericsBasicsDemo ( ) {
        // Show Generics in action //
        obj1.setParam ( 287 );

        // Show Value //
        System.out.println ( obj1.getParam ( ) );

        // Show the Type //
        System.out.println ( obj1.showObjectType ( ) );

        // Setting new value //
        obj1.setParam ( 34876 );
        System.out.println ( "Updated Value is : " + obj1.getParam ( ) );

        // POINT-5: Following shows a checked exception due to Generics //
        // obj2.setParam(287);

        // Show Value //
        System.out.println ( obj2.getParam ( ) );

        // Show the Type //
        System.out.println ( obj2.showObjectType ( ) );
    }

    private static void showGenericPairDemo ( ) {
        SampleB< Integer, String > directory = new SampleB<> ( );

        // <== OR ==> //

        SampleB< Float, String > arc = new SampleB<> ( 45.5F, "Tony" );

        directory.setObject ( 342342 );
        directory.setReference ( "Josh" );

        arc.showClassName ( );
        System.out.println ( arc );
    }

    public static void main ( String[] args ) {
        System.out.println ( "Hello World!" );

        // <== BASICS ==> //
        // showGenericsBasicsDemo ( );

        // <== Generics Pair ==> //
        showGenericPairDemo ( );

    }
}
