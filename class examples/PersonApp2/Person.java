package insy.java;

/**
A simple class that stores information about a person
**/
public class Person
{
    // access modifier - private
    // Encapsulation - hiding the implementation details
    // instance variables or state variables or attributes
    private String lname, fname;
    
    // composition
    // HAS-A relationship
    private OurDate dateOfBirth;
    
    
    // static variable
    private static int count = 0;
    
    // Constructors
    // default
    public Person()
    {
        this( "NONE", "NONE", new OurDate() );
    }
    
    /**
    overloaded constructor
    @param l - last name
    @param f - first name
    @param dob - date of birth
    **/
    
    public Person( String l, String f, OurDate dob )
    {
        setLname( l );
        setFname( f );
        setDateOfBirth( dob );
        
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
    
    public OurDate getDateOfBirth()
    {
        // never return a reference to an object instance variable
        return dateOfBirth.clone();
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
    
    public void setDateOfBirth( OurDate dob )
    {
        // never copy reference of an outside object
        // to an instance variable
        dateOfBirth = dob.clone();
    }
    
    // overriding toString()
    public String toString()
    {
        return lname + ", " + fname + " (" + dateOfBirth + ")";
    }
    
    // override equals
    public boolean equals( Object o )
    {
        Person p = (Person)o;
        
        if ( ( lname.equals( p.getLname() ) ) &&
             ( fname.equals( p.getFname() ) ) &&
             ( dateOfBirth.equals( p.getDateOfBirth() ) ) )
             
             return true;
         
        return false;
       
    }
    
    public Person clone()
    {
        Person p = new Person( lname, fname, dateOfBirth.clone() );
        
        return p;
    }
   
        
}
    