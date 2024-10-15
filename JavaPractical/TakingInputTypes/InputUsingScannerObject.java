import java.util.Scanner;
class InputUsingScannerObject
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		String str="";
		int x=0;
		double y=0.0;
		char ch='$';

		System.out.println("Enter Your String:");
		str=sc.nextLine();

		System.out.println("Enter Any Int Value:");
		x=sc.nextInt();

		System.out.println("Enter Your Double Value:");
		y=sc.nextDouble();

		System.out.println("Enter Your Character Value:");
		ch=sc.next().charAt(0);

		System.out.println("The value of String:"+str);
		System.out.println("The Value Of Int Value:"+x);
		System.out.println("The Value Of Double Value:"+y);
		System.out.println("The Value Of Char :"+ch);
	}
}