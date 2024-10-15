//Display Prime Numbers In Arrays:

import java.util.Scanner;
class  PrimeArrayList
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

		System.out.println("\nArray Elements Are:");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}
		
		//process
		System.out.println("\nPrime Numbers list Is:");

		for(int no:x)
		{
			int d=2;
			int flag=0;

			while(d<=(no/2))
			{
				if(no%d==0)
				{
					flag=1;
					break;
				}
				d++;
			}

			if(flag==0 && no!=1)
			{
				System.out.print("  "+no);
			}
		}

		System.out.println();
	}
}
