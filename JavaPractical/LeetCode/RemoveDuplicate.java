import java.util.Scanner;

class RemoveDuplicate 
{
	public static int RemoveDupi(int nums[])
	{
		int temp[]=new int[nums.length];
		int j=0;

		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]!=nums[i+1])
			{
				System.out.println("j is "+j);
				temp[j++]=nums[i];
				System.out.println("j is "+j);
			}
		}

		temp[j++]=nums[nums.length-1];

		//Changing the original array

		for(int i=0;i<j;i++)
		{
			nums[i]=temp[i];
		}

		return j;
	}


	public static void main(String[] args) 
	{
		int cnt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Count Of Array Elements");
		cnt = sc.nextInt();

		int nums[]=new int[cnt];

		System.out.println("Lenth of Number"+nums.length);

		System.out.println("Enter The Array Elements:");
		for(int i=0;i<cnt;i++)
		{
			nums[i]=sc.nextInt();
		}

		int lenght=nums.length;

		lenght=RemoveDupi(nums);
		for(int i=0;i<lenght;i++)
		{
			System.out.println(nums[i]+" ");
		}
	}


}
