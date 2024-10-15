/*
QUE 1:
Practice Problems: Classes and Objects (Chapters 5 and 6)
1) The Java class called Holidayis started below. An object of class Holidayrepresents a
holiday during the year. This class has three instance variables:
? name, which is a Stringrepresenting the name of the holiday
? day, which is an intrepresenting the day of the month of the holiday
? month, which is a Stringrepresenting the month the holiday is in

public class Holiday 
{
	private String name;
	private int day;
	private String month;
	// your code goes here
}


//---------------------------------Ans From Here---------------------------------

class Holiday
{
	private int day;
	private String name;
	private String month;
	
	/*
	a) Write a constructor for the class Holiday, which takes a Stringrepresenting the name, an
	intrepresenting the day, and a Stringrepresenting the month as its arguments, and sets the
	class variables to these values. 

	Holiday(int d,String nm,String mn)
	{
		day=d;
		name=nm;
		month=mn;
	}

	//---------------------------------------------

	public void display()
	{
		System.out.println("\nNameOfHoliday-Day-Month\t\t"+name+"\t"+day+"-"+month);
	}
	//-------------------------------------------------

	/** b) Write a method inSameMonth, which compares two instances of the class Holiday,and
	returns the Boolean value trueif they have the same month, and falseif they do not.

	public boolean IsSameMonth(Holiday h,Holiday h1)
	{
		if(h.month==h1.month)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//---------------------------------------------------

	/**	c) Write a method avgDatewhich takes an array of base type Holidayas its argument, and
	returns a doublethat is the average of the dayvariables in the Holidayinstances in the
	array. You may assume that the array is full (i.e. does not have any null entries).

	public int GetAve()
	{
		return avg;
	}
	
}

class PracticeProblemsJava 
{
	public static void main(String[] args) 
	{
		int x[]=new int[5];



		Holiday h1 = new Holiday(9,"GudhiPadava","April");
		h1.display();

		Holiday h2 = new Holiday(17,"RamNavmi","Oct");
		h2.display();

		boolean b1=h2.IsSameMonth(h1,h2);
		System.out.println("\nIs Month Same?? : "+b1);

		
		//----------------------------------------------------------

		/**d) Write a piece of code that creates a Holidayinstance with the name “Independence Day”,
		with the day “4”, and with the month “July”.

		Holiday h3=new Holiday(4,"IndependentDay","July");
		h3.display();
	}
}
*/
//==============================================================================================================================

//QUE 2:
/*
import java.util.Scanner;
class Movie
{
	private String title;
	private String studio;
	private String rating;

	//-----------------------------------------------------

	Movie(String t,String s,String r)
	{
		title=t;
		studio=s;
		rating=r;
	}

	//-----------------------------------------------

	Movie(String t1,String s1)
	{
		title=t1;
		studio=s1;
		rating = " PG-21 ";
	}

	//---------------------------------------------------------

	public void Display()
	{
		System.out.println("Movie Title: "+title+"\tMovie Studio: "+studio+"\tMovie Ratings: "+rating);
	}

}

class PracticeProblemsJava 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[6];

		Movie m1=new Movie("DDLJ","CromaStudio","G");
		m1.Display();

		Movie m2=new Movie("CasinoRoyale","EonProductions","PG13");
		m2.Display();

		Movie m3=new Movie("1920","BlumHose");
		m3.Display();	

		//-----------------------------------------------
	}
}

*/
//=====================================================================================================================

//QUE 3
//Consider the following definition of the class MyClass:

/*
class Myclass
{
	private static  int cnt=0;
	private int x;

	public Myclass(int i)
	{
		x=i;
	}
	public void IncramentCnt()
	{
		cnt++;
	}
	public void PrintX()
	{
		System.out.println(" x = "+x);
	}
	public void PrintCount()
	{
		System.out.println(" Count ="+cnt);
	}
}
class PracticeProblemsJava 
{
	public static void main(String[] args) 
	{
		Myclass m1=new Myclass(5);
		Myclass m1=new Myclass(7);

		m1.printX();
		m1.IncramentCnt();
		Myclass.IncramentCnt();
		m1.PrintCount();
		m2.PrintCount();
		m2.printX();
		m1.setX(14);
		m1.IncramentCnt();
		m1.printX();
		m1.PrintCount();
		m2.PrintCount();
		
	}
}
*/
//==============================================================================================

