import java.util.Scanner;
import java.util.*;
class ExceptionHand 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Any Count:");
		

		
		try
		{
			int cnt=sc.nextInt();
			int x[]=new int[cnt];

			for(int i=0;i<5;i++)
			{
				x[i]=sc.nextInt();
			}

			System.out.println("Enter Any Postion:");
			int pos=sc.nextInt();

			System.out.println("Value At Positon:"+x[pos]);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Input MisMatch:"+ime);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("\n Index Issue: "+ae);			
		}
		catch(Exception e)
		{
			System.out.println("Execution Program:");
		}

		System.out.println("End Of Program:");
	}
}
