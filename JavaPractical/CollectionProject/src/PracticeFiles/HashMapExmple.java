package PracticeFiles;

import java.util.HashMap;
import java.util.Map;
/*
 * 
public class HashMapExmple {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer>  map = new HashMap<>();
		
		map.put(1, 45);
		map.put(2, 18);
		map.put(3, 93);
		map.put(4, 17);
		map.put(1, 25);

		map.put(6, null);
		map.put(7, null);

		map.put(10,66);
		System.out.println("Get() :"+map.get(1));
		
		
		int size = map.size();
		System.out.println("Size ():"+size);
		int capacity=16;
		float loadfactor = (float)size/(float)capacity;
		System.out.println("loadfactor "+loadfactor);
		
		
		System.out.println(map);
		
		for(Integer val: map.keySet())
		{
			System.out.print(" "+val);
		}
		
		System.out.println("\nKeySet() : "+map.keySet()); // Provide A Set of Keys:
		System.out.println("entryset() : "+map.entrySet()); // Provide Key- Value Pair Collection
		System.out.println("values() :"+map.values()); 		//Provide the Collection of Value
	}
}
*/
//===========================================================================
//Capacity and Load Factor

public class HashMapExmple {
    public static void main(String[] args) {
        // Using the default constructor
        HashMap<String, Integer> defaultMap = new HashMap<>();
        defaultMap.put("Key1", 1);
        System.out.println("Default constructor: " + defaultMap);

        // Using the constructor with initial capacity
        HashMap<String, Integer> capacityMap = new HashMap<>(10);
        capacityMap.put("Key2", 2);
        System.out.println("Constructor with initial capacity: " + capacityMap);

        // Using the constructor with initial capacity and load factor
        HashMap<String, Integer> capacityLoadFactorMap = new HashMap<>(10, 0.7f);
        capacityLoadFactorMap.put("Key3", 3);
        System.out.println("Constructor with initial capacity and load factor: " + capacityLoadFactorMap);

        // Using the copy constructor
        Map<String, Integer> existingMap = new HashMap<>();
        existingMap.put("KeyA", 100);
        existingMap.put("KeyB", 200);

        HashMap<String, Integer> copyMap = new HashMap<>(existingMap);
        System.out.println("Copy constructor: " + copyMap);
    }
}
