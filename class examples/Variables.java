// Demonstrate the use of variables

import javax.swing.*;

// public - access modifier
public class Variables
{
    public static void main( String[] arg )
    {
       // declare primitive variables
       // int - integers
       // double - double
       // boolean - 
       // char - character
       // String - string
       
       int xInt;
       double xDbl;
       boolean xBool;
       char xChar;
       String xStr;
       
       // initialize the variables
       xInt = 10;
       xDbl = 2.5;
       xBool = true;
       xChar = '?';
       xStr = "This is a String";
       
       /*JOptionPane.showMessageDialog( null, "xInt = " + xInt +
                                            "\nxDbl = " + xDbl +
                                            "\nxBool = " + xBool +
                                            "\nxChar = " + xChar +
                                            "\nxStr = " + xStr );
                                            */
       String message = "";
       
       message = message + "xInt = " + xInt;
       message = message + "\nxDbl = " + xDbl;     
       message = message + "\nxBool = " + xBool;
       message = message + "\nxChar = " + xChar;
       message = message + "\nxStr = " + xStr;
       
       JOptionPane.showMessageDialog( null, message );               
       
    }
    
}
    
