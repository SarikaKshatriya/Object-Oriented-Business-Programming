package insy.java.hw6;
//Name: Sarika Kshatriya


//class to hold details of the location,year of construction and property tax
public class House
{
	//declare variables
	private int streetNum,yearOfConstruction,tax;
	private String streetName,townName;
	
	//default constructor
	public House()
	{
		this(0,"NONE","NONE",0,0);
	}
	//constructor with house details
	public House(int num,String st,String t,int y,int tx)
	{
		setStreetNum(num);
		setStreetName(st);
		setTown(t);
		setYearOfConstruction(y);
		setTax(tx);
	}
	
	//selectors
	public int getStreetNum()
	{
		return streetNum;
	}
	public String getStreetName()
	{
		return streetName;
	}
	public String getTown()
	{
		return townName;
	}
	public int getYearOfConstruction()
	{
		return yearOfConstruction;
	}
	public int getTax()
	{
		return tax;
	}

	//mutators
	public void setStreetNum(int num)
	{
		streetNum=num;	
	}
	public void setStreetName(String st)
	{
		streetName=st;
	}
	public void setTown(String t)
	{
		townName=t;
	}
	public void setYearOfConstruction(int y)
	{
		if( y > 0)
			yearOfConstruction=y;
	}
	public void setTax(int tx)
	{
		if( tx > 0)
			tax=tx;
	}
	
	public String toString()
	{
		return "Address: "+"\n Street Number: " +streetNum+ "\n Street Name: "+streetName+ "\n Town:"+townName+ "\n Year Of Construction:"+yearOfConstruction+ "\n Tax:"+tax+"\n";
	}
	
}
