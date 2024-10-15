/*
class JustPract
{

	public static void main(String []args)
	{
		String s1="-",s2="-";

		try
		{
			s1=args[0];
			s2=args[1];
		}catch(Exception e){}

		System.out.println("String s1 is: "+s1);
		System.out.println("String s2 is: "+s2);
	}

	public static void main(String []args) throws Exception
	{
		int x=Integer.parseInt(args[0]);
		double y=Double.parseDouble(args[1]);

		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
	}
}

class JustPract
{
	public static void main(String []args)
	{
		System.out.println("Welcome TechArcher");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
	}
}

// A Java program to demonstrate working of
// synchronized.

import java.io.*;
import java.util.*;

// A Class used to send a message
class Sender 
{
	public void send(String msg)
	{
		System.out.println("Sending\t" + msg);
		try{Thread.sleep(1000);}catch (Exception e){System.out.println("Thread interrupted.");}
		System.out.println("\n" + msg + "Sent");
	}
}

// Class for send a message using Threads
class ThreadedSend extends Thread
{
	private String msg;
	Sender sender;

	// Receives a message object and a string
	// message to be sent
	ThreadedSend(String m, Sender obj)
	{
		msg = m;
		sender = obj;
	}

	public void run()
	{
		// Only one thread can send a message
		// at a time.
		synchronized (sender)
		{
			// synchronizing the send object
			sender.send(msg);
		}
	}
}

class JustPract {
	public static void main(String args[])
	{
		Sender send = new Sender();

		ThreadedSend S1 = new ThreadedSend(" Hi ", send);
		S1.start();

		ThreadedSend S2 = new ThreadedSend(" Bye ", send);
		S2.start();

	}
}


//==========================================

import java.util.Scanner;
class JustPract 
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Your Count:");
		int cnt = sc.nextInt();

		int x[]= new int[cnt];

		System.out.println("Enter Your Array Elements:");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}

		System.out.println("Array Elements Are:");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(" "+x[i]);
		}

		System.out.println();

		System.out.println(" Enter Your k :");
		int k= sc.nextInt();
		int max=0;

		for(int i=0;i<x.length;i++)
		{
			if(i<k)
			{
				if(x[i]>max)
				{
					max=x[i];
				}
			}
		}

		System.out.println(" "+max);
	}
}


//==================================================

Enter An array Elemnts:[1,2,3,4,5,7] And Enter k =3 and Group That Elements Of k Elements And Find The Max Between Thewm:

[1,2,3][2,3,4][3,4,5][4,5,7] 

ouput : 3,4,5,7

import java.util.Scanner;
class JustPract 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Your Count:");
		int cnt = sc.nextInt();

		int x[]= new int[cnt];

		System.out.println("Enter Your Array Elements:");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}

		System.out.println("Array Elements Are:");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(" "+x[i]);
		}

		System.out.println();

		System.out.println(" Enter Your k :");
		int k= sc.nextInt();
		int max=0;
		int j;
		for(int i=0;i<x.length;i++)
		{
			try
			{
				for(j=i;j<k;j++)
				{
					if(x[j]>max)
					{
						max=x[j];
					}
				}
				System.out.println(" "+max);
			}
			catch (Exception e){}
			k++;
		}	
	}
}


//========================================================================================



class DemoObj
{
	public void show()
	{
		System.out.println("\n In the DemoObj-show()");
	}
}

class JustPract 
{
	public static void main(String args[])
	{
		// Creating Anonymous Object
		new DemoObj().show();
		new DemoObj().show();
	}
}


//==============================================

defining main() method in same classs:

class JustPract 
{
	private int x;
	private double y;
	public static void main(String []args)
	{
		JustPract ob=new JustPract();
		ob.x=10;	// As a main() is a mehhod form same class, it will able to access
		ob.y=33.25;	// method, directly using the . operator.
		System.out.println("\n x="+ob.x+"\t y="+ob.y);
	}
}

//===========================================================

class Addition
{
	static int add(int x, int y)
	{
		System.out.println("1.int-int:");
		return (x+y);
	}
	static float add(float x, int y)
	{
		System.out.println("2.float-int:");
		return (x+y);
	}
	static double add(double x, int y)
	{
		System.out.println("3.double-int:");
		return (x+y);
	}
}
class JustPract 
{
	public static void main(String []args)
	{
		System.out.println("1. int-int: "+Addition.add(2,3));	
		System.out.println("2. float-int: "+Addition.add(4.5F,7));
		System.out.println("1. double-int: "+Addition.add(56.34,9));
	}
}


//----------------------------------------------------------------------------------------

class DemoThread extends Thread
{

	public void run()
	{
		try
		{
			for(int i=0;i<15;i++)
			{
				System.out.println(i+" - "+this);
				Thread.sleep(600);
			}
		}
		catch(Exception e){e.printStackTrace();}
	}
}

class JustPract 
{
	public static void main(String []args)
	{
		DemoThread ob1=new DemoThread();
		ob1.start();
		try{Thread.sleep(6000);}catch(Exception e){}
		ob1.interrupt();
	}
}

//==========================================================

class Base
{
	private int a;
	public Base()
	{
		System.out.println("\n In Base default");
		a=10;
	}
	public Base(int x)
	{
		System.out.println("\n In Base para");
		a=x;
	}
	public void showBase()
	{
		System.out.println("\n a="+a);
	}
}
class ImdBase extends Base
{
	private int b;
	public ImdBase()
	{
		System.out.println("\n In ImdBase default");
		b=20;
	}
	public ImdBase(int x, int y)
	{
		super(x);
		System.out.println("\n In ImdBase para");
		b=y;
	}
	public void showImdBase()
	{
		showBase();
		System.out.println("\n b="+b);
	}
}
class Derived extends ImdBase 
{
	private int c;
	public Derived()
	{
		System.out.println("\n In Derived default");
		c=30;
	}
	public Derived(int x, int y, int z)
	{
		super(x,y);
		System.out.println("\n In Derived para");
		c=z;
	}
	public void showDerived()
	{
		showImdBase();
		System.out.println("\n c="+c);
	}
}

class JustPract 
{
	public static void main(String []args)
	{
		Derived ob1=new Derived();
		ob1.showDerived();

		Derived ob2=new Derived(100,200,300);
		ob2.showDerived();
	}
}

//============================================================

class A
{
	private int a1;
	private int a2;
	{
		a1=1;
		System.out.println("Init block A");
	}
	A()
	{	
		a2=11;
		System.out.println("Default Constructor A");
	}
	A(int p1)
	{	
		a2=p1;
		System.out.println("para Constructor A");
	}
	public void showA()
	{
		System.out.println("A: a1: "+a1+"\t a2: "+a2);
	}
}
class B extends A
{
	private int b1;
	private int b2;
	{
		b1=2;
		System.out.println("Init block B");
	}
	B()
	{
		b2=22;
		System.out.println("Default Constructor B");
	}
	B(int p1, int p2)
	{
		super(p1);
		b2=p2;
		System.out.println("Para Constructor B");
	}
	public void showB()
	{
		showA();
		System.out.println("B: b1: "+b1+"\t b2: "+b2);
	}
}
class C extends B
{
	private int c1;
	private int c2;
	{
		c1=3;
		System.out.println("Init block C");
	}
	C()
	{
		c2=33;
		System.out.println(" Default Constructor C");
	}
	C(int p1, int p2, int p3)
	{
		super(p1,p2);
		c2=p3;
		System.out.println(" Para Constructor C");
	}
	public void showC()
	{
		showB();
		System.out.println("C: c1: "+c1+"\t c2: "+c2);
	}
}

class JustPract 
{
	public static void main(String []args)
	{
		C ob=new C();
		ob.showC();

		C ob1=new C(111,222,333);
		ob1.showC();
	}
}


//==========================================================================

class JustPract 
{
	
	public static void Pallli(String ar[])
		{

          
			System.out.println(ar[0]);
			
			System.out.println(ar[1]);
			//return (ar[0]+ar[1]);
        }
	
    public static void main(String[] args) 
	{
        // Create a static bloc
		JustPract.Pallli(args);
		
			//System.out.println(ar[0]);
        
    }
}

//=================================================================

public class JustPract 
{
    public static void main(String[] args) {
        // Create a static block
        static {
            // Access the String[]args argument
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}

//================================================================

public class JustPract 
{
	public static void main(String []args)
	{
		String s1="-",s2="-";

		s1=args[0];
		s2=args[1];

		System.out.println("String s1 is: "+s1);
		System.out.println("String s2 is: "+s2);
	}
}

//===============================================================
public class JustPract 
{
	public static void main(String []args)
	{
		int x=args[0];
		double y=args[1];

		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
	}
}

//============================================
public class JustPract 
{
	public static void main(String []args)
	{
		int x = Integer.parseInt(args[0]); // "12"--> 12
		double y = Double.parseDouble(args[1]);

		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
		System.out.println("Sum is: "+(x+y));
	}
}

//=====================================================


import java.io.InputStreamReader;
import java.io.BufferedReader;
public class JustPract 
{
	public static void main(String []args) throws Exception
	{
		int x=0;
		double y=0.0;
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		/*
		try{
		System.out.println("Enter the int value: ");
		x=Integer.parseInt(br.readLine());

		System.out.println("Enter the fractional value: ");
		y=Double.parseDouble(br.readLine());}catch(Exception e){};

		

		System.out.println("Enter the int value: ");
		x=Integer.parseInt(br.readLine());

		System.out.println("Enter the fractional value: ");
		y=Double.parseDouble(br.readLine());

		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
		System.out.println("Sum is: "+(x+y));
	}
}


//====================================================

import java.util.Scanner;
public class JustPract 
{
	public static void main(String []args)
	{
		int rem =0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num= sc.nextInt();
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum is :"+sum);
	}	
}

//==============================================
public class JustPract 
{
	public static void main(String []args)
	{
		int x=-13, y=5, z=-2;

		System.out.println("-%+: "+(x%y));
		System.out.println("-%-: "+(x%z));
		System.out.println("+%-: "+(21%z));
		System.out.println("+%+: "+(33%4));

		System.out.println("+%+: "+(33.5%4));
		System.out.println("+%+: "+(36.5%2.3));
	}
}

//==========================================================
public class JustPract 
{
	public static void main(String []args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);

		if(a>b)
		{
			if(a>c)
			{
				System.out.println("\n a is max");
			}
			else
			{
				System.out.println("\n c is max");
			}
		}	
		else
		{
			if(b>c)
			{
				System.out.println("\n b is max");
			}
			else
			{
				System.out.println("\n c is max");
			}
		}
	}
}

//-========================================================================

import java.util.*;
class JustPract 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("\n Enter any no: ");
		int no=sc.nextInt();
		
		for(int i=2;i<no;i++)
		{
			int d=2;
			int flg=0;
			while(d<=(i/2))
			{
				if(i%d==0)
				{
					flg=1;
					break;
				}
				d++;
			}
			
			if(flg==0)
			{
				System.out.println(i+" no is prime ");
			}
			else
			{
				System.out.println(i+" no is not prime ");
			}
		}
	}
}

//=======================================================================

class JustPract 
{
	public static void main(String []args)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i<=j)
				{
					System.out.print("*");
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

//====================================================================
//DemoContinue

class JustPract
{
	public static void main(String []args)
	{
		int i,j;

		for(i=0;i<10;i++)
		{
			System.out.print("- ");
			for(j=0;j<10;j++)
			{
				if(j>i)
				{
					
					System.out.print("$ ");
					continue;
				}

				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

//====================================================

//DemoLabelledContinue

class JustPract
{
	public static void main(String []args)
	{
		int i,j;

		outer:for(i=0;i<10;i++)
		{			
			System.out.print("-");
			for(j=0;j<10;j++)
			{
				if(i>5)
				{
					continue outer;
				}
				if(j>i)
				{
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
			//System.out.println("Hello");
		}
	}
}	


//==========================================================================================

// Using the break 


class JustPract
{
	public static void main(String []args)
	{
		int i,j;

		for(i=0;i<10;i++)
		{
			System.out.print("- ");
			for(j=0;j<10;j++)
			{
				if(j>i)
				{
					break;
				}
				System.out.print(""+j);
			}
			System.out.println();
		}
	}
}


//=====================================================

//labelled break

class JustPract
{
	public static void main(String []args)
	{
		int i,j;

		outer:for(i=0;i<10;i++)
		{
			System.out.print("-");
			for(j=0;j<10;j++)
			{
				if(i>5)
				{
					break outer;
				}
				if(j>i)
				{
					break;
				}
				System.out.print(""+j);
			}
			System.out.println();
		}
	}
}	


//------------------------------------------------------------------
//ArrayInputCommandline

class JustPract
{
	public static void main(String []args)
	{
		int []x=new int[args.length];

		for(int i=0;i<args.length;i++)
		{
			x[i]=Integer.parseInt(args[i]);
		}

		System.out.println("Array Elements are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("    "+x[i]);
		}

	}
}

//============================================================================

// WAP to perform searching operation

import java.util.Scanner;
class JustPract
{
	public static void main(String []args)
	{
		int index=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Count : ");
		int cnt = sc.nextInt();

		int x[]=new int[cnt];

		System.out.println("Enter Your "+cnt+" Elements:");
		for(int i=0;i<cnt;i++)
		{
			x[i]=sc.nextInt();
		}

		System.out.println("Array Elements are Elements:");
		for(int i=0;i<cnt;i++)
		{
			System.out.print(" "+x[i]);
		}

		System.out.println("\nEnter Your Element You Want To search");
		int SerEl = sc.nextInt();
		for(int i=0;i<cnt;i++)
		{
			if(SerEl == x[i])
			{
				 index = i+1;
			}
		}
		System.out.println("Element Fount At Index: "+index);
	}
}

//=================================================================


class JustPract
{
	public static void main(String []args)
	{
		int []x=new int[args.length];

		for(int i=0;i<args.length;i++)
		{
			x[i]=Integer.parseInt(args[i]);
		}

		System.out.println("Array Elements are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("    "+x[i]);
		}

	}
}


//=======================================================================
//Type Promotion

	/*Big Value DataType Cannot Convert into Small type.... int to Byte
	but Small Value Datatype Will convert into Large Value types byte to int


class JustPract
{
	public static void main(String []args)
	{
		// int to byte   - lossy conversion from int to byte
		int I1= 10;
		int I2= 20;
		byte ans = I1+I2;
		System.out.println("Int To Bye :"+ans);

		// Byte To Int
		byte b1= 10;
		byte b2= 20;
		int ans = b1+b2;
		System.out.println("Byte To Int :"+ans);

	}
}

//====================================================================================

//For Student 3 And N Sub:2D arrays

import java.util.*;
class JustPract
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);

		int Student[][]= new int[3][];

		for(int i=0;i<3;i++)
		{
			System.out.println("Enter The Subject Count for Student: "+(i+1));
			int cnt = sc.nextInt();

			Student[i]= new int[cnt];
			System.out.println("Enter The Subject Marks For Student "+(i+1));
			for(int j=0;j<cnt;j++)
			{
				Student[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<Student.length;i++)
		{
			System.out.print("Student :"+(i+1));
			for(int j=0;j<Student[i].length;j++)
			{
				System.out.print("\t "+Student[i][j]);
			}
			System.out.println();
		}
	}
}


//======================================================================

//N student N Subject 

import java.util.Scanner;
class JustPract
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Student Count :");
		int StuCnt = sc.nextInt();
		int Student[][] = new int[StuCnt][];

		for(int i=0;i<StuCnt;i++)
		{
			System.out.println("Enter The Stubject Count for Student :"+(i+1));
			int subcnt = sc.nextInt();

			Student[i]=new int[subcnt];

			System.out.println("Enter The Subject Marks for Student :"+(i+1));
			for(int j=0;j<subcnt;j++)
			{
				Student[i][j]=sc.nextInt();
			}
		}

		System.out.println("Details Of Student :");
		for(int i=0;i<Student.length;i++)
		{
			System.out.print("Student "+(i+1));
			for(int j=0;j<Student[i].length;j++)
			{
				System.out.print("\t"+Student[i][j]);
			}
			System.out.println();
		}
	}
}


//=======================================================================

// WAP to perform matrix multi.



import java.util.Scanner;
class JustPract
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int x[][]= new int[3][3];
		int y[][]= new int[3][3];
		int z[][]= new int[3][3];

		System.out.println("\nEnter Arrat x:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				x[i][j]=sc.nextInt();
			}
		}

		//------------------------------
		
		System.out.println("\nEnter Arrat y:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				y[i][j]=sc.nextInt();
			}
		}


		//-----------------------------------------
		
		System.out.println("\nArray x is:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+x[i][j]);
			}
			System.out.println();
		}

		//-------------------------------------


		System.out.println("\nArray y is:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+y[i][j]);
			}
			System.out.println();
		}


		//-----------------------------------------

		System.out.println("\nMul Of Two Arrays :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				z[i][j]=0;
				for(int k=0;k<x[i].length;k++)
				{
					z[i][j]=z[i][j]+x[i][k]*y[k][j];
				}
			}

		}

		System.out.println("\nArray z is:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+z[i][j]);
			}
			System.out.println();
		}
	}
}

//===========================================================================================

import java.util.*;
class MyNumber
{
	private int no;
	public void SetNum(int n)
	{
		no=n;
	}
	public int GetNum()
	{
		return no;
	}

	public String toOctal()
	{
		int rev=0;
		int no = this.no;
		String Octal ="";

		while(no!=0)
		{
			int rem=no%8;
			Octal=rem+Octal;
			no=no/8;
		}

		return Octal;
	}

	public void toBinary()
	{
		int no=this.no;
		String binary="";

		while(no!=0)
		{
			int rem = no%2;
			binary=rem+binary;
			no=no/2;
		}
		System.out.println("Binary Number is:"+binary);
	}

	public void toHex()
	{
		int no=this.no;
		String Hex="";

		while(no!=0)
		{
			int rem = no%16;

			if(rem<10)
			{
				Hex=rem+Hex;
			}
			else
			{
				Hex=(char)(rem+55)+Hex;
			}
			no=no/16;
		}
		System.out.println("The Hexa Is :"+Hex);
	}

	public boolean isBinary(int a)
	{
		String str = Integer.toString(a);

		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c!='0' && c!='1')
			{
				return false;
			}
		}
		return true;
	}

	public boolean isOctal(int a)
	{
		String str = Integer.toString(a);

		for(int i=0;i<str.length();i++)
		{
			char c= str.charAt(i);

			if(c<'0' || c >'7')
			{
				return false;
			}
		}
		return true;
	}

	public boolean isHex(int a)
	{
		String str = Integer.toString(a);

		for(int i=0;i<str.length();i++)
		{
			char c = Character.toUpperCase(str.charAt(i));

			if((c>='0' && c<='9') || (c>='A' && c<='F') || (c>='a' && c<='f'))
			{
				return false;
			}
		}
		return true;
	}
	
}
class JustPract
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = sc.nextInt();

		MyNumber n = new MyNumber();
		n.SetNum(num);

		int NN = n.GetNum();
		System.out.println("Num is :"+NN);

		String oct = n.toOctal();
		System.out.println("Octal Value is :"+oct);

		n.toBinary();
		n.toHex();

		//======================================================


		boolean isbinary = n.isBinary(1010);
		System.out.println("IsbInary() :"+isbinary);

		
		boolean isoct= n.isOctal(9);
		System.out.println("isoct() :"+isoct);

		
		boolean ishex= n.isHex(18);
		System.out.println("ishex() :"+ishex);
	}
}


//===========================================================================

import java.util.*;
class MyArray
{
	private int arr[];

	public void SetArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Count Of Array Elements :");
		int cnt = sc.nextInt();
		arr=new int[cnt];
		System.out.println("Enter Your Array :");
		for(int i=0;i<cnt;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	public void SetArray(int a[])
	{
		arr=new int[a.length];

		for(int i=0;i<a.length;i++)
		{
			arr[i]=a[i];
		}
	}

	public String GetArray()
	{
		String str ="";
		for(int i=0;i<arr.length;i++)
		{
			str = str +" "+arr[i];
		}
		return str;
	}

	public void Display()
	{
		System.out.println("Array Elements Are :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}

	public int GetLength()
	{
		int i;
		for( i=0;i<arr.length;i++);
		int len =i;
		return len;
	}

	public boolean isMaching(int a[])
	{
		boolean b = true;
		if(arr.length!=a.length)
		{
			return false;
		}
		else
		{
			for(int i=0;i<a.length;i++)
			{
				if(arr[i]!=a[i])
				{
					b=false;
					break;
				}
			}
		}
		return true;
	}

	public int SearNum(int num)
	{
		int i,pos=0;

		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				pos = i;
				break;
			}
		}
		return pos;
	}

	public void ShowSortArray()
	{
		int i,j,temp;
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println("Sorted Array is :");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}

class JustPract
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int x[]={1,2,3,4,5,6,7};

		MyArray ob = new MyArray();
		MyArray ob1 = new MyArray();

		ob.SetArray(x);
		ob.Display();

		ob1.SetArray();
		ob1.Display();

		//------------------------

		String str1 = ob.GetArray();
		System.out.println("Array Elements Are :"+str1);

		//-----------------------------
		
		System.out.println("Length Of Array is  :"+ob.GetLength());

		//------------------------------------------------

		boolean ans = ob1.isMaching(x);
		if(ans == true)
		{
			System.out.println("Array Are Macthing ");
		}
		else
		{
			System.out.println("Array Are Not Macthing ");	
		}

		//-----------------------------------

		System.out.println("Enter Your Number You Want TO Search :");
		int NumSearch = sc.nextInt();

		int search = ob1.SearNum(NumSearch);
		System.out.println("Number FOund At Pos :"+(search+1));

		//===========================================================

		ob1.ShowSortArray();

	}
}

//=====================================================================

import java.util.*;
class Demo
{
	private int x,y;
	public Demo()
	{
		x=10;
		y=20;
	}
	public Demo(int x,int y)
	{
		this.x=x;
		this.y=y;
	}

	public Demo(Demo t)
	{
		this.x=t.x;
		this.y=t.y;
	}
	public void ShowValue()
	{
		System.out.println("x = "+x + "\ty = "+y);
	}
}

class JustPract
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);

		Demo ob = new Demo();
		ob.ShowValue();

		//-------------------------------

		System.out.println("Enter The  two value :"); 
		int p = sc.nextInt();
		int q= sc.nextInt();

		
		System.out.println("Demo Para Constructers :");
		Demo ob1 = new Demo(p,q);
		ob1.ShowValue();

		//-----------------------------------

		System.out.println("Demo Copy Constructers :");
		Demo ob2 = new Demo(ob1);
		ob2.ShowValue();


	}
}

//================================================================

class InitilizerBlock
{
	private int x,y;

	{
		x=10;
		y=30;
	}

	public void ShowValue()
	{
		System.out.println(" x = "+x+" y = "+y);
	}
}

class JustPract
{
	public static void main(String []args)
	{
		System.out.println("Initi I");
		InitilizerBlock I1 = new InitilizerBlock();
		I1.ShowValue();

		
		System.out.println("Initi II");
		InitilizerBlock I2 = new InitilizerBlock();
		I2.ShowValue();
	}
}

//===========================================================================

import java.util.*;
class Person
{
	private String name;
	private int age;

	public void in()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Name :");
		name = sc.next();
		System.out.println("Enter The Age :");
		age = sc.nextInt();
	}
	public void out()
	{
		System.out.println("Name :"+name+"\tage = "+age);
	}
}

class Student extends Person
{
	private int rollNo;
	private double per;

	public void input()
	{
		in();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Roll no:");
		rollNo = sc.nextInt();
		System.out.println("Enter The Student Percentage :");
		per = sc.nextDouble();
	}
	public void output()
	{
		out();
		System.out.println("Roll No :"+rollNo+"\tPer :"+per);
	}
}
class JustPract
{
	public static void main(String []args)
	{
		/*Student p1 = new Student();
		p1.in();
		p1.input();
		p1.out();
		p1.output();

		//or 

		Student s1= new Student();
		s1.input();
		s1.output();
	}
}


//==========================================================

//Single Inheritance

import java.util.*;
class Person
{
	private String name;
	private int age;

	private void in()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Name :");
		name = sc.next();
		System.out.println("Enter The Age :");
		age = sc.nextInt();
	}
	public void out()
	{
		in();
		System.out.println("Name :"+name+"\tage = "+age);
	}
}

class Student extends Person
{
	private int rollNo;
	private double per;

	private void input()
	{
		//in();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Roll no:");
		rollNo = sc.nextInt();
		System.out.println("Enter The Student Percentage :");
		per = sc.nextDouble();
	}
	public void output()
	{
		out();
		input();
		System.out.println("Roll No :"+rollNo+"\tPer :"+per);
	}
}
class JustPract
{
	public static void main(String []args)
	{
		/*
		Student p1 = new Student();
		p1.in();
		p1.input();
		p1.out();
		p1.output();

		//or 

		
		Student s1= new Student();
		s1.output();
	}
}

//=============================================

//MultiLevel inheritance :

import java.util.*;
class Person
{
	private String name;
	private int age;

	public void in()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Name :");
		name = sc.next();
		System.out.println("Enter The Age :");
		age = sc.nextInt();
	}
	public void out()
	{
		System.out.println("Name :"+name+"\tage = "+age);
	}
}

class Student extends Person
{
	private int rollNo;
	private double per;

	public void input()
	{	
		in();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Roll no:");
		rollNo = sc.nextInt();
		System.out.println("Enter The Student Percentage :");
		per = sc.nextDouble();
	}
	public void output()
	{
		out();
		System.out.println("Roll No :"+rollNo+"\tPer :"+per);
	}
}

class Sports extends Student
{
	private char Grade;

	public void setGrade()
	{
		input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Student Grade :");
		Grade = sc.next().charAt(0);
	}
	public void DisplayGrade()
	{
		output();
		System.out.println("Grade is:"+Grade);
	}

}
class JustPract
{
	public static void main(String []args)
	{
		Sports s = new Sports();
		s.setGrade();
		s.DisplayGrade();
	}
}

*/
//=======================================================================
/*
import java.util.*;
class Person
{
	private String name;
	private int age;

	public void in()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Name :");
		name = sc.next();
		System.out.println("Enter The Age :");
		age = sc.nextInt();
	}
	public void out()
	{
		System.out.println("Name :"+name+"\tage = "+age);
	}
}

class Student extends Person
{
	private int rollNo;
	private double per;

	private void input()
	{	
		in();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Roll no:");
		rollNo = sc.nextInt();
		System.out.println("Enter The Student Percentage :");
		per = sc.nextDouble();
	}
	public void output()
	{
		input();
		out();
		System.out.println("Roll No :"+rollNo+"\tPer :"+per);
	}
}

class Sports extends Student
{
	private char Grade;

	public void setGrade()
	{
		//input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Student Grade :");
		Grade = sc.next().charAt(0);
	}
	public void DisplayGrade()
	{
		output();
		System.out.println("Grade is:"+Grade);
	}
}

class JustPract
{
	public static void main(String []args)
	{
		Sports s = new Sports();
		s.setGrade();
		s.DisplayGrade();
	}
}

*/
//=============================================================================
/*
class base
{
	private int a;
	public base()
	{
		System.out.println("In base Constructer :");
		a=20;
	}
	public base (int x)
	{
		System.out.println("Derived Para A: ");
		a=x;
	}
	public void show1()
	{

		System.out.println("A = "+a);
	}
}

class base1 extends base
{
	private int b;
	public base1()
	{
		System.out.println("In base1 Constructer :");
		b=30;
	}
	public base1(int x,int y)
	{
		super(x);
		System.out.println("Derived Para B: ");
		b=y;
		
	}
	public void show2()
	{
		show1();
		System.out.println("B = "+b);
	}
}
 
class base2 extends base1
{
	private int c;
	public base2()
	{
		System.out.println("In base2 Constructer :");
		c=50;
	}
	public base2(int x,int y,int z)
	{
		super(x,y);
		System.out.println("Derived Para C: ");
		c=z;
	}
	public void show3()
	{
		show2();
		System.out.println("C = "+c);
	}
}

class JustPract
{
	public static void main(String []args)
	{
		base2 b2 = new base2();
		b2.show3();

		base2 b3 = new base2(100,200,300);
		b3.show3();
	}
}

/*
//================================================================

class A
{
	{
		System.out.println("Init block A");
	}
	A()
	{
		System.out.println("Constructor A");
	}
}
class B extends A
{
	{
		System.out.println("Init block B");
	}
	B()
	{
		System.out.println("Constructor B");
	}
}
class C extends B
{
	{
		System.out.println("Init block C");
	}
	C()
	{
		System.out.println("Constructor C");
	}
}


class JustPract
{
	public static void main(String []args)
	{
		C ob=new C();
	}
}


*/
//=====================================================
/*

class A
{
	private int a1;
	private int a2;
	{
		a1=1;
		System.out.println("Init block A");
	}
	A()
	{	
		a2=11;
		System.out.println("Constructor A");
	}
	public void showA()
	{
		System.out.println("A: a1: "+a1+"\t a2: "+a2);
	}
}
class B extends A
{
	private int b1;
	private int b2;
	{
		b1=2;
		System.out.println("Init block B");
	}
	B()
	{
		b2=22;
		System.out.println("Constructor B");
	}
	public void showB()
	{
		showA();
		System.out.println("B: b1: "+b1+"\t b2: "+b2);
	}
}
class C extends B
{
	private int c1;
	private int c2;
	{
		c1=3;
		System.out.println("Init block C");
	}
	C()
	{
		c2=33;
		System.out.println("Constructor C");
	}
	public void showC()
	{
		showB();
		System.out.println("C: c1: "+c1+"\t c2: "+c2);
	}
}


class JustPract
{
	public static void main(String []args)
	{
		C ob=new C();
		ob.showC();
	}
}
*/
//==========================================================
/*
class A
{
	private int a1;
	private int a2;
	{
		a1=1;
		System.out.println("Init block A");
	}
	A()
	{	
		a2=11;
		System.out.println("Default Constructor A");
	}
	A(int p1)
	{	
		a2=p1;
		System.out.println("para Constructor A");
	}
	public void showA()
	{
		System.out.println("A: a1: "+a1+"\t a2: "+a2);
	}
}
class B extends A
{
	private int b1;
	private int b2;
	{
		b1=2;
		System.out.println("Init block B");
	}
	B()
	{
		b2=22;
		System.out.println("Default Constructor B");
	}
	B(int p1, int p2)
	{
		super(p1);
		b2=p2;
		System.out.println("Para Constructor B");
	}
	public void showB()
	{
		showA();
		System.out.println("B: b1: "+b1+"\t b2: "+b2);
	}
}
class C extends B
{
	private int c1;
	private int c2;
	{
		c1=3;
		System.out.println("Init block C");
	}
	C()
	{
		c2=33;
		System.out.println(" Default Constructor C");
	}
	C(int p1, int p2, int p3)
	{
		super(p1,p2);
		c2=p3;
		System.out.println(" Para Constructor C");
	}
	public void showC()
	{
		showB();
		System.out.println("C: c1: "+c1+"\t c2: "+c2);
	}
}

class JustPract
{
	public static void main(String []args)
	{
		C ob=new C();
		ob.showC();

		C ob1=new C(111,222,333);
		ob1.showC();
	}
}

*/

