package Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
/*
public class SpliteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(12);
		arr.add(24);
		arr.add(30);
		arr.add(19);
		arr.add(17);
		arr.add(21);
		arr.add(25);
		
		Iterator<Integer> itr = arr.iterator();
		System.out.println("Entered Arraylist Using iterator : ");
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}
		
		
		itr=arr.iterator();
		System.out.println("\nArraylist Using ForEach() : ");
		itr.forEachRemaining(elements -> System.out.println(elements));
		
		
		//-------------------------------------------------
		
		
		Spliterator<Integer> sitr =arr.spliterator();
		System.out.println("Using tryAdvance() - I");
		while(sitr.tryAdvance(element -> System.out.print(" "+element)));
		
		sitr=arr.spliterator();
		System.out.println("\nUsing tryAdvance() - II");
		while(sitr.tryAdvance(System.out::println));
		
		//-----------------------------------------------------------
		
		sitr = arr.spliterator();
		
		Spliterator<Integer> sitr1 = sitr.trySplit();	
		System.out.println("\nEntered Array SplitPart Is :");
		if(sitr1!=null)
			sitr1.forEachRemaining(element -> System.out.print(" "+element));
		

		System.out.println("\nEntered Array SplitPart Is :");
		sitr.forEachRemaining(element -> System.out.print(" "+element));
	}
}
*/

//===============================================================================


public class SpliteratorExample {

	public static void main(String[] args) {
		
		
		List<String> arrlist = new ArrayList<>();
		
		arrlist.add("Apple");
		arrlist.add("Banana");
		arrlist.add("Orange");
		arrlist.add("Kiwi");
		arrlist.add("Grabs");
		arrlist.add("Watermelon");
		
		Spliterator<String> sitr = arrlist.spliterator();
		
		System.out.println("Squential travarsal Using tryAdvance() :");
		while(sitr.tryAdvance(element->System.out.println(" "+element)));
		
		sitr=arrlist.spliterator();
		
		System.out.println("Parallel Travaesal :");
		Spliterator<String> sitr1 = sitr.trySplit();
		
		if(sitr1!=null)
			sitr1.forEachRemaining(System.out::println);
		
		System.out.println("Remaning Elements Sequen :");
		sitr.forEachRemaining(System.out::println);
		}
}















