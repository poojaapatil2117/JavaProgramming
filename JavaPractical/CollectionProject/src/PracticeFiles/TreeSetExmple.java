package PracticeFiles;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExmple {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(21);
		list.add(17);
		
		SortedSet<Integer> sortedset = new TreeSet<>(list);
		sortedset.add(19);
		sortedset.add(24);
		sortedset.add(21); //does not allow duplicate
		
		System.out.println(sortedset);
		
		//Rverse Order Compareator
		
		TreeSet<String> sort = new TreeSet<>(Comparator.reverseOrder());
		sort.add("Rohit");
		sort.add("Virat");
		sort.add("Rishabh");
		sort.add("Ishan");
		
		System.out.println(sort);
		
		System.out.println("\nsort.ceiling(\"Rohit\") : "+sort.ceiling("Rohit"));
		System.out.println("\nsort.floor(\"Virat\") : "+sort.floor("Virat"));
		System.out.println("\nsort.lower(\"Virat\") : "+sort.lower("Virat"));
		System.out.println("\nsort.higher(\"krunal\") : "+sort.higher("krunal"));
		System.out.println("\nsort.pollFirst() : "+sort.pollFirst());
		System.out.println("\nsort.pollLast() : "+sort.pollLast());
		
		System.out.println();
		
	}

}
