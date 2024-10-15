import java.util.Scanner;
Class JavaProgrTest1
{
	
}


//============================================================================
//Que 6
//Abundant Number: wrote in Examp
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
//Que 6
//Updated and Right Ans
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
		if(sum>NN1) // change is Here The Conditon is (sum>num)
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
//========================================================================
/*
Que=7
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
//==============================================================================================

/*
Que 8:1. Star Pattern

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

*/

//=============================================================
//QUe 2: Character Pattern 
/* Palli

class JavaProgrTest1 
{
	public static void main(String[] args) 
	{
		char ch1='A';

		for(int i=0;i<5;i++)
		{
			char ch='A';
		
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
			ch--;
			ch--;
			ch1=ch;
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
			System.out.println();
		}
		
	}
}
*/
//=======================================================================
// Updated
/*

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
		
			ch1--; //Change is here Only;

			for(int j=5;j<9;j++)
			{
				if(j<=(4+i))
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
*/
//==================================================================
/*
//In Paper i Write:

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
				if(j<=(4+i))
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
*/
//=======================================================================================================

/*
Que 9: i I wrote in Paper
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
*/
//=======================================================================================================
/*
//Updated
import java.util.Scanner;
class JavaProgrTest1  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int x=0,y=1;

		System.out.print(x+" "+y); //Change is Here Only #Println
		int z=x+y;

		for(int i=2;i<10;i++)
		{
			z=x+y;
			x=y;
			y=z;
			System.out.print("  "+z);
		}
		System.out.println();
	}
}
*/
//=========================================================================================================
/*
//Que 10:
import java .util.Scanner;
class JavaProgrTest1
{
	public static void main(String args[])
	{
		int ans=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Your TWo numbers:");
		int x=sc.nextInt();
		int y=sc.nextInt();

		System.out.println("*****MENU****");
		System.out.println("1.Add\t 2.Sub\t 3.Mul\t 4.Div");

		System.out.println("\n Enter Your Options");
		int opt=sc.nextInt();

		switch(opt)
		{
			case 1:
				ans=x+y;
				break;
			case 2:
				ans=x-y;
				break;
			case 3:
				ans=x*y;
				break;
			case 4:
				ans=x/y;
				break;
			default:
				System.out.println("Wrong Choice");
		}
		System.out.println("The Ans = "+ans);
	}
}
*/
//=========================================================================================================

/*
//Decending Order:
Que 11
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
*/
//===================================================================
