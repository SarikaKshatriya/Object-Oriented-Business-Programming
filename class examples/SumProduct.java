// prompt the user for an int value n
// find the sum of values 1+2+....n
// find the product of values 1.2.....n

import javax.swing.*;
import java.text.*;

// public - access modifier
public class SumProduct
{
    public static int sum( int num )
    {
        int sum = 0; // local variable
        
        for( int i = 1; i <= num; i++ )
            sum += i;
        
        return sum;
        
    }
    
    // factorial
    public static int product( int num )
    {
        int product = 1;
        
        for( int i = 1; i <= num; i++ )
            product *= i;
        
        return product;
        
        
    }
    
    public static void main( String[] arg )
    {
       // declare variables
       int val, sum, product;
       String message;
       
       
       val = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an integer value" ) );
       
       sum = sum( val );
       product = product( val );
       
       
       message = "val = " + val;
       message += "\n1+2+..." + val + ": " + sum;
       message += "\n1.2. ..." + val + ": " + product;
       

       JOptionPane.showMessageDialog( null, message );      
       
       System.exit( 0 );         
       
    }
    
}
    
