package de.eldecker.bruchrechner;


public class BruchTest {

    public static void main ( String args[] ){
 
        Bruch b1 = new Bruch( 1, 3 );
        Bruch b2 = new Bruch( 2, 5 );

        Bruch b3 = b1.dividieren( b2 );
        
        System.out.println( b1 + " geteilt durch " + b2 + ": " + b3 );
        // erwartetes Ergebnis: 5/6
    }
    
}
