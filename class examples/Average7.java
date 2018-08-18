// demonstrating the use of while

// prompt the user for the number of values
// prompt the user for the values
// and report the average of these values
// rewriting Average2 using do-while

import javax.swing.*;
import java.text.*;

// public - access modifier
public class Average7
{
    public static void main( String[] arg )
    {
       // declare variables
       int val, sum, count;
       double average;
       String message;
       
       // declaring a constant
       final int SIZE;
       
       sum = 0;
       
       // initializing the loop control variable
       count = 0;
       
       // prompt the user for the size of the data set
       SIZE = Integer.parseInt( JOptionPane.showInputDialog( "Please enter the number of values" ) );
       
       do // executes it at least once
       {
           val = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an integer value" ) );
       
           // update the sum
           sum += val;
           
           // update the loop control variable
           count += 1;
       } while ( count < SIZE ); // repetition condition
       
       // calculate the average
       average = sum / count;
      
       message = "\nAverage = " + average;
       

       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}
    
