//Using Add
/*
import java.util.Vector;
class VectorInCollection
{
	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		System.out.println("Size of V1 = "+v1.size()+"\tCapacity Of V1 = "+v1.capacity());
		v1.add(10);
		v1.add("Hello");
		v1.add(20.14);
		System.out.println("Size of V1 = "+v1.size()+"\tCapacity Of V1 = "+v1.capacity());
		System.out.println("-----------------------------------------------------------------");

		Vector v2 = new Vector(3);
		System.out.println("Size of V2 = "+v2.size()+"\tCapacity Of V2 = "+v2.capacity());
		v2.add(10);
		v2.add("Hello");
		v2.add(20.18);
		Short s = new Short((short)12);
		v2.add(s);
		System.out.println("Size of V2 = "+v2.size()+"\tCapacity Of V2 = "+v2.capacity());
		v2.add(300);
		v2.add("hii");
		v2.add(2345.47);
		System.out.println("Size of V2 = "+v2.size()+"\tCapacity Of V2 = "+v2.capacity());
		v2.add("hii");
		v2.add(2345.47);
		v2.add("hii");
		v2.add(2345.47);
		v2.add("hii");
		v2.add(2345.47);
		System.out.println("Size of V2 = "+v2.size()+"\tCapacity Of V2 = "+v2.capacity());
		System.out.println("-----------------------------------------------------------------");

		Vector v3 = new Vector(3,2);
		v3.add(300);
		v3.add("hii");
		v3.add(2345.47);
		v3.add(s);
		System.out.println("Size of V2 = "+v3.size()+"\tCapacity Of V2 = "+v3.capacity());
		v3.add(2345.47);
		v3.add(s);
		v3.add(2345.47);
		v3.add(s);	
		v3.add(s);
		v3.add(2345.47);
		v3.add(s);
		v3.add(s);
		System.out.println("Size of V2 = "+v3.size()+"\tCapacity Of V2 = "+v3.capacity());

	}
}


//--------------------------------------------------------------------------------------------------

// Using addElement(), clear() and isEmpty():

import java.util.Vector;
class VectorInCollection
{
	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		System.out.println("Size of V1 = "+v1.size()+"\tCapacity Of V1 = "+v1.capacity());
		System.out.println("v1 isEmpty() : "+v1.isEmpty());
		v1.addElement(10);
		System.out.println("Size of V1 = "+v1.size()+"\tCapacity Of V1 = "+v1.capacity());
		System.out.println("v1 isEmpty() : "+v1.isEmpty());
		v1.clear();
		System.out.println("v1 isEmpty() : "+v1.isEmpty());
	}
}



//--------------------------------------------------------------------------------------------------

// Using contains(), elementAt() and elements()


import java.util.Vector;
import java.util.Enumeration;
class VectorInCollection
{
	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		System.out.println("Size of V1 = "+v1.size()+"\tCapacity Of V1 = "+v1.capacity());
		v1.add(2345.47);
		v1.add("Hello");
		v1.add(15);
		Short s = new Short((short)12);
		v1.add(21);
		v1.add("Bye");
		v1.add(s);	
		v1.add("Good Morning");
		v1.add(27);
		v1.add("Hii");
		v1.add("java");
		v1.add(21.171);
		
		System.out.println("Size of V1 = "+v1.size()+"\tCapacity Of V1 = "+v1.capacity());
		System.out.println("V1 Containd('java') : "+v1.contains("java"));
		System.out.println("V1 Containd(45) : "+v1.contains(45));
		System.out.println("V1 elementAt(4) : "+v1.elementAt(4));

		//----------------------------------------------------------

		System.out.println("\nDisplaying All Elements In V1 : ");
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(" "+v1.elementAt(i));
		}

		//--------------------------------------------------

		System.out.println("\nDisplaying All Elements In V1 Using Enumeration: ");
		Enumeration  e = v1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

		//---------------------------------------------

		System.out.println("\nDisplaying All Elements In V1 Using For Each(): ");

		for(Object ob : v1)
		{
			System.out.println(ob);
		}
	}
}


//================================================================================================
// Using same additional methods: 

import java.util.Vector;
import java.util.Arrays;
import java.util.Iterator;
class VectorInCollection
{
	public static void main(String[] args) 
	{
		Vector<String> v1 = new Vector<>();
		v1.add("Hello");
		v1.insertElementAt("hii",0);

		Object s[]=v1.toArray();

		System.out.println("Array V1 Elements Are:");
		System.out.println(Arrays.toString(s));
		v1.addElement("Java");
		v1.add(1,"C++");

		Object arr[] = v1.toArray();
		System.out.println("\nArray V1 Elements Are Using Another Method:");
		for (int i=0;i<arr.length;i++ )
		{
			System.out.println(v1.get(i));
		}

		v1.set(1,"Android");
		v1.remove(2);
		System.out.println("\nArray V1 Elements Are Using Another Method:");

		System.out.println(Arrays.toString(v1.toArray()));
		System.out.println();
		System.out.println("v1.firstElement() "+v1.firstElement());
		System.out.println("v1.lastElement() "+v1.lastElement());
		

		System.out.println("\nArray V1 Elements Are Using iterator:");
		Iterator<String> itr = v1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("Size of V1 = "+v1.size()+"\tCapacity Of V1 = "+v1.capacity());
		
	}
}


---------------------------------------------STACK---------------------------------------
*/
import java.util.Vector;
import java.util.Scanner;
import java.util.Stack;
class VectorInCollection
{
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack();
		System.out.println("Stack Size() = "+stack.size()+"\tStack Size() = "+stack.capacity());

		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("======MENU===========");
			System.out.println("1.push \t2.pop \t3.Stop");
			System.out.println("Enter Your Option:");
			int opt = sc.nextInt();

			switch(opt)
			{
				case 1:
					try
					{
						System.out.println("Enter The Int Value :");
						stack.push(sc.nextInt());
					}
					catch (Exception e)
					{
						System.out.println("Enter Only Int Value :");
					}
					break;

				case 2:
					if(!stack.empty())
					{
						System.out.println("pop() Element :"+stack.pop());
					}
					else
					{
						System.out.println("Stack Is Empty ");
					}
					break;
				case 3:
					System.exit(0);
			}
		}
	}
}