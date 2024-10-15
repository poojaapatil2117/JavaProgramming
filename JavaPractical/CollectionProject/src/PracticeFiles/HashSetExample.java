package PracticeFiles;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Integer> hashset = new LinkedHashSet<>();
		
		hashset.add(15);
		hashset.add(17);
		hashset.add(24);
		hashset.add(19);
		hashset.add(8);
		
		System.out.println(hashset);
		
		Set<String> hashset1 = new LinkedHashSet<>(10);
		hashset1.add("Rohit");
		hashset1.add("Virat");
		hashset1.add("Mahi");
		hashset1.add("Rishabh");
		hashset1.add("Bumrah");
		hashset1.add("Bumrah"); 
		hashset1.add(null); 
		
		System.out.print(hashset1);
		
		//Creating Another Hashset Using Another Collection
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(45);
		numbers.add(21);
		numbers.add(17);
		System.out.println("\n"+numbers);
		
		Set<Integer> hashset2 = new HashSet<>(numbers);
		hashset2.add(24);
		hashset2.add(19);
		
		Predicate<Integer> predicate = new Predicate<Integer>(){
			
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t==45;
			}
		};
		
		System.out.println(predicate.test(45));
		
		hashset2.removeIf(number -> number==24);
		System.out.println(hashset2);
		
		
	}
}
