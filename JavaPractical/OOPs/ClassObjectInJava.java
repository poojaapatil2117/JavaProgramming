/*
import java.util.Scanner;
class Employee
{
	private int Eid;
	private double Esalary;

	public void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Employee Id:");
		Eid=sc.nextInt();

		System.out.println("Enter The Employee Salary:");
		Esalary=sc.nextDouble();
	}
	public void out()
	{
		System.out.println("\n E-Id = "+Eid+"\tE-Salary = "+Esalary);
	}
}

class ClassObjectInJava 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.in();
		e.out();
	}
}
*/

//==========================================================================
// WAP to input and display the data of two students
/*
import java.util.Scanner;
class Student
{
	private int StuId;
	private double per;

	public void in()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Student Id:");
		StuId=sc.nextInt();

		System.out.println("Enter The Student Per:");
		per=sc.nextDouble();
	}
	public void out()
	{
		System.out.println("\n Student Id = "+StuId+"\tStudent Per = "+per);
	}
}

class ClassObjectInJava 
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.in();
		s.out();

		Student s1=new Student();
		s1.in();
		s1.out();
	}
}
*/
//=======================================================================================================

// Or can be passed from the main()
/*
import java.util.Scanner;
class Student
{
	private int StuId;
	private double per;

	public void in(int Id,double p)
	{
		StuId=Id;
		per=p;
	}
	public void out()
	{
		System.out.println("\n StudentId = "+StuId+"\t StudentPer = "+per);
	}
}

class ClassObjectInJava 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		Student s=new Student();
		s.in(1,89.76);
		s.out();

		Student s1=new Student();
		s1.in(2,99.67);
		s1.out();

		//------------------------------------

		System.out.println("Enter Student Id:");
		int Sid=sc.nextInt();

		System.out.println("Enter student Per:");
		double Perc=sc.nextDouble();

		Student s2=new Student();
		s2.in(Sid,Perc);
		s2.out();
	}
}

*/

//=========================================================================================

// Both can be combined together as
/*
import java.util.Scanner;
class Student
{
	private int StuId;
	private double per;

	public void in()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Student Id:");
		StuId=sc.nextInt();

		System.out.println("Enter student Per:");
		per=sc.nextDouble();

	}
	public void in(int Id,double p)
	{
		StuId=Id;
		per=p;
	}
	public void out()
	{
		System.out.println("\n StudentId = "+StuId+"\t StudentPer = "+per);
	}
}

class ClassObjectInJava 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);


		Student s3=new Student();
		s3.in();
		s3.out();

		Student s=new Student();
		s.in(2,89.76);
		s.out();

		Student s1=new Student();
		s1.in(3,99.67);
		s1.out();

		//------------------------------------
		

		System.out.println("Enter Student Id:");
		int Sid=sc.nextInt();

		System.out.println("Enter student Per:");
		double Perc=sc.nextDouble();

		Student s2=new Student();
		s2.in(Sid,Perc);
		s2.out();
	}
}
*/
//==================================================================================

// Write a program to display the details of elder student (refer above program)
/*
import java.util.Scanner;
class Student
{
	private int StuId;
	private double per;
	private int age;

	public void in()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Student Id:");
		StuId=sc.nextInt();

		System.out.println("Enter student Per:");
		per=sc.nextDouble();

		System.out.println("Enter student Age:");
		age=sc.nextInt();

	}
	public void in(int Id,double p,int a)
	{
		StuId=Id;
		per=p;
		age=a;
	}
	public void out()
	{
		System.out.println("\n StudentId = "+StuId+"\t StudentPer = "+per+"\t StudentAge = "+age);
	}
	public int getage()
	{
		return age;
	}
}

class ClassObjectInJava 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);


		Student s3=new Student();
		s3.in();
		s3.out();

		Student s=new Student();
		s.in(2,89.76,21);
		s.out();
		s.getage();

		Student s1=new Student();
		s1.in(3,99.67,38);
		s1.out();
		s1.getage();

		//------------------------------------
		

		System.out.println("Enter Student Id:");
		int Sid=sc.nextInt();

		System.out.println("Enter student Per:");
		double Perc=sc.nextDouble();

		System.out.println("Enter student Age:");
		int ageS=sc.nextInt();

		Student s2=new Student();
		s2.in(Sid,Perc,ageS);
		s2.out();

		//------------------------------------------

		System.out.println("The Details Of Elder Student:");
		if(s.getage()>s1.getage())
			s.out();
		else
			s1.out();

	}
}
*/
//========================================================================================================

// Array as Objects
/*
import java.util.Scanner;
class Student
{
	private int StuId;
	private double per;
	private int age;

	public void in(int Id,double p,int a)
	{
		StuId=Id;
		per=p;
		age=a;
	}
	public void out()
	{
		System.out.println("\n StudentId = "+StuId+"\t StudentPer = "+per+"\t StudentAge = "+age);
	}
	public int getage()
	{
		return age;
	}
}

class ClassObjectInJava 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		Student []s=new Student[3];

		for(int i=0;i<3;i++)
		{
			System.out.println("\n Enter The All Details For Student "+(i+1)+":");
			s[i]=new Student();

			System.out.println("Enter Student Id:");
			int Id=sc.nextInt();

			System.out.println("Enter student Per:");
			double p=sc.nextDouble();

			System.out.println("Enter student Age:");
			int ageS=sc.nextInt();

			s[i].in(Id,p,ageS);
		}

		//------------------------------------------

		System.out.println("Student Details List:");
		for(int i=0;i<3;i++)
		{
			s[i].out();
		}

	}
}

*/

//================================================================================
/*
// WAP to create the array of Item objects and find the total bill.

import java.util.Scanner;
class Item
{
	private int id;
	iprivate double ipr;
	private double tot;

	public void in()
	{
		Scanner  sc = new Scanner(System.in);

		System.out.println("Enter Your Id:");
		id=sc.nextInt();

		System.out.println("Enter Your Price:");
		ipr=sc.nextDouble();

	}

	public void out()
	{
		System.out.println("\n ItemId = "+id+"\t ItemPrice = "+ipr);
	}

	public double GetTot()
	{
		return ipr;
	}

}

class ClassObjectInJava 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		Item []iItem = new Item[3];

		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Detail For "+(i+1)+" Item");
			iItem[i] = new Item();
			iItem[i].in();
		}

		//------------------------------------------

		System.out.println("Student Details List:");
		for(int i=0;i<3;i++)
		{
			iItem[i].out();
		}

		//---------------------------------------------

		double tot=0.0;

		System.out.println("The Total Of Item Is:");
		for(int i=0;i<3;i++)
		{
			tot=tot+iItem[i].GetTot();
		}

		System.out.println("The Total = "+tot);

	}
}

*/
//=================================================================================================================

// Using static keyword:
/*

import java.util.Scanner;
class Item
{
	private int id;
	private double ipr;
	private static double tot=100.0;

	public void in()
	{
		Scanner  sc = new Scanner(System.in);

		System.out.println("Enter Your Id:");
		id=sc.nextInt();

		System.out.println("Enter Your Price:");
		ipr=sc.nextDouble();

		tot=tot+ipr;

	}

	public void out()
	{
		System.out.println("\n ItemId = "+id+"\t ItemPrice = "+ipr);
	}

	public void ShowTot()
	{
		System.out.println("\n Total = "+tot);
	}

}

class ClassObjectInJava 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		Item []iItem = new Item[3];

		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Detail For "+(i+1)+" Item");
			iItem[i] = new Item();
			iItem[i].in();
		}

		//------------------------------------------

		System.out.println("Student Details List:");
		for(int i=0;i<3;i++)
		{
			iItem[i].out();
		}

		//---------------------------------------------

		iItem[0].ShowTot();
		//or iItem[1].ShowTot();
		//or iItem[2].ShowTot();
	}
}

*/
//=========================================================================================================

// Create class Item, and WAP to input and display the list of items together with total bill. #Static Block

/*
import java.util.Scanner;
class Item
{
	private int id;
	private double ipr;
	private static double tot;

	public void in()
	{
		Scanner  sc = new Scanner(System.in);

		System.out.println("Enter Your Id:");
		id=sc.nextInt();

		System.out.println("Enter Your Price:");
		ipr=sc.nextDouble();

		tot=tot+ipr;

	}
	static
	{
		tot=100.0;
	}
	public void out()
	{
		System.out.println("\n ItemId = "+id+"\t ItemPrice = "+ipr);
	}

	public static void ShowTot()
	{
		System.out.println("\n Total = "+tot);
	}

}

class ClassObjectInJava 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		Item []iItem = new Item[3];

		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Detail For "+(i+1)+" Item");
			iItem[i] = new Item();
			iItem[i].in();
		}

		//------------------------------------------

		System.out.println("Student Details List:");
		for(int i=0;i<3;i++)
		{
			iItem[i].out();
		}

		//---------------------------------------------

		 Item.ShowTot(); 
	}
}

*/
//==============================================================================================

import java.util.Scanner;
class Student
{
	private int id;
	private double per;

	public void in(int sid,double p)
	{
		id=sid;
		per=p;
	}

	public void out()
	{
		System.out.println("\n StudentId = "+id+"\t StudentPer = "+per);
	}
	double GetPer()
	{
		return per;
	}
}

class ClassObjectInJava 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("\nEnter Your Student Count:");
		int cnt=sc.nextInt();

		Student []s = new Student[cnt];

		for(int i=0;i<s.length;i++)
		{
			System.out.println("\nEnter Detail For "+(i+1)+" Student:");
			s[i] = new Student();
			
			System.out.println("\nENter Student ID:");
			int id = sc.nextInt();

			System.out.println("Enter Student Percentage:");
			double p=sc.nextDouble();

			s[i].in(id,p);
		}

		//------------------------------------------

		System.out.println("\nStudent Details List:");
		for(int i=0;i<s.length;i++)
		{
			s[i].out();
		}

		//---------------------------------------------

		double tper=0.0;
		int tpos=-1;

		for(int i=0;i<s.length;i++)
		{
			if(s[i].GetPer()>tper)
			{
				tper=s[i].GetPer();
				tpos=i;
			}
		}

		System.out.println("\nToppers Details Are:");
		s[tpos].out();
	}
}
