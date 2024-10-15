//ArrayList:
/*

1 Rotate Array in Java
You may have been using Java for a while. Do you think a simple Java aray question can be a challenge? Let's use the following problem to test.
Problem: Rotate an aray of n elements to the right yb k steps. For example, with n = 7 and k = 3 the array [1,2,3,4,5,6,7] si rotated ot [5,6,7,1,2,3,4].
How many different ways do you know to solve this problem?


import java.util.Scanner;
class ArrayListOne
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int n[]=new int[7];
		int y[]=new int[7];
		int k=3;
	
		System.out.println("Enter Your Array Elements:");
		for(int i=0;i<7;i++)
		{
			n[i]=sc.nextInt();
		}

		System.out.println("Original  Array Elements:");
		for(int i=0;i<7;i++)
		{
			System.out.print("  "+n[i]);
		}
		
		//process
		int j=0;
		for(int i=0;i<7;i++)
		{
			if(i>k)
			{
				y[j]=n[i];
				j++;
			}
		}
		for(int i=0;i<7;i++)
		{
			if(i<=k)
			{
				y[j]=n[i];
				j++;
			}
		}

		System.out.println("after Rotating  Array Elements:");
		for(int i=0;i<7;i++)
		{
			System.out.print("  "+y[i]);
		}		
	}
}


output:
C:\Users\USER\Documents\JAVAFSD24>javac ArrayListOne.java

C:\Users\USER\Documents\JAVAFSD24>java ArrayListOne
Enter Your Array Elements:
1
2
3
4
5
6
7
Original  Array Elements:
  1  2  3  4  5  6  7after Rotating  Array Elements:
  5  6  7  1  2  3  4
C:\Users\USER\Documents\JAVAFSD24>


//=======================================================================================================

///3  Longest Palindromic Substring in Java

import java.util.Scanner;
class ArrayListOne
{
	public static void main(String args[])
	{
		int Maxlength=0;
		String Maxstring=" ";
		Scanner sc= new Scanner (System.in);
	
		String str[]=new String[5];

		System.out.println("\nEnter Your Strings:");
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.nextLine();
		}
		
		System.out.println("\nYour Strings Are");
		for(int i=0;i<str.length;i++)	
		{
			System.out.println("  "+str[i]);
		}

		for(int i=0;i<str.length;i++)	
		{
			if(Maxlength < str[i].length())
			{
				Maxlength=str[i].length();
				 Maxstring=str[i];
			}
		}
		
		System.out.println("\nThe Lenth of ith elements is :"+Maxlength);
		System.out.println("\nAnd MaxString Is "+Maxstring);

	}
}



output:
C:\Users\USER\Documents\JAVAFSD24>javac ArrayListOne.java

C:\Users\USER\Documents\JAVAFSD24>java ArrayListOne

Enter Your Strings:
racecar
madam
rar
aba
abba

Your Strings Are
  racecar
  madam
  rar
  aba
  abba

The Lenth of ith elements is :7

And MaxString Is racecar

C:\Users\USER\Documents\JAVAFSD24>


=================================================
///Using Count:


import java.util.Scanner;
class ArrayListOne
{
	public static void main(String args[])
	{
		int Maxlength=0;
		String Maxstring=" ";
		Scanner sc= new Scanner (System.in);
	
		System.out.println("Enter Your Count");
		int cnt=sc.nextInt();
		String str[]=new String[cnt];
		sc.nextLine();
		System.out.println("\nEnter Your Strings:");
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.nextLine();
		}
		
		System.out.println("\nYour Strings Are");
		for(int i=0;i<str.length;i++)	
		{
			System.out.println("  "+str[i]);
		}

		for(int i=0;i<str.length;i++)	
		{
			if(Maxlength < str[i].length())
			{
				Maxlength=str[i].length();
				 Maxstring=str[i];
			}
		}
		
		System.out.println("\nThe Lenth of ith elements is :"+Maxlength);
		System.out.println("\nAnd MaxString Is "+Maxstring);

	}
}



//===================================================================================================

//4 Find a peak element which is not smaller than its neighbours

import java.util.Scanner;
class ArrayListOne
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Count:");
		int cnt=sc.nextInt();
	
		int x[]=new int[cnt];

		System.out.println("Enter Your"+cnt+"Elements");
		for(int i=0;i<cnt;i++)
		{
			x[i]=sc.nextInt();
		}
		
		//process

		for(int i=0;i<cnt;i++)
		{
			System.out.println("The Peak Elements are:");
			if(i>=1 && i<cnt-1)
			{
				if(x[i] > x[i+1]  &&  x[i] > x[i-1])
				{
					System.out.println("  "+x[i]);	
				}
			}
		}
	}
}


//======================================================================================================

5. K’th Smallest/Largest Element in Unsorted Array
Given an array arr[] of size N and a number K, where K is smaller than the size of the array. Find the K’th smallest element in the given array. Given that all array elements are distinct.

Examples:  

Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4 
Output: 10 



import java.util.Scanner;
class ArrayListOne
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Count:");
		int cnt=sc.nextInt();
	
		int x[]=new int[cnt];


		System.out.println("Enter Your "+cnt+" Elements");
		for(int i=0;i<cnt;i++)
		{
			x[i]=sc.nextInt();
		}

		System.out.println("Before Sorted Array:");
		for(int i=0;i<cnt;i++)
		{
			System.out.print("  "+x[i]);
		}

		//process
		for(int i=0;i<cnt;i++)
		{
			for(int j=0;j<cnt-1;j++)
			{
				if(x[i]<x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}

		System.out.println("\nAfter Sorting Array:");
		for(int i=0;i<cnt;i++)
		{
			System.out.print("  "+x[i]);
		}

		System.out.println("\nEnter Your K Position Which max Elements You Want:");
		int k=sc.nextInt();
		for(int i=0;i<cnt;i++)
		{
			if(i==k)
			{
				System.out.println("\nThe Max Element At "+k+" Pos is "+x[i]);
			}
		}
	}
}


output:

C:\Users\USER\Documents\JAVAFSD24>javac ArrayListOne.java

C:\Users\USER\Documents\JAVAFSD24>java ArrayListOne
Enter your Count:
6
Enter Your 6 Elements
8
45
90
1
2
34
Before Sorted Array:
  8  45  90  1  2  34
After Sorting Array:
  1  2  8  34  45  90
Enter Your K Position Which max Elements You Want:
4

The Max Element At 4 Pos is 45

C:\Users\USER\Documents\JAVAFSD24>

//==========================================================================================================

6.Sort an array of 0s, 1s and 2s | Dutch National Flag problem
Given an array A[] consisting of only 0s, 1s, and 2s. The task is to write a function that sorts the given array. The functions should put all 0s first, then all 1s and all 2s in last.


Given N balls of colour red, white or blue arranged in a line in random order. You have to arrange all the balls such that the balls with the same colours are adjacent with the order of the balls, with the order of the colours being red, white and blue (i.e., all red coloured balls come first then the white coloured balls and then the blue coloured balls). 

Examples:

Input: {0, 1, 2, 0, 1, 2}
Output: {0, 0, 1, 1, 2, 2}

Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}



import java.util.Scanner;
class ArrayListOne
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Count:");
		int cnt=sc.nextInt();
	
		int x[]=new int[cnt];

		System.out.println("Enter Your "+cnt+" Elements");
		for(int i=0;i<cnt;i++)
		{
			x[i]=sc.nextInt();
		}

		System.out.println("\nArray Elemets are:");
		for(int i=0;i<cnt;i++)
		{
			System.out.print("  "+x[i]);
		}

		//process
		System.out.println("\nAfter Elemets are:\n");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<cnt;j++)
			{
				if(i==x[j])
				{
					System.out.print("  "+x[j]);	
				}
			}
		}

	}
}


output:

C:\Users\USER\Documents\JAVAFSD24>javac ArrayListOne.java

C:\Users\USER\Documents\JAVAFSD24>java ArrayListOne
Enter your Count:
7
Enter Your 7 Elements
1
0
2
2
0
0
1

Array Elemets are:
  1  0  2  2  0  0  1
After Elemets are:

  0  0  0  1  1  2  2
C:\Users\USER\Documents\JAVAFSD24>


//====================================================================================================

7.  Find common elements in three sorted arrays

Given three Sorted arrays in non-decreasing order, print all common elements in these arrays.

Examples: 

Input: 
ar1[] = {1, 5, 10, 20, 40, 80} 
ar2[] = {6, 7, 20, 80, 100} 
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
Output: 20, 80

Input: 
ar1[] = {1, 5, 5} 
ar2[] = {3, 4, 5, 5, 10} 
ar3[] = {5, 5, 10, 20} 
Output: 5, 5

*/

