/* This is our first Java program
*/

// This program prints a single line of
// output.

// using JOptionPane for output

import javax.swing.*;

// public - access modifier
public class Welcome2
{
    public static void main( String[] arg )
    {
       // println - starts the next print on a new line
       //System.out.println( "Welcome to Java Programming. " ); 
       //System.out.println( "Hope you all have a great semester." );
       
       JOptionPane.showMessageDialog( null, 
                                "Welcome to Java Programming.\n" +  
                                "Hope you all have a great semester." );
       
       System.exit( 0 );
       
    }
    
}