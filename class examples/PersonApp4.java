import javax.swing.*;

// demonstrating calling-by-reference
public class PersonApp4
{
    // calling-by-value
    public static void incrementAge( int age )
    {
        age++;
    }
    
    // calling-by-reference
    public static void incrementAge( Person p )
    {
        p.setAge( p.getAge() + 1 );
    }
    
    
    public static void main( String[] args )
    {
        Person p1; // object variable
        
        // create an object
        p1 = new Person( "Smith", "Greg", 35 );
        System.out.println( "p1:" + p1 ); 
        
        incrementAge( p1.getAge() );
        
        System.out.println( "After calling incrementAge(int)" ); 
        System.out.println( "p1:" + p1 ); 
        
        incrementAge( p1 );
        
        System.out.println( "After calling incrementAge(Person)" ); 
        System.out.println( "p1:" + p1 );
        
               
    }
}
        