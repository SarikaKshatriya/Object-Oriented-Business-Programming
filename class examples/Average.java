// demonstrating the use of while

// prompt the user for 3 values
// and report the average of these values

import javax.swing.*;
import java.text.*;

// public - access modifier
public class Average
{
    public static void main( String[] arg )
    {
       // declare variables
       int val, sum, count;
       double average;
       String message;
       
       // declaring a constant
       final int SIZE = 10;
       
       sum = 0;
       
       // initializing the loop control variable
       count = 0;
       
       while ( count < SIZE ) // repetition condition
       {
           val = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an integer value" ) );
       
           // update the sum
           sum += val;
           
           // update the loop control variable
           count += 1;
       }
       
       // calculate the average
       average = sum / count;
      
       message = "\nAverage = " + average;
       

       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}
    
