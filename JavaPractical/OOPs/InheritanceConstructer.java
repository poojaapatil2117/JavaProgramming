/// Using the constructors and initiliser blocks in inheritance
/*
class A
{
	{
		System.out.println("Init Block A:");
	}
	A()
	{
		System.out.println("Costructer Block A:");
	}
}
class B extends A
{
	{
		System.out.println("Init Block B:");
	}
	B()
	{
		System.out.println("Costructer Block B:");
	}
}
class C extends B
{
	{
		System.out.println("Init Block C:");
	}
	C()
	{
		System.out.println("Costructer Block C:");
	}
}


class InheritanceConstructer 
{
	public static void main(String[] args) 
	{
		C ob = new C();
	}
}
*/
//=============================================================================

//assigning values using init block and constructor
/*
class A
{
	private int a1;
	private int a2;
	{
		a1=10;
		System.out.println("Init Block A:");
	}
	A()
	{
		a2=22;
		System.out.println("Costructer Block A:");
	}
	public void ShowA()
	{
		System.out.println(" a1 = "+a1+" a2 = "+a2);
	}
}
class B extends A
{
	private int b1;
	private int b2;
	{
		b1=44;
		System.out.println("Init Block B:");
	}
	B()
	{
		b2=66;
		System.out.println("Costructer Block B:");
	}
	public void ShowB()
	{
		ShowA();
		System.out.println(" b1 = "+b1+" b2 = "+b2);
	}
}
class C extends B
{
	private int c1;
	private int c2;
	{
		c1=34;
		System.out.println("Init Block C:");
	}
	C()
	{
		c2=88;
		System.out.println("Costructer Block C:");
	}
	public void ShowC()
	{
		ShowB();
		System.out.println(" c1 = "+c1+" c2 = "+c2);
	}
}


class InheritanceConstructer 
{
	public static void main(String[] args) 
	{
		C ob = new C();
		ob.ShowC();
	}
}
*/
//========================================================================

// Defining parameterized constructors in above program

class A
{
	private int a1;
	private int a2;
	{
		a1=10;
		System.out.println("Init Block A:");
	}
	A()
	{
		a2=22;
		System.out.println("Costructer Block A:");
	}
	A(int p1)
	{
		a2=p1;
		System.out.println("Para Constructer A:");
	}
	public void ShowA()
	{
		System.out.println(" a1 = "+a1+" a2 = "+a2);
	}
}
class B extends A
{
	private int b1;
	private int b2;
	{
		b1=44;
		System.out.println("Init Block B:");
	}
	B()
	{
		b2=66;
		System.out.println("Costructer Block B:");
	}
	B(int p1,int p2)
	{
		super(p1);
		b2=p2;
		System.out.println("Para Constructer B:");
	}
	public void ShowB()
	{
		ShowA();
		System.out.println(" b1 = "+b1+" b2 = "+b2);
	}
}
class C extends B
{
	private int c1;
	private int c2;
	{
		c1=34;
		System.out.println("Init Block C:");
	}
	C()
	{
		c2=88;
		System.out.println("Costructer Block C:");
	}
	C(int p,int p1,int p2)
	{
		super(p1,p2);
		c2=p2;
		System.out.println("Para Constructer c:");
	}
	public void ShowC()
	{
		ShowB();
		System.out.println(" c1 = "+c1+" c2 = "+c2);
	}
}


class InheritanceConstructer 
{
	public static void main(String[] args) 
	{
		C ob = new C();
		ob.ShowC();

		C ob1=new C(111,222,333);
		ob1.ShowC();
	}
}