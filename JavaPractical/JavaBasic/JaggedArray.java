
// WAP to input and display the marks obtained to 3 students in different subjects.
/*

import java.util.Scanner;
class JaggedArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int x[][]=new int[3][];

		
		for(int i=0;i<3;i++)
		{
			System.out.print(" Enter the Sub Count For Studrnt "+(i+1)+" : ");
			int sub=sc.nextInt();
			x[i]=new int[sub];
			System.out.println("\n Enter The Subhect Marks For Student "+(i+1)+" : ");
			for(int j=0;j<sub;j++)
			{
				x[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<x.length;i++)
		{
			System.out.print(" Marks Of Student:"+(i+1)+" : ");
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println();
		}
	}
}
*/
//========================================================================================================

//For N Student And M Subject:

import java.util.Scanner;

class JaggedArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter The Count For Student:");
		int Stucnt=sc.nextInt();

		int x[][]=new int[Stucnt][];
		
		System.out.println("Enter The "+Stucnt+" Student Marks : ");
		for(int i=0;i<Stucnt;i++)
		{
			System.out.print(" Enter the Sub Count For Studrnt "+(i+1)+" : ");
			int sub=sc.nextInt();
			x[i]=new int[sub];
			System.out.println("\n Enter The Subhect Marks For Student "+(i+1)+" : ");
			for(int j=0;j<sub;j++)
			{
				x[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<x.length;i++)
		{
			System.out.print(" Marks Of Student:"+(i+1)+" : ");
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println();
		}
	}
}