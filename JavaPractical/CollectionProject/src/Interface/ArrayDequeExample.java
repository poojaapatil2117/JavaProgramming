package Interface;

import java.util.*;
/*
public class ArrayDequeExample {

	public static void main(String[] args) {

		Deque<String> dque = new ArrayDeque<>();
		
		dque.add("Rohit");
		dque.add("virat");
		dque.add("Rishab");
		dque.add("mohit");
		dque.add("Rahul");
		
		System.out.println("Deque List :"+dque);
		System.out.println("---------------------------------------------");
		
		dque.addFirst("Ritika");
		dque.addLast("Anushka");
		System.out.println("addFist()addLast() List : "+dque);
		System.out.println("---------------------------------------------");
		
		boolean Con = dque.contains("Rohit");
		System.out.println("contains(Rohit) : "+Con);
		System.out.println("---------------------------------------------");
		

		System.out.println("GetFirst() : "+dque.getFirst());
		System.out.println("---------------------------------------------");
		

		System.out.println("GetLast() : "+dque.getLast());
		System.out.println("---------------------------------------------");
		

		System.out.println("element() : "+dque.element());
		System.out.println("---------------------------------------------");
		

		System.out.println("isEmpty() : "+dque.isEmpty());
		System.out.println("---------------------------------------------");
		


		System.out.println("offer(\"Devisha\") : "+dque.offer("Devisha"));
		System.out.println("offerFirst(\"Dhanashree\") : "+dque.offerFirst("Dhanashree"));
		System.out.println("offerLast(\"Sakshi\") : "+dque.offerLast("Sakshi"));
		System.out.println("Deque List :"+dque);
		System.out.println("---------------------------------------------");
		

		System.out.println("peek() : "+dque.peek());
		System.out.println("peekFirst() : "+dque.peekFirst());
		System.out.println("peekLast() : "+dque.peekLast());
		System.out.println("Deque List :"+dque);
		System.out.println("---------------------------------------------");
		

		System.out.println("poll() : "+dque.poll());
		System.out.println("pollFirst() : "+dque.pollFirst());
		System.out.println("pollLast() : "+dque.pollLast());
		System.out.println("Deque List :"+dque);
		System.out.println("---------------------------------------------");
		
		System.out.println("remove() :"+dque.remove("Devisha"));
		System.out.println("---------------------------------------------");
		
		dque.push("Ritika");
		System.out.println("Deque List Push(\"Ritika\"):"+dque);
		System.out.println("---------------------------------------------");
		

		dque.pop();
		System.out.println("Deque List Pop():"+dque);
		System.out.println("---------------------------------------------");
		

		System.out.println("Deque List removeFirst():"+dque.removeFirst());
		System.out.println("---------------------------------------------");
		
		System.out.println("Deque List removeLast():"+dque.removeLast());
		System.out.println("---------------------------------------------");
		

		System.out.println("Deque List removeFirst()_removeLast() :"+dque);
		System.out.println("---------------------------------------------");
		

		//Handling Exception
		
		try {
			dque.removeFirst();
		}catch(Exception e) 
		{
			System.out.println("Exception on RemoveFist :"+e);
		}
		System.out.println("\n---------------------------------------------");
		
		
		System.out.println("Using Iterator (descendingIterator()) : ");
		Iterator<String> itr = dque.descendingIterator();
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}
		System.out.println("\n---------------------------------------------");
		

		
		dque.clear();
		System.out.println("clear() List : "+dque);
		System.out.println("---------------------------------------------");
		

		System.out.println("isEmpty() : "+dque.isEmpty());
		System.out.println("---------------------------------------------");
		
	}
}



//====================================================================================

// Write a program to implement the stack using ArrayDeque

public class ArrayDequeExample {

	public static void main(String[] args) {
	
		Deque<Integer> stack = new ArrayDeque<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("--------------------MENU------------------------");
			System.out.println("1.Push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("4.Cheak If Empty");
			System.out.println("5.GetSize");
			System.out.println("6.Exit");
			
			System.out.println("Enter Your Choise :");
			int choise = sc.nextInt();
			
			switch(choise)
			{
				case 1:
					System.out.println("Enter Your Number To Push : ");
					int NumToPush = sc.nextInt();
					stack.push(NumToPush);
					System.out.println("Pushed : "+NumToPush+" In Stack");
					System.out.println("Current Stack :"+stack);
					break;
				case 2:
					if(stack.isEmpty())
					{
						System.out.println("stack is Empty :")
					}
					else
					{
						int NumToPop = stack.pop();
						System.out.println("Poped "+NumToPop+" in stack ");
						System.out.println("Current Stack :"+stack);
					}
					break;
			}
		}
	}	
}
*/
