import javax.swing.*;

public class PersonApp2
{
    public static void main( String[] args )
    {
        Person p1, p2; // object variable
        //int month, day, year;
        OurDate dob;
        
        dob = new OurDate( 12, 1, 1980 );
        
        p1 = new Person( "Smith", "Greg", dob );
        System.out.println( "p1: " + p1 ); 
        
        dob.setYear( 1985 );
        p2 = new Person( "Smith", "Fred", dob );
        
        System.out.println( "After we create p2" ); 
        System.out.println( "p1: " + p1 ); 
        System.out.println( "p2: " + p2 ); 
    }
}
        