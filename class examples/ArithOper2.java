// using user prompt
// Arithmetic operators
// repeat for double

import javax.swing.*;
import java.text.*;

// public - access modifier
public class ArithOper2
{
    public static void main( String[] arg )
    {
       // declare primitive variables
       double val1, val2;
       double sum, diff, product;
       double quotient;
       DecimalFormat myFormat;
       
       // create a DecimalFormat object
       myFormat = new DecimalFormat( "0.00" );
       
       // prompt the user for 2 double values & initialize the variables
       val1 = Double.parseDouble( JOptionPane.showInputDialog( "Please enter a double value" ) );
       val2 = Double.parseDouble( JOptionPane.showInputDialog( "Please enter a double value" ) );
       
       // perform the operations
       sum = val1 + val2;
       diff = val1 - val2;
       product = val1 * val2;
       quotient = (double)val1 / val2; // type casting
       
       // create and display the output message
       String message = "";
       
       message = message + "val1 = " + val1 + "; val1 = " + val2;
       message = message + "\nsum = " + sum;     
       message = message + "\ndiff = " + diff;
       message = message + "\nproduct = " + product;
       message = message + "\nquotient = " + myFormat.format( quotient );
       
       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}
    
