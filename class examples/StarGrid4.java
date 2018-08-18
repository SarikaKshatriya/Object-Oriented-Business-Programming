// nested loops


// * * * *
// * * * * *
// * * * * *
// * * 
// * * *
// random 
import java.util.*;

public class StarGrid4
{
    public static void main( String[] args )
    {
        Random rand = new Random();
        
        for( int row = 0; row < 5; row++ )
        {
            int rowLength = rand.nextInt( 5 ); // 0 - 4
            
            for( int column = 0; column <= rowLength; column++ )
                System.out.print( "* " );
            System.out.println();  
        }      
    }
}