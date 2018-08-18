
public class ArrayDemo
{
    public static void main( String[] args )
    {
        // declare vint array
        int[] arr;
        
        // allocate the array
        arr = new int[ 10 ];
        
        // initialize the array
        for( int i = 0; i < arr.length; i++ )
            arr[ i ] = 2 * i;

            
        // print the array
        for( int i = 0; i < arr.length; i++ )
            System.out.print( arr[ i ] + " " );
        System.out.println();
        
        // another way of declaring, allocating, and initializing arrays
        int[] arr2 = { 10, 20, 30 };
    }
}        
                
        
        
    