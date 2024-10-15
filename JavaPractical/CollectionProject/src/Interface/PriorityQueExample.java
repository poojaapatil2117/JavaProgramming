package Interface;

import java.util.*;

//------------------------------------

//1.Using PriorityQueue<>() 

/*
public class PriorityQueExample {
	public static void main(String args[])
	{
		Queue<Integer> prq = new PriorityQueue<>();
		
		prq.add(4);
		prq.add(3);
		prq.add(12);
		prq.add(45);
		prq.add(24);
		prq.add(11);
		prq.add(2);
		prq.add(18);
		prq.add(1);
		
		System.out.println("Original Queue Ele : "+prq);
		prq.remove(45);
		System.out.println("After Remove Queue Ele : "+prq);
	}
}

//===========================================================================

public class PriorityQueExample {

	public static void main(String args[])
	{
		Queue<Integer> prq = new PriorityQueue<>(Comparator.reverseOrder());
		
		prq.add(4);
		prq.add(3);
		prq.add(12);
		prq.add(45);
		prq.add(24);
		prq.add(11);
		prq.add(2);
		//prq.add(18);
		//prq.add(1);
		
		System.out.println("Original Queue Ele : "+prq);
		//prq.remove(45);
		System.out.println("After Remove Queue Ele : "+prq);
	}
}


//=========================================================================================

//Creating PriorityQueue using ArrayList

public class PriorityQueExample {

	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1,2,3,4,5));
		
		System.out.println("ArrayList : "+list);
		System.out.println("-------------------------------------------");
		
		PriorityQueue<Integer>  prq  = new PriorityQueue<>(list);
		System.out.println("PriorityQueue List :"+prq);
		System.out.println("-------------------------------------------");
	}
}


//============================================================================

// Creating PriorityQueue from another PriorityQueue 

public class PriorityQueExample {

	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1,2,3,4,5));
		
		System.out.println("ArrayList : "+list);
		System.out.println("-------------------------------------------");
		
		PriorityQueue<Integer>  prq  = new PriorityQueue<>(list);
		System.out.println("PriorityQueue List :"+prq);
		prq.remove(4);
		System.out.println("PriorityQueue List After remove():"+prq);
		System.out.println("-------------------------------------------");
		
		PriorityQueue<Integer> prq1 = new PriorityQueue<>(prq);
		System.out.println("PriorityQueue List :" +prq1);
		System.out.println("-------------------------------------------");
	}
}

//==================================================================================

// Using custom comparator to create the priority queue

class Person implements Comparable<Person>
{
	private String nm;
	private int age;
	public Person(String nm,int age)
	{
		this.nm=nm;
		this.age=age;
	}
	public int compareTo(Person other) {
		
		return Integer.compare(this.age, other.age);
	}
	public String toString()
	{
		return nm +"("+age+")";
	}
}

public class PriorityQueExample {

	public static void main(String args[])
	{
		  // PriorityQueue with custom objects (min-heap based on age)
		
		PriorityQueue<Person> prq = new PriorityQueue<>();
		prq.add(new Person("Rohit",37));
		prq.add(new Person("Virat",35));
		prq.add(new Person("Yashasvi",25));
		
        System.out.println("Polling elements from Person Queue:");
        while(!prq.isEmpty())
        {
        	System.out.println(prq.poll());
        }
    }  
}


//=======================================================================================

// the custom comparator can be defined to perform same operation as shown


class Person implements Comparable<Person>
{
	String nm;
	int age;
	public Person(String nm,int age)
	{
		this.nm=nm;
		this.age=age;
	}
	public int compareTo(Person other) {
		
		return Integer.compare(this.age, other.age);
	}
	public String toString()
	{
		return nm +"("+age+")";
	}
}

public class PriorityQueExample {

	public static void main(String args[])
	{	
		Comparator<Person> agecompartor = new Comparator<Person>() {

		
			public int compare(Person p1, Person p2) {
				return Integer.compare(p1.age,p2.age);
			}
	};
		  // PriorityQueue with custom objects (min-heap based on age)
		
		PriorityQueue<Person> prq = new PriorityQueue<>(agecompartor);
		prq.add(new Person("Rohit",37));
		prq.add(new Person("Virat",35));
		prq.add(new Person("Yashasvi",25));
		
        System.out.println("Polling elements from Person Queue:");
        while(!prq.isEmpty())
        {
        	System.out.println(prq.poll());
        }
    }  
}

*/

//==========================================================================================

//Using lambda expression 

class Person implements Comparable<Person>
{
	String nm;
	int age;
	public Person(String nm,int age)
	{
		this.nm=nm;
		this.age=age;
	}
	public int compareTo(Person other) {
		
		return Integer.compare(this.age, other.age);
	}
	public String toString()
	{
		return nm +"("+age+")";
	}
}

public class PriorityQueExample {

	public static void main(String args[])
	{	
		Comparator<Person> agecompartor = (p1,p2) -> Integer.compare(p1.age,p2.age);

		  // PriorityQueue with custom objects (min-heap based on age)
		PriorityQueue<Person> prq = new PriorityQueue<>(agecompartor);
		prq.add(new Person("Rohit",37));
		prq.add(new Person("Virat",35));
		prq.add(new Person("Yashasvi",25));
		
        System.out.println("Polling elements from Person Queue:");
        while(!prq.isEmpty())
        {
        	System.out.println(prq.poll());
        }
    }  
}