//==========================================================================
/*
import java.util.Scanner;
class Student
{
	private String nm;
	private int id;

	public void in()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		nm=sc.nextInt();
		System.out.println("Enter The Id:");
		id=sc.nextInt();
	}
	public void out()
	{
		System.out.println("Name = "+nm+"\tid = "+id);
	}
}
class Sports
{
	private int grade;

	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Grade");
		grade = sc.nextInt();
	}
	public void output()
	{
		System.out.println("Grade = "+grade);
	}
}

class Result extends Student,Sports
{
	private int result;

	public void ShowResult()
	{
		in();
		input();
		out();
		output();

		if(Grade<=10)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Pass");
		}
	}
}
class JustPract
{
	public static void main(String []args)
	{
		
		Result r= new Result();
		r.ShowResult();
	}
}
*/
//==========================================================

//Method Overriding--------
/*
class A
{
	public void Display()
	{
		System.out.println("Method in A Class");
	}
}
class B extends A
{
	public void Display()
	{
		System.out.println("Method in B Class");
	}
}
class JustPract
{
	public static void main(String []args)
	{
		B b = new B();
		b.Display();
	}
}
*/
//======================================================
/*
import java.util.Scanner;
import java.util.*;
import java.io.*;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class Person
{
	private String nm;
	private int age;

	public void input()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name :");
		nm = sc.nextLine();
		System.out.println("Enter Your Age :");
		age = sc.nextInt();
		fflush(stdin);

		System.out.println("Enter your Name :");
		nm = sc.nextLine();
		System.out.println("Enter Your Age :");
		age = sc.nextInt();
	}
	public void Display()
	{
		System.out.println("Name :"+nm+"\tAge :"+age);
	}

}
class Student extends Person
{
	private double Marks;

	public void in()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks :");
		Marks = sc.nextDouble();
	}
	public void Display()
	{
		System.out.println("Percentage :"+Marks);
	}

}
class JustPract
{
	public static void main(String []args)
	{
		Student s = new Student();
		s.in();
		s.Display();

		Person p = new Person();
		p.input();
		p.Display();
		
	}
}

*/
//======================================================

