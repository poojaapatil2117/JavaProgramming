
import java.util.Scanner;
public class Extra
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

