import java.util.Scanner;
class Plus 
{

	public static int[] plusOne(int[] digit)
	{
		String result ="";
		int resultfinal;
		for(int i=0;i<digit.length;i++)
		{
			result=result+digit[i];
			System.out.println("Result ="+result);
		}

		resultfinal=Integer.parseInt(result)+1;
		int NNresult=resultfinal;

		System.out.println("resultfinal ="+resultfinal); //to cheack result is correct or not

		int cnt=0,rem;

		for(int i=0;resultfinal!=0;i++)
		{
			rem=resultfinal%10;
			cnt++;
			resultfinal=resultfinal/10;
		}
		
		System.out.println("Count is "+cnt);
		int cnt1=cnt;
		int temp[]=new int[cnt];

		for(int i=cnt-1;i>=0;i--)
		{
			resultfinal=NNresult;
			while(resultfinal!=0)
			{
				temp[i--]=resultfinal%10;
				resultfinal=resultfinal/10;
			}
		}

		System.out.println("Array Elements Are");
		for(int i=0;i<cnt;i++)
		{
			System.out.println(" "+temp[i]);
		}

		return temp;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int cnt;
		System.out.println("\nEnter The Count");
		cnt=sc.nextInt();

		int nums[]=new int[cnt];

		System.out.println("\nEnter The Array Elements");
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=sc.nextInt();
		}

		plusOne(nums);
	}
}
