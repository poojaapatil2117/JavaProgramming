package FileIO;

import java.io.*;
/*
public class PrintStreamExample {

	public static void main(String[] args) {
		
		PrintStream ps = System.out;
		
		ps.print("\nHello");
		ps.println("\nWel-Come to World ");
		ps.printf("\ninteger Value : %d ",78);
		ps.printf("\nFloating Value : %.2f",4386.23487);
		
		boolean b = true;
		char c = 'A'; 
		int a = 10;
		float f= 32.23f;
		long l = 37262384L;
		double d =235.4362;
		String str = "Rohit Sharma is Indian Cricketer ";
		
		ps.println(b);
		ps.println(c);
		ps.println(a);
		ps.println(f);
		ps.println(l);
		ps.println(d);	
	}
}

//==========================================================

//Exmple 2:

public class PrintStreamExample {

	public static void main(String[] args) {
	
		try {PrintStream ps = new PrintStream(new FileOutputStream("Output.txt"));
		
			ps.println("Writing to a File ");
			ps.printf("Formatted Number :%d%n",100);
		}
		
		catch(Exception e) {e.printStackTrace();};
		
	}
}

//==============================================================

//Example 3:


import java.util.Date;
public class PrintStreamExample {

	public static void main(String[] args) {
	
			PrintStream ps = System.out;

			ps.printf("Current Date and Time : %tc%n",new Date());
			ps.printf("Numbers With Leading Zero : %o4d%n ",5);
			ps.printf("Floating pointnumberwithtwoDecinmal %.2f%n",123.456);
			ps.printf("Right Justified Number %10d%n",42);
	}
}
*/
//===========================================================================

//Example 4:


public class PrintStreamExample {

	public static void main(String[] args) {
	
		
		try {
			PrintStream ps = new PrintStream(new FileOutputStream("Output_1.txt"));
			
			System.setOut(ps);
			
			System.out.println("This Will Be Writtern TO File :");
			System.out.printf("Formated Output to the file : %d%n",10);
			
		}catch(Exception e) {e.printStackTrace();};
		
	}
}
