package FileIO;

import java.io.*;
/*
public class BufferInputStramExample {

	public static void main(String[] args) {
		try{
			
		FileInputStream  fis = new FileInputStream("E:\\myfile.txt");
		
		BufferedInputStream bis= new BufferedInputStream(fis);
		
		int i=0;
		while((i=bis.read())!=-1)
		{
			char ch=(char)i;
			System.out.print(ch);
		}
		bis.close();
		fis.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
*/
//===========================================================

//Example 2:

public class BufferInputStramExample {

	public static void main(String[] args) {
		try{
			
		FileInputStream  fis = new FileInputStream("E:\\myfile.txt");
		
		BufferedInputStream bis= new BufferedInputStream(fis);
		
		bis.skip(5);
		System.out.println("Output After Skip 5 words :");
		int i=0;
		while((i=bis.read())!=-1)
		{
			char ch=(char)i;
			System.out.print(ch);
		}
		bis.close();
		fis.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
