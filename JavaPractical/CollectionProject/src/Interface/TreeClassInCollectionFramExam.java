package Interface;

import java.util.*;

/*
 * 
public class TreeClassInCollectionFramExam {

	public static void main(String[] args) {
		
		TreeSet <Integer> EvenNum = new TreeSet<>();
		EvenNum.add(2);
		EvenNum.add(4);;
		EvenNum.add(6);
		System.out.println("Even Numbers : "+EvenNum);
		
		
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(1);
		tset.addAll(EvenNum);
		
		System.out.println("New TreeSet :"+tset);
	}
}



//========================================================

//Using Iterator


public class TreeClassInCollectionFramExam {

	public static void main(String[] args) {
		
		TreeSet <Integer> EvenNum = new TreeSet<>();
		EvenNum.add(2);
		EvenNum.add(4);
		EvenNum.add(6);
		EvenNum.add(8);
		EvenNum.add(10);
		
		System.out.println("Even Numbers : "+EvenNum);
		
		
		Iterator<Integer> itr = EvenNum.iterator();
		System.out.println("\nUsing Iterator :");
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}
	}
}

//===========================================================================
 * 
//Remove Elements

public class TreeClassInCollectionFramExam {

	public static void main(String[] args) {
		
		TreeSet <Integer> EvenNum = new TreeSet<>();
		EvenNum.add(2);
		EvenNum.add(4);
		EvenNum.add(6);
		EvenNum.add(8);
		EvenNum.add(10);
		
		System.out.println("Even Numbers : "+EvenNum);
		
		
		boolean Val = EvenNum.remove(6);
		System.out.print("remove() :"+EvenNum);
		
		boolean val2 = EvenNum.removeAll(EvenNum);
		System.out.println("\nremoveAll(EvenNum) :"+EvenNum);
	}
}

//=============================================================================

// first() and last() Methods


public class TreeClassInCollectionFramExam {

	public static void main(String[] args) {
		
		TreeSet <Integer> Num = new TreeSet<>();
		Num.addAll(Arrays.asList(1,2,3,4,5,6));
	
		
		System.out.println("Even Numbers : "+Num);
		System.out.println("Even Numbers first() : "+Num.first());
		System.out.println("Even Numbers last() : "+Num.last());
		
	}
}

//=======================================================================

// ceiling(), floor(), higher() and lower() Methods

public class TreeClassInCollectionFramExam {

	public static void main(String[] args) {
		
		TreeSet <Integer> Num = new TreeSet<>();
		Num.addAll(Arrays.asList(1,2,3,4,5,6));
		

		System.out.println("Numbers List : "+Num);
	
		System.out.println("Even Numbers Num.higher(4) : "+Num.higher(4));
		System.out.println("Even Numbers Num.lower(4) : "+Num.lower(4));
		System.out.println("Even Numbers Num.floor(3) : "+Num.floor(3));
		System.out.println("Even Numbers Num.ceiling(4) : "+Num.ceiling(6));
	}
}

//===================================================================

//  pollfirst() and pollLast() Methods

public class TreeClassInCollectionFramExam {

	public static void main(String[] args) {
		
		TreeSet <Integer> Num = new TreeSet<>();
		Num.addAll(Arrays.asList(1,2,3,4,5,6));
		

		System.out.println("Numbers List : "+Num);
	
		System.out.println("Even Numbers Num.pollFirst() : "+Num.pollFirst());
		System.out.println("Even Numbers Num.pollLast() : "+Num.pollLast());
		
		System.out.println("Numbers List After Poll: "+Num);
	}
}

//=================================================================================

//The headSet() ,The tailSet() , The subSet()

public class TreeClassInCollectionFramExam {

	public static void main(String[] args) {
		
		TreeSet <Integer> Num = new TreeSet<>();
		Num.addAll(Arrays.asList(1,2,3,4,5,6));
		

		System.out.println("Numbers List : "+Num);

		 System.out.println("---------------------------------------");

		// Demonstrating headSet() method
		 System.out.println("Numbers Num.headSet(4) I : "+Num.headSet(4));
		//or
		 TreeSet<Integer> headSet = (TreeSet<Integer>) Num.headSet(4);
		 System.out.println("Headset II :"+headSet);

		 System.out.println("---------------------------------------");
		  
		 

		
        // Demonstrating tailSet() method
		 System.out.println("Numbers Num.tailSet(4)I : "+Num.tailSet(4));
		//Or
		 TreeSet<Integer> tailset = (TreeSet<Integer>) Num.tailSet(4);
		 System.out.println("Tailset II :"+tailset);
		 System.out.println("---------------------------------------");

		
        // Demonstrating subSet() method
		 System.out.println("Even Numbers Num.subSet(2, 5) I : "+Num.subSet(2, 5));
		//or
		 TreeSet<Integer> subset = (TreeSet<Integer>) Num.subSet(2,6);
		 System.out.println("Subset II :"+subset);
		 System.out.println("---------------------------------------");
		
		
		System.out.println("Numbers List After Poll: "+Num);
	}
}

*/

//=======================================================================================

//Java program demonstrating the subset, difference, intersection, and union operations on 
//TreeSet in Java

public class TreeClassInCollectionFramExam {

	public static void main(String[] args) {
		

        // Creating TreeSets
		TreeSet<Integer> set1 = new TreeSet<>();
		TreeSet<Integer> set2 = new TreeSet<>();
		
		//Adding Elements in set1 and set2:
		set1.addAll(Arrays.asList(1,2,3,4));
		set2.addAll(Arrays.asList(4,6,2,8));
		
		//Dislay Set1 And Set2:
		System.out.println("Set 1 : "+set1);
		System.out.println("Set 2 : "+set2);
		System.out.println("--------------------------------------------");
		
		//Union Operation
		TreeSet<Integer> union = new TreeSet<>(set1);
		union.addAll(set2);
		System.out.println("Unioun : "+union);
		System.out.println("--------------------------------------------");
		
		//subset Operation
		TreeSet<Integer> subset = new TreeSet<>(set1);
		subset.retainAll(set2);
		System.out.println("subset : "+subset);
		System.out.println("--------------------------------------------");
		
		//intersection Operation
		TreeSet<Integer> Intersection = new TreeSet<>(set1);
		Intersection.retainAll(set2);
		System.out.println("Intersection : "+Intersection);
		System.out.println("--------------------------------------------");
		

        // Difference operation (set1 - set2)
		TreeSet<Integer> Difference1 = new TreeSet<>(set1);
		Difference1.removeAll(set2);
		System.out.println("Difference operation (set1 - set2) : "+Difference1);
		System.out.println("--------------------------------------------");
		

        // Difference operation (set2 - set1)
		TreeSet<Integer> Difference2 = new TreeSet<>(set1);
		Difference2.removeAll(set1);
		System.out.println("Difference operation (set2 - set1) : "+Difference2);
		System.out.println("--------------------------------------------");
		
	}
}



















		