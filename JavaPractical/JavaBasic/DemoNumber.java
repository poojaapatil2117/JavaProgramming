
import java.util.Scanner;
/*
class Number
{
	private int no;

	public void SetNumber(int no)
	{
		this.no=no;
	}

	public int getNumber()
	{
		return no;
	}

	public int GetRevese()
	{
		int t=no,rev=0;
		while(t!=0)
		{
			rev=(rev*10)+(t%10);
			t=t/10;
		}
		return rev;
	}

	public boolean isPalindrome()
	{
		if(GetRevese()==no)
			return true;
		else
			return false;
	}

}

class DemoNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Number:");
		int num=sc.nextInt();

		Number n1 = new Number();
		n1.SetNumber(num);

		System.out.println("The original numer is:"+n1.getNumber());
		System.out.println("Reverse numer is:"+n1.GetRevese());

		boolean palin = n1.isPalindrome();
		if(palin)
			System.out.println("The numer is Palindrom");
		else
			System.out.println("The numer is Not Palindrom");


	}
}
*/
//==============================================================================================================

// Same program using static

class Number
{
	public static int GetRevese(int t)
	{
		int rev=0;
		while(t!=0)
		{
			rev=(rev*10)+(t%10);
			t=t/10;
		}
		return rev;
	}

	public static boolean isPalindrome(int no)
	{
		if(GetRevese(no)==no)
			return true;
		else
			return false;
	}

}

class DemoNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Number:");
		int num=sc.nextInt();

		int t=Number.GetRevese(num);

		System.out.println("Entered numer is:"+ num);
		System.out.println("Reverse numer is:"+ t);

		
		if(Number.isPalindrome(num))
			System.out.println("The numer is Palindrom");
		else
			System.out.println("The numer is Not Palindrom");
	}
}