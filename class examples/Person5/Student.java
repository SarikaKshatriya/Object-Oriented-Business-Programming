
// Inheritance
// IS-A relationship
public class Student extends Person
{
    private String major;
    
    // Constructors
    public Student()
    {
        //super(); // default constructor of super class
        setMajor( "NONE" );
    }
    
    public Student( String l, String f, OurDate dob, String m )
    {
        super( l, f, dob );
        setMajor( m );
    }
    
    // selectors
    public String getMajor()
    {
        return major;
    }
    
    // mutator
    public void setMajor( String m )
    {
        major = m;
    }
    
    // overriding
    public String toString()
    {
        return super.toString() + " Major: " + major;
    }
    
    // overriding
    public boolean equals( Object o )
    {
        Student st = (Student)o;
        
        if ( ( super.equals( st ) ) &&
             ( major.equals( st.getMajor() ) ) )
             return true;
            
        return false;
    }
    
    public Student clone()
    {
        return new Student( getLname(), getFname(), getDateOfBirth(), major );
    }
} 
        
    