import javax.swing.*;

// demonstrating the use of equals
public class PersonApp2
{
    public static void main( String[] args )
    {
        Person p1, p2; // object variable
        
        // create an object
        p1 = new Person( "Smith", "Greg", 35 );
        p2 = new Person( "Smith", "Fred", 35 );
        
        System.out.println( "p1:" + p1 ); 
        System.out.println( "p2:" + p2 ); 
        
        //if ( p1 == p2 )
        if ( p1.equals( p2 ) )
            System.out.println( "p1 is same as p2" ); 
        else
            System.out.println( "p1 is not same as p2" );         
    }
}
        