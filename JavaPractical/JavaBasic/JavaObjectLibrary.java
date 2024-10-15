/*
class  JavaObjectLibrary
{
	public static void main(String[] args) 
	{
		Object ob = new Object();
		System.out.println(" "+ob);
		System.out.println(ob.toString());
	}
}

//=========================================

class OverrideToStringMethod
{
	String info;
}
class JavaObjectLibrary
{
	public static void main(String[] args)
	{
		OverrideToStringMethod ob = new OverrideToStringMethod();
		System.out.println(ob);
		
	}
}

//======================================================================

class MyClass
{
	String info;
	public String toString()
	{
		return "Printing Object Info:";
	}
}

class JavaObjectLibrary
{
	public static void main(String[] args)
	{
		MyClass ob = new MyClass();
		System.out.println(ob);	
	}
}

//=========================================================
//Using Thread:
class MyThread extends Thread
{
	Thread t;
	public MyThread()
	{
		super("Thread - 0");
		t=this;
	}
	String info;

	public String toString()
	{
		t=Thread.currentThread();
		info="["+t.getName()+","+t.getPriority()+","+t.getThreadGroup()+"]";
		return info;
	}
}

class JavaObjectLibrary
{
	public static void main(String[] args)
	{
		MyThread ob = new MyThread();
		System.out.println(" Object Info"+ob);	
	}
}


//===============================================================================

//Using Exception

class MyException extends Exception
{
	String exp_info;
	public MyException(String t)
	{
		exp_info=t;
	}
	public String toSring()
	{
		return exp_info;
	}
}

class JavaObjectLibrary
{
	public static void main(String[] args)
	{
		MyException ob = new MyException("Exception Info:");
		System.out.println(" Object Info"+ob);	
	}
}

*/
//======================================================================================

//Using Clone And Equals


class MyCloneAndEquals implements Cloneable
{
	int data;
	public MyCloneAndEquals()
	{
		data=100;
	}
	public void setData(int data)
	{
		this.data=data;
	}
	public int GetData()
	{
		return data;
	}
	public Object getClone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}


class JavaObjectLibrary
{
	public static void main(String[] args)
	{
		try
		{
			MyCloneAndEquals ob = new MyCloneAndEquals();
			MyCloneAndEquals ob1 =(MyCloneAndEquals) ob.getClone();

			System.out.println("Value of Ob = "+ob.GetData());
			System.out.println("Value of Ob1 = "+ob1.GetData());

			System.out.println("Ob Equals(Ob1) = "+ob.equals(ob1));


			MyCloneAndEquals ob2=ob;
			System.out.println("ob.equals(ob2) = "+ob.equals(ob2));

			ob2.setData(1500);
			System.out.println("Value of Ob = "+ob.GetData());
			System.out.println("Value of Ob2 = "+ob2.GetData());

			System.out.println("Hashcode Of Ob:"+ob);
			System.out.println("Hashcode Of Ob1:"+ob1);
			System.out.println("Hashcode Of Ob2:"+ob2);
		}
		catch (Exception e)
		{
		}
	}
}