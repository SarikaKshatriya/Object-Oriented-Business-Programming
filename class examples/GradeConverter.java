// demonstrating the use of nested if-else

// prompt the user for an int score
// and convert that score into a letter grade

import javax.swing.*;
import java.text.*;

// public - access modifier
public class GradeConverter
{
    public static void main( String[] arg )
    {
       // declare variables
       int score;
       
       score = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an integer value" ) );
      
       // create and display the output message
       String message = "";
       
       message = message + "score = " + score;
       
       // nested if-else
       if ( score >= 90 )
         message = message + "\nGrade = A";
       else if ( score >= 80 ) 
                message = message + "\nGrade = B";
            else if ( score >= 70 )
                    message = message + "\nGrade = C";
                 else 
                    message = message + "\nGrade = D";
          
       
       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}
    
