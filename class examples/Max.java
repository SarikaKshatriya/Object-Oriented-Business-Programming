// prompt the user for 2 int values
// print the maximum of these two.

import javax.swing.*;
import java.text.*;

// public - access modifier
public class Max
{
    // returns the maximum of num1 and num2
    public static int max( int num1, int num2 )
    {
        if ( num1 > num2 )
            return num1;
        
        return num2;
        
    }
    
    
    public static void main( String[] arg )
    {
       // declare variables
       int val1, val2, max;
       String message;
       
       
       val1 = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an integer value" ) );
       val2 = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an integer value" ) );
       
       max = max( val1, val2 );
       
       
       message = "val1 = " + val1 + ", val2 = " + val2;
       message += "\nmax = " + max;
       

       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}
    
