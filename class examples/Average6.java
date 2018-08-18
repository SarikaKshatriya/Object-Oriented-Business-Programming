// demonstrating the use of while

// prompt the user for exam scores
// report the average and the number
// of students who failed
// rewriting Average4 using for loop

import javax.swing.*;
import java.text.*;

// public - access modifier
public class Average6
{
    public static void main( String[] arg )
    {
       // declare variables
       int val, sum, count, noOfFails = 0;
       double average;
       String message;
       
       // declaring a constant
       final int SENTINEL = -99;
       
       sum = 0;
       
       count = 0;
       
       // prompt for the first value 
       // initialize the loop control variable
       val = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an exam score or " + SENTINEL + " to stop." ) );
       
       /*for ( val = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an exam score or " + SENTINEL + " to stop." ) );
             val != SENTINEL;
             val = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an exam score or " + SENTINEL + " to stop." ) ) ) // repetition condition
             */
        // for( ;; ) - infinite loops
        // while ( true )         
       for( ;val != SENTINEL; )    
       {
           // update the sum
           sum += val;
           
           // update the number of fails
           if ( val < 60 )
                noOfFails += 1;
           
           // prompt for the next value
           // update the loop control variable
           val = Integer.parseInt( JOptionPane.showInputDialog( "Please enter the next exam score or " + SENTINEL + " to stop." ) );
       
           count += 1;
       }
       
       // calculate the average
       average = sum / count;
      
       message = "\nAverage = " + average;
       message += "\nNo. of fails = " + noOfFails;
       

       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}
    
