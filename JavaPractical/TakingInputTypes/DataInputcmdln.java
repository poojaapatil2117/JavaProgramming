/*
class DataInputcmdln
{
	public static void main(String args[])
	{
		String s1="_";
		String s2="_";

		s1=args[0];
		s2=args[1];
		
		System.out.println("S1="+s1);
		System.out.println("S2="+s2);
	}
}

C:\Users\USER\Documents\JAVAFSD24>java DataInputcmdln
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at DataInputcmdln.main(DataInputcmdln.java:8)

how to deal with this error
//=================================================================================================

class DataInputcmdln
{
	public static void main(String args[])
	{
		String s1="_";
		String s2="_";

		try
		{	
			s1=args[0];
			s2=args[1];
		}
		catch(Exception e){}
		
		System.out.println("S1="+s1);
		System.out.println("S2="+s2);
	}
}


C:\Users\USER\Documents\JAVAFSD24>javac DataInputcmdln.java

C:\Users\USER\Documents\JAVAFSD24>java DataInputcmdln hello all
S1=hello
S2=all

C:\Users\USER\Documents\JAVAFSD24>java DataInputcmdln hello
S1=hello
S2=_

C:\Users\USER\Documents\JAVAFSD24>java DataInputcmdln
S1=_
S2=_

C:\Users\USER\Documents\JAVAFSD24>
//===========================================================================================================
We know the input is in form of strings and is is true even when we try to pass numeric 
values coz they are automatically converted into strings, then how to input the numeric values



class DataInputcmdln
{
	public static void main(String args[])
	{
		int x=args[0];
		double d=args[1];
		
		System.out.println("x="+x);
		System.out.println("d="+d);
	}
}

C:\Users\USER\Documents\JAVAFSD24>javac DataInputcmdln.java
DataInputcmdln.java:69: error: incompatible types: String cannot be converted to int
                int x=args[0];
                          ^
DataInputcmdln.java:70: error: incompatible types: String cannot be converted to double
                double d=args[1];
                             ^
2 errors

then how to convert string to int

//====================================================================================


class DataInputcmdln
{
	public static void main(String args[])
	{
		int x=Integer.parseInt(args[0]);
		double y=Double.parseDouble(args[1]);

		System.out.println("X="+x);
		System.out.println("Y="+y);
		System.out.println("SUM="+(x+y));
	}
}


C:\Users\USER\Documents\JAVAFSD24>javac DataInputcmdln.java

C:\Users\USER\Documents\JAVAFSD24>java DataInputcmdln 11 22
X=11
Y=22.0
SUM=33.0

C:\Users\USER\Documents\JAVAFSD24>


//==========================================================

///Using Try Catch

class DataInputcmdln
{
	public static void main(String args[])
	{
		int y=10; 
		double d=11.486;

		try
		{	
			 y=Integer.parseInt(args[0]);
			d=Double.parseDouble(args[1]);
		}
		catch(Exception e){}

		System.out.println("X="+y);
		System.out.println("Y="+d);
		System.out.println("SUM="+(y+d));
	}
}
*/
//============================================================================================================