//Using Super keyWord For instant Variable:
/*
class Base
{
	public int a;
	Base()
	{
		a=10;
	}
}
class Derived extends Base
{
	public int a;
	Derived()
	{
		a=100;
	}
	public void out()
	{
		System.out.println("\n In Derived Inh a="+super.a+" and a="+a);
	}
}
class JustPract
{
	public static void main(String []args)
	{
		Derived ob=new Derived();
		ob.out();
	}
}

*/
//============================================
//Using This Keyword
/*
class A
{
	private int x;

	A()
	{
		x=10;
	}
	public A(int x)
	{
		this.x=x;
	}
	public void Show()
	{
		System.out.println("X = "+x);
	}
}
class JustPract
{
	public static void main(String []args)
	{
		A a = new A(20);
		a.Show();
		
	}
}
*/
//=======================
//invoke Current Constructer using this in same class
/*
class A
{
	private int a;
	public A()
	{
		a=10;
	}
	public A(int x)
	{
		this.a=x;
	}
	public A(double x)
	{
		this();
	}
	public void Show()
	{
		System.out.println("a = "+a);
	}

}
class JustPract
{
	public static void main(String []args)
	{
		A a = new A(50);
		a.Show();
	}
}*/

//=========================================

//invoke Current method  using this in same class
/*

class A
{
	private int a;
	public void A()
	{
		System.out.println("In A ");
	}
	public void B()
	{
		System.out.println("In B ");
		//this.A();
	}
}
class JustPract
{
	public static void main(String []args)
	{
		A a = new A();
		a.B();
	}
}

*/
//================================================
/*
class A
{
	private int a;
	public void A(A obj)
	{
		System.out.println("In A ");
	}
	public void B()
	{
		System.out.println("In B ");
		A(this);
	}
}
class JustPract
{
	public static void main(String []args)
	{
		A a = new A();
		a.B();
	}
}
*/

