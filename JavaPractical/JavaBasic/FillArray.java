///Double Class:

/*

import java.util.Scanner;
class FillArray 
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
		FillArray.FillArray(x,1);
		FillArray.Display(x);

		System.out.println();

		System.out.println("for Fill 5");
		FillArray.FillArray(x,5,2,3);
		FillArray.Display(x);

		System.out.println();
	}
}
*/
//================================================================================

/**
This class contains some static methods, which are provided to fill the entire array with
the value 1 and A method which will fill the specific part of an array with a given value
*/
import java.util.Scanner;
public class FillArray 
{
	/**
	This method will fill an array with a value provided by val 
	*/
	public static void FillArray(int x[],int val)
	{
		for(int i=0;i<x.length;i++)
		{
			x[i]=val;
		}
	}

	/**
	This method will fill a part, from sp position and cnt elements after it,
	of array with a value provided by val 
	*/

	public static void FillArray(int x[],int val,int sp,int cnt)
	{
		while(cnt>0)
		{
			x[sp]=val;
			sp++;
			cnt--;
		}
	}

	
	/**
	This method will displays all array element in a single line.
	*/
	public static void Display(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}
	}
}

