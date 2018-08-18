import javax.swing.*;

public class StudentApp3
{
    public static void main( String[] args )
    {
        Person[] group = new Person[ 3 ]; // object variable
        String lname, fname, major;
        int month, day, year;
        int choice;
        
        System.out.println( "No. of Persons: " + Person.getCount() );
        
        for( int i = 0; i < group.length; i++ )
        {
            choice = Integer.parseInt( JOptionPane.showInputDialog( "Choose 0 for Person and 1 for Student" ) );
            
            if ( choice == 0 )
            {
            
                // prompt the user for Peron attributes
                lname = JOptionPane.showInputDialog( "Please enter the last name" );
                fname = JOptionPane.showInputDialog( "Please enter the first name" );
                month = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an int month" ) );
                day = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an int day" ) );
                year = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an int year" ) );
                
                // create an object
                group[ i ] = new Person( lname, fname, new OurDate( month, day, year ) );
            }
            else
            {
            
                // prompt the user for Peron attributes
                lname = JOptionPane.showInputDialog( "Please enter the last name" );
                fname = JOptionPane.showInputDialog( "Please enter the first name" );
                month = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an int month" ) );
                day = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an int day" ) );
                year = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an int year" ) );
                major = JOptionPane.showInputDialog( "Please enter the major" );
                
                // create an object
                group[ i ] = new Student( lname, fname, new OurDate( month, day, year ), major );
            }
        }
        
        // print the entire group
        for( int i = 0; i < group.length; i++ )
            System.out.println( group[ i ] ); 
        
    }
}
        