//====================================================

//Static keyWord: Variable
/*
class A
{
	private static int a,b;
	int z;
	public void A(int x,int y)
	{
		a=x;
		b=y;
		int z = a+b;
		
		System.out.println("Value of z :"+z);
	}
}
class JustPract
{
	public static void main(String []args)
	{
		A a = new A();
		a.A(50,50);
	}
}*/

//======================================================

//Static keyWord: Variable
/*
class A
{
	private  int a,b;
	int z;
	public static void A(int x,int y)
	{
		a=x;
		b=y;
		int z = a+b;
		
		System.out.println("Value of z :"+z);
	}
}
class JustPract
{
	public static void main(String []args)
	{
		A a = new A();
		a.A(50,50);
	}
}  


//Output Will Be 
JustPract.java:2443: error: non-static variable a cannot be referenced from a static context
                a=x;
                ^
JustPract.java:2444: error: non-static variable b cannot be referenced from a static context
                b=y;
                ^
JustPract.java:2445: error: non-static variable a cannot be referenced from a static context
                int z = a+b;
                        ^
JustPract.java:2445: error: non-static variable b cannot be referenced from a static context
                int z = a+b;
                          ^
4 errors

// Bacause You Declare Method as Static And Take the variable non-Static it will show an error. 
//to solve this Error you Need to Make Variable Static:


//====================


class A
{
	private static int a,b;
	int z;
	public static void A(int x,int y)
	{
		a=x;
		b=y;
		int z = a+b;
		
		System.out.println("Value of z :"+z);
	}
}
class JustPract
{
	public static void main(String []args)
	{
		A a = new A();
		a.A(50,50);
	}
}  

*/
//======================================================================
/* Without Main Excution Of Program
class A
{
	static {
		System.out.println("Hello");
		System.exit(0);
	}
}

*/

