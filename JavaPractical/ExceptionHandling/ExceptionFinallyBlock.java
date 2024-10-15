/*
import java.util.Scanner;
class  ExceptionFinallyBlock
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int x,y,z;
		z=0;

		try
		{
			System.out.println("Enter Any Two Values:");
			x=sc.nextInt();
			y=sc.nextInt();

			z=x/y;

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("In Finally Block:");
		}

		System.out.println("The Value Of Z = "+z);
		
	}
}
*/
//================================================================================================
//Random Numbers:---------
/*
import java.util.Random;
class  ExceptionFinallyBlock
{
	public static void main(String[] args) 
	{
		int x[]={23,45,56,78,43,321,87,89,78,65,34,23,67,98};

		Random random=new Random();

		for(int i=0;i<10;i++)
		{
			int r=random.nextInt(30);
			try
			{
				System.out.print(x[r]);
			}
			catch (Exception e)
			{
				System.out.print("_");
			}
			finally
			{
				System.out.println("Random Location:"+r);
			}
		}

		System.out.println("End Of Program:");

	}
}
*/
//====================================================================================

import java.util.Random;
class  ExceptionFinallyBlock
{
	public static void main(String[] args) 
	{
		int x[]={23,45,56,78,43,321,87,89,78,65,34,23,67,98};

		Random random=new Random();

		for(int i=0;i<10;i++)
		{
			int r=random.nextInt(30);
			try
			{
				System.out.print(x[r]);
			}
			finally
			{
				System.out.println("Random Location:"+r);
			}
		}

		System.out.println("End Of Program:");

	}
}