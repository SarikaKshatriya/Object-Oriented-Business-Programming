
public class AutoApp
{
    public static void drive( Drivable v )
    {
        v.start();
        v.accelerate();
        v.decelerate();
        v.stop();
    }
    
    public static void main( String[] arg )
    {
        Drivable d1, d2;
        
        // create a minivan and drive it
        System.out.println( "--------------------------------------" );
        System.out.println( "Create a Minivan and drive it" );
        d1 = new Minivan();
        drive( d1 );
        
        // create a sports car and drive it
        System.out.println( "--------------------------------------" );
        System.out.println( "Create a SportsCar and drive it" );
        d2 = new SportsCar();
        drive( d2 );
    }
}
        
        
        
    