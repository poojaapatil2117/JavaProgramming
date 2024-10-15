package ListExamples;

import java.util.ArrayList;
import java.util.List;

//Example 1:
/*
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Hello");
		a1.add(10);
		a1.add(1000);
		System.out.println(a1);

	}

}

//=========================================================================
//Example 2
public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> arrlist = new ArrayList<>();
		arrlist.add("Hello");
		arrlist.add("how");
		arrlist.add("are");
		arrlist.add("You");
		arrlist.add("Java");
		arrlist.add("C++");
		System.out.println("For Arralist array is :"+arrlist);
		
		
		ArrayList a1 = new ArrayList(arrlist);
		System.out.println("For a1 Array :"+a1);
		
	}

}
//============================================================================================

//Example 3:

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> arrlist = new ArrayList<>();
		arrlist.add("Hello");
		arrlist.add("how");
		arrlist.add("are");
		System.out.println("For Arralist array is :"+arrlist);
		
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("You");
		a1.add("C++");
		a1.addAll(arrlist);
		System.out.println(a1);
		
		ArrayList<String> a2 = new ArrayList<>();
		a2.add("hii");
		a2.add("Good");
		a2.addAll(1,a1);
		System.out.println(a2);
		
		a2.set(2, "Hey");
		System.out.println(a2);		
	}
}
*/
//==========================================================================================

//Search and remove operations

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> arrlist = new ArrayList<>();
		arrlist.add("Hello");
		arrlist.add("how");
		arrlist.add("are");
		System.out.println("For IsConatain() :"+arrlist.contains("Hello"));
		System.out.println("For IsConatain() :"+arrlist.contains("Bye"));
		
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("You");
		a1.add("C++");
		a1.addAll(arrlist);
		System.out.println(a1);
		System.out.println("2nd Element In Arralist a1 :"+a1.get(2));
		
		ArrayList<String> a2 = new ArrayList<>();
		a2.add("hii");
		a2.add("Good");
		a2.addAll(1,a1);
		System.out.println(a2);
		System.out.println(" A2 Arraylist ContainAll() = "+a2.containsAll(arrlist));
		a2.set(2, "Hey");
		System.out.println(a2);		
		
		List<String> sl = a2.subList(2, 5);
		System.out.println("Sublist Of String : "+sl);
		
		if(a2.indexOf("Good")!=-1)
		{
			System.out.println("Good Is Present at "+a2.indexOf("Good")+" position");
		}
		else
		{
			System.out.println("Good is Not Present in list");
		}
		
		a2.add("C");
		a2.add("C");
		System.out.println(a2);
		System.out.println("Last Index Of C In List is : "+a2.lastIndexOf("C"));
		
		a2.remove("C");
		System.out.println(a2);
		
		a2.removeAll(arrlist);
		System.out.println(a2);
	}
}
