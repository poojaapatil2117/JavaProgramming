///for Loop
/*
import javax.swing.JOptionPane;
class Loops
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(JOptionPane.showInputDialog("Enter Any Number"));

		System.out.println("Entered Number is:"+num);

		int tot=0;
		for(;num!=0;num=num/10)
		{
			tot=tot+(num%10);
		}

		
		System.out.println("The Tot of Entered Number Digit Is:"+tot);
	}
}

output

C:\Users\USER\Documents\JAVAFSD24>javac Loops.java

C:\Users\USER\Documents\JAVAFSD24>java Loops
Entered Number is:345
The Tot of Entered Number Digit Is:12

//==================================================================================================

///While Loop

class Loops
{
	public static void main(String args[])
	{
		int i=1;

		
		while(i<=15)
		{
			System.out.println("i="+i);
			i++;
		}
	}
}

output

C:\Users\USER\Documents\JAVAFSD24>javac Loops.java

C:\Users\USER\Documents\JAVAFSD24>java Loops
i=1
i=2
i=3
i=4
i=5
i=6
i=7
i=8
i=9
i=10
i=11
i=12
i=13
i=14
i=15


//=====================================================================================================

/// WAP to display list of odd nos from 1 to 50 using while loop.

class Loops
{
	public static void main(String args[])
	{
		int i=1;

		while(i<=50)
		{
			if(i%2!=0)
			{
				System.out.print("\t"+i);
			}
			i++;
		}
	}
}

output:

C:\Users\USER\Documents\JAVAFSD24>javac Loops.java

C:\Users\USER\Documents\JAVAFSD24>java Loops
        1       3       5       7       9       11      13      15      17      19      21      23      25      27      29      31      33      35      37      39      41      43      45      47      49
C:\Users\USER\Documents\JAVAFSD24>


//=================================================================================================

// WAP to find the entered number is prime

import java.util.Scanner;
class Loops
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter any Number:");
		int num=sc.nextInt();

		int d=2,flag=0;

		while(d<=(num/2))
		{
			if(num%d==0)
			{
				flag=1;
				break;
			}
			d++;
		}
		if(flag==0)
		{
			System.out.println("Entered Number Is Prime Number");
		}
		else
		{
			System.out.println("Entered Number is Not Prime Number");
		}
	}
}

Output:

C:\Users\USER\Documents\JAVAFSD24>javac Loops.java

C:\Users\USER\Documents\JAVAFSD24>java Loops
Enter any Number:
21
Entered Number is Not Prime Number

C:\Users\USER\Documents\JAVAFSD24>java Loops
Enter any Number:
2
Entered Number Is Prime Number

C:\Users\USER\Documents\JAVAFSD24>java Loops
Enter any Number:
5
Entered Number Is Prime Number

C:\Users\USER\Documents\JAVAFSD24>java Loops
Enter any Number:
100
Entered Number is Not Prime Number


//======================================================================================================

/// using  do while()
/// Display list of prime nos from given range 

import java.util.Scanner;
class Loops
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter any Number:");
		int num=sc.nextInt();

		int i;

		for(i=1;i<=num;i++)
		{
			int d=2;
			int flag=0;
			while(d<=i/2)
			{
				if(i%d==0)
				{
					flag=1;
					break;
				}
				d++;
			}
			if(flag==0 && i!=1)
			{
				System.out.print("\t"+i);
			}
		}
	}
}

output:

C:\Users\USER\Documents\JAVAFSD24>javac Loops.java

C:\Users\USER\Documents\JAVAFSD24>java Loops
Enter any Number:
10
        2       3       5       7
C:\Users\USER\Documents\JAVAFSD24>

*/
//=================================================================================
