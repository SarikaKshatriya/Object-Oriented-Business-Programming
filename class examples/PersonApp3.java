import javax.swing.*;

// demonstrating the use of clone
public class PersonApp3
{
    public static void main( String[] args )
    {
        Person p1, p2; // object variable
        
        // create an object
        p1 = new Person( "Smith", "Greg", 35 );
        System.out.println( "p1:" + p1 ); 
        //p2 = new Person( "Smith", "Fred", 35 );
        
        p2 = p1.clone(); // copy p1
        p2.setFname( "Fred" ); // change p2's first name
        
        System.out.println( "After creating p2" ); 
        System.out.println( "p1:" + p1 ); 
        System.out.println( "p2:" + p2 ); 
        
               
    }
}
        