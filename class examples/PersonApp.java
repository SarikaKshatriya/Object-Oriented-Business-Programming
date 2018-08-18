
public class PersonApp
{
    public static void main( String[] args )
    {
        Person fred; // object variable
        
        
        // initialize or instantiate
        //fred = new Person();
        
        /*
        // initialize the attributes
        fred.setFname( "Fred" );
        fred.setLname( "Smith" );
        fred.setAge( -35 );*/
        
        fred = new Person( "Smith", "Fred", 35 );
        
        // print the details
        //System.out.println( "fred: " + fred.getLname() + ", " + fred.getFname() + " (" + 
                                //fred.getAge() + ")" );
        
        //System.out.println( "fred:" + fred.toString() );
        System.out.println( "fred:" + fred ); 
    }
}
        