// demonstrating the use of while

// prompt the user for the number of values
// prompt the user for the values
// and report the average of these values
// rewriting using a sentinel value

import javax.swing.*;
import java.text.*;

// public - access modifier
public class Average3
{
    public static void main( String[] arg )
    {
       // declare variables
       int val, sum, count;
       double average;
       String message;
       
       // declaring a constant
       final int SENTINEL = -99;
       
       sum = 0;
       
       count = 0;
       
       // prompt for the first value 
       // initialize the loop control variable
       val = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an integer value or " + SENTINEL + " to stop." ) );
       
       while ( val != SENTINEL ) // repetition condition
       {
           // update the sum
           sum += val;
           
           // prompt for the next value
           // update the loop control variable
           val = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an integer value or " + SENTINEL + " to stop." ) );
       
           count += 1;
       }
       
       // calculate the average
       average = sum / count;
      
       message = "\nAverage = " + average;
       

       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}
    
