import javax.swing.*;

public class StaffApp
{
    public static void main( String[] args )
    {
        Person[] group = new Person[ 3 ]; // object variable
        String lname, fname, major;
        int month, day, year;
        int choice;
        double mRate, hRate;
        
        
        for( int i = 0; i < group.length; i++ )
        {
            choice = Integer.parseInt( JOptionPane.showInputDialog( "Choose 0 for Staff and 1 for Student" ) );
            
            if ( choice == 0 )
            {
            
                // prompt the user for Peron attributes
                lname = JOptionPane.showInputDialog( "Please enter the last name" );
                fname = JOptionPane.showInputDialog( "Please enter the first name" );
                month = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an int month" ) );
                day = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an int day" ) );
                year = Integer.parseInt( JOptionPane.showInputDialog( "Please enter an int year" ) );
                mRate = Double.parseDouble( JOptionPane.showInputDialog( "Please enter the monthly rate" ) );
                
                // create an object
                group[ i ] = new Staff( lname, fname, new OurDate( month, day, year ), mRate );
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
                hRate = Double.parseDouble( JOptionPane.showInputDialog( "Please enter the hourly rate" ) );
                
                // create an object
                group[ i ] = new Student( lname, fname, new OurDate( month, day, year ), major, hRate );
            }
        }
        
        // print the entire group
        for( int i = 0; i < group.length; i++ )
            System.out.println( group[ i ] + " Annual Salary: " + group[ i ].getAnnualSalary() ); 
        
    }
}
        