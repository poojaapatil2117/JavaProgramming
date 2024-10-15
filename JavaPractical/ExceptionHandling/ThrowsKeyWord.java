/*
import java.util.*;
class NumberDemoforException
{
	private int x;
	private int y;

	public void setx(int x)
	{
		this.x=x;
	}
	public void sety(int y)
	{
		this.y=y;
	}
	public int GetDiv()
	{
		return (x/y);
	}
}


class ThrowsKeyWord 
{
	public static void main(String[] args) 
	{
		NumberDemoforException ob = new NumberDemoforException();
		ob.setx(10);
		ob.sety(5);

		System.out.println("The Value Of Division:"+ob.GetDiv());
	}
}
*/
//===========================================================================================
//Divide By Zero
/*
import java.util.*;
import java.io.IOException;
class NumberDemoforException
{
	private int x;
	private int y;

	public void setx(int x)
	{
		this.x=x;
	}
	public void sety(int y)
	{
		this.y=y;
	}
	public int GetDiv() throws ArithmeticException,IOException
	{
		return (x/y);
	}
}


class ThrowsKeyWord 
{
	public static void main(String[] args) 
	{
		NumberDemoforException ob = new NumberDemoforException();
		ob.setx(10);

		//ob.sety(0); //It will Show an Exception:
		ob.sety(5);

		try
		{
			System.out.println("The Value Of Division:"+ob.GetDiv());
		}
		catch (Exception e)
		{
		}
		
	}
}
*/
//=======================================================================================
import java.util.*;
import java.io.IOException;
class NumberDemoforException
{
	private int x;
	private int y;

	public void setx(int x)
	{
		this.x=x;
	}
	public void sety(int y)
	{
		this.y=y;
	}
	public int GetDiv() throws ArithmeticException,IOException
	{
		return (x/y);
	}
}


class ThrowsKeyWord 
{
	public static void main(String[] args) throws IOException
	{
		NumberDemoforException ob = new NumberDemoforException();
		ob.setx(10);

		//ob.sety(0); //It will Show an Exception:
		ob.sety(5);

		
		System.out.println("The Value Of Division:"+ob.GetDiv());

	}
}






