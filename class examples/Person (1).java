public class Person
{
    // access modifier - private
    // Encapsulation - hiding the implementation details
    // instance variables or state variables or attributes
    private String lname, fname;
    private int age;
    
    // static constant
    public static final int MAX_AGE = 150;
    
    // static variable
    private static int count = 0;
    
    // Constructors
    // default
    public Person()
    {
        /*lname = "NONE";
        fname = "NONE";
        age = 0;
        count++;*/
        this( "NONE", "NONE", 0 );
    }
    
    // overloaded constructor
    public Person( String l, String f, int age )
    {
        setLname( l );
        setFname( f );
        setAge( age );
        //this.age = age;
        
        count++;
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
    
    // static method
    public static int getCount()
    {
        return count;
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
        if ( ( a >= 0 ) && ( a < MAX_AGE ) )
            age = a;
    }
    
    // overriding toString()
    public String toString()
    {
        return lname + ", " + fname + " (" + age + ")";
    }
    
    // override equals
    public boolean equals( Object o )
    {
        Person p = (Person)o;
        
        if ( ( lname.equals( p.getLname() ) ) &&
             ( fname.equals( p.getFname() ) ) &&
             ( age == p.getAge() ) )
             
             return true;
         
        return false;
       
    }
    
    public Person clone()
    {
        Person p = new Person( lname, fname, age );
        
        return p;
    }
   
        
}
    