import javax.swing.*;
import insy.java.OurDate;
import insy.java.Person;

public class PersonApp
{
    public static void main( String[] args )
    {
        Person p; // object variable
        String lname, fname;
        int month, day, year;
        
        System.out.println( "No. of Persons: " + Person.getCount() );
        
        // prompt the user for Peron attributes
        lname = JOptionPane.showInputDialog( "Please enter the last name" );
        fname = JOptionPane.showInputDialog( "Please enter the first name" );
        month = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an int month" ) );
        day = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an int day" ) );
        year = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an int year" ) );
        
        // create an object
        p = new Person( lname, fname, new OurDate( month, day, year ) );
        
        System.out.println( p ); 
        System.out.println( "No. of Persons: " + Person.getCount() );
    }
}
        