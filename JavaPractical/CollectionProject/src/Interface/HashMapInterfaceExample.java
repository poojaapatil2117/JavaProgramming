package Interface;

import java.util.*;
/*
//Constructers :

public class HashMapInterfaceExample {

	public static void main(String[] args) {
		

        // Using the default constructor
		HashMap<String,Integer> defaultHasmap = new HashMap<>();
		defaultHasmap.put("Key1", 1);
		System.out.println("defaultHasmap() : "+defaultHasmap);
		System.out.println("----------------------------- ");
		

        // Using the constructor with initial capacity
		HashMap<String,Integer> InitialCapacity = new HashMap<>(10);
		InitialCapacity.put("Key2",2);
		System.out.println("InitialCapacity :"+InitialCapacity);
		System.out.println("----------------------------- ");
		
		
        // Using the constructor with initial capacity and load factor
		HashMap<String,Integer> InitialCapacityLoad = new HashMap<>(10,0.7f);
		InitialCapacityLoad.put("Key3", 3);
		System.out.println("InitialCapacityLoad :"+InitialCapacityLoad);
		System.out.println("----------------------------- ");
		

        // Using the copy constructor
		Map<String,Integer> existingMap = new HashMap<>();
		existingMap.put("Abc", 1);
		existingMap.put("PQR", 2);
		
		
		HashMap<String,Integer> cpyMap= new HashMap<>(existingMap);
		System.out.println("copy_constructor : "+cpyMap);
		System.out.println("----------------------------- ");
	}
}

//=============================================================================================
 
import java.util.Map.Entry;

public class HashMapInterfaceExample {

	public static void main(String[] args) {
		
		HashMap<String , Integer> hmap = new HashMap<>();
		hmap.put("Apple", 1);
		hmap.put("Banana", 2);
		hmap.put("Grabs", 3);
		hmap.put("Orange", 4);

        // Accessing elements
		System.out.println("get() : "+hmap.get("Apple"));
		System.out.println("-------------------------------------------");

        // Removing an element
		System.out.println("remove() : "+hmap.remove("Orange"));
		System.out.println("-------------------------------------------");
		

        // Iterating over elements
		System.out.println("Iterating over elements :");
		for(Map.Entry<String, Integer> entry : hmap.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("-------------------------------------------");
		

        // Checking if a key exists
		System.out.println("Checking if a key exists : "+hmap.containsKey("Apple"));
		System.out.println("-------------------------------------------");
		
        // Checking if a Value exists
		System.out.println("Checking if a Value exists : "+hmap.containsValue(5));
		System.out.println("-------------------------------------------");
		

        // Getting the size of the HashMap
		System.out.println("Getting the size of the HashMap : "+hmap.size());
		System.out.println("-------------------------------------------");
		

        // Clearing the HashMap
		hmap.clear();
		System.out.println("clear() : "+hmap);
		System.out.println("-------------------------------------------");
	}
}
*/
//========================================================================

public class HashMapInterfaceExample {

	public static void main(String[] args) {
	
		// Creating a HashMap
		HashMap<String,String> Hmap = new HashMap<>();
		Hmap.put("Apple","Red");
		Hmap.put("Banana","Yellow");
		Hmap.put("Orange","Orange");

        // Using entrySet and a for-each loop:
		System.out.println("Using entrySet and a for-each loop");
		for(Map.Entry<String,String> entry : Hmap.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("-----------------------------------------------");
		

        // Using keySet and a for-each loop:
		System.out.println("Using `keySet' and a 'for-each` loop");
		for(String key : Hmap.keySet())
		{
			System.out.println("Key :"+key + "Value :"+Hmap.get(key));
		}
		System.out.println("-----------------------------------------------");
		

        // Using `values` and a `for-each` loop:
		System.out.println("Using `values` and a `for-each` loop");
		for(String key : Hmap.values())
		{
			System.out.println( "Value :"+Hmap.values());
		}
		System.out.println("-----------------------------------------------");
		

        // Using an `Iterator`:
        System.out.println("Using an `Iterator`:");
        Iterator<Map.Entry<String,String>>itr = Hmap.entrySet().iterator();
        while(itr.hasNext())
        {
        	Map.Entry<String, String> entry=itr.next();
        	System.out.println("Key : "+entry.getKey()+" ,"+ " Value : "+entry.getValue());
        }
		System.out.println("-----------------------------------------------");
		
		// Using Java 8's `forEach` method:
        System.out.println("Using Java 8's `forEach` method:");
        Hmap.forEach((Key,Value)-> System.out.println("Key :"+Key +" ,"+" Value :"+Value));
		System.out.println("-----------------------------------------------");
	}
}