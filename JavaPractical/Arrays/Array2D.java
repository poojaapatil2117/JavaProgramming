
//Innitiliztion Of an Array And Display It:
/*
class Array2D 
{
	public static void main(String[] args) 
	{
		int x[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println();
		}
	}
}

//=====================================================================

///  Input and Display in 2D Array

import java.util.Scanner;
class Array2D 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int x[][]=new int[3][4];

		System.out.println("\n Enter Your Array Elements:");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				x[i][j]=sc.nextInt();
			}

			System.out.println();
		}

		System.out.println("\n The Array Elements Are:");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println();
		}
	}
}

*/
//================================================================================

// WAP to perform matrix multi.

import java.util.Scanner;
class Array2D 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int x[][]=new int[3][3];
		int y[][]=new int[3][3];
		int z[][]=new int[3][3];

		System.out.println("\n Enter Your 1st Array Elements:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				x[i][j]=sc.nextInt();
			}

			System.out.println();
		}

		System.out.println("\n Enter Your Array 2nd Elements:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				y[i][j]=sc.nextInt();
			}

			System.out.println();
		}

		System.out.println("The Updated Array is");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				z[i][j]=0;

				for(int k=0;k<3;k++)
				{
						z[i][j]=z[i][j]+(x[i][k]*y[k][j]);
				}
			}
			System.out.println();
		}

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.print("\t");

			for(int j=0;j<3;j++)
			{
				System.out.print("  "+y[i][j]);
			}
			System.out.print("\t");

			for(int j=0;j<3;j++)
			{
				System.out.print("  "+z[i][j]);
			}

			System.out.println();
		}

	}
}