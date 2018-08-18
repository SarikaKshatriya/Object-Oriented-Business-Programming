import javax.swing.*;

public class StudentApp
{
    public static void main( String[] args )
    {
       
        System.out.println( "No. of Students: " + Student.getCount() );
        
       
        // create an object
        Student st1 = new Student( "Smith", "Fred", new OurDate( 1, 1, 1985 ), "INSY" );
        
        System.out.println( st1 ); 
        System.out.println( "No. of Students: " + Student.getCount() );
        
        // create an object
        Student st2 = new Student( "Smith", "Fred", new OurDate( 1, 1, 1985 ), "INSY" );
        
        System.out.println( st2 ); 
        System.out.println( "No. of Students: " + Student.getCount() );
        
        if ( st1.equals( st2 ) )
            System.out.println( "st1 and st2 are same" );
        else
            System.out.println( "st1 and st2 are not the same" );        
    }
}
        