/*
class Myclass
{
	private static  int cnt=0;
	private int x;

	public Myclass(int i)
	{
		x=i;
	}
	static public void IncramentCnt()
	{
		cnt++;
	}
	public void PrintX()
	{
		System.out.println(" x = "+x);
	}
	public void PrintCount()
	{
		System.out.println(" Count ="+cnt);
	}
}
class PracticeProblemsJava 
{
	public static void main(String[] args) 
	{
		Myclass m1=new Myclass(5);
		Myclass m2=new Myclass(7);

		m1.PrintX();
		m1.IncramentCnt();
		Myclass.IncramentCnt();
		m1.PrintCount();
		m2.PrintCount();
		m2.PrintX();
		//m1.setX(14);
		m1.IncramentCnt();
		m1.PrintX();
		m1.PrintCount();
		m2.PrintCount();
		
	}
}

*/
//======================================================================================================
//Que 4:
//4.1 Write a Java class Author with following features:
/*
class Author
{
	private String Fnm;
	private String Lnm;

	public void SetFnm(String Fnm)
	{
		this.Fnm=Fnm;
	}
	public void SetLnm(String Lnm)
	{
		this.Lnm=Lnm;
	}

	public String GetFnm()
	{
		return Fnm;
	}
	public String GetLnm()
	{
		return Lnm;
	}
	
	public String toString()
	{
		return Fnm+" "+Lnm;
	}
}

class PracticeProblemsJava 
{
	public static void main(String[] args) 
	{
		//----------------------------------------------------
		//Using tostring Method:
		System.out.println("Using tostring Method:");
		Author a1=new Author();
		a1.SetFnm("Pooja");
		a1.SetLnm("Patil");
		a1.toString();

		System.out.println(" The String is "+a1.toString());

		//--------------------------------------------------------------

		Author a2=new Author();
		a2.SetFnm("Rohit");
		a2.SetLnm("Sharma");
		
		System.out.println("The 2nd String is "+a2.GetFnm()+"  "+a2.GetLnm());
	}
}


//-----------------------------------------------------------------------------------------------------------
//4.2. Write a Java class Book with following features:


class Books
{
	private String title;
	private double price;
	private String author;

	//-----------------------------------Setters-------------------

	public void Settitle(String title)
	{
		this.title=title;
	}
	public void Setprice(double price)
	{
		this.price=price;
	}
	public void SetAuthor(String author)
	{
		this.author=author;
	}

	//----------------------Getters-------------------------

	public String Gettitle()
	{
		return title;
	}
	public double Getprice()
	{
		return price;
	}
	public String GetAuthor(String author)
	{
		return author;
	}

	//-----------------------------------------------------------
	
	public String toString()
	{
		return "Titile:"+title+"\tPrice:"+price+"\tAuther:"+author;
	}

}

class PracticeProblemsJava 
{
	public static void main(String[] args) 
	{
		//----------------------------------------------------
		//Using tostring Method:

		System.out.println("Using tostring Method:");
		Books a1=new Books();
		a1.Settitle("C program");
		a1.Setprice(257);
		a1.SetAuthor("abc");
		a1.toString();

		System.out.println(a1.toString());

		//--------------------------------------------------------------

		
	}
}
*/

