// demonstrating the use of  if-else

// prompt the user for an int value
// check whether it is even or odd
// rewriting using a method

import javax.swing.*;
import java.text.*;

// public - access modifier
public class EvenOrOdd2
{
    public static boolean isEven( int num )
    {
        // version 1
        /*boolean result;
        
        if ( (num % 2) == 0 )
            result = true;
        else 
            result = false;        
        
        return result;*/
        
        // version 2
        /*if ( (num % 2) == 0 )
            return true;
        else 
            return false;*/
        
        // version 3
        /*if ( (num % 2) == 0 )
            return true;

        return false; */
        
        // version 4
        return ((num % 2) == 0 );
       
    }
    
    public static void main( String[] arg )
    {
       // declare variables
       int val;
       
       val = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an integer value" ) );
      
       // create and display the output message
       String message = "";
       
       message = message + "val = " + val;
       
       if (isEven( val ))
         message = message + "\nval is even";
       else
         message = message + "\nval is odd";    
       
            
       
       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}
    
