package Interface;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Spliterator;

public class ProrityOperationExample {

	public static void main(String[] args) {
		Queue<Integer> prq = new PriorityQueue<>();
		
		prq.add(4);
		prq.add(3);
		prq.add(12);
		prq.add(45);
		prq.add(24);
		prq.add(11);
		prq.add(2);
		prq.add(18);
		prq.add(1);
		
		System.out.println("Original Prt : "+prq);
		//prq.clear();
		boolean con = prq.contains(21);
		System.out.println("Contain() Prt : "+con);
		System.out.println("Original Prt : "+prq);

		//--------------------------------------------------------
		
		Iterator<Integer> itr = prq.iterator();
		System.out.print("\nUsing Iterator : ");
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}

		System.out.println("\n--------------------------------------");
		//---------------------------------------------------------------
		
		System.out.println("\nusing prq.offer(21) : "+prq.offer(21));

		System.out.println("\nAfter using prq is : "+prq);
		System.out.println("\nusing prq.peek() : "+prq.peek());
		System.out.println("\nusing prq.poll() : "+prq.poll());
		System.out.println("\nusing prq.size() : "+prq.size());
		System.out.println("\nusing prq.remove() : "+prq.remove());
		System.out.println("\nAfter using Above Methods Array is : "+prq);

		System.out.println("\n--------------------------------------");
		
		
		//--------------------------------------------------------
		
		
		System.out.println("Using Spliterator() I ");
		Spliterator<Integer> sitr = prq.spliterator();
		Spliterator<Integer> sitr1 = sitr.trySplit();
		sitr.forEachRemaining(el -> System.out.print(" "+el));
		
		System.out.println("\nUsing Spliterator() II ");
		if(sitr1!=null)
			sitr1.forEachRemaining(el1->System.out.print(" "+el1));
		System.out.println("\n--------------------------------------");
		
		
		//------------------------------------------------------------------
	
		System.out.println("Converting The que Into toArray() object :");
		Object[] arryOb = prq.toArray();
		for(Object prq1 : arryOb)
		{
			System.out.print(" "+prq1);
		}
	}

}






