//===========================================================================================================
//Que 1:
/*
import java.util.Scanner;
class Number
{
	private int no;

	public void SetNo(int num)
	{
		no=num;
	}

	public int GetNo()
	{
		return no;
	}

	public void toBinary(int n)
	{
		int no = this.no;
		String binary="";
		while(no>0)
		{
			int rem=no%2;
			binary=rem+binary;
			no=no/2;
		}

		System.out.print(binary);
	}


	public String ToOctal()
	{
		int no=this.no;

		String Octal="";
		while(no>0)
		{
			int rem=no%8;
			Octal=rem+Octal;
			no=no/8;
		}
		return Octal;
	}

	public void ToHexa()
	{
		int no=this.no;

		String Hexa="";

		while(no>0)
		{
			int rem=no%16;

			if(rem<10)
			{
				Hexa=rem+Hexa;
			}
			else
			{
				Hexa=(char)(rem+55)+Hexa;
			}
			no=no/16;
		}
		System.out.print(Hexa);
	}


	public boolean isbinary(int a)
	{
		String str=Integer.toString(a);

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

	public boolean isOctal(int n)
	{
		String str=Integer.toString(n);
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c<'0' ||  c>'7')
			{
				return false;
			}
		}
		return true;
	}

	public boolean isHexa(int n)
	{
		String str=Integer.toString(n);

		for(int i=0;i<str.length();i++)
		{
			char c=Character.toUpperCase(str.charAt(i));

			if((c>='0'&&c<='9') || (c>='a'&& c<='f') || (c>='A'&&c<='z'))
			{
				return false;
			}
		}

		return true;
	}


}
class PracticeProblemsJava {
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Your Number:");
		int num=sc.nextInt();

		Number n1=new Number();
		n1.SetNo(num);
		System.out.println("The Numer is = "+n1.GetNo());

		System.out.print("Binary Of Numer "+n1.GetNo()+" Is ");
		n1.toBinary(num);

		System.out.println("\nOctal Of Numer "+n1.GetNo()+" Is "+n1.ToOctal());


		System.out.print("Hexa Of Numer "+n1.GetNo()+" Is ");
		n1.ToHexa();

		boolean isBin = n1.isbinary(1010);
		System.out.println(" IsBinary ? :"+isBin);

		boolean isOct = n1.isOctal(12);
		System.out.println(" isOctal ? :"+isOct);

		
		boolean isHex = n1.isHexa(OGA);
		System.out.println(" isHexa ? :"+isHex);

	

		System.out.println();



    }
}
*/
//======================================================================================
/*
QUE 2:
Write a program to define the operations mentioned in a class given below.
class MyArray
{ 
 private int ar[]; 
 public void setArray(){….} 
 public void setArray(int []a){….} 
 public void ShowArray(){….} 
 public String getArray(){…..} 
 public int getLength(){……} 
 public boolean isMatching(int []a){……} 
 public int search(int n){} 
 public void showSorted(){….}  
}
//----------------------------------------------------------------------------------------

import java.util.Scanner;
class MyArray
{
	private int arr[];

	//---------------------------------------------

	public void SetArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Count Of Array:");

		int cnt= sc.nextInt();
		arr=new int[cnt];
		
		System.out.println("Enter Your 1st Array Elemnets:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}

	public void ShowArray()
	{
		System.out.println("Elements are:");
		for(int i=0;i<cnt;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
	
	//-------------------------------------------------------

	public void SetArray(int a[])
	{
	   ar=new int[a.length];
	   for(int i=0;i<6;i++)
	   {
			arr[i]=a[i];
	   }
	}

	
	public String GetArray()
	{
		String Str="";
		for(int i=0;i<cnt;i++)
		{
			Str=str+" "+arr[i]);
		}
		return Str;
	}

	//-----------------------------------

	//For Length:

	public int GetLength()
	{
		return arr.length;
	}

	//--------------------------------------------

	public boolean isMatching(int []a)
	{
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=arr[i])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			return false;
		}
		else
		{
			return true;
		}
	} 

	//-----------------------------------------
	public int search(int n)
	{
		int i,pos=-1;
		for(i=0;i<6;i++)
		{
			if(arr[i]==n)
			{
				temp=arr[i];
				pos=i;
			}
		}
		return pos;
	} 
	//----------------------------------------------

	public void showSorted()
	{
		int i,j;
		for(i=0;i<6;i++)
		{
			for(j=i;j<6;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		//display

		for(i=0;i<6;i++)
		{
			System.out.print("  "+arr[i]);
		}
	}  
}

class PracticeProblemsJava 
{
    public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		//------------------------------------
		
		
	   System.out.println("******** FOR INPUT AND DISPLAY *******");
	   MyArray m1 = new MyArray();
	   m1.SetArray();
	   m1.ShowArray();
	   m1.GetLength();
	   System.out.println(" Array Length:"+ m1.GetLength());


		//----------------------------------------------------------------

	   System.out.println("******** FOR MATCHING *******");
	   
       int x[]=new int[6];

	   MyArray m2 = new MyArray();

	   m2.SetArray();
	   m2.SetArray(x);

	   //----------------------------

	   //Ismaching

	   boolean m3 = m2.isMatching(x);
	
	   System.out.println(" IsMatching? : "+m3);

	   //--------------------------------------------------------

		System.out.println("******** FOR SEARCHING *******");
	    MyArray m4 = new MyArray();

		m4.SetArray();

	    System.out.println("\n Enter The Number You Want To Search:");
		int num=sc.nextInt();

		int m5=m4.search(num);
		System.out.println("Number "+num+" Found At "+m5+" Position");

		//---------------------------------------------------------------------

		System.out.println("******** FOR SORTED ARRAY *******");

		m4.showSorted();

    }
}
*/
//================================================================================================================

