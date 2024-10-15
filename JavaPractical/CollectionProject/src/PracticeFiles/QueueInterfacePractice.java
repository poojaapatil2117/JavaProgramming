package PracticeFiles;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfacePractice {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(11);
		queue.add(22);
		queue.add(33);
		queue.add(44);
		queue.add(55);
		
		//Add() and Offer():
		System.out.println("-------------Add() and Offer()----------- ");
		System.out.println("Offer() : "+queue.offer(21));
		System.out.println("Add() : "+queue.add(17));
		
		System.out.println("list"+queue);
		
		//remove() And poll()

		System.out.println("------------remove() And poll()----------------- ");
		System.out.println("Remove() 1 :"+queue.remove());
		System.out.println("Remove() 2 :"+queue.remove());
		System.out.println("Poll() 3 :"+queue.poll());
		System.out.println("Poll() 4 :"+queue.poll());
		
		//element() and peek()

		System.out.println("------------remove() And poll()--------------- ");
		System.out.println("element() 1 :"+ queue.element());
		System.out.println("peek() 1 :"+ queue.peek());
		
		System.out.println(queue);
		

	}

}
