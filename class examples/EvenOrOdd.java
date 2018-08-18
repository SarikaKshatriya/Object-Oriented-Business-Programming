// demonstrating the use of  if-else

// prompt the user for an int value
// check whether it is even or odd

import javax.swing.*;
import java.text.*;

// public - access modifier
public class EvenOrOdd
{
    public static void main( String[] arg )
    {
       // declare variables
       int val;
       
       val = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an integer value" ) );
      
       // create and display the output message
       String message = "";
       
       message = message + "val = " + val;
       
       if ( (val % 2) == 0 )
         message = message + "\nval is even";
       else
         message = message + "\nval is odd";    
       
            
       
       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}
    
