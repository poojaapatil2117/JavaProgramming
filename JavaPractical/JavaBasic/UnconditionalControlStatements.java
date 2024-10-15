///using the continue
/*
class UnconditionalControlStatements
{
	public static void main(String args[])
	{

		for(int i=0;i<10;i++)
		{
			System.out.print(" -");
			for(int j=0;j<10;j++)
			{
				if(j>i)
				{
					continue;
				}
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}

//===================================================================================================

// Using Labelled Continue: 

class UnconditionalControlStatements
{
	public static void main(String args[])
	{

		outer:for(int i=0;i<10;i++)
		{
			System.out.print(" -");
			for(int j=0;j<10;j++)
			{
				if(i>5)
				{
					continue outer;
				}
				if(j>i)
				{
					continue;
				}
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
	}
}

//===================================================================================================
// Using the break ans labelled break

class UnconditionalControlStatements
{
	public static void main(String args[])
	{

		for(int i=0;i<10;i++)
		{
			System.out.print(" -");
			for(int j=0;j<10;j++)
			{
				if(j>i)
				{
					break;
				}
				System.out.print(""+j);
			}
			System.out.println();
		}
	}
}

*/
//==================================================================================================
///Using Labbled Break:

class UnconditionalControlStatements
{
	public static void main(String args[])
	{

		outer:for(int i=0;i<10;i++)
		{
			System.out.print(" -");
			for(int j=0;j<10;j++)
			{
				if(i>5)
				{
					break outer;
				}
				if(j>i)
				{
					break;
				}
				System.out.print(""+j);
			}
			System.out.println();
		}
		
		
	}
}

output:

C:\Users\USER\Documents\JAVAFSD24>java UnconditionalControlStatements
 -0
 -01
 -012
 -0123
 -01234
 -012345
 -
