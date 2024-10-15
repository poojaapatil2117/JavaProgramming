///Assingment Operatores:
/*
class Operatores
{
	public static void main(String args[])
	{
		System.out.println("\nAssignment Opratores");
		int x=10;
		int y=x;
		int z=x+y;	

		System.out.println("\n x="+x+"\t y="+y+"\t z="+z);
	
		x+=100;
		y*=2;

		System.out.println("\nX="+x+"\t y="+y+"\t z="+z);
	}
}

//================================================================================================
///Unaray Operatores:

import java.util.Scanner;
class Operatores
{
	public static void main(String args[])
	{
		System.out.println("\nUnarayOpratores");
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter The X value:");
		int x=sc.nextInt();

		System.out.println("Enter The y value:");
		int y=sc.nextInt();

		int z=-x;
		x++;
		--y;

		System.out.println("\n x="+x+"\t y="+y+"\t z="+z);

		z=++x+y--;
		System.out.println("\n x="+x+"\t y="+y+"\t z="+z);
	}
}

//============================================================================================================\

///(type) : Used To TypeCasting

import java.util.Scanner;
class Operatores
{
	public static void main(String args[])
	{
		System.out.println("\nUnarayOpratores");
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter The X value:");
		int x=sc.nextInt();

		System.out.println("Enter The y value:");
		int y=sc.nextInt();

		double z=x/y;

		System.out.println("\n x="+x+"\t y="+y+"\t z="+z);

		z=(double)x/y;
		System.out.println("\n x="+x+"\t y="+y+"\t z="+z);

		z=x/(double)y;
		System.out.println("\n x="+x+"\t y="+y+"\t z="+z);

		z=(double)x/(double)y;
		System.out.println("\n x="+x+"\t y="+y+"\t z="+z);
	}
}

output:

C:\Users\USER\Documents\JAVAFSD24>java Operatores

UnarayOpratores
Enter The X value:
40
Enter The y value:
20

 x=40    y=20    z=2.0

 x=40    y=20    z=2.0

 x=40    y=20    z=2.0

 x=40    y=20    z=2.0

C:\Users\USER\Documents\JAVAFSD24>


//================================================================================================================

///Arthmatic Operations:

import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Scanner;
class Operatores
{
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nArthmatic Opratores");
		int p=0,n=0;
		double r=0.0,SI=0.0;
		try
		{
			System.out.println("Enter Your Value For P:");
			p=Integer.parseInt(br.readLine());

			System.out.println("Enter Your Value For R:");
			r=Double.parseDouble(br.readLine());
	
			System.out.println("Enter Your Value For N:");
			n=Integer.parseInt(br.readLine());
		}
		catch(Exception e){};

		SI=(p*r*n)/100;

		System.out.println("The Simple Interest Is = "+SI);
	}
}

output

C:\Users\USER\Documents\JAVAFSD24>javac Operatores.java

C:\Users\USER\Documents\JAVAFSD24>java Operatores
Enter Your Value For P:
2
Enter Your Value For R:
34
Enter Your Value For N:
45
The Simple Interest Is = 30.6

C:\Users\USER\Documents\JAVAFSD24>


//=============================================================
//Demo Div/mod:

import java.util.Scanner;

class Operatores
{
	public static void main(String args[])
	{

		System.out.println("\nDemo Div/mod:Opratores");
		int tot=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("\nEnter The any Number:");
		int num=sc.nextInt();

		int rem=num%10;
		tot=tot+rem;
		num=num/10;

		rem=num%10;
		tot=tot+rem;
		num=num/10;

		rem=num%10;
		tot=tot+rem;
		num=num/10;

		System.out.println("Total= "+tot);
	}
}

output:
C:\Users\USER\Documents\JAVAFSD24>javac Operatores.java

C:\Users\USER\Documents\JAVAFSD24>java Operatores

Enter The any Number:
123
Total= 6

C:\Users\USER\Documents\JAVAFSD24>java Operatores

Enter The any Number:
456
Total= 15

//========================================================================================

///Using Mod

class Operatores
{
	public static void main(String []args)
	{
		System.out.println("\nmod:Opratores");
		int x=-15, y=5, z=-2;

		System.out.println("-%+: "+(x%y));
		System.out.println("-%-: "+(x%z));
		System.out.println("+%-: "+(21%z));
		System.out.println("+%+: "+(33%4));
	
		System.out.println("+%+: "+(33.5%4));
		System.out.println("+%+: "+(36.5%2.3));
	}
}

//===================================================================================================
///Relational Operators: 

class Operatores
{
	public static void main(String []args)
	{

		System.out.println("\n/Relational Operators: ");
		int x=20,y=7;
		boolean b;
	
		System.out.println("\nx="+x+"\t y="+y);

		b=x>y;
		System.out.println("(x>y) is:"+b);

		b=x!=y;
		System.out.println("(x!=y) is:"+b);
		
		b=y<1;
		System.out.println("(y<1) is:"+b);

		b=x%y==0;
		System.out.println("(x%y==0) is:"+b);

		b=x%10==0;
		System.out.println("(x%10==0) is:"+b);

		b=100%y==0;
		System.out.println("(100%y==0) is:"+b);
	}
}

output:

C:\Users\USER\Documents\JAVAFSD24>javac Operatores.java

C:\Users\USER\Documents\JAVAFSD24>java Operatores

x=20     y=7
(x>y) is:true
(x!=y) is:true
(y<1) is:false
(x%y==0) is:false
(x%10==0) is:true
(100%y==0) is:false


//==================================================================================================

//Logical Operatores

class Operatores
{
	public static void main(String []args)
	{
		System.out.println("\nLogical Operatores");

		int x=20,y=7;
		boolean b;
	
		System.out.println("\nx="+x+"\t y="+y);

		b=(x>y && y<100);
		System.out.println("(x>y && y<100) is:"+b);

		b=(x!=y && y==7);
		System.out.println("(x!=y && y==7) is:"+b);
		
		b=(y<1 || x==20);
		System.out.println("(y<1 || x==20) is:"+b);

		b=(x==20 && y==0);
		System.out.println("(x==20 && y==0) is:"+b);

		b=!(x!=y);
		System.out.println("!(x!=y)is:"+b);
	}
}

output:
C:\Users\USER\Documents\JAVAFSD24>javac Operatores.java

C:\Users\USER\Documents\JAVAFSD24>java Operatores

x=20     y=7
(x>y && y<100) is:true
(x!=y && y==7) is:true
(y<1 || x==20) is:true
(x==20 && y==0) is:false
!(x!=y)is:false

//=========================================================================================

///Ternary Opretores:

import java.util.Scanner;
class Operatores
{
	public static void main(String []args)
	{
		System.out.println("\nTernary Operatores");

		Scanner sc=new Scanner(System.in);

		System.out.println("\nEnter Two Values");
		int x=sc.nextInt();
		int y=sc.nextInt();

		int z = (x>y)?x:y;

		System.out.println("The max Value is:"+z);
	}
}

ouput:
C:\Users\USER\Documents\JAVAFSD24>javac Operatores.java

C:\Users\USER\Documents\JAVAFSD24>java Operatores

Ternary Operatores

Enter Two Values
10
20
The max Value is:20


//=====================================================================================

 ///Nesting of conditional operators

import java.util.Scanner;
class Operatores
{
	public static void main(String []args)
	{
		System.out.println("\nNesting of conditional operators");

		Scanner sc=new Scanner(System.in);

		System.out.println("\nEnter THree Values");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
	
		int p = (x>y) ? (x>z?x:z) : (y>z?y:z) ;

		System.out.println("The max Value is:"+p);
	}
}

ouput:

C:\Users\USER\Documents\JAVAFSD24>javac Operatores.java

C:\Users\USER\Documents\JAVAFSD24>java Operatores

Nesting of conditional operators

Enter THree Values
100
20
30
The max Value is:100

C:\Users\USER\Documents\JAVAFSD24>java Operatores

Nesting of conditional operators

Enter THree Values
34
50
23
The max Value is:50

C:\Users\USER\Documents\JAVAFSD24>java Operatores

Nesting of conditional operators

Enter THree Values
12
45
78
The max Value is:78

C:\Users\USER\Documents\JAVAFSD24>

*/

//====================================================================================

/// Bitwise Operator: [ & | ^ >> << >>> ]
 

import java.util.Scanner;
class Operatores
{
	public static void main(String []args)
	{
		System.out.println("\nNesting of conditional operators");
		
		int x=10,y=12;

		System.out.println(" (x&y) " + (x&y) );
		System.out.println(" (x|y) " + (x|y) );
		System.out.println(" (x^y) " + (x^y) );
		System.out.println(" (x<<2) " + (x<<2) );
		System.out.println(" (y>>2) " + (y>>2) );
	}
}


C:\Users\USER\Documents\JAVAFSD24>javac Operatores.java

C:\Users\USER\Documents\JAVAFSD24>java Operatores

Nesting of conditional operators
 (x&y) 8
 (x|y) 14
 (x^y) 6
 (x<<2) 40
 (y>>2) 3

C:\Users\USER\Documents\JAVAFSD24>