// pre and post increment
public class PrePost
{
    public static void main( String[] args )
    {
        int i = 1, j = 2;
        
        // i + ++j
        System.out.println( "i = " + i + ", j = " + j );
        System.out.println( "\ni + ++j = " + (i + ++j) );
        System.out.println( "\ni = " + i + ", j = " + j );
        
        // i + j++
        System.out.println( "\ni + j++ = " + (i + j++) );
        System.out.println( "\ni = " + i + ", j = " + j );
    }
}
        
        
        
    