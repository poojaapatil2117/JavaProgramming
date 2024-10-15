package PracticeFiles;

import java.util.Hashtable;

public class HashTableExample {

    public static void main(String[] args) {
    	/*
        // Default constructor
        Hashtable<String, Integer> defaultHashtable = new Hashtable<>();
        defaultHashtable.put("One", 1);
        defaultHashtable.put("Two", 2);
        System.out.println("Default constructor: " + defaultHashtable);

        // Constructor with initial capacity
        Hashtable<String, Integer> initialCapacityHashtable = new Hashtable<>(20);
        initialCapacityHashtable.put("Three", 3);
        initialCapacityHashtable.put("Four", 4);
        System.out.println("Constructor with initial capacity: " + initialCapacityHashtable);

        // Clone constructor
        Hashtable<String, Integer> cloneHashtable = new Hashtable<>(initialCapacityHashtable);
        System.out.println("Clone constructor: " + cloneHashtable);
        */
        //ComputeIfPresent(BiFunction)
        
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(45, "Rohit");
        hashtable.put(18, "Virat");
        hashtable.put(07, "mahi");
        hashtable.put(93, "JB");
        
        System.out.println(hashtable);
        
        hashtable.computeIfPresent(07, (i,s) -> "Rishabh");
        System.out.println(hashtable);
        
        hashtable.compute(07, (k,v) -> "Shreyash");
        System.out.println(hashtable);
        
        hashtable.computeIfAbsent(88, k->"yash");
        System.out.println(hashtable);
        
        hashtable.merge(21, "Ishan", (s1,s2)->"sijde");
        System.out.println(hashtable);
        
        
        
        
        
        
        
    }
}