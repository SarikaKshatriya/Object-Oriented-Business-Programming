
public class ArrayDemo3
{
    // calling-by-reference
    public static void incrementByOne( int[] arr2 )
    {
        for( int i = 0; i < arr2.length; i++ )
            arr2[ i ]++;
        
    }
    
    // arr3 = arr1 + arr2
    // calling-by-ref
    public static void add( int[] arr1, int[] arr2, int[] arr3 )
    {
        for( int i = 0; i < arr1.length; i++ )
            arr3[ i ] = arr1[ i ] + arr2[ i ];
    }
    
    // overloaded add
    public static int[] add( int[] arr1, int[] arr2 )
    {
        int[] arr3 = new int[ arr1.length ];
        
        for( int i = 0; i < arr1.length; i++ )
            arr3[ i ] = arr1[ i ] + arr2[ i ];
        
        return arr3;
    }
        
    
    
    public static void main( String[] args )
    {
        // declare int arraya
        
        int[] ar1 = { 1, 2, 3, 4, 5 };
        int[] ar2 = { 5, 4, 3, 2, 1 };
        int[] ar3 = new int[ 5 ];
        int[] ar4;
        
        add( ar1, ar2, ar3 );
        ar4 = add( ar2, ar3 );

            
        // print the arrays
        for( int i = 0; i < ar1.length; i++ )
            System.out.print( ar1[ i ] + " " );
        System.out.println();
        
        for( int i = 0; i < ar2.length; i++ )
            System.out.print( ar2[ i ] + " " );
        System.out.println();
        
        for( int i = 0; i < ar3.length; i++ )
            System.out.print( ar3[ i ] + " " );
        System.out.println();
        
        for( int i = 0; i < ar4.length; i++ )
            System.out.print( ar4[ i ] + " " );
        System.out.println();
        
        
    }
}        
                
        
        
    