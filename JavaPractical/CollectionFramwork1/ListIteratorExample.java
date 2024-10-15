import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
class ListIteratorExample 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList();
		a1.add("Mango");
		a1.add("Banana");
		a1.add("Apple");
		a1.add("Orange");

		System.out.println("Fruits Are : "+a1);

		// Use iterator() for forward traversal:
		System.out.println("\nUse iterator() for forward traversal:");
		Iterator<String> itr = a1.iterator();
		while(itr.hasNext())
		{
			String fru = itr.next();
			System.out.println(fru+" ");
		}

		//Use listIterator() for both forward and backward traversal
		System.out.println("\nUse listIterator() for forward traversal");
		ListIterator<String> ListItr = a1.listIterator();
		while(ListItr.hasNext())
		{
			String litr = ListItr.next();
			System.out.println(litr);
		}

		System.out.println("\nUse listIterator() for  backward traversal");
		while(ListItr.hasPrevious())
		{
			String BackLitr = ListItr.previous();
			System.out.println(BackLitr);
		}

		// Use listIterator(int index) to start traversal from a specific position
        System.out.println("\n\nUsing listIterator(int index) to start at index 2 For Foward traversal:");
		ListItr = a1.listIterator(2);
		while(ListItr.hasNext())
		{
			String litr = ListItr.next();
			System.out.println(litr);
		}

		System.out.println("\n\nUsing listIterator(int index) to start at index 2 For BackWord traversal:");
		ListItr = a1.listIterator(2);
		while(ListItr.hasPrevious())
		{
			String litrArg = ListItr.previous();
			System.out.println(litrArg);
		}

		
	}
}
