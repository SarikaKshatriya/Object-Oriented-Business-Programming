// demonstrating the use of nested if-else

// prompt the user for a letter grade
// and convert that grade into the GPA

import javax.swing.*;
import java.text.*;

// public - access modifier
public class GradeConverter3
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
       

       if ( grade == 'A' )
         message = message + "\nGPA = 4.0";
         
       if ( grade == 'B' )
         message = message + "\nGPA = 3.0";
         
       if ( grade == 'C' )
         message = message + "\nGPA = 2.0";
         
       if ( grade == 'D' )
         message = message + "\nGPA = 1.0";     
         
       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}
    
