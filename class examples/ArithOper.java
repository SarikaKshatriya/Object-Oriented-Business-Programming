// using user prompt
// Arithmetic operators

import javax.swing.*;
import java.text.*;

// public - access modifier
public class ArithOper
{
    public static void main( String[] arg )
    {
       // declare primitive variables
       int val1, val2;
       String val1Str, val2Str;
       int sum, diff, product, mod;
       double quotient;
       DecimalFormat myFormat;
       
       // create a DecimalFormat object
       myFormat = new DecimalFormat( "0.00" );
       
       // prompt the user for 2 int values & initialize the variables
       val1Str = JOptionPane.showInputDialog( "Please enter an integer value" );
       val2Str = JOptionPane.showInputDialog( "Please enter an integer value" );
       
       val1 = Integer.parseInt( val1Str );
       val2 = Integer.parseInt( val2Str );
       
       // perform the operations
       sum = val1 + val2;
       diff = val1 - val2;
       product = val1 * val2;
       quotient = (double)val1 / val2; // type casting
       mod = val1 % val2;  // remainder when dividing val1 by val2
       
       // create and display the output message
       String message = "";
       
       message = message + "val1 = " + val1 + "; val1 = " + val2;
       message = message + "\nsum = " + sum;     
       message = message + "\ndiff = " + diff;
       message = message + "\nproduct = " + product;
       message = message + "\nquotient = " + myFormat.format( quotient );
       message = message + "\nmod = " + mod;
       
       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}
    
