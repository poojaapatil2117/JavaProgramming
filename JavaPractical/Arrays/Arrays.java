/// ARRAY IN Java PROGRAMMING 

///Initilization Of Array:
/*

class Arrays
{
	public static void main(String args[])
	{
		int x[]={10,11,12,13,14,15};
		
		System.out.println("\nArray Elements Are:");
		for(int i=0;i<6;i++)
		{
			System.out.print("   "+x[i]);
		}
		
	}
}


//=====================================================================
///using Length:

class Arrays
{
	public static void main(String args[])
	{
		int x[]={10,11,12,13,14,15};

		System.out.println("\nThe Lenth/Count Of Array Is ="+x.length); 
		
		System.out.println("\nArray Elements Are:");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("   "+x[i]);
		}
		
	}
}

output:

C:\Users\USER\Documents\JAVAFSD24>javac Arrays.java

C:\Users\USER\Documents\JAVAFSD24>java Arrays

The Lenth/Count Of Array Is =6

Array Elements Are:
   10   11   12   13   14   15
C:\Users\USER\Documents\JAVAFSD24>


//===========================================================================================

// Array input using scanner class

import java.util.Scanner;
class Arrays
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int x[]=new int[6];

		System.out.println("\n Enter Your Array Elements:");
		for(int i=0;i<6;i++)
		{
			x[i]=sc.nextInt();
		}
		
		System.out.println("\nThe Lenth/Count Of Array Is ="+x.length); 
		
		System.out.println("\nArray Elements Are:");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("   "+x[i]);
		}
		System.out.println("\nThe Lenth/Count Of Array Is ="+x.length); 
	}
}

//===============================================================================================

// Array input using commandline

class Arrays
{
	public static void main(String args[])
	{

		int x[]=new int[args.length];

		for(int i=0;i<args.length;i++)
		{
			x[i]=Integer.parseInt(args[i]);
		}
		
		System.out.println("\nThe Lenth/Count Of Array Is ="+x.length); 
		
		System.out.println("\nArray Elements Are:");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("   "+x[i]);
		}
		System.out.println("\nThe Lenth/Count Of Array Is ="+x.length); 
	}
}


//=============================================================================================

// Array input using BufferedReader and InputStreamReader

import java.io.InputStreamReader;
import java.io.BufferedReader;
class Arrays
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x[]=new int[7];

		System.out.println("\nEnter Your Array Elements:");
		for(int i=0;i<x.length;i++)
		{
			try{x[i]=Integer.parseInt(br.readLine());}catch(Exception e){};
		}
		
		System.out.println("\nThe Lenth/Count Of Array Is ="+x.length); 
		
		System.out.println("\nArray Elements Are:");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("   "+x[i]);
		}
		System.out.println("\nThe Lenth/Count Of Array Is ="+x.length); 
	}
}


//============================================================================================================

// The element count can be dynamic, the lets see how the memory is allocated

import java.io.InputStreamReader;
import java.io.BufferedReader;
class Arrays
{
	public static void main(String args[])
	{

		int cnt=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nEnter Your Count:");
		try{cnt=Integer.parseInt(br.readLine());}catch(Exception e){};

		int x[]=new int[cnt];

		System.out.println("\nEnter Your "+cnt+" Array Elements:");
		for(int i=0;i<cnt;i++)
		{
			try{x[i]=Integer.parseInt(br.readLine());}catch(Exception e){};
		}
		
		System.out.println("\nThe Lenth/Count Of Array Is ="+x.length); 
		
		System.out.println("\nArray Elements Are:");
		for(int i=0;i<cnt;i++)
		{
			System.out.print("   "+x[i]);
		}
	}
}

*/
//=================================================================================================================

// Arrayinput using javax.swing.JOptionPane.showInputDialog()

import javax.swing.JOptionPane;
class Arrays
{
	public static void main(String args[])
	{
		int cnt =Integer.parseInt(JOptionPane.showInputDialog("Enter Your Count"));

		int x[]=new int[cnt];

		for(int i=0;i<cnt;i++)
		{
			x[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter any Number"));
		}

		System.out.println("The Array Elements Are:");

		for(int i=0;i<cnt;i++)
		{
			System.out.print("   "+x[i]);
		}
	}
}