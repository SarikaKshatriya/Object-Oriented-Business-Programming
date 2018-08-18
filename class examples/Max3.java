// prompt the user for 3 int & double values
// print the maximum of these two.

import javax.swing.*;
import java.text.*;

// public - access modifier
public class Max3
{
    
    
    // returns the maximum of num1 and num2
    public static int max( int num1, int num2 )
    {
        if ( num1 > num2 )
            return num1;
        
        return num2;
        
    }
    
    // returns the maximum of num1, num2, and num3
    // overloaded method
    public static int max( int num1, int num2, int num3  )
    {
        //int max;
        
        /*max = max( num1, num2 );
        max = max( max, num3 );*/
        
        
        return max( max( num1, num2 ), num3 );
        
    }
    
    // returns the maximum of num1 and num2
    // overloaded method
    public static double max( double num1, double num2 )
    {
        if ( num1 > num2 )
            return num1;
        
        return num2;
        
    }
    
    // returns the maximum of num1, num2, and num3
    // overloaded method
    public static double max( double num1, double num2, double num3  )
    {
        //int max;
        
        /*max = max( num1, num2 );
        max = max( max, num3 );*/
        
        return max( max( num1, num2 ), num3 );
        
    }
    
    
    public static void main( String[] arg )
    {
       // declare variables
       int val1, val2, val3, max;
       String message;
       
       
       val1 = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an integer value" ) );
       val2 = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an integer value" ) );
       val3 = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an integer value" ) );
       
       max = max( val1, val2, val3 );
       
       
       message = "val1 = " + val1 + ", val2 = " + val2 + ", val3 = " + val3;
       message += "\nmax = " + max;
       

       JOptionPane.showMessageDialog( null, message );   
       
       // repeat for double
       double valDbl1, valDbl2, valDbl3, maxDbl;
       
       
       valDbl1 = Double.parseDouble( JOptionPane.showInputDialog( "Please enter a double value" ) );
       valDbl2 = Double.parseDouble( JOptionPane.showInputDialog( "Please enter a double value" ) );
       valDbl3 = Double.parseDouble( JOptionPane.showInputDialog( "Please enter a double value" ) );
       
       maxDbl = max( valDbl1, valDbl2, valDbl3 );
       
       
       message = "val1 = " + valDbl1 + ", val2 = " + valDbl2 + ", val3 = " + valDbl3;
       message += "\nmax = " + maxDbl;
       

       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}
    
