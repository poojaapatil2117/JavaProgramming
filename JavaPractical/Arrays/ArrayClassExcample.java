/*

import java.util.Arrays;
class ArrayClassExcample 
{
	public static void main(String[] args) 
	{
		int x[]={11,2,3,45,25,6,7,8};
		System.out.println("Array Elements Are :"+Arrays.toString(x));

		//Sorting:
		Arrays.sort(x);
		System.out.println("Array After Sorting :"+Arrays.toString(x));

		//Using Specific Range:

		int y[]={21,2,23,45,6,7,28,9,10};

		Arrays.sort(y,2,7);
		System.out.println("Array in Range :"+Arrays.toString(y));

		//Using Searching:

		System.out.println("Array After Sorting :"+Arrays.toString(x));
		int key=28;
		int pos=Arrays.binarySearch(x,key);
		System.out.println("Position is "+pos);

		//Fill:

		Arrays.fill(x,1);
		System.out.println("Array After Fill With 1 :"+Arrays.toString(x));

		//using range:

		Arrays.fill(x,2,6,222);
		System.out.println("Array After Fill With 1 In Range :"+Arrays.toString(x));

		//copy:

		int z[]=Arrays.copyOf(x,12);
		System.out.println("After Copy Z-Array :"+Arrays.toString(z));

		int t[]=Arrays.copyOf(y,5);
		System.out.println("After Copy t-Array :"+Arrays.toString(t));

		int t1[]=Arrays.copyOfRange(y,2,5);
		System.out.println("After Copy t1-Array :"+Arrays.toString(t1));

		int t2[]=Arrays.copyOf(y,y.length);
		System.out.println("After Copy t2-Array :"+Arrays.toString(t2));

		//Using Equals:

		boolean b = Arrays.equals(x,y);
		System.out.println("x equals y :"+b);

		boolean b1 = Arrays.equals(t2,y);
		System.out.println("t2 Equals y :"+b1);

	}
}

*/
//==============================================================================================

//Shallow Copy And DeepCopy
import java.util.Arrays;
class Sample
{
	private int num;
	public Sample()
	{
		num=1;
	}
	public Sample(int num)
	{
		this.num=num;
	}
	public void set(int num)
	{
		this.num=num;
	}
	public void Show()
	{
		System.out.println("num = "+num);
	}
}

class ArrayClassExcample 
{
	public static void main(String[] args) 
	{
		//shallowCopies

		Sample ob1= new Sample();
		Sample ob2=ob1;
		ob1.set(1000);
		ob2.Show();
		System.out.println("is-Equal ? ob1.equals(ob2) = "+ob1.equals(ob2));
		System.out.println("------------------------------------------");

		//DeepCopies

		Sample s1 = new Sample(100);
		Sample s2 = new Sample(100);
		s1.set(2000);
		s1.Show();
		s2.Show();
		System.out.println("is-Equal ? s1.equals(s2) = "+s1.equals(s2));
		System.out.println("------------------------------------------");

		//LazyCopy

		int x[]={11,22,33,44,55};
		int y[]={11,22,33,44,55};

		System.out.println("Array Of X "+Arrays.toString(x));
		System.out.println("Array Of Y "+Arrays.toString(y));


		System.out.println("is-Equals ? Before Changing Value for Any one Of Them i.e x Or Y = "+Arrays.equals(x,y));
		
		System.out.println();

		y[2]=100;
		System.out.println("Array Of X "+Arrays.toString(x));
		System.out.println("Array Of Y "+Arrays.toString(y));

		System.out.println("is-Equals ? After Changing Value for Any one Of Them i.e x Or Y = "+Arrays.equals(x,y));


	}
}

