/*
import java.io.InputStreamReader;
import java.io.BufferedReader;
class InputUsingIOClass
{
	public static void main(String args[])
	{
		int x=0;
		double y=0.0;

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter The value Of x:");
		x=Integer.parseInt(br.readLine());

		System.out.println("Enter The value Of Y:");
		y=Double.parseDouble(br.readLine());

		System.out.println("The value Of x= "+x);
		System.out.println("The value Of y="+y);
		System.out.println("The Sum = "+(x+y));
	}
	
}

C:\Users\USER\Documents\JAVAFSD24>javac InputUsingIOClass.java
InputUsingIOClass.java:14: error: unreported exception IOException; must be caught or declared to be thrown
                x=Integer.parseInt(br.readLine());
                                              ^
InputUsingIOClass.java:17: error: unreported exception IOException; must be caught or declared to be thrown
                y=Double.parseDouble(br.readLine());
                                                ^
2 errors

Remove this Exception Using try Catch 

or throws clause

//===================================================================================================================
///try Catch 

import java.io.InputStreamReader;
import java.io.BufferedReader;
class InputUsingIOClass
{
	public static void main(String args[])
	{
		int x=0;
		double y=0.0;

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		try
		{
			System.out.println("Enter The value Of x:");
			x=Integer.parseInt(br.readLine());

			System.out.println("Enter The value Of Y:");
			y=Double.parseDouble(br.readLine());
		}
		catch(Exception e){}

		System.out.println("The value Of x= "+x);
		System.out.println("The value Of y="+y);
		System.out.println("The Sum = "+(x+y));
	}
	
}

*/
//================================================================================================================///throws clause


import java.io.InputStreamReader;
import java.io.BufferedReader;
class InputUsingIOClass
{
	public static void main(String args[]) throws Exception
	{
		int x=0;
		double y=0.0;

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		
		System.out.println("Enter The value Of x:");
		x=Integer.parseInt(br.readLine());

		System.out.println("Enter The value Of Y:");
		y=Double.parseDouble(br.readLine());
	

		System.out.println("The value Of x= "+x);
		System.out.println("The value Of y="+y);
		System.out.println("The Sum = "+(x+y));
	}
	
}





