package Interface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
import java.util.function.Function;

//-------------------Types Of InterFace-----------------------:
 * 
//1.Function

//  Example 1:
public class TypesOfFunctionalInterface {
	public static void main(String args[])
	{
		Function<String , Integer>  StringLength = (str) -> str.length();
		
		int len = StringLength.apply("hello , how are you ");
		System.out.println("String Length is : "+len);
	}
}



//====================================================================================================

//Example 2:

public class TypesOfFunctionalInterface {
	public static void main(String args[])
	{
		Function<Integer , Integer>  Square = (x) -> x*x;
		
		int result = Square.apply(5);
		System.out.println("Square Is: "+result);
	}
}


//=======================================================================
//Types Of Function
//Unary And Binary

//For Unary:

import java.util.function.UnaryOperator;
public class TypesOfFunctionalInterface {
	public static void main(String args[])
	{
		
		UnaryOperator<Integer> not = a -> a^1;
		System.out.println(not.apply(0));
	
	}
}


//for Binary

import java.util.function.BinaryOperator;

public class TypesOfFunctionalInterface {
	public static void main(String args[])
	{
		BinaryOperator<Integer> and =(a,b )-> (a&b) ;
		
		System.out.println(and.apply(12, 5));
	}
}
//=====================================================================
 * 
//2.Supplier:
public class TypesOfFunctionalInterface {
	public static void main(String args[])
	{
		Supplier<String> message = () ->"Hello There";
		Supplier<Integer> IntVal = () -> 124;
		
		System.out.println(message.get());
		System.out.println(IntVal.get());
	}
}

//================================================================================

//3.Consumer

import java.util.ArrayList;
import java.util.List;
class PrintNumber implements Consumer<Integer>
{
	@Override
	public void accept(Integer lis) {
		System.out.println(lis);
		
	}
	
}
public class TypesOfFunctionalInterface {
	public static void main(String args[])
	{
		List<Integer> lis = new ArrayList<>();
		lis.add(1);
		lis.add(2);
		lis.add(3);
		lis.add(4);
		lis.add(5);
		lis.add(6);
		System.out.print(lis);
		
		
		System.out.println("\n\nUsing Consumer");
		Consumer<Integer> printnum = new PrintNumber();
		lis.forEach(printnum);
	}
}

//=======================================================================================

//using lambda expression 


import java.util.ArrayList;
import java.util.List;

public class TypesOfFunctionalInterface {
	public static void main(String args[])
	{
		List<Integer> lis = new ArrayList<>();
		lis.add(1);
		lis.add(2);
		lis.add(3);
		lis.add(4);
		lis.add(5);
		lis.add(6);
		System.out.print(lis);
		
		
		System.out.println("\n\nUsing Consumer Lambda");
		Consumer<Integer> printnum = (num) -> System.out.println(num);
		
		lis.forEach(printnum);
	}
}


//=================================================================================================

//4.Predicate:

import java.util.function.Predicate;

class IsEven implements Predicate<Integer>
{
	public boolean test(Integer num) {
		return num%2==0;
	}
	
}

public class TypesOfFunctionalInterface {
	public static void main(String args[])
	{
		Predicate<Integer> pre = new IsEven();
		
		System.out.println("1.IsEven : "+pre.test(4));
		System.out.println("2.IsEven : "+pre.test(5));
	}
}




//Using Lambda

import java.util.function.Predicate;

public class TypesOfFunctionalInterface {
	public static void main(String args[])
	{
		Predicate<Integer> pre =(num)-> num%2==0 ;
		
		System.out.println("1.IsEven : "+pre.test(4));
		System.out.println("2.IsEven : "+pre.test(5));
	}
}

*/

//=====================================================================================

//using with arrayList
/*

public class TypesOfFunctionalInterface {
	public static void main(String args[])
	{
		ArrayList<Integer> ar =new ArrayList<>();
		ar.add(11);
		ar.add(45);
		ar.add(30);
		ar.add(25);
		ar.add(55);
		
		Predicate<Integer> pre = (num) -> num%2==0;
		ar.removeIf(pre);
		System.out.println("Removed Numbers : "+ar);
		
		
		Predicate<Integer> GreThiry = num1 -> num1 > 30;
		ar.removeIf(GreThiry);
		System.out.println("Greater Than Thirty : Removed "+ar);
	}
}
*/
//===============================================================================================
/*
//boolean	removeIf(Predicate<? super E> filter):


public class TypesOfFunctionalInterface {
	public static void main(String args[])
	{
		ArrayList<Integer> arlis = new ArrayList<>();
		arlis.add(10);
		arlis.add(21);
		arlis.add(30);
		arlis.add(45);
		arlis.add(50);
		
		boolean remove = arlis.removeIf(num -> num%2==0);
		System.out.println("Numbers After Remove "+arlis);
	}
}
*/

//===================================================================================================
/*
public class TypesOfFunctionalInterface {
	public static void main(String args[])
	{
		ArrayList<Integer> ar2 = new ArrayList<>();
		ar2.add(1);
		ar2.add(2);
		ar2.add(3);
		ar2.add(4);
		ar2.add(5);

		System.out.println("Before Replace :"+ar2);
		ar2.replaceAll(num -> num*num);
		
		System.out.println("After Replace :"+ar2);
		
	}
}
*/
//=================================================================================
/*
public class TypesOfFunctionalInterface {
	public static void main(String args[])
	{
		ArrayList<String> str = new ArrayList<>();
		str.add("hello");
		str.add("Good");
		str.add("morning");
	

		System.out.println("Before Replace :"+str);
		
		str.replaceAll(string ->string.toUpperCase());
		
		System.out.println("After Replace :"+str);
		
	}
}
*/

//========================================================================================

//boolean retainAll(Collection<?> c)

/*
public class TypesOfFunctionalInterface {
	public static void main(String args[])
	{
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		
		list1.add("Apple");
		list1.add("banana");
		list1.add("Grabs");
		list1.add("Orange");
		
		//------------------------
		
		list2.add("banana");
		list2.add("Orange");
		list2.add("Kiwi");
		list2.add("Apple");
		
		System.out.println("List1 :"+list1);
		System.out.println("List2 :"+list2);
		
		boolean changed = list1.retainAll(list2);
		
		System.out.println("Printing The Modified List1 :"+list1);
	
		System.out.println("Cheak List1 is Modified :"+changed);
		
		
	}
}*/