//======================================================

//this KeyWord : Variable

/*

class DemoFinal
{
	final public int x;
	public DemoFinal()
	{
		x=45;
	}
	public DemoFinal(int x)
	{
		this.x=x;
	}
	public void in(int x)
	{
		this.x=x; //JustPract.java:2534: error: cannot assign a value to final variable x this.x=x;
	}
	public void Display()
	{
		System.out.println("The Value Of X = "+x);
	}
}

class JustPract
{
	public static void main(String []args)
	{
		DemoFinal d = new DemoFinal();
		d.in(21);
		d.Display();
		
		
		DemoFinal d1 = new DemoFinal(56);
		d1.Display();
	}
}
*/
//======================================================================
/*
//Final Method :

final class DemoFinal
{
	final public int x;
	public DemoFinal()
	{
		x=45;
	}
	final public void Display()
	{
		System.out.println("The Value Of X = "+x);
	}
}

class Demo extends DemoFinal
{
	final public int y;
	public Demo()
	{
		y=21;
	}
	public void Display()
	{
		
		System.out.println("The Value Of Y = "+y);
	}
}
class JustPract
{
	public static void main(String []args)
	{
		Demo d = new Demo();
		d.Display();
	}
}


error:
JustPract.java:2582: error: Display() in Demo cannot override Display() in DemoFinal
        public void Display()
                    ^
  overridden method is final
1 error*/

