package insy.java.hw6;
//Name: Sarika Kshatriya

//class to hold details for the name of the occupying family and the date they moved in
public class Home extends House
{
	//declare variables
	private String familyOccupying;
	private OurDate dateMovedIn;

	//default constructor
	public Home()
	{
		super();
		setFamily("NONE");
		setDateMovedIn(new OurDate());
	}
	//constructor calling default construcor of super class
	public Home (int house, String street, String town, String family,OurDate movedIn)
	{
		super(house,street,town,0,0);
		setFamily(family);
		setDateMovedIn(movedIn);
	}
	//default constructor
	public Home (int house, String street, String town, int yearConstructed, int propertyTax, String family, OurDate movedIn)
	{
		super(house,street,town,yearConstructed,propertyTax);
		setFamily(family);
		setDateMovedIn(movedIn);
	}
	
	//selectors
	public String getFamily()
	{
		return familyOccupying;
	}
	
	public OurDate getDateMovedIn()
	{
		return dateMovedIn.clone();
	}
	
	//mutators
	public void setFamily(String f)
	{
		familyOccupying = f;
	}
	
	public void setDateMovedIn(OurDate od)
	{
		dateMovedIn = od.clone();
	}
	//overriding 
	public String toString()
	{
		return super.toString() + " has been occupied by " + familyOccupying + " since " + dateMovedIn;
	}
}
