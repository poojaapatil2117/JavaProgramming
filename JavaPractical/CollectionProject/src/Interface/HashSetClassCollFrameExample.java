package Interface;
import java.util.*;
/*
public class HashSetClassCollFrameExample {

	public static void main(String[] args) {
		
		// Using the no-argument constructor  HashSet() Constructer :
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(21);
		set1.add(17);
		set1.add(24);
		set1.add(19);
		set1.add(18);
		System.out.println("Default Constructer : "+set1);
		
		
		 // Using the constructor that accepts a Collection : HashSet(Collection<? extends E> c)
		Collection<Integer> cll = Arrays.asList(1,2,3,4,6);
		HashSet<Integer> hset = new HashSet<>(cll);
		System.out.println("Collection As Arrgument To The HashSet : "+hset);
		

        //Using the constructor that accepts an initial capacity : HashSet(int initialCapacity):	
		HashSet<Integer> hset1 = new HashSet<>(10);
		hset1.add(45);
		hset1.add(18);
		hset1.add(07);
		hset1.add(97);
		System.out.println("Capcity Constructer :"+hset1);
		
		
		// Using the constructor that accepts an initial capacity and load factor
		HashSet<Integer> hset2 = new HashSet<>(10,0.5f);
		hset1.add(45);
		hset1.add(18);
		hset1.add(07);
		System.out.println("Capcity Constructer :"+hset2);
	}

}

//===================================================================================

//Add Elements to HashSet

public class HashSetClassCollFrameExample {

	public static void main(String[] args) {
		
		 // Creating a HashSet
		HashSet<String> hset = new HashSet<>();
		
		// Adding new elements to the HashSet
		hset.add("Mango");
		hset.add("Banana");
		hset.add("Orange");
		hset.add("Grabs");
		hset.add("Mango");
		hset.add("Orange");

		//Display
		System.out.print("List Of HashSet Using For-Each()loop : \n");
		for(String str : hset)
		{
			System.out.println(" "+str);
		}
	
	}
}

//========================================================

//Create HashSet from Another Collection


public class HashSetClassCollFrameExample {

	public static void main(String[] args) {
		
		List<Integer> lst1 = new ArrayList<>();
		lst1.add(21);
		lst1.add(19);
		lst1.add(18);
		lst1.add(20);
		
		List<Integer> lst2 = new ArrayList<>();
		lst2.add(24);
		lst2.add(17);
		lst2.add(1);
		lst2.add(8);
		
		// Creating a HashSet from another collection (ArrayList)
		HashSet<Integer> hset = new HashSet<>(lst1);
		
		// Adding all the elements from an existing collection to a HashSet
		hset.addAll(lst2);
		System.out.println("List : "+hset);
		

		// Accessing elements using an iterator
		
		System.out.println("\nAccessing elements using an iterator");
		Iterator<Integer> itr = hset.iterator();
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}
	}
}

//=======================================================================================

//Remove elementss

public class HashSetClassCollFrameExample {

	public static void main(String[] args) {
		
		
		HashSet<String> hset = new HashSet<>();
		hset.addAll(Arrays.asList("Rohit","Virat","Shubhman","Ishan","Shikhar","Shehvag"));
		System.out.println("HashSet List : "+ hset);
		
		  // Using remove(Object o)
		hset.remove("Shubhman");
		System.out.println("\nUsing remove(Object o) : "+hset);
		
		 // Using removeAll(Collection c)
		hset.removeAll(Arrays.asList("Shikhar","Shehvag"));
		System.out.println("\nremoveAll(Collection c) : "+hset);

        // Using removeIf(Predicate<? super E> filter)
		
		hset.removeIf(Player->Player.startsWith("I"));
		System.out.println("\nUsing removeIf(Predicate<? super E> filter) :"+hset);
	}
}

*/

//====================================================================================

//Using different iterators


public class HashSetClassCollFrameExample {

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<>();
		hset.addAll(Arrays.asList("Rohit","Virat","Shubhman","Ishan","Shikhar","Shehvag"));
		System.out.println("HashSet List : "+ hset);
		

		//---------------------------------------------------------
		
		System.out.println("\nHashSet List Using Iterator :");
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}
		
		//-------------------------------------------------------

		System.out.println("\n\nHashSet List Using Spliterator :");
		Spliterator<String> sitr = hset.spliterator();
		sitr.forEachRemaining(Play -> System.out.println(" "+Play));
		
		//-----------------------------------------------------------------
		
		System.out.println("\nHashSet List Using ForEach() :");
		hset.forEach(player -> System.out.println(" "+player));
	
	}
}





