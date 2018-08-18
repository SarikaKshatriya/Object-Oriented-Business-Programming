
// Inheritance
// IS-A relationship
public class Staff extends Person
{
    private double monthlyRate;
    
    // Constructors
    public Staff()
    {
        //super(); // default constructor of super class
        setMonthlyRate( 0.0 );
    }
    
    public Staff( String l, String f, OurDate dob, double m )
    {
        super( l, f, dob );
        setMonthlyRate( m );
    }
    
    // selectors
    public double getMonthlyRate()
    {
        return monthlyRate;
    }
    
    public double getAnnualSalary()
    {
        return 12 * monthlyRate;
    }
    
    // mutator
    public void setMonthlyRate( double m )
    {
        monthlyRate = m;
    }
    
    // overriding
    public String toString()
    {
        return super.toString() + " Monthly Rate: " + monthlyRate;
    }
    
    // overriding
    public boolean equals( Object o )
    {
        Staff st = (Staff)o;
        
        if ( ( super.equals( st ) ) &&
             ( monthlyRate == st.getMonthlyRate() ) )
             return true;
            
        return false;
    }
    
    public Staff clone()
    {
        return new Staff( getLname(), getFname(), getDateOfBirth(), monthlyRate );
    }
} 
        
    