/*
class ExceptionPractice 
{
	public static void main(String[] args) 
	{
		x=10;
		System.out.println("x= "+x);
	}
}
*/
//======================================
/*
class ExceptionPractice
{
	public static void main(String []args)
	{
		int x;
		double y;

		try
		{
			x=Integer.parseInt(args[0]);
			y=Integer.parseInt(args[1]);

			System.out.println("x="+x+"\t y="+y);
		}
		catch (ArrayIndexOutOfBoundsException  e)
		{
			System.out.println("Problem due to improper location access");
			System.out.println("Execution with default values");
			x=1;
			y=1.0;
		}
		catch(NumberFormatException e)
		{
			System.out.println("Problem due to improper Numeric values entered");
			System.out.println("Execution with default values");
			x=2;
			y=2.2;
		}

		catch(Exception e)
		{
			System.out.println("Problem due to improper runtime");
			System.out.println("Execution with default values");
			x=3;
			y=3.2;
		}
		System.out.println("x="+x+"\t y="+y);
		
	}
}
*/
//======================================================

/*

class ExceptionPractice
{
	public static void main(String []args)
	{
		String s1="";
		String s2="";
		
		try
		{
			s1=args[0];
			s2=args[1];
		}
		catch(Exception e)
		{
			System.out.println("---------------------------------");
			System.out.println("One: "+e.getMessage());
			System.out.println("---------------------------------");
			System.out.println("Two: "+e);
			System.out.println("---------------------------------");
			System.out.println("Three:");
			e.printStackTrace();
			System.out.println("---------------------------------");
			System.out.println("Four: Index Issue");
			System.out.println("---------------------------------");
		}

		System.out.println("s1="+s1+"\t s2="+s2);
	}
}

*/

//==========================================================================
/*
import java.util.*;
class ExceptionPractice
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Your Count ");
		int cnt = sc.nextInt();

		try
		{
			int x[]=new int[cnt];

			System.out.println("\nEnter Your Elements:");
			for(int i=0;i<cnt;i++)
			{
				x[i]=sc.nextInt();
			}

			System.out.println("\nEnter Any Position :");
			int pos = sc.nextInt();
			System.out.println("Value At Pos :"+x[pos]);
		}
		
		catch(InputMismatchException ae)
		{
			System.out.println("You Enter Char \nError : "+ae);
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Entered Pos is Not Exits:"+e);
		}

		catch(Exception ep)
		{
			System.out.println("Excution problem"+ep);
		}
		finally
		{
			System.out.println("Finally Block ");
		}
	}
}
*/
//=====================================================

/*

import java.util.Scanner;
class ExceptionPractice
{
	public static void main(String []args)
	{
		int x,y;
		double z=0.0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter any two nos: ");
		x=sc.nextInt();
		y=sc.nextInt();

		try
		{
			z=x/y;
		}
		catch (Exception e)
		{
			
			System.out.println("In catch block");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("In Finally block");
		}

		System.out.println(" value of z is: "+z);
	}
}

*/
//========================================================

/* Random Usded in Try Block
import java.util.Random;
import java.util.*;
class ExceptionPractice
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Your Count ");
		int cnt = sc.nextInt();
		int x[]=new int[cnt];
		
		Random random = new Random();

		
		System.out.println("\nEnter Your Elements:");
		for(int i=0;i<cnt;i++)
		{
			x[i]=sc.nextInt();
		}

		for(int i=0;i<cnt;i++)
		{
			int r = random.nextInt(30);

			try
			{
				System.out.println(x[r]);
			}
			
			finally
			{
				System.out.println("In finally");
			}
		}

		System.out.println("End Of Program");
	}
}

*/
//=================================================

//Gemerated Manully Exception 
/*
import java.util.*;

class FillForm
{
	private int id;
	private String nm;
	private int age;
	private double SSC;
	private double HSC;
	private double Btech;

	public void in()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter Your Name:");
		nm=sc.nextLine();
		System.out.println("\n Enter Your Id:");
		id=sc.nextInt();
		System.out.println("\n Enter Your age:");
		age=sc.nextInt();

		if(age<21)
		{
			throw new NumberFormatException("Age is less to apply For This Job ");
		}

		else if(age>29)
		{
			throw new NumberFormatException("Age is Greater Than Age Window");
		}

		System.out.println("\n Enter Your SSC Marks:");
		SSC=sc.nextDouble();
		System.out.println("\n Enter Your HSC Marks:");
		HSC=sc.nextDouble();
		System.out.println("\n Enter Your B-Tech Marks:");
		Btech=sc.nextDouble();
	}
	public void out()
	{
		System.out.println("Name :"+nm+"\tId :"+id+"\tAge :"+age);
		System.out.println("SSC :"+SSC+"\tHSC :"+HSC+"\tB-TECH :"+Btech);
	}
}

class ExceptionPractice
{
	public static void main(String []args)
	{	
		FillForm ob = new FillForm();
		ob.in();
		ob.out();
	}
}

*/
//============================================================================

//Handling Manually Exception
/*
import java.util.*;

class FillForm
{
	private int id;
	private String nm;
	private int age;
	private double SSC;
	private double HSC;
	private double Btech;

	public void in()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter Your Name:");
		nm=sc.nextLine();
		System.out.println("\n Enter Your Id:");
		id=sc.nextInt();
		System.out.println("\n Enter Your age:");
		age=sc.nextInt();

		if(age<21)
		{
			throw new NumberFormatException("Age is less to apply For This Job ");
		}

		else if(age>29)
		{
			throw new NumberFormatException("Age is Greater Than Age Window");
		}

		System.out.println("\n Enter Your SSC Marks:");
		SSC=sc.nextDouble();
		System.out.println("\n Enter Your HSC Marks:");
		HSC=sc.nextDouble();
		System.out.println("\n Enter Your B-Tech Marks:");
		Btech=sc.nextDouble();
	}
	public void out()
	{
		System.out.println("Name :"+nm+"\tId :"+id+"\tAge :"+age);
		System.out.println("SSC :"+SSC+"\tHSC :"+HSC+"\tB-TECH :"+Btech);
	}
}

class ExceptionPractice
{
	public static void main(String []args)
	{	
		FillForm ob = new FillForm();

		try
		{
			ob.in();
		}
		catch (NumberFormatException e)
		{
			System.out.println("Probblem Due To :"+e.getMessage());
		}
		ob.out();
		System.out.println("End Of Program:");
	}
}

*/

//===========================================================================

import java.io.IOException;
class Number
{
	private int x;
	private int y;
	public void setx(int x)
	{
		this.x=x;
	}
	public void sety(int y)
	{
		this.y=y;
	}
	public int getDiv() throws ArithmeticException, IOException
	{
		return (x/y);
	}
}
class ExceptionPractice
{
	public static void main(String []args) throws IOException
	{
		Number ob=new Number();

		try
		{
			ob.setx(10);
			ob.sety(0);
			System.out.println("Division is: "+ob.getDiv());
		}

		catch (Exception e)
		{
			
			System.out.println(e.getMessage());
			System.out.println("In catch Block:");
		}

		 //will generate an exception (java.lang.ArithmeticException: / by zero)
		//ob.sety(5);
	
		
		System.out.println("End of Program");
	}
}
