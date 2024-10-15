///Using If:
/*

import java.io.InputStreamReader;
import java.io.BufferedReader;

class ControlStatments
{
	public static void main(String args[])
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=0;
		try
		{
			System.out.println("\n EnterAny Value:");
			num=Integer.parseInt(br.readLine());
		}
		catch(Exception e){}
		
		if(num%7==0)
		{
			System.out.println("Number Is Divisible By 7");
		}
		if(num%7!=0)
		{
			System.out.println("Number Not Divisible By 7");
		}
	}
}

Output

C:\Users\USER\Documents\JAVAFSD24>javac ControlStatments.java

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments

 EnterAny Value:
70
Number Is Divisible By 7

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments

 EnterAny Value:
100
Number Not Divisible By 7

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments

 EnterAny Value:
35
Number Is Divisible By 7

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments

 EnterAny Value:
45
Number Not Divisible By 7

C:\Users\USER\Documents\JAVAFSD24>

//============================================================================================================================

///Using If()Else


import java.io.InputStreamReader;
import java.io.BufferedReader;

class ControlStatments
{
	public static void main(String args[]) throws Exception
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=0;
		
		System.out.println("\n EnterAny Value:");
		num=Integer.parseInt(br.readLine());

		if(num%7==0)
		{
			System.out.println("Number Is Divisible By 7");
		}
		else
		{
			System.out.println("Number Not Divisible By 7");
		}
	}
}


output

C:\Users\USER\Documents\JAVAFSD24>javac ControlStatments.java

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments

 EnterAny Value:
70
Number Is Divisible By 7

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments

 EnterAny Value:
35
Number Is Divisible By 7

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments

 EnterAny Value:
60
Number Not Divisible By 7

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments

 EnterAny Value:
100
Number Not Divisible By 7

C:\Users\USER\Documents\JAVAFSD24>


//====================================================================================

///Using Nesting of if() else:

class ControlStatments
{
	public static void main(String args[])
	{

		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);

		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is Greater"+a);
			}
			else
			{
				System.out.println("c Is greater"+c);
			}	
		}
		else 
		{	
			if(b>c)
			{
				System.out.println(" b Is Greater"+b);
			}
			else
			{
				System.out.println("c Is Greater"+c);
			}
		}	
	}
}

Output:

C:\Users\USER\Documents\JAVAFSD24>javac ControlStatments.java

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments 11 22 33
c Is Greater33

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments 11 45 22
 b Is Greater45

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments 92 45 22
a is Greater92

C:\Users\USER\Documents\JAVAFSD24>

//=============================================================================
// Using if() else Ladder

import java.util.Scanner;
class ControlStatments
{
	public static void main(String args[])
	{

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Your Values");
		int x=sc.nextInt();
		int y=sc.nextInt();

		if(x>0 && y>0)
		{
			System.out.println("Point Present in I Qua");
		}

		else if(x<0 && y>0)
		{
			System.out.println("Point Present in II Qua");
		}

		else if(x<0 && y<0)
		{
			System.out.println("Point Present in III Qua");
		}

		else if(x>0 && y<0)
		{
			System.out.println("Point Present in IV Qua");
		}

		else if(x==0 && y!=0)
		{
			System.out.println("Point Present in Y axis");
		}

		else if(x!=0 && y==0)
		{
			System.out.println("Point Present in x axis");
		}

		else
		{
			System.out.println("Point Present at Origin");
		}
	}
}


ouput:

C:\Users\USER\Documents\JAVAFSD24>javac ControlStatments.java

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments
Enter Your Values
10
20
Point Present in I Qua

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments
Enter Your Values
-10
20
Point Present in II Qua

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments
Enter Your Values
-10
-20
Point Present in III Qua

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments
Enter Your Values
10
-20
Point Present in IV Qua

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments
Enter Your Values
0
20
Point Present in Y axis

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments
Enter Your Values
10
0
Point Present in x axis

C:\Users\USER\Documents\JAVAFSD24>java ControlStatments
Enter Your Values
0
0
Point Present at Origin

*/
//==========================================================================