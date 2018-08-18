
public class PlaneApp
{
    public static void fly( FixedWing f )
    {
        f.start();
        f.accelerate();
        f.takeOff();
        f.cruise();
        f.land();
        f.decelerate();
        f.stop();
    }
    
    //overload fly
    public static void fly( RotaryWing r )
    {
        r.takeOff();
        r.cruise();
        r.land();
        
    }
   
    
    public static void main( String[] args )
    {
        FixedWing f;
        RotaryWing r;
        
        // create a passenger jet and fly it
        System.out.println( "--------------------------------------" );
        System.out.println( "Create a Passenger Jet and fly it" );
        f = new PassengerJet();
        fly( f );
        
        // create a helicopter and fly it
        System.out.println( "--------------------------------------" );
        System.out.println( "Create a Helocopter and fly it" );
        r = new Copter();
        fly( r );
    }
}
    