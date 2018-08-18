
//Name: Sarika Kshatriya


//Driver application for Home class
import javax.swing.*;
import insy.java.hw6.Home;
import insy.java.hw6.House;
import insy.java.hw6.OurDate;

public class HomeDriver
{
	public static void main(String args[])
	{
		Home h;
		//declare variables		
		int streetNum,yearOfConstruction,tax,month, day, year;
		String streetName,townName,familyOccupying;
		
		//prompt user for home details
		streetNum = Integer.parseInt(JOptionPane.showInputDialog("Please enter the street number" ));
		streetName = JOptionPane.showInputDialog("Please enter the Street name");
		townName = JOptionPane.showInputDialog("Please enter the town");
		yearOfConstruction = Integer.parseInt(JOptionPane.showInputDialog("Enter the year of construction"));
		tax = Integer.parseInt(JOptionPane.showInputDialog("Please enter the property Tax"));
		familyOccupying = JOptionPane.showInputDialog("Please enter the name of the family");
		month = Integer.parseInt(JOptionPane.showInputDialog( "Please enter an int month(01-12)" ));
		day = Integer.parseInt(JOptionPane.showInputDialog("Please enter an int day(01-31)" ));
		year = Integer.parseInt(JOptionPane.showInputDialog("Please enter an int year(0000-9999)" ));
		
		//create instance of Home class
		h = new Home(streetNum, streetName,townName, yearOfConstruction, tax, familyOccupying, new OurDate(month, day, year));

		//print details of the home
		JOptionPane.showMessageDialog(null,h);
		//System.out.println(h);
	}
		
	
}