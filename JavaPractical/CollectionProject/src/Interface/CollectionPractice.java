package Interface;

import java.util.*;
/*
public class CollectionPractice {

	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(null);
		lst.add(null);
		lst.add(null);
		
		System.out.println("Original List 1: "+lst);
		System.out.println("-------------------------------------------");
		

		List<Integer> lst2 = new ArrayList<>();
		lst2.add(1);
		lst2.add(2);
		lst2.add(3);
		lst2.add(4);
		lst2.add(5);
		lst2.add(4);
		
		System.out.println("Original List 2 : "+lst2);
		System.out.println("-------------------------------------------");
		
		
		//Iterator:
		System.out.println("Using Iterator List 1 :");
		Iterator<Integer> itr = lst.iterator();
		while(itr.hasNext())
		{
			System.out.println(" "+itr.next());
		}
		System.out.println("-------------------------------------------");
		
		//e1.equals(e2)
		System.out.println("Equals :"+lst.equals(lst2));
		System.out.println("-------------------------------------------");
	}
}

//================================================================================

//Cheak Allow null Or not

public class CollectionPractice {

	public static void main(String[] args) {
		
		List<Integer> lst = new LinkedList<>();
		lst.add(1);
		lst.add(2);
		lst.add(null);
		lst.add(null);
		lst.add(null);
		System.out.println("LinkedList :"+lst);
		System.out.println("--------------------------------------------");
		
		Set<Integer> lst5 = new HashSet<>();
		lst5.add(1);
		lst5.add(2);
		lst5.add(null);
		lst5.add(null);
		lst5.add(null);
		System.out.println("HashSet :"+lst5);
		System.out.println("--------------------------------------------");


		List<Integer> lst1 = new Vector<>();
		lst1.add(1);
		lst1.add(2);
		lst1.add(null);
		lst1.add(null);
		lst1.add(null);
		System.out.println("Vector :"+lst1);
		System.out.println("----------------------------------------");
		
		List<Integer> lst2 = new ArrayList<>();
		lst2.add(1);
		lst2.add(2);
		lst2.add(3);;
		lst2.add(null);
		lst2.add(null);
		lst2.add(null);
		lst2.add(null);
		System.out.println("ArrayList :"+lst2);
		System.out.println("----------------------------------------------");
		
		Stack<Integer> stack = new Stack<>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(null);
		stack.add(null);

		System.out.println("Element Access : "+stack.get(1));
		System.out.println("Stack :"+stack);
		System.out.println("----------------------------------------------");
		
	}
}


//=======================================================================================

// addAll() And removeAll() Add Or remove All Elments At a Time:
 * 
public class CollectionPractice {

	public static void main(String[] args) {
		
		List<Integer> lst = new LinkedList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		System.out.println("List1 : "+lst);
		System.out.println("--------------------------------------------");
		
		List<Integer> lst1 = new LinkedList<>();
		lst1.addAll(Arrays.asList(6,7,8,9));
		System.out.println("List 2 : "+lst1);
		System.out.println("--------------------------------------------");
	
		lst1.addAll(lst);
		System.out.println(lst1);
		System.out.println("--------------------------------------------");
		

		lst1.removeAll(lst);
		System.out.println(lst1);
		System.out.println("--------------------------------------------");
		
		
	}
}

*/
//====================================================

//Iterator():Iterate Only Forward Direction 
//ListIterator():Iterate Forward And Backword Direction

public class CollectionPractice {

	public static void main(String[] args) {
		
		List lst = new LinkedList();
		
		lst.add(1);
		lst.add("Hello");
		lst.add(3.56);
		
		System.out.println("List1 : "+lst);
		System.out.println("--------------------------------------------");
	}
}