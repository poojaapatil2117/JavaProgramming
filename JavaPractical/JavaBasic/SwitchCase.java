///MenuDrivenProgram
//perofrm Add Mul Sub And Div
/*
import java.util.Scanner;
class SwitchCase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("******MENU*******");
		System.out.println("1.Add\t 2.Mul\t 3.Sub\t 4.Div");
		System.out.println("\n CHoose your Options");
		int opt=sc.nextInt();

		System.out.println("Enter Your Two values");
		int x=sc.nextInt();
		int y=sc.nextInt();

		switch(opt)
		{
			case 1:
				int add=x+y;
				System.out.println("Add="+add);	
				break;
			case 2:
				int mul=x*y;
				System.out.println("mul="+mul);	
				break;
			case 3:
				int Sub=x-y;
				System.out.println("Sub="+Sub);	
				break;
			case 4:
				int Div=x/y;
				System.out.println("DIv="+Div);	
				break;
			default:
				System.out.println("Wrong Chose");
		}
	}
}


//===================================================================================================

///Using the character as a option (both lcase and ucase for a single case)

import java.util.Scanner;
class SwitchCase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("******MENU*******");
		System.out.println("1.Add\t 2.Mul\t 3.Sub\t 4.Div");
		System.out.println("\n CHoose your Options");
		char opt=sc.next().charAt(0);

		System.out.println("Enter Your Two values");
		int x=sc.nextInt();
		int y=sc.nextInt();

		switch(opt)
		{
			case 'A':
			case 'a':
				int add=x+y;
				System.out.println("Add="+add);	
				break;
			case 'B':
			case 'b':
				int mul=x*y;
				System.out.println("mul="+mul);	
				break;
			case 'C':
			case 'c':
				int Sub=x-y;
				System.out.println("Sub="+Sub);	
				break;
			case 'D':
			case 'd':
				int Div=x/y;
				System.out.println("DIv="+Div);	
				break;
			default:
				System.out.println("Wrong Chose");
		}
	}
}

//-=====================================================================================================
///Using While

import java.util.Scanner;
class SwitchCase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int i=0;
		while(i<3)
		{	
			i++;
			System.out.println("******MENU*******");
			System.out.println("1.Add\t 2.Mul\t 3.Sub\t 4.Div");
			System.out.println("\n CHoose your Options");
			char opt=sc.next().charAt(0);
	
			System.out.println("Enter Your Two values");
			int x=sc.nextInt();
			int y=sc.nextInt();

			switch(opt)
			{
				case 'A':
				case 'a':
					int add=x+y;
					System.out.println("Add="+add);	
					break;
				case 'B':
				case 'b':
					int mul=x*y;
					System.out.println("mul="+mul);	
					break;
				case 'C':
				case 'c':
					int Sub=x-y;
					System.out.println("Sub="+Sub);	
					break;
				case 'D':
				case 'd':
					int Div=x/y;
					System.out.println("DIv="+Div);	
					break;
				default:
					System.out.println("Wrong Chose");
			}
		}
	
	}
}


output:
C:\Users\USER\Documents\JAVAFSD24>javac SwitchCase.java

C:\Users\USER\Documents\JAVAFSD24>java SwitchCase
******MENU*******
1.Add    2.Mul   3.Sub   4.Div

 CHoose your Options
a
Enter Your Two values
10
20
Add=30
******MENU*******
1.Add    2.Mul   3.Sub   4.Div

 CHoose your Options
b
Enter Your Two values
20
10
mul=200
******MENU*******
1.Add    2.Mul   3.Sub   4.Div

 CHoose your Options
c
Enter Your Two values
10
10
Sub=0

C:\Users\USER\Documents\JAVAFSD24>



//========================================================================================================================
// Using the switch within infinite loop (Termination using break)

import java.util.Scanner;
class SwitchCase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int i=0;
		while(true)
		{	
			i++;
			System.out.println("******MENU*******");
			System.out.println("1.Add\t 2.Mul\t 3.Sub\t 4.Div");
			System.out.println("\n CHoose your Options");
			char opt=sc.next().charAt(0);

			if(opt=='e' || opt=='E')
				break;
	
			System.out.println("Enter Your Two values");
			int x=sc.nextInt();
			int y=sc.nextInt();

			switch(opt)
			{
				case 'A':
				case 'a':
					int add=x+y;
					System.out.println("Add="+add);	
					break;
				case 'B':
				case 'b':
					int mul=x*y;
					System.out.println("mul="+mul);	
					break;
				case 'C':
				case 'c':
					int Sub=x-y;
					System.out.println("Sub="+Sub);	
					break;
				case 'D':
				case 'd':
					int Div=x/y;
					System.out.println("DIv="+Div);	
					break;
				default:
					System.out.println("Wrong Chose");
			}
		}
	
	}
}


output:

C:\Users\USER\Documents\JAVAFSD24>javac SwitchCase.java

C:\Users\USER\Documents\JAVAFSD24>java SwitchCase
******MENU*******
1.Add    2.Mul   3.Sub   4.Div

 CHoose your Options
a
Enter Your Two values
10
20
Add=30
******MENU*******
1.Add    2.Mul   3.Sub   4.Div

 CHoose your Options
b
Enter Your Two values
10
20
mul=200
******MENU*******
1.Add    2.Mul   3.Sub   4.Div

 CHoose your Options
c
Enter Your Two values
10
20
Sub=-10
******MENU*******
1.Add    2.Mul   3.Sub   4.Div

 CHoose your Options
d
Enter Your Two values
30

10
DIv=3
******MENU*******
1.Add    2.Mul   3.Sub   4.Div

 CHoose your Options
e

C:\Users\USER\Documents\JAVAFSD24>

*/
//=================================================================================================

// Using the switch within infinite loop (Termination using System.exit(0) )


import java.util.Scanner;
class SwitchCase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int i=0;
		while(true)
		{	
			i++;
			System.out.println("******MENU*******");
			System.out.println("a.Add\t b.Mul\t c.Sub\t d.Div\t e.Stop");
			System.out.println("\n CHoose your Options");
			char opt=sc.next().charAt(0);
	
			System.out.println("Enter Your Two values");
			int x=sc.nextInt();
			int y=sc.nextInt();

			switch(opt)
			{
				case 'A':
				case 'a':
					int add=x+y;
					System.out.println("Add="+add);	
					break;
				case 'B':
				case 'b':
					int mul=x*y;
					System.out.println("mul="+mul);	
					break;
				case 'C':
				case 'c':
					int Sub=x-y;
					System.out.println("Sub="+Sub);	
					break;
				case 'D':
				case 'd':
					int Div=x/y;
					System.out.println("DIv="+Div);	
					break;

				case 'E':
				case 'e':
					System.exit(0);
				default:
					System.out.println("Wrong Chose");
			}
		}
	
	}
}