//======================================================================
/*

//Polymorphism in Java

class rect
{
	public void AreaR()
	{
		System.out.println("In Rectangel :");
	}
}
class Triangle
{
	public void AreaT()
	{
		System.out.println("In Triangle :");
	}
}
class Circle
{
	public void AreaC()
	{
		System.out.println("In Circle :");
	}
}

class JustPract
{
	public static void main(String []args)
	{
		rect R = new rect();
		R.AreaR();

		Triangle t = new Triangle();
		t.AreaT();
		
		Circle c = new Circle();
		c.AreaC();
	}
}

*/
//But It Is an Compile Time Poly

//=======================================
/*
class shape
{
	public void area()
	{
		System.out.println("In Circle :");
	}
}
class rect extends shape
{
	public void area()
	{
		System.out.println("In Rectangel :");
	}
}
class Triangle extends shape
{
	public void area()
	{
		System.out.println("In Triangle :");
	}
}
class Circle extends shape
{
	public void area()
	{
		System.out.println("In Circle :");
	}
}

class JustPract
{
	public static void main(String []args)
	{
		shape ref;

		ref= new rect();
		ref.area();

		ref= new Triangle();
		ref.area();

		ref= new Circle();
		ref.area();
	}
}
*/
//=====================================
/*
class Shape
{
	public abstract void area();
}
class Rect extends Shape
{
	public void area()
	{
		System.out.println("In Rect area()");
	}
}
class Triangle extends Shape
{
	public void area()
	{
		System.out.println("In Triangle area()");
	}
}
class Circle extends Shape
{
	public void area()
	{
		System.out.println("In Circle area()");
	}
}
class Parabola extends Shape
{
	public void area()
	{
		System.out.println("In Circle area()");
	}
}
class JustPract
{
	public static void main(String []args)
	{
		// rather than creating the complex architecture to decide the which shape,
		// lets go for the possiblities.

		Shape ref;

		ref=new Rect(); 
		ref.area(); 

		// OR

		ref=new Circle(); 
		ref.area(); 

		// OR

		ref=new Triangle(); 
		ref.area(); 

		// OR

		ref=new Parabola (); 
		ref.area(); 
	}
}

//=========================================================

abstract class Demo
{
	private int x=10;
	public Demo()
	{
		System.out.println("\n In the Demo Class Constructor");
	}
	public void out()
	{
		System.out.println("\n In out() method - x is "+x);
	}
	abstract void show();
}
class Test extends Demo
{
	int y;
	public Test()
	{
		y=100;
		System.out.println("\n In child Test class Constructor");
	}
	public void show()
	{
		System.out.println("\n Hi from show() Test and y="+y);
	}
}
class JustPract
{
	public static void main(String []args)
	{
		Test ob=new Test();
		ob.show();
		ob.out();

		Demo d;

		d= new Test();
		d.show();
		d.out();
	}
}
*/
//============================================================

