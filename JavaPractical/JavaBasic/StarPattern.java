/*
Que 1: Star Pattern

class JavaProgrTest1 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(i>j)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

//=============================================================

class JavaProgrTest1 
{
	public static void main(String[] args) 
	{
		char ch1='A',temp=ch1;

		for(int i=0;i<5;i++)
		{
			char ch='A';
			ch1=temp;

			for(int j=0;j<5;j++)
			{
				if(j>=(4-i))
				{
					System.out.print(ch);
					ch++;
				}
				else
				{
					System.out.print(" ");
				}
			}

			for(int j=5;j<9;j++)
			{
				if(i>=1 && j<=(4+i))
				{
					System.out.print(ch1);
					ch1--;
				}
				else
				{
					System.out.print(" ");
				}
			}
			temp++;
			System.out.println();
		}
		
	}
}

//==================================================================

//Fibo Series

import java.util.Scanner;
class JavaProgrTest1  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int x=0,y=1;

		System.out.println(x+" "+y);
		int z=x+y;

		for(int i=2;i<10;i++)
		{
			z=x+y;
			x=y;
			y=z;
			System.out.print("  "+z);
		}
	}
}

//=================================================================
//Decending Order:

import java.util.Scanner;
class JavaProgrTest1  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int x[]=new int[5];

		System.out.println("Enter Your Elements: ");
		for(int i=0;i<5;i++)
		{
			x[i]=sc.nextInt();
		}

		//process
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<5;j++)
			{
				if(x[i]<x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}

		System.out.println(" Sorted Array Elements Ars: ");
		for(int i=0;i<5;i++)
		{
			System.out.print("  "+x[i]);
		}


	}
}


//========================================================================

//Factorial:

import java.util.Scanner;
class JavaProgrTest1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Your Number:");
		int num=sc.nextInt();

		int fact=1,i=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}

		System.out.println("The Fact ="+fact);
	}
}
*/
//=====================================================================

//Abundant Number: Wrong 
/*

import java.util.Scanner;
class JavaProgrTest1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Your Number:");
		int num=sc.nextInt();

		int sum=0,i=1,NN=num;
		while(i<=(num/2))
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println("The sum="+sum);
		if(sum==NN1) //Here The Conditon is (sum>num)
		{
			System.out.println("Abundant Number");
		}
		else
		{
			System.out.println("Not Abundant Number");
		}
	}
}
*/
//===============================================