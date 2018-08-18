
import javax.swing.*;

//Program to check the given year is leap year or not
public class Hw2
{
 public static void main(String[] args)
	{
		//declare variable to input year
		int year;
		String message="";
		final int SENTINEL=-99;
		
		//prompt user to input year
		year=Integer.parseInt(JOptionPane.showInputDialog("Please enter year or "+SENTINEL+" to stop"));
		//keep prompting user till sentinel is entered
		while(year != SENTINEL)
		{
			//Check the year is leap year or not
			if( year % 4 == 0) 
			{
				if(year % 100 == 0)
				{
					if(year % 400 ==0)
						message= message+"The year "+year+ " is a leap year";
					else
						message=message+"The year "+year+" is not a leap year";
				}
				else
					message=message+"The year"+year+" is a leap year";
			}
			else
				message=message+"The year "+year+" is not a leap year";
			JOptionPane.showMessageDialog(null,message);
			//clear the previous message and print message for current year only
			message="";
			year=Integer.parseInt(JOptionPane.showInputDialog("Please enter year or "+SENTINEL+" to stop"));
		}
		System.exit(0);
	}
}
