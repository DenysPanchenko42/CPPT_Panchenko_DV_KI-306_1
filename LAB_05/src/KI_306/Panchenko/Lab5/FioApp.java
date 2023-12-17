
package KI_306.Panchenko.Lab5;

import java.io.*;
import java.util.*;

/**
* Class <code>FioApp</code> Inheritance class for Equations class
* @author Panchenko
*/

public class FioApp extends Equations{

	/**
	 * @param args is arguments
	 * @throws FileNotFoundException is exception 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException
	{

		// TODO Auto-generated method stub
		CalcWFio obj = new CalcWFio();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter data: ");
		double data = s.nextDouble();
		obj.calc(data);
		System.out.println("Result is: " + obj.getResult());
		obj.writeResTxt("textRes.txt");
		obj.writeResBin("BinRes.bin");
		obj.readResBin("BinRes.bin");
		System.out.println("Result is: " + obj.getResult());
		obj.readResTxt("textRes.txt");
		System.out.println("Result is: " + obj.getResult());
		
		
	}
}

/**
* Class <code>CalcWFio</code> Implementation of functions for the class FioApp
* @author Panchenko
*/

class CalcWFio
{
	
	

	public void writeResTxt(String fName) throws FileNotFoundException
	{
		PrintWriter f = new PrintWriter(fName);
		f.printf("%.17f ",result);
		f.close();
	}
	
	
	
	public void readResTxt(String fName)
	{
		try
		{
			File f = new File (fName);
				if (f.exists())
				{
					Scanner s = new Scanner(f);
					result = s.nextDouble();
					s.close();
				}
				else
					throw new FileNotFoundException("File " + fName + "not found");
		}
		catch (FileNotFoundException ex)
		{
			System.out.print(ex.getMessage());
		}
	}
	public void writeResBin(String fName) throws FileNotFoundException, IOException
	{
		DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
		f.writeDouble(result);
		f.close();
	}
	public void readResBin(String fName) throws FileNotFoundException, IOException
	{
		DataInputStream f = new DataInputStream(new FileInputStream(fName));
		result = f.readDouble();
		f.close();
	}
	
	public void calc(double x)
	{
		result = Equations.calculate(x);
	}
	
	public double getResult()
	{
		return result;
	}
	private double result;
}