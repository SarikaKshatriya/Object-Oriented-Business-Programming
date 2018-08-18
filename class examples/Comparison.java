// demonstrating the use of simple if

// prompt the user for 2 int values
// compare the values and output the
// result

import javax.swing.*;
import java.text.*;

// public - access modifier
public class Comparison
{
    public static void main( String[] arg )
    {
       // declare variables
       int val1, val2;
       
       val1 = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an integer value" ) );
       val2 = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an integer value" ) );
      
       // create and display the output message
       String message = "";
       
       message = message + "val1 = " + val1 + "; val2 = " + val2;
       
       if ( val1 > val2 )
         message = message + "\nval1 is greater than val2";
       
       if ( val1 == val2 )
         message = message + "\nval1 is same as val2";
       
       if ( val1 < val2 )
         message = message + "\nval1 is less than val2";     
       
       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}
    
