package PracticeFiles;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> linkedhashmap = new LinkedHashMap<>();
		linkedhashmap.put(45, "Rohit");
		linkedhashmap.put(18, "Virat");
		linkedhashmap.put(07, "Mahi");
		linkedhashmap.put(17, "AB");
		linkedhashmap.put(93, "JB");
		linkedhashmap.put(null, "null");
		linkedhashmap.put(15, "null");
		
		System.out.println(linkedhashmap);
		
		System.out.println("Using BiConsumer :");
		linkedhashmap.forEach((k,v) -> System.out.println("Key : "+k + "\tValue : "+v));
		
		linkedhashmap.computeIfAbsent(07 , e -> "Mahi");
		System.out.println(linkedhashmap);
		
		linkedhashmap.replace(89, "osjdxo");
		System.out.println(linkedhashmap);

	}

}
