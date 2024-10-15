package PracticeFiles;

import java.util.TreeMap;

public class TreemapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> treemap = new TreeMap<>();
		
		treemap.put(45, "Rohit");
		treemap.put(18, "Virat");
		treemap.put(7, "Mahi");
		treemap.put(93, "JB");
		
		System.out.println(treemap); // it display The Result Natural Ordering 1,2,3......  So output is 7,18,45,93
		
		System.out.println(treemap.headMap(46));
		
	}

}
