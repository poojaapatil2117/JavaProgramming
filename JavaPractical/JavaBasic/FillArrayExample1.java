///Create public Class i.e FillArray  And Used It As A Library Or Package In this Program:

import java.util.Scanner;
class FillArrayExample1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;

		System.out.println("Enter Your Count");
		int cnt=sc.nextInt();

		int x[]=new int[cnt];


		System.out.println("for Fill 1");
		FillArray.FillArray(x,1);
		FillArray.Display(x);

		System.out.println();

		System.out.println("for Fill 5");
		FillArray.FillArray(x,5,2,3);
		FillArray.Display(x);

		System.out.println();
	}
}

