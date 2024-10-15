/* 
//Using ForEach()
// Define a custom iterable class

import java.util.Iterator;
class MyIterator implements Iterable<String>
{
	String data[];
	public MyIterator(String data[])
	{
		this.data=data;
	}
	public Iterator<String> iterator()
	{
		return new Iterator<String> () {

			private int index=0;

			
			public boolean hasNext()
			{
				return index<data.length;	
			}

			
			public String next()
			{
				if(!hasNext())
				{
					throw new java.util.NoSuchElementException();
				}
				return data[index ++];
			}
		};
	}
}

class IterableInterface 
{
	public static void main(String[] args) 
	{
		String x[] = {"hello","Good Morning","Have A Nice Day"};

		//Using For
		System.out.println("----------Using For-----------");
		for (int i=0; i<3;i++ )
		{
			System.out.println(""+x[i]);
		}

		//Using For Each
		
		System.out.println("\n--------Using For Each-----------");
		MyIterator ob = new MyIterator(x);
		for(String item : ob)
		{
			System.out.println(item);
		}
	}
}


//==============================================================================================

//Using Iterator in List
// Creating our own iterable class

import java.util.Iterator;
class Demo implements Iterable<String>
{
	String data[];
	public Demo(String data[])
	{
		this.data=data;
	}
	public Iterator<String> iterator()
	{
		return new Iterator<String> () {

			private int index=0;

			
			public boolean hasNext()
			{
				return index<data.length;	
			}

			
			public String next()
			{
				if(!hasNext())
				{
					throw new java.util.NoSuchElementException();
				}
				return data[index ++];
			}
		};
	}
}

class IterableInterface 
{
	public static void main(String[] args) 
	{
		String x[] = {"hello","Good Morning","Have A Nice Day"};

		//Using For
		System.out.println("----------Using For-----------");
		for (int i=0; i<3;i++ )
		{
			System.out.println(""+x[i]);
		}

		//Using For Each
		
		System.out.println("\n--------Using For Each-----------");
		Demo ob = new Demo(x);
		for(String item : ob)
		{
			System.out.println(item);
		}
		
		System.out.println("\n--------Using Iterater-----------");
		Iterator<String> ob1 = ob.iterator();
		while(ob1.hasNext())
		{
			System.out.println(ob1.next());
		}

	}
}
*/
//========================================================================================================

