// demonstrating order of evaluation

// x + y * z + x
// (x + y) * z + x
// x + y * (z + x)
// (x + y) * (z + x)

import javax.swing.*;
import java.text.*;

// public - access modifier
public class OrderOfEvaluation
{
    public static void main( String[] arg )
    {
       // declare variables
       int x, y, z;
       x = 2;
       y = 3;
       z = 4;

       
       // create and display the output message
       String message = "";
       
       message = message + "x = " + x + "; y = " + y + "; z = " + z;
       message = message + "\nx + y * z + x = " + (x + y * z + x);     
       message = message + "\n(x + y) * z + x = " + ((x + y )* z + x);
       message = message + "\nx + y * (z + x) = " + (x + y * (z + x));
       message = message + "\n(x + y) * (z + x) = " + ((x + y )* (z + x));
       
       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}
    
