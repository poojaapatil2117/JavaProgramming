/*//=====================================================================================================
import java.util.Scanner;
import java.util.*;

class AgeException extends Exception
{
	private String msg;

	public AgeException()
	{
		super("Age Issue");
	}
	public AgeException(String message)
	{
		super(message);
		msg=message;
	}
	public String toString()
	{
		return " As Per Application Deamand The Issue Of An error Due to "+msg;
	}

}

class FillForm
{
	private int id;
	private String nm;
	private int age;
	private double per;

	public void input() throws AgeException
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Student Name:");
		nm=sc.nextLine();

		System.out.println("Enter Student Id:");
		id=sc.nextInt();

		System.out.println("Enter Student age:");
		age=sc.nextInt();

		if(age<21)
		{
			throw new AgeException("Age is To less For Apply Job :");
			
		}
		else if(age > 29)
		{
			throw new AgeException("Age is More For Apply this Job :");
		}

		System.out.println("Enter The Student Per:");
		per=sc.nextDouble();
	}

	public void display()
	{
		System.out.println("Stu Name:"+nm);
		System.out.println("Stu Id :"+id+"\tStu Age: "+age+"\tPer: "+per);
	}
}
class UserDefinedException 
{
	public static void main(String[] args) 
	{

		FillForm f = new FillForm();
		try
		{
			f.input();
		}
		catch (Exception e)
		{
			//System.out.println("------------------------------------------------------------");
			//System.out.println("1. Problem Due to: "+e.getMessage());
			System.out.println("------------------------------------------------------------");
			System.out.println("2. Exception info - "+e);
			System.out.println("------------------------------------------------------------");
			System.out.println("3. Exception info - ");
			e.printStackTrace();
			System.out.println("------------------------------------------------------------");
		}
		
		f.display();

		System.out.println("End Of Program:");
	}
}

*/

//==================================================================================================================

// Some practic exampes of userdefined exceptions
/*
Example 1: In this example, we have created a custom exception class NegativeBalanceException, 
which extends Exception, as well as a class BankAccount, which includes a withdrawal method. 
If the balance is less than the amount withdrawn, an instance of NegativeBalanceException with an error message 
is thrown. The exception is then caught and the error message is printed in the main method.


import java.util.Scanner;

class NegativeBalanceException extends Exception
{
	public NegativeBalanceException(String message)
	{
		super(message);
	}
}

class BankAccount
{
	private double balance;
	public BankAccount(double balance)
	{
		this.balance=balance;
	}

	public double getBalance()
	{
		return balance;
	}

	public void Withdraw(double amount)throws NegativeBalanceException
	{
		if (balance-amount<0)
		{
			throw new NegativeBalanceException("Insufficient Funds To WithDraw:"+amount+" rs");
		}
		else
		{
			balance-=amount;
		}
	}
}

class UserDefinedException 
{
	public static void main(String[] args) 
	{
		BankAccount b=new BankAccount(300);

		try
		{
			b.Withdraw(200);
		}
		catch (NegativeBalanceException e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println("Remaining Balance:"+b.getBalance());
	}
}
*/
//===========================================================================================================

// Example 2: User Defined exception in java for Validating Login Credentials
/*

class LogInException extends Exception
{
	public LogInException(String message)
	{
		super(message);
	}
}
class LogIn
{
	private String UName;
	private String Password;

	public LogIn(String UName,String Password) throws LogInException
	{

		if(UName == null || UName.isEmpty())
		{
			throw new LogInException("Username is NULL Or Empty:");
		}
		if(Password == null || Password.isEmpty())
		{
			throw new LogInException("Password Is Null Or Empty:");
		}

		this.UName=UName;
		this.Password=Password;
	}

	public boolean Isvalid()
	{
		return true;
	}
}
class UserDefinedException 
{
	public static void main(String[] args) 
	{
		BankAccount b=new BankAccount(300);

		try
		{
			LogIn login=new LogIn("","123");
		}
		catch (LogInException e)
		{
			System.out.println(e.getMessage());
		}

		//------------------------------------------------

		try
		{
			LogIn login=new LogIn("wehfioh","");
		}
		catch (LogInException e)
		{
			System.out.println(e.getMessage());
		}

		//------------------------------------------------

		try
		{
			LogIn login=new LogIn("oiejfkk","123");
			if(login.Isvalid())
			{
				System.out.println("Login Succ:");
			}
			else
			{
				System.out.println("Login UnSucc:");
			}
		}
		catch (LogInException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

*/
//=========================================================================================
/*// Example 3: User Defined exception in java for Validity of an Entity

class InvaildEntityException extends Exception
{
	public InvaildEntityException(String message)
	{
		super(message);
	}
}
class EntityEx
{
	private int age;
	private String name;

	public EntityEx(int age , String name) throws InvaildEntityException
	{
		if(name==null || name.isEmpty())
		{
			throw new InvaildEntityException("name Is empty Or Null");
		}
		if(age<0)
		{
			throw new InvaildEntityException("age Can not Be Negative:");
		}
		this.age=age;
		this.name=name;
	}

	public String GetName()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}

}
class UserDefinedException 
{
	public static void main(String[] args) 
	{
		try
		{
			EntityEx e=new EntityEx(-30,"docjo");
		}
		catch (InvaildEntityException e)
		{
			System.out.println(e.getMessage());
		}
		//-----------------------------
		try
		{
			EntityEx e=new EntityEx(30,"");
		}
		catch (InvaildEntityException e)
		{
			System.out.println(e.getMessage());
		}
		//-------------------------------------------\
		try
		{
			EntityEx e=new EntityEx(30,"docjo");
			System.out.println("Name:"+e.GetName());
			System.out.println("Name:"+e.getage());

		}
		catch (InvaildEntityException e)
		{
			System.out.println(e.getMessage());
		}

	}
	
}
*/
//=================================================================================================\\

// Example 4: User Defined exception in java for Validating the age of user

class InvalidAgeException extends Exception 
{
    	public InvalidAgeException(String message) 
	{
        	super(message);
    	}
}

class User 
{
    	private int age;
    	public User(int age) throws InvalidAgeException 
	{
       		if (age < 0) 
		{
            		throw new InvalidAgeException("Age cannot be negative.");
        	}

        	if (age > 150) 
		{
            		throw new InvalidAgeException("Age is too high.");
        	}
	        this.age = age;
   	}
}

class UserDefinedException 
{
	public static void main(String[] args) 
	{
        try 
		{
          	User user = new User(-1);
        } 
		catch (InvalidAgeException ex) 
		{
           	System.out.println(ex.getMessage());
        }

        	try 
		{
            		User user = new User(151);
        	} 
		catch (InvalidAgeException ex) 
		{
            		System.out.println(ex.getMessage());
        	}

        	try 
		{
            		User user = new User(30);
            		System.out.println("Age is valid.");
        	} 
		catch (InvalidAgeException ex) 
		{
            		System.out.println(ex.getMessage());
        	}
    	}
}


