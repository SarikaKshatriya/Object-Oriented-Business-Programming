

//program that inputs 2 persons first name,last name and age and compares the two age
import javax.swing.*;
public class HW1
{
	public static void main(String[] args)
	{
		//declare variables for first person: firstname,lastname and age
		String firstFirstName;
		String firstLastName;
		int firstAge;
		
		//declare variables for second person: firstname,lastname and age
		String secondFirstName;
		String secondLastName;
		int secondsAge;
		
		//declare variable to display output message
		String message="";
		
		//ask user to enter information of first person
		firstFirstName=JOptionPane.showInputDialog("Please enter first name of the first person");
		firstLastName=JOptionPane.showInputDialog( "Please enter last name of the first person");
		firstAge=Integer.parseInt(JOptionPane.showInputDialog( "Please enter age of the first person"));
		
		//ask user to enter information of second person
		secondFirstName=JOptionPane.showInputDialog("Please enter first name of the second person");
		secondLastName=JOptionPane.showInputDialog("Please enter last name of the second person");
		secondsAge=Integer.parseInt(JOptionPane.showInputDialog("Please enter age of the second person"));
		
		//when printing ouput combine all the information of both persons and append to message string
		message="First Person: "+ firstLastName + ", " + firstFirstName +" ("+firstAge+")\n";
		message=message+"Second Person: "+ secondLastName +", "+ secondFirstName+" ("+secondsAge+")\n";
		
		//check if the first person is older than second
		if(firstAge>secondsAge)
			message=message+ firstLastName + " is older than " + secondLastName;
			
		//check if the first person is younger than second
		if(firstAge<secondsAge)
			message=message+ firstLastName + " is younger than " + secondLastName;	
		
		//check if the first person is of same age of second
		if(firstAge==secondsAge)
			message=message+ firstLastName + " is of same age as " + secondLastName;
		
		//show output to the user
		JOptionPane.showMessageDialog(null,message);
		
		System.exit(0);
		
			
	}
}