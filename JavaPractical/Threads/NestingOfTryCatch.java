import java.util.Scanner;
import java.util.*;
class Myarray
{
	private int x[];
	private int cnt;
	public void input()
	{
		Scanner sc=new Scanner(System.in);

		try
		{
			System.out.println("Enter Your Count:");
			cnt=sc.nextInt();
			x=new int[cnt];

			try
			{
				System.out.println("Enter Your "+cnt+" Elements:");
				for(int i=0;i<5;i++)
				{
					x[i]=sc.nextInt();
				}
			}
			catch (NegativeArraySizeException e)
			{
				System.out.println("ONE");
				e.printStackTrace();
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("TWO");
			e.printStackTrace();
		}
	}
	public void display()
	{
		System.out.println("Array Elements Are:");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(" "+x[i]);
		}
	}
}

class NestingOfTryCatch 
{
	public static void main(String[] args) 
	{
		Myarray ob=new Myarray();
		try
		{
			ob.input();
		}
		catch (Exception e)
		{
			System.out.println("Three:");
		}
		ob.display();
	}
}
