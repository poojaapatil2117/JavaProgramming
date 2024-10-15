// WAP to display *
/*
class Pattern
{
	public static void main(String args[])
	{
		System.out.println("*");
	}
}

//================================================================
///WAP to print *****

class Pattern
{
	public static void main(String args[])
	{
		for(int i=0;i<5;i++)
		{
			System.out.print("*");
		}
	}
}

ouput:
C:\Users\USER\Documents\JAVAFSD24>javac Pattern.java

C:\Users\USER\Documents\JAVAFSD24>java Pattern
*****

//=============================================================================
WAP to print 
	*****
	*****
	*****
	*****
	*****

class Pattern
{
	public static void main(String args[])
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{	
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//=======================================================================================

WAP to print 
     
	* * * * *  
	*         *  
	*         *  
	*         *  
	* * * * *  

class Pattern
{
	public static void main(String args[])
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{	
				if(i==0 || i==4 || j==0 || j==4)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

//============================================================================================================

WAP to print 
	* 
	** 
	*** 
	**** 
	*****


class Pattern
{
	public static void main(String args[])
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();	
		}
		
	}
}

//=======================================================================================

WAP to print 
	*****
	**** 
	*** 
	** 
	* 

class Pattern
{
	public static void main(String args[])
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j<=(4-i))
				{
					System.out.print(" *");
				}
			}
			System.out.println();	
		}
	}
}
//========================================================================================================

     	        *
	       ***
	      *****
	     *******
	    *********
                    *********** 

class Pattern
{
	public static void main(String args[])
	{
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(j>=(5-i))
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(int k=6;k<11;k++)
			{
				if(k<=(5+i) && i>=1)
				{
					System.out.print(" *");
				}
			}
			System.out.println();	
		}
	}
}

//===================================================================================================

      1
    222
   33333
  4444444
 555555555
66666666666

class Pattern
{
	public static void main(String args[])
	{
		for(int i=0;i<6;i++)
		{
			int num1=i+1;
			int num2=i+1;
			for(int j=0;j<6;j++)
			{
				if(j>=(5-i))
				{
					System.out.print(num1);
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(int k=6;k<11;k++)
			{
				if(k<=(5+i) && i>=1)
				{
					System.out.print(num2);
				}
			}
			System.out.println();	
		}
	}
}

//==========================================================================================================


      A
    ABC
   ABCDE
  ABCDEFG
 ABCDEFGHI
ABCDEFGHIJK


class Pattern
{
	public static void main(String args[])
	{
		for(int i=0;i<6;i++)
		{
			char num1='A';

			for(int j=0;j<6+i;j++)
			{
				if(j>=(5-i))
				{
					System.out.print(num1);
					num1++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();	
		}
	}
}

//=============================================================================================================

     A
    BCD
   CDEFG
  DEFGHIJ
 EFGHIJKLM
FGHIJKLMNOP
*/

class Pattern
{
	public static void main(String args[])
	{
		char a='A';
		//num1='A';
		char n=a;
		for(int i=0;i<6;i++)
		{
			a=n;

			for(int j=0;j<6+i;j++)
			{
				if(j>=(5-i))
				{
					System.out.print(""+a);
					a++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			n++;
			
			System.out.println();	
		}
	}
}