
import java.util.Scanner;
class  MaxSumContiguousSubarray1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);

		int sum=0,comsum=0,max=0;

		System.out.println("\nEnter The Count Of Array Elements");

		int cnt = sc.nextInt();
		int arr[]=new int[cnt];

		System.out.println("Enter the Array Elements");
		for(int i=0;i<cnt;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++)
		{
			sum=0;
			for(int j=i;j<arr.length;j++)
			{
				sum = sum + arr[j];

				if(sum > max)
				{
					max = sum;
				}
			}
		}
		System.out.println("Max Is "+max);
	}
}