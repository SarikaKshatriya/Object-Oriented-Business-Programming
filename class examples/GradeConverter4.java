// demonstrating the use of nested if-else

// prompt the user for a letter grade
// and convert that grade into the GPA

// rewrite using switch

import javax.swing.*;
import java.text.*;

// public - access modifier
public class GradeConverter4
{
    public static void main( String[] arg )
    {
       // declare variables
       char grade;
       String input;
       
       input = JOptionPane.showInputDialog( "Please enter a letter grade" );
       
       grade = input.charAt( 0 );
      
       // create and display the output message
       String message = "";
       
       message = message + "Grade = " + grade;
       
       switch ( grade )  // only int or char
       {
           case 'A':  message = message + "\nGPA = 4.0";
                    break;
           
           case 'B':  message = message + "\nGPA = 3.0"; 
                    break;
           
           case 'C':  message = message + "\nGPA = 2.0";
                    break;
           
           default:  message = message + "\nGPA = 1.0";
       }
       

       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}
    