//Abstract Method and CLass:
/*
abstract class Shape
{
	abstract public double area();
	public void Display()
	{
		System.out.println("In Shape");
	}
}
class Circle extends Shape
{
	private double radius;

	public Circle(double radius)
	{
		this.radius = radius;
	}

	public double area()
	{
		return Math.PI*radius*radius;
		
	}
}
class Rect extends Shape
{
	private double length;
	private double width;

	public Rect(double length , double width)
	{
		this.length=length;
		this.width=width;
	}

	public double area()
	{
		return length*width;
	}
}

class JustPract
{
	public static void main(String []args)
	{
		Rect r = new Rect(3,6);
		double rectarea=r.area();
		System.out.println(rectarea);

		Circle c = new Circle(7);
		double Circlearea=c.area();
		System.out.println(Circlearea);
	}
}

*/

//====================================================================
/*
//Memeber Inner Class

class InnerClassExamp
{
	private int a;
	public InnerClassExamp()
	{
		a=45;
	}
	class Inner
	{
		public void show ()
		{
			System.out.println("A= "+a);
		}
	}

	public void display_Inner()
	{
		Inner I = new Inner();
		I.show();
	}
}
class JustPract
{
	public static void main(String []args)
	{
		InnerClassExamp innerclass = new InnerClassExamp();
		innerclass.display_Inner();
		
		//Or

		InnerClassExamp innerclass1 = new InnerClassExamp();
		InnerClassExamp.Inner in =innerclass1.new Inner();
		in.show();
	}
}
*/
//===================================================

