package PracticeFiles;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> prlist = new PriorityQueue<>();
		prlist.add(4);
		prlist.add(3);
		prlist.add(12);
		prlist.add(45);
		prlist.add(24);
		prlist.add(11);
		prlist.add(2);

		System.out.println(prlist);
		
		System.out.println("Remove :"+prlist.remove());
		System.out.println("Remove :"+prlist.remove());
		System.out.println("Remove :"+prlist.remove());
		
		System.out.println(prlist);

	}

}
