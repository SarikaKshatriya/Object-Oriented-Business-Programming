//Name:Sarika Kshatriya

import javax.swing.*;

//Program to check the given number is palindrome or not
public class Hw5
{
 public static void main(String[] args)
	{
		//declare variable to input number
		int number,size;
		String message="";
		final int SENTINEL=-99;		
		int intArray[];
		boolean result;
		
		//prompt user to input number
		number=Integer.parseInt(JOptionPane.showInputDialog("Please enter number or "+ SENTINEL +" to stop"));

		//keep prompting user till sentinel is entered
		while(number != SENTINEL)
		{
			size=getSize(number);
			intArray= new int[size];
			fillArray(number,intArray);
			result=isPalindrome(intArray);
			message = "The given number "+ number + " is: ";
			if(result)
				message=message+ " Palindrome.";
			else
				message=message+ " not a Palindrome.";

			JOptionPane.showMessageDialog(null,message);
			number=Integer.parseInt(JOptionPane.showInputDialog("Please enter number or "+ SENTINEL + " to stop"));
		}
		System.exit(0);
	}

	//method to calculate number of digits in the number
	public static int getSize(int num)
	{
		int NoOfDigits;
		for(NoOfDigits=0;num != 0;NoOfDigits++)
			num=num/10;
		return NoOfDigits; 
	}
	
	//method to fill the array with all digits present in a number
	public static void fillArray(int num,int[] intArray)
	{
		for(int i=intArray.length-1;i>=0;i--)
		{
			intArray[i]=num%10;
			num=num/10;
		}
	}

	//method to check the array is palindrome or not
	public static boolean isPalindrome(int[] intArray)
	{
		int c=0;
		for(int i=0;i<(intArray.length/2);i++)
		{	
			if(intArray[i]==intArray[intArray.length-i-1])
				c++;
		}
		if (c==(intArray.length/2))
			return true;
		else
			return false;
	}
}		
	