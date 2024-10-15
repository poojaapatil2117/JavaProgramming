// WAP to perform searching operation

/*
import java.util.Scanner;
class ArrayOprations 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int i;

		System.out.println("\nEnter Your Count:");
		int cnt=sc.nextInt();

		int x[]=new int[cnt];

		System.out.println("\nEnter Your "+cnt+" Elements"); 
		for(i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}

		System.out.println("\nDisplay An Array Elements"); 
		for(i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}

		System.out.println("\nEnter Your Element You Want To Search");
		int num=sc.nextInt();

		for(i=0;i<x.length;i++)
		{
			if(x[i]==num)
			{
				break;
			}
		}

		if(i<x.length)
		{
			System.out.print("\n num Fount At "+ i +" ith Location"); 
		}
		else
		{
			System.out.print("\n num Not Fount At Location");
		}
	}
}

//===========================================================================

// Write a program to fill all array elements with as a 1 and the some portion with 5

import java.util.Scanner;
class ArrayOprations 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter Your Count");
		int cnt=sc.nextInt();

		int x[]=new int[cnt];

		for(i=0;i<x.length;i++)
		{
			x[i]=1;
		}

		for(i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}

		for(i=0;i<x.length;i++)
		{
			if(i>=2 && i<5)
			{
				x[i]=5;
			}
			
		}

		System.out.println("\nNow Our Array Is:");
		for(i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}

		System.out.println();
	}
}


//==========================================================================================


// you can display function i a same class to avoid the rep. of code as

import java.util.Scanner;
class ArrayOprations 
{
	public static void Display(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;

		System.out.println("Enter Your Count");
		int cnt=sc.nextInt();

		int x[]=new int[cnt];

		for(i=0;i<x.length;i++)
		{
			x[i]=1;
		}

		Display(x);

		System.out.println();
		for(i=0;i<x.length;i++)
		{
			if(i>=2 && i<5)
			{
				x[i]=5;
			}
			
		}

		Display(x);
		System.out.println();
	}
}

*/

//================================================================================

// take a same efforts for fill operation


import java.util.Scanner;

class ArrayOprations 
{
	public static void FillArray(int x[],int val)
	{
		for(int i=0;i<x.length;i++)
		{
			x[i]=val;
		}
	}

	public static void FillArray(int x[],int val,int sp,int cnt)
	{
		while(cnt>0)
		{
			x[sp]=val;
			sp++;
			cnt--;
		}
	}

	public static void Display(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}
	}
}
class FillArrayExample
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;

		System.out.println("Enter Your Count");
		int cnt=sc.nextInt();

		int x[]=new int[cnt];


		System.out.println("for Fill 1");
		FillArray(x,1);
		Display(x);

		System.out.println();

		System.out.println("for Fill 5");
		FillArray(x,5,2,3);
		Display(x);

		System.out.println();
	}
}