//Local Inner Class

/*
class LocalInnerClassExamp
{
	private int outfield=45;

	public void LocInnerClass()
	{
		 final int infield = 21;

		class Inner
		{
			public void show ()
			{
				System.out.println("outfield "+outfield);
				System.out.println("infield "+infield);

				outfield=300;
				//infield=400; it will show an error cause it is final:

				System.out.println("After Change The Value :");
				System.out.println("outfield "+outfield);
				System.out.println("infield "+infield);
			}
		}
		
		Inner I = new Inner();
		I.show();
	}
	
	
}
class JustPract
{
	public static void main(String []args)
	{
		LocalInnerClassExamp ob1 = new LocalInnerClassExamp();
		ob1.LocInnerClass();
	}
}
*/
//==============================================
/*
VarArgs in java:

class JustPract
{
	static void Display(String... str)
	{
		System.out.println("Length :"+str.length);

		for(String i : str)
		{
			System.out.print(" "+i);
		}
	}

	public static void main(String []args)
	{
		JustPract varargs = new JustPract();
		varargs.Display();

		varargs.Display("Rohit","Virat");
	}
}
*/
//=======================================================
//Interface In Java:
/*
interface InterFaceExample
{
	int val=10;
	double val2 =45;
	abstract void Out();
}
class B implements InterFaceExample
{
	public void Out()
	{
		val=17;
		System.out.println("Hello");
	}
	public void Show()
	{
		System.out.println("Val1 = "+val + "\tVal2 = "+val2);
	}
}

class JustPract
{
	public static void main(String args[])
	{
		B b = new B();


		b.Out();
		b.Show();


		System.out.println(InterFaceExample.val);
		System.out.println(InterFaceExample.val2);
	}
}
*/
//===========================================================

/*
class A
{
	void Show()
	{
		System.out.println("Hiiiiiiiiiiiiiiiiii ");
	}
}
interface B
{
	void Show();
}
class C extends A implements B 
{
	public void Show()
	{
		System.out.println("Byeeeeeeeeeee ");
	}
}

class JustPract
{
	public static void main(String args[])
	{
		C c = new C();
		c.Show();
	} 
}
*/
//=================
/*
interface A
{
	 void Display();
	
}

interface B 
{
	 void Display();
	
}

class C implements A,B
{
	public void Show()
	{
		System.out.println("In show ");
	}

	public void Display()
	{
		System.out.println("Display in C ");
	}
}

class JustPract
{
	public static void main(String args[])
	{
		C c = new C();
		c.Show();
		c.Display();
	}
}
*/
//========================================
/*
//Interface Extends Interface class Extend Class And Implements Interface

import java.util.Scanner;
interface SampleIn
{
	void in();
}
interface SampleOut extends SampleIn
{
	void out();
}
class Demo
{	private int a;
	public Demo()
	{
		a=100;
	}

	public void show()
	{	
		System.out.println("\n a="+a);
	}
}
class Test extends Demo implements SampleOut
{
	private int x;
	private double y;
	public Test()
	{
		x=23;
		y=45.21;
	}
	public void in() // visibility must be public
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the values of x and y: ");
		x=sc.nextInt();
		y=sc.nextDouble();
	}
	public void out() // visibility must be public
	{
		show();
		System.out.println("\n x="+x+"\t y="+y);
	}
}

class JustPract
{	public static void main(String []args)
	{
		Test ob=new Test();
		ob.in();
		ob.out();
	}
}
*/
//================================================
/*
import java.util.Scanner;

interface Sample
{
	//void in();
	void out();
}
class test implements Sample
{
	private int a;
	private int b;
	public test()
	{
		a=100;
		b=200;
	}
	public void in()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value Of A:");
		a=sc.nextInt();
	
		System.out.println("Enter The Value Of B:");
		b=sc.nextInt();
	}
	public void out()
	{
		System.out.println("Addition oF a and b "+(a+b));
	}
}

class JustPract
{	public static void main(String []args)
	{
	
		test t = new test(); 
		t.in();
		t.out();		// Using The Object Of Class 

		//or 

		Sample s = new test();
		s.in();
		s.out();	  // we can create the reference Variable of  Interface it is able to refer an object of
					 //its every child but it will access only thoes method 
					 //i.e Defined in Interface Otherwise it will show an error msg
					 //JustPract.java:3180: error: cannot find symbol  s.in();
	}
}
*/
//=============================================================

class JustPract
{	public static void main(String []args)
	{
		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<10;j++)
			{
				if(i<=j)
				{
					System.out.print("*");
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



