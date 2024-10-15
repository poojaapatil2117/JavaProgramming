package PracticeFiles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {
	
	public static void main(String args[])
	{	
		//Constructers
		
		/*
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		System.out.println(arr);
		
		ArrayList<Integer> arr2 = new ArrayList <>(arr);
		arr2.add(1);
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		System.out.println(arr2);
		
		

		ArrayList<Integer> arr3 = new ArrayList <>(5);
		arr3.add(11);
		arr3.add(22);
		arr3.add(44);
		System.out.println(arr3);
		
		
		//--------------------------------------
		
		//Methods
		
		ArrayList<Integer> array = new ArrayList<>();

		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		
		System.out.println(array);
		
		ArrayList<Integer> array1 = new ArrayList<>();	
		array1.add(10);
		array1.add(20);
		array1.add(30);
		
		array1.addAll(array);
		
		System.out.println(array1);
		
		array1.addAll(2, array);
		System.out.println(array1);
		
		array1.set(6, 45);
		System.out.println(array1);
		
		*/
		
		//----------------------------------
		
		//Using Iterator :
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Rohit");
		list.add("Virat");
		list.add("Rishab");
		list.add("Bumarah");
		list.add("Yashashvi");
		list.add("Shikhar");
		list.add("Yuvi");
		
		//Iterator:
		System.out.println("List Iterator :");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}
		
		//listIterator
		System.out.println("\nList Iterator :");
		ListIterator<String> itr1 = list.listIterator();
		while(itr1.hasNext())
		{
			System.out.print(" "+itr1.next());
		}
		
		//Backword Side
		System.out.println("\nBackWord Side :");
		while(itr1.hasPrevious())
		{
			System.out.print(" "+itr1.previous());
		}
		
		
	}
}
