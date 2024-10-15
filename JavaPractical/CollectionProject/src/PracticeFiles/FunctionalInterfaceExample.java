package PracticeFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

//------------------------------------------------
/*
public class FunctionalInterfaceExample {

	public static void main(String args[])
	{
		BiFunction <Integer,Integer,Integer> add = (a,b)->a+b;
		
		int result = add.apply(20, 10);
		System.out.println("Reult :"+result);
	 }
}
*/
//=======================================
//Consumer
/*
public class FunctionalInterfaceExample {

	public static void main(String args[])
	{
		List<Integer> num = new ArrayList<>();
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);
		
		//First Method 
		System.out.println("First Method ");
		Consumer<Integer> PrintNum = new PrintNumbers();
		num.forEach(PrintNum);
		

		//Secound Method
		System.out.println("Secound Method ");
		PrintNumbers ob = new PrintNumbers();
		Consumer<Integer> PrintNum1= ob;
		num.forEach(PrintNum1);
		
	}
}

class PrintNumbers implements Consumer<Integer>
{

	@Override
	public void accept(Integer number ) {
		System.out.println(number);	
	}
}
*/

//===================================
/*
public class FunctionalInterfaceExample {

	public static void main(String args[])
	{
		List<Integer> num = new ArrayList<>();
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);
		
		Consumer<Integer> PrintNum = (number) -> System.out.println(number);
		
		num.forEach(PrintNum);
		
		//or
		
		num.forEach((number) -> System.out.println(number));
	}
}
*/
//========================================================================s
/*
public class FunctionalInterfaceExample {

	public static void main(String args[])
	{
		List<Integer> num = new ArrayList<>();
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);
		
		Consumer<Integer> PrintNum =new Consumer<>(){
			public void accept(Integer number)
			{
				System.out.println(number);
			}
		};
		
		num.forEach(PrintNum);
		
		//or
		
		//num.forEach((number) -> System.out.println(number));
	}
}

*/

//---------------------------------------------------

// Predicate Using Seaparate Class
/*
public class FunctionalInterfaceExample {

	public static void main(String args[])
	{
		Predicate<Integer> preExa = new PredicateExample();
		
		System.out.println("isEven 4 : "+ preExa.test(4));
		System.out.println("isEven 5 : "+ preExa.test(5));
		System.out.println("isEven 20 : "+ preExa.test(20));
	}
}

class PredicateExample implements Predicate<Integer>
{
	public boolean test(Integer number)
	{
		return number%2==0;
	}	
}
*/

//----------------------------------------------------

//boolean	removeIf(Predicate<? super E> filter):
//Using With ArrayList And Lambda Function

/*
public class FunctionalInterfaceExample {

	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(18);
		list.add(17);
		list.add(21);
		list.add(24);
		
		System.out.println("Remove if Even :");
		Predicate<Integer> PredicateExample = number -> number%2==0;
		list.removeIf(PredicateExample);
		System.out.println(list);
		
		System.out.println("remove if == 45");
		Predicate<Integer> PreExa2 = number -> number==45;
		System.out.println(list.removeIf(PreExa2));
		System.out.println(list);
		
	}
}
*/
//================================================================

//void replaceAll(UnaryOperator<E> operator): 

/*
public class FunctionalInterfaceExample {

	public static void main(String args[])
	{
		ArrayList<Integer> arrlist = new ArrayList<>();
		arrlist.add(11);
		arrlist.add(22);
		arrlist.add(33);
		arrlist.add(44);
		arrlist.add(55);
		
		UnaryOperator<Integer> unary = n -> n*n;
		
		arrlist.replaceAll(unary);
		System.out.println(arrlist);
	}
}
*/
//----------------------------------------------------

public class FunctionalInterfaceExample {

	public static void main(String args[])
	{
		ArrayList<String> arrlist = new ArrayList<>();
		arrlist.add("mango");
		arrlist.add("Banana");
		arrlist.add("Orange");
		
		UnaryOperator<String> unary = n ->n.toUpperCase();
		
		arrlist.replaceAll(unary);
		System.out.println(arrlist);
	}
}



