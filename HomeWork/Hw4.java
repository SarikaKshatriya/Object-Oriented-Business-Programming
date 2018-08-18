//Name:Sarika Kshatriya

//rectangle class to check construcors ,set,get and toString method

import javax.swing.*;
public class Hw4
{
	public static void main(String args[])
	{
		//declare variables
		double length,width,area,perimeter;
		String message="";
		int menuOption;

		//create Rectangle object using the default constructor
		Rectangle rect= new Rectangle();

		//display menu options 1 to 7 and 0 to quit
		message = message + " Please enter one of the following options- " 
		 + "\n 1 - Set the length"
		 + "\n 2 - Set the width"
		 + "\n 3 - Get the length"
		 + "\n 4 - Get the width"
		 + "\n 5 - Get the perimeter"
		 + "\n 6 - Get the area"
		 + "\n 7 - Print the object as string"
		 + "\n 0 - Quit";
		menuOption = Integer.parseInt(JOptionPane.showInputDialog(message));

		//call the appropriate method for that object depending on the user selection 
		while(menuOption > 0)
		{
			switch(menuOption)
			{
				case 1:
					length = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the rectangle"));
					rect.setRectLength(length);
					break;
				case 2:
					width = Double.parseDouble(JOptionPane.showInputDialog("Please enter the width of the rectangle"));
					rect.setRectWidth(width);
					break;
				case 3:
					JOptionPane.showMessageDialog(null,"\nThe length of the rectangle is : "+ rect.getRectLength());
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"\nThe width of the rectangle is : "+ rect.getRectWidth());
					break;
				case 5:
					JOptionPane.showMessageDialog(null,"\nThe perimeter of the rectangle is : "+ rect.getPerimeter());
					break;
				case 6:
					JOptionPane.showMessageDialog(null,"\nThe area of the rectangle is : "+ rect.getArea());
					break;
				case 7:
					JOptionPane.showMessageDialog(null,rect);
					break;
				default:
					JOptionPane.showMessageDialog(null, "\n Please enter a number between 0-7");
					break;
			}
			
			menuOption = Integer.parseInt(JOptionPane.showInputDialog(message));
		}
		
		System.exit(0);
			
	}
}