//QUE 3
/*
Write a program to implement all the methods in a class given below. 
class MyString 
{ 
 private String str; 
 1.public void setString(String s){…} 
 2.public String getString(){….} 
 3.public int getLength(){} 
 4.public boolean is matching(String a){….} 
 5.public String toUcaseString(){…..} 
 6.public String toLcaseString(){…..} 
} 
*/

//------------------------------------------------------------------------------------
/*
import java.util.*;
import java.util.Scanner;
class MyString 
{
	private String str;

	public void SetString(String s)
	{
		str=s;
	}

	//---------------------------------

	public String GetString()
	{
		return str;
	} 

	//---------------------------------

	public int getLength()
	{
		char ch[]=str.toCharArray();
		return ch.length;
	} 

	//----------------------------------


	public boolean ismatching(String a)
	{
		char ch1[]=str.toCharArray();
		char ch2[]=a.toCharArray();

		boolean flag =true;

		if(ch1.length!=ch2.length)
		{
			flag=false;
		}
		else
		{
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					flag=false;
					//break;
				}
			}
		}

		return flag;
	} 
}

class PracticeProblemsJava 
{
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		

		MyString s=new  MyString();
		s.SetString("hello How Are you");

		System.out.println("Length of String:"+s.getLength());

		//----------------------------------------

		System.out.println("\n Enter the String to compare: ");
		String t=sc.nextLine();

		boolean ans=s.ismatching(t);

		if(ans)
			System.out.println("String Match");
		else
			System.out.println("String Not Match");
	}
}

*/
//====================================================================
/*
class Demo
{
	final static int a=10;

	public void showValue()
	{
		
		//a=20;
		System.out.println("Value Of a = "+a);
		
	}

	
}

class PracticeProblemsJava 
{
    public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);

		Demo d = new Demo();
		d.showValue();
		//Demo.showValue();
	}
}
*/
//==================================
/*
class Demo{
	private int a;
	public Demo()
	{
		//a=10;
		this(23);
	}
	public Demo(int b)
	{
		System.out.println(" b "+b);
	}
    public void method1() {
        System.out.println("Method1");
    }

    public void method2() {
        this.method1(); // Calls method1 of this object
    }
}
class PracticeProblemsJava
{
	public static void main(String[] args) {
       Demo example = new Demo();
	   example.method2(); // Output: Method1
   }

}
*/
//=================================================================================

class PracticeProblemsJava {
    int x;

    public PracticeProblemsJava(int x) {
        this.x = x;
    }

    public void display() {
        System.out.println("x: " + x);
    }

    public void callDisplay(PracticeProblemsJava obj) {
        obj.display();
    }

    public void test() {
        this.callDisplay(this); // Passes the current instance as an argument
    }

    public static void main(String[] args) {
        PracticeProblemsJava example = new PracticeProblemsJava(5);
        example.test(); // Output: x: 5
    }
}


 