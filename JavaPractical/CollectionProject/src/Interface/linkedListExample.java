package Interface;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Stack;

/*
public class linkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> llist = new LinkedList<>();
		
		
		//Queue
		
		llist.add(64);
		llist.add(56);
		llist.add(12);
		llist.add(46);
		llist.add(78);
		
		System.out.println("add() :"+llist.add(45));
		System.out.println("Offer() :"+llist.offer(85));
		
		System.out.println("Using Poll() : "+llist.poll());
		System.out.println("Using Remove() : "+llist.remove());
		System.out.println("Using Poll() : "+llist.poll());
		System.out.println("Using element() : "+llist.element());

		System.out.println("Using peek() : "+llist.peek());
		

	}

}

//===================================================================================================


public class linkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> llist = new LinkedList<>();
		//Queue
		llist.add(64);
		llist.add(56);
		llist.add(12);
		llist.add(46);
		llist.add(78);
		
		System.out.println("add() :"+llist.add(45));
		System.out.println("Offer() :"+llist.offer(85));
	
		System.out.println("Arrlist 1 :"+llist);
		
		System.out.println("Removed Element : "+llist.remove(4));

		System.out.println("Using Poll() : "+llist.poll());
		System.out.println("Using Remove() : "+llist.remove());
		System.out.println("Using Poll() : "+llist.poll());
		System.out.println("Using element() : "+llist.element());
		System.out.println("Using peek() : "+llist.peek());

				
		System.out.println("ArrayList is :");
		System.out.println(" "+llist);
	}

}

//=================================================================================================

//Stack Operations Using LinkedList:

public class linkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> llist = new LinkedList<>();
		
		//Stack Oprations Using List:
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("*************Menu***********");
			System.out.println("1.push \t2.pop \t3.stop");
			System.out.println("Enter Your CHoise :");
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					
					System.out.println("Enter Int Value :");
					llist.push(sc.nextInt());
					break;
					
				case 2:
					if(llist.isEmpty())
					{
						System.out.println("List is Empty:");
					}
					else
					{
						System.out.println("Pop() Value :"+llist.pop());
					}
					break;
					
				case 3:
					System.exit(0);
			}
		}
		
	}
}

*/

//===============================================================================================

//implement All linked list operations using LinkedList

/*

public class linkedListExample {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(78);
		list.add(64);
		list.add(56);
		list.add(12);
		list.add(46);
		list.add(78);
		System.out.println("Array is :"+list);
		
		LinkedList <Integer> list1 = new LinkedList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		System.out.println("Original LinkedList : list1 :"+list);
		System.out.println("Original LinkedList : list2 :"+list1);
		
		boolean change = list.addAll(list1);
		
		System.out.println("list 1 :"+list);
		System.out.println("list 2 :"+list1);
		
		boolean change1 = list.addAll(1, list1);
		
		System.out.println("List 1 :"+list);
		System.out.println("List 2 :"+list1);
		
		System.out.println("change 1 :"+change1);
		
		
		list.addFirst(21);
		System.out.println("Add Element At First : "+ list);
		
		list.addLast(17);
		System.out.println("Add Element At Last : "+ list);
		
//		list.clear();
//		System.out.println("Empty List : "+list);
		
		LinkedList<Integer> list11 = (LinkedList<Integer>) list.clone();
		System.out.println("Shallow copy : "+list11);

		boolean con = list11.contains(21);
		System.out.print("contain() : " + con);
		
		//---------------------------------Iterator---------------------------
		
		Iterator<Integer> itr = list.descendingIterator();
		System.out.println("\nUsing descendingIterator :");
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}
		
		//-------------------------------------------------------------------------
		
		System.out.println("\n\nelement() :"+list.element());
		System.out.println("Getindex() : "+list.get(5));
		System.out.println("list.getFirst() : "+list.getFirst());
		System.out.println("list.getLast() : "+list.getLast());
		System.out.println("IndexOf() :"+list.indexOf(4));
		System.out.println("lastIndexOf() :"+list.lastIndexOf(4));
		
		//---------------------------------------------------------------------------------
		
		boolean b = list.offer(88);
		System.out.println("Offer() :"+list);
		
		boolean b1 = list.offerFirst(19);
		System.out.println("OfferFirst() :"+list);
		
		boolean b2 = list.offerLast(24);
		System.out.println("OfferLast() :"+list);
		
		
		//----------------------------------------------------------------------------------------
		
		System.out.println("peek() :"+list.peek());
		System.out.println("peekFirst() :"+list.peekFirst());
		System.out.println("peekLast() :"+list.peekLast());
		
	}
}

*/
//=======================================================================================

//Using iterator :

public class linkedListExample {
	public static void main(String[] args) {
	
		LinkedList<Integer> lst = new LinkedList<>();
		
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		
		Iterator<Integer> itr = lst.iterator();
		System.out.println("Array Elements Using Iterator :");
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}	
	}
}



//=======================================================================================

//Using listiterator:
/*
public class linkedListExample {
	public static void main(String[] args) {
	
		LinkedList<Integer> lst = new LinkedList<>();
		
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		
		//-------------------------------------------------------------------------
		
		
		ListIterator<Integer> itr = lst.listIterator();
		
		System.out.println("Array Elements Using ListIterator(Forward-Direction) :");
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}	
		
		
		System.out.println("\nArray Elements Using ListIterator(Backword-Direction) :");
		while(itr.hasPrevious())
		{
			System.out.print(" "+itr.previous());
		}
		
		//--------------------------------------------------------------------------------------
		
		//Foreach():
		
		itr=lst.listIterator();
		System.out.println("\nUsing ForEach() :");
		lst.forEach(num -> System.out.print(" "+num));
		
		System.out.println("\n Using TO Array : "+lst.toArray());
		
		
		//--------------------------------------------------------------------------------------
		

		Spliterator<Integer> sitr = lst.spliterator();
		System.out.println("\nUsing Splitrator() :TryAdvance-I :");
		while(sitr.tryAdvance(num -> System.out.print(" "+num)));
		
		sitr = lst.spliterator();
		System.out.println("\nUsing Splitrator() :TryAdvance-II :");
		while(sitr.tryAdvance(System.out::print));
		
		System.out.println("\n\ntrySplit() Method : ");
		sitr=lst.spliterator();
		Spliterator<Integer> sitr1 = sitr.trySplit();
		if(sitr1!=null)
			sitr1.forEachRemaining(el -> System.out.println(" "+ el));
		
		System.out.println("\n Entered Array Split Part is :");
		sitr.forEachRemaining(el -> System.out.print(" "+ el));
		
	}
}

*/

//===========================================================================================

/*
//Thread Saftey:

public class linkedListExample {
	public static void main(String[] args) {
	
		List<Integer> lst = new LinkedList<>();
		
		List<Integer> SynchroNum = Collections.synchronizedList(lst);
		
		Thread t1 = new Thread(()->{
			
			for(int i=0;i<10;i++)
			{
				SynchroNum.add(i);
				try {
					Thread.sleep(200);
				}catch(InterruptedException e) {e.printStackTrace();}
			}
		});
		
		Thread t2 = new Thread(()->{
			while(true)
			{
				System.out.println("List Size :"+SynchroNum.size());
				try{
					Thread.sleep(100);
				}catch(InterruptedException e) {e.printStackTrace();}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

*/