import java.util.Scanner;
class ArrayListOne
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Count for array:");
		int cnt=sc.nextInt();

		int x[]=new int[cnt];
		int y[]=new int[cnt];
		int z[]=new int [cnt];
		

		System.out.println("Enter Your "+cnt+" Elements For 1st Array:");
		for(int i=0;i<cnt;i++)
		{
			x[i]=sc.nextInt();
		}

		System.out.println("Enter Your "+cnt+" Elements 2nd array");
		for(int i=0;i<cnt;i++)
		{
			y[i]=sc.nextInt();
		}

		System.out.println("Enter Your "+cnt+" Elements 3rd array");
		for(int i=0;i<cnt;i++)
		{
			z[i]=sc.nextInt();
		}

		//Sorting The array

		for(int i=0;i<cnt;i++)
		{
			for(int j=0;j<cnt;j++)
			{
				if(x[i]<x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}

			for(int k=0;k<cnt;k++)
			{
				if(y[i]<y[k])
				{
					int temp=y[i];
					y[i]=y[k];
					y[k]=temp;
				}
			}

			for(int l=0;l<cnt;l++)
			{
				if(z[i]<z[l])
				{
					int temp=z[i];
					z[i]=z[l];
					z[l]=temp;
				}
			}
		}

		System.out.println("\nafter sorting array X:\n");
		for(int i=0;i<cnt;i++)
		{
			System.out.print("  "+x[i]);
		}

		System.out.println("\nafter sorting array Y:\n");
		for(int i=0;i<cnt;i++)
		{
			System.out.print("  "+y[i]);
		}

		System.out.println("\nafter sorting array Z:\n");
		for(int i=0;i<cnt;i++)
		{
			System.out.print("  "+z[i]);
		}

		//process

		System.out.println("\n");
		for(int i=0;i<cnt;i++)
		{
			outer:for(int j=i;j<cnt;j++)
			{
				for(int k=0;k<cnt;k++)
				{
					if(x[i]==y[j] && x[i]==z[k] && y[j]==z[k])
					{
						System.out.print("   "+x[i]);
						break outer;
					}
				}
			}
		}
		System.out.println();

	}
}

