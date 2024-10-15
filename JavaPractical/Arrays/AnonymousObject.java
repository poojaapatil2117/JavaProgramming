///AnonymousObject 
/*
class Demo
{
	public void showInfo()
	{
		System.out.println(" Welcome To Java Programming");
	}
}
class AnonymousObject 
{
	public static void main(String[] args) 
	{
			new Demo().showInfo();
	}
}


//=============================================

///Defining Main Method In Class

class AnonymousObject 
{
	private int x;
	private float y;

	public static void main(String[] args) 
	{
			AnonymousObject ob = new AnonymousObject();
			ob.x=10;
			ob.y=11.23F;
			System.out.println("x = "+ob.x+"\t y = "+ob.y);
	} 
}

//==================================================================

// Java allows you to init the fields(instance variables) directly.

class AnonymousObject 
{
	 int x=11;
	 float y=21.17F;

	public static void main(String[] args) 
	{
			AnonymousObject ob = new AnonymousObject();
			System.out.println("x = "+ob.x+"\t y = "+ob.y);
	} 
}

//======================================================================

// Defining Another method with Main Class


class AnonymousObject 
{
	public vod NewMethod()
	{
		System.out.println("Hello Good Morning To all Of You:");
	}

	public static void main(String[] args) 
	{
			System.out.println("x = "+ob.x+"\t y = "+ob.y);
	} 
}


 now I want to Access NewMethod Ther ARe Teo Option
	1.Declare it as Static :
	2.Create The Object of This Class:


//-------------------------------------------

//1.Declare it as Static :

class AnonymousObject 
{
	public static void NewMethod()
	{
		System.out.println("Hello Good Morning To all Of You:");
	}

	public static void main(String[] args) 
	{
			AnonymousObject.NewMethod();
	} 
}

//---------------------------------------------

//2.Create The Object of This Class:

class AnonymousObject 
{
	public static void NewMethod()
	{
		System.out.println("Hello Good Morning To all Of You:");
	}

	public static void main(String[] args) 
	{
			AnonymousObject ob = new AnonymousObject();
			ob.NewMethod();
	} 
}

*/
//====================================================================================