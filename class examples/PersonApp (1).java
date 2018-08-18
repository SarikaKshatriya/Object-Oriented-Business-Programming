import javax.swing.*;

public class PersonApp
{
    public static void main( String[] args )
    {
        Person fred; // object variable
        String lname, fname;
        int age;
        
        System.out.println( "No. of Persons: " + Person.getCount() );
        
        // prompt the user for Peron attributes
        lname = JOptionPane.showInputDialog( "Please enter the last name" );
        fname = JOptionPane.showInputDialog( "Please enter the first name" );
        age = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an age less than " + Person.MAX_AGE ) );
        
        // create an object
        fred = new Person( lname, fname, age );
        
        // print the details
        //System.out.println( "fred: " + fred.getLname() + ", " + fred.getFname() + " (" + 
                                //fred.getAge() + ")" );
        
        //System.out.println( "fred:" + fred.toString() );
        System.out.println( "fred:" + fred ); 
        System.out.println( "No. of Persons: " + Person.getCount() );
    }
}
        