/*
ouput:

C:\Users\USER\Documents\JAVAFSD24>java ArrayListOne
Enter your Count for array:
7
Enter Your 7 Elements For 1st Array:
1
2
3
45
17
21
6
Enter Your 7 Elements 2nd array
11
22
45
33
66
21
17
Enter Your 7 Elements 3rd array
45
11
21
222
17
1
2
   45   17   21
C:\Users\USER\Documents\JAVAFSD24>

//=============================================================================================================

8.
Find the first repeating element in an array of integers
Given an array of integers arr[], The task is to find the index of first repeating element in it i.e. the element that occurs more than once and whose index of the first occurrence is the smallest. 

Examples: 

Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
Output: 5 
Explanation: 5 is the first element that repeats

Input: arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}
Output: 6 
Explanation: 6 is the first element that repeats


import java.util.Scanner;
class ArrayListOne
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Count for array:");
		int cnt=sc.nextInt();

		int x[]=new int[cnt];
		int y[]=new int[cnt];
		int z[]=new int [cnt];
		

		System.out.println("Enter Your "+cnt+" Elements For 1st Array:");
		for(int i=0;i<cnt;i++)
		{
			x[i]=sc.nextInt();
		}

		//Sorting The array

		//process

		System.out.println("\n");
		outer:for(int i=0;i<cnt;i++)
		{
			for(int j=i+1;j<cnt;j++)
			{
				if(x[i]==x[j])
				{
					System.out.print("  "+x[i]);
					break outer;
				}	
			}
			
		}

	}
}

output:

C:\Users\USER\Documents\JAVAFSD24>java ArrayListOne
Enter your Count for array:
9
Enter Your 9 Elements For 1st Array:
6
10
5
4
9
20
4
6
10

  6


//======================================================================================================================

9.Find first non-repeating element in a given Array of integers
Given an array of integers of size N, the task is to find the first non-repeating element in this array. 

Examples:

Input: {-1, 2, -1, 3, 0}
Output: 2
Explanation: The first number that does not repeat is : 2

Input: {9, 4, 9, 6, 7, 4}
Output: 6


import java.util.Scanner;
class ArrayListOne
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int cnt1=0;
		System.out.println("Enter your Count for array:");
		int cnt=sc.nextInt();

		int x[]=new int[cnt];
		int num=0,flag=0;

		System.out.println("Enter Your Elements:");
		for(int i=0;i<cnt;i++)
		{
			x[i]=sc.nextInt();
		}
		
		//process

		System.out.println("\n");
		outer:for(int i=0;i<cnt;i++)
		{
			cnt1=0;
			for(int j=0;j<cnt;j++)
			{
				if(x[i]==x[j])
				{
					cnt1++;
				}	
			}
			if(cnt1==1)
			{
				System.out.println("  "+x[i]);
				break outer;
			}
		}
	}
}

ouput:

C:\Users\USER\Documents\JAVAFSD24>javac ArrayListOne.java

C:\Users\USER\Documents\JAVAFSD24>java ArrayListOne
Enter your Count for array:
6
Enter Your Elements:
9
4
9
6
7
4


  6

C:\Users\USER\Documents\JAVAFSD24>java ArrayListOne
Enter your Count for array:
5
Enter Your Elements:
-1
2
-1
3
0


  2


//======================================================================================================

import java.util.Scanner;
class ArrayListOne
{
	public static void main(String args[])
	{
		
		Scanner sc= new Scanner (System.in);

		String str[]=new String[5];
		String temp[]=new String[5];

		System.out.println("\nEnter Your Strings:");
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.nextLine();
		}
		
		System.out.println("\nYour Strings Are");
		for(int i=0;i<str.length;i++)	
		{
			System.out.println("  "+str[i]);
		}

		//process:
		
		int top=-1;
		int i=0;
		int ans=0;

		while(i<5)
		{
			top++;
			temp[top]=str[i];

			if(str[i]== "+"  || str[i] == "-" || str[i] == "*" || str[i] == "/" )
			{
				 ans=Integer.parseInt(str[i-1])+operator(str[i])+Integer.parseInt(str[i-2]);
			}
			i++;
		}
		System.out.println("The ans = "+ans);
		
	}
}

//=================================================================


import java.util.Scanner;
class ArrayListOne
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int cnt1=0;
		System.out.println("Enter your Count for array:");
		int cnt=sc.nextInt();

		int x[]=new int[cnt];
		
		System.out.println("Enter Your Elements:");
		for(int i=0;i<cnt;i++)
		{
			x[i]=sc.nextInt();
		}
		
		//process

		System.out.println("\n");
		for(int i=0;i<cnt;i++)
		{
			cnt1=0;
			for(int j=0;j<cnt;j++)
			{
				if(x[i]==x[j])
				{
					cnt1++;
				}	
			}
			if(cnt1==1)
			{
				System.out.println("  "+x[i]);
				break ;
			}
		}
	}
}
*/
//=====================================================================
/*
import java.util.Scanner;
class ArrayListOne
{
	public static void main(String args[])
	{
		
		Scanner sc= new Scanner (System.in);

		String str[]=new String[5];
		String temp[]=new String[5];

		System.out.println("\nEnter Your Strings:");
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.nextLine();
		}
		
		System.out.println("\nYour Strings Are");
		for(int i=0;i<str.length;i++)	
		{
			System.out.println("  "+str[i]);
		}

		//process:
		
		int top=-1;
		int i=0;
		int ans=0;

		while(i<5)
		{
			top++;
			temp[top]=str[i];

			if(str[i]== "+"  || str[i] == "-" || str[i] == "*" || str[i] == "/" )
			{
				 ans=Integer.parseInt(str[i-1])+Operator(str[i])+Integer.parseInt(str[i-2]);
			}
			i++;
		}
		System.out.println("The ans = "+ans);
		
	}
}
*/
