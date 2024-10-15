import java.util.Scanner;
class FillForm
{
	private int Id;
	private int age;
	private double Sp;
	private String name;
	private double Hp;
	private double Gp;

	public void input()
	{
		Scanner sc=new Scanner(System.in);

		
		System.out.println("Enter Name:");
		name=sc.nextLine();

		System.out.println("Enter Your ID:");
		Id=sc.nextInt();

		System.out.println("Enter Age:");
		age=sc.nextInt();

		if(age<21 || age >29)
		{
			throw new NumberFormatException("Age Is not Within The Window:");
		}
		System.out.println("Enter SSC Per:");
		Sp=sc.nextDouble();

		System.out.println("Enter HSC Per:");
		Hp=sc.nextDouble();

		System.out.println("Enter The Gp:");
		Gp=sc.nextDouble();
	}
	public void Output()
	{
		System.out.println("Student ID:"+Id);
		System.out.println("Student Name:"+name);
		System.out.println("Student age:"+age);
		System.out.println("Sp per:"+Sp+"\tHp Per:"+Hp+"\tGp Per:"+Gp);
	}
}



class ManullyGenExceptionHandle
{
	public static void main(String[] args) 
	{
		FillForm f=new FillForm();
		try
		{
			f.input();
		}
		catch (Exception e)
		{
			System.out.println("Error Due To : "+e.getMessage());
		}
		
		f.Output();
		System.out.println("End Of Program:");
	}
}
