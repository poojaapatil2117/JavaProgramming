package Interview;
import java.util.Scanner;
/*
public class BuildingExample {

	public static void main(String[] args) 
	{
		int temp=0;
		Scanner sc = new Scanner(System.in);
		
		int x[]= new int[5];
		System.out.println("Enter The Array:");
		for(int i=0;i<5;i++)
		{
			x[i]=sc.nextInt();
			temp=x[0];
		}


		System.out.println("Array Elements are:");
		System.out.print(" "+temp);
		for(int i=0;i<4;i++)
		{
			if(x[i]<x[i+1])
			{
				System.out.print(" "+x[i+1]);
			}
		}
	}
}
*/
//====================================================
/*
public class BuildingExample {

	public static void main(String[] args) 
	{
		int temp=0,flag=0,temp1=0;
		Scanner sc = new Scanner(System.in);
		
		int x[]= new int[5];
		System.out.println("Enter The Array:");
		for(int i=0;i<5;i++)
		{
			x[i]=sc.nextInt();
			temp=x[0];
		}


		System.out.println("Array Elements are:");
		System.out.print(" "+temp);
		for(int i=1;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(!(x[i]>x[j]))
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.print(" "+x[i]);
			}
		}
	}
}
*/
//=====================

public class BuildingExample {

	public static void main(String[] args) 
	{
		int temp=0,flag=0,temp1=0,max=0;
		Scanner sc = new Scanner(System.in);
		
		int x[]= new int[5];
		System.out.println("Enter The Array:");
		for(int i=0;i<5;i++)
		{
			x[i]=sc.nextInt();
			max=x[0];
			
		}


		System.out.println("Array Elements are:");
		System.out.print(" "+temp);
		for(int i=1;i<5;i++)
		{	
			if(x[i]>max)
			{
				max=x[i+1];
			}
			System.out.print(" "+max);
		}
	}
}

//===================================================================
/*

import java.util.Scanner;
class BuildingExample
{	
	public static void main(String []args)
	{
		int i=0,j=0;
		/*
		for(i=0,j=0;i>=j && i<4 && j<4 ;j++)
		{
			System.out.print("*");
		}*/
		
		/*
		while(i>=j && i<4 && j<4)
		{
			System.out.print("*");
			j++;
			i++;
		}*/
		
		/*
		while(i<4)
		{
			for(j=0;j<4 && i>=j ;j++)
			{
				System.out.print("*");
			}
			i++;
			System.out.println();
		}
		*/
		/*
		for(i=0,j=0;i>=j && i<4 && j<4;j++,i++)
		{
			
			System.out.print("*");
			
			if(i>=4 )
			{
				break;
			}
		}
		
	}
}

*/
//==============================

