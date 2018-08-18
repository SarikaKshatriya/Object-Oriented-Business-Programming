import javax.swing.*;

// demonstrating an array of objects
public class PersonApp5
{
    
    public static void main( String[] args )
    {

        Person[] group; // object array variable
        
        // allocate the array
        group = new Person[ 3 ];
        
        // initialize the array
        group[ 0 ] = new Person();
        group[ 1 ] = new Person( "Smith", "Fred", 35 );
        group[ 2 ] = new Person( "Smith", "Greg", 46 );
        
        
        // print the array
        for( int i = 0; i < group.length; i++ )
            System.out.println( group[ i ] );
               
    }
}
        