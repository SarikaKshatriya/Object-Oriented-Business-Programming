public class Person
{
    // access modifier - private
    // Encapsulation - hiding the implementation details
    // instance variables or state variables or attributes
    private String lname, fname;
    private int age;
    
    // Constructors
    // default
    public Person()
    {
        /*lname = "NONE";
        fname = "NONE";
        age = 0;*/
        this( "NONE", "NONE", 0 );
    }
    
    // overloaded constructor
    public Person( String l, String f, int age )
    {
        setLname( l );
        setFname( f );
        setAge( age );
        //this.age = age;
    }
    
    // object behavior
    // accesor methods
    
    // selector methods
    public String getLname()
    {
        return lname;
    }
    
    public String getFname()
    {
        return fname;
    }
    
    public int getAge()
    {
        return age;
    }
    
    // mutator methods
    public void setLname( String l )
    {
        lname = l;
    }
    
    public void setFname( String f )
    {
        fname = f;
    }
    
    public void setAge( int a )
    {
        if ( a >= 0 )
            age = a;
    }
    
    // overriding toString()
    public String toString()
    {
        return lname + ", " + fname + " (" + age + ")";
    }
    
   
        
}
    