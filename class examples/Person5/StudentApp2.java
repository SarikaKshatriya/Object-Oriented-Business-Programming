import javax.swing.*;

public class StudentApp2
{
    // Polymorphism - a method can respond to different types of objects
    public static void printPersonName( Person p )
    {
        System.out.println( "Person's name is: " + p.getFname() + " " + p.getLname() );
    }
    
    public static void main( String[] args )
    {
       
        System.out.println( "No. of Students: " + Student.getCount() );
        
       
        // Student IS-A type of Person
        // Polymorphism - one type of variable can hold multiple types of objects
        Person p1 = new Student( "Smith", "Fred", new OurDate( 1, 1, 1985 ), "INSY" );
        
        // Dynamic Binding - at run time it figures the correct version
        // of the toString method to call
        System.out.println( p1 ); 
        System.out.println( "No. of Students: " + Student.getCount() );
        
        // create an object
        Student st2 = new Student( "Smith", "Greg", new OurDate( 1, 1, 1985 ), "INSY" );
        
        System.out.println( st2 ); 
        System.out.println( "No. of Students: " + Student.getCount() );
        
        Person p3 = new Person( "Smith", "Mike", new OurDate( 1, 1, 1985 ) );
        
        System.out.println( p3 ); 
        
        // cannot do this as a Person is not a Student
        //Student st = new Person();
        
        printPersonName( p1 );
        printPersonName( st2 );
        printPersonName( p3 );
        
               
    }
}
        