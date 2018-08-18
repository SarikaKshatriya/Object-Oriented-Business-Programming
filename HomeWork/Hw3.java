

//program to compute the electic charge of a customer

import javax.swing.*;
import java.text.*;

public class Hw3
{
	//method:takes kwh and calculates the total charge for that customer
	public static double findCharge(int kwh)
	{
		//declare variable		
		double charge=0.0;
		//calculate charge according to schedule
		if(kwh >=0 && kwh<=300)
			charge=kwh*0.09;
		if(kwh >300 && kwh<=600)
			charge=(300*0.09)+(kwh-300)*0.08;
		if(kwh >600 && kwh<=1000)
			charge=(300*0.09)+(300*0.08)+(kwh-600)*0.06;
		if(kwh > 1000)
			charge=(300*0.09)+(300*0.08)+(400*0.06)+(kwh-1000)*0.05;

		return charge;		
	}
	public static void main(String[] args)
	{
		//declare variables
		String message="";
		final int SENTINEL= -999;
		int NoOfCustomer=0;
		int customerNumber;
		int kwh,totalKwh=0;
		double charge,totalCharge=0.0;

		DecimalFormat myFormat= new DecimalFormat("0.00");

		JTextArea textArea = new JTextArea(15,15);
		//promt user for customer number
		customerNumber=Integer.parseInt(JOptionPane.showInputDialog("Please enter a customer number or"+SENTINEL+" to quit."));
		
		message = message + "Customer No.\tUsage in Kwh.\tTotal Charges";
		message = message + "\n-----------------------------------------------------------------------\n";
		
		while(customerNumber != SENTINEL)
		{
			//promt user for kwh
			kwh=Integer.parseInt(JOptionPane.showInputDialog("Please enter the usage in KWH"));
			//call the function to compute the charges
			charge=findCharge(kwh);
			NoOfCustomer+=1;
			message = message+customerNumber+"\t"+kwh+"\t"+myFormat.format(charge)+"\n";

			customerNumber=Integer.parseInt(JOptionPane.showInputDialog("Please enter a customer number or"+SENTINEL+" to quit."));
			
			totalCharge=totalCharge+charge;
			totalKwh=totalKwh+kwh;
	
		}
		//display total charge and kwh for all customers
		message = message+"\n-------------------------------------------------------------------------\n";
		message = message+NoOfCustomer+"\t"+totalKwh+"\t"+myFormat.format(totalCharge);
		textArea.setText(message);
		JOptionPane.showMessageDialog(null,textArea);
		System.exit(0);		
		

	}
}