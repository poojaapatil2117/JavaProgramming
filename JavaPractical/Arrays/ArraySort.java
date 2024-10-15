//Array Sorting:

import java.util.Scanner;
class ArraySort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Count:");
		int cnt= sc.nextInt();

		int x[]=new int[cnt];


		System.out.println("\nEnter Your "+cnt+" Elements:");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}

		System.out.println("\n Original Array Elements Are:");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}

		for(int i=0;i<x.length-1;i++)
		{
			for(int j=i;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}

		System.out.println("\n After Sorting Array Elements Are:");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}
		
		System.out.println();
	}
}
