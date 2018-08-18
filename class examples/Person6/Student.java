
// Inheritance
// IS-A relationship
public class Student extends Person
{
    private String major;
    private double hourlyRate;
    
    // Constructors
    public Student()
    {
        //super(); // default constructor of super class
        setMajor( "NONE" );
        setHourlyRate( 0.0 );
    }
    
    public Student( String l, String f, OurDate dob, String m, double h )
    {
        super( l, f, dob );
        setMajor( m );
        setHourlyRate( h );
    }
    
    // selectors
    public String getMajor()
    {
        return major;
    }
    
    public double getHourlyRate()
    {
        return hourlyRate;
    }
    
    public double getAnnualSalary()
    {
        return 20 * 52 * hourlyRate;
    }
    
    // mutator
    public void setMajor( String m )
    {
        major = m;
    }
    
    public void setHourlyRate( double h )
    {
        hourlyRate = h;
    }
    
    // overriding
    public String toString()
    {
        return super.toString() + " Major: " + major + " Hourly Rate: " + hourlyRate;
    }
    
    // overriding
    public boolean equals( Object o )
    {
        Student st = (Student)o;
        
        if ( ( super.equals( st ) ) &&
             ( major.equals( st.getMajor() ) ) &&
             ( hourlyRate == st.getHourlyRate() ) )
             return true;
            
        return false;
    }
    
    public Student clone()
    {
        return new Student( getLname(), getFname(), getDateOfBirth(), major, hourlyRate );
    }
} 
        
    