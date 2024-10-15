package FileIO;

import java.io.ByteArrayInputStream;
/*
 * 
public class ByteArrayInputStremExam {

	public static void main(String[] args) {
		
		String str="Hello World";
		byte barr[]=str.getBytes();
		ByteArrayInputStream bais = new ByteArrayInputStream(barr);
		
		int ch;
		ch=bais.read();
		
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch=bais.read();
		}
	}
}
*/
//===================================================================

import java.io.*;
public class ByteArrayInputStremExam {

	public static void main(String[] args) {
	
		String data = "Hello World";
		try {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte arr[]=data.getBytes();
		baos.write(arr);
		
		String str = baos.toString();
		System.out.println("Output Stream :"+str);
		
		baos.close();
		
		}catch(Exception e) {};
	}
}