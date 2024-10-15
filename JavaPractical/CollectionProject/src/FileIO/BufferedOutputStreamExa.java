package FileIO;

import java.io.*;
/*
 * 
public class BufferedOutputStreamExa {
	public static void main(String args[])
	{
		try 
		{	
		FileOutputStream fos = new FileOutputStream("E:\\myfile.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(fos) ;
		
		String s = "Wel-come ";
		byte b[] = s.getBytes();
		
		bos.write(b);
		
		bos.close();
		
		fos.close();
		
		System.out.println("Successfully Writtem");
		}catch(Exception e) 
		{
			e.printStackTrace();
		};
	}	
}

*/
//===============================================

//Example 2:

public class BufferedOutputStreamExa{
	public static void main(String args[])
	{
		try 
		{	
		FileOutputStream fos = new FileOutputStream("E:\\myfile1.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(fos) ;
		
		String s = "Rohit Sharma is an Indian Cricketer ";
	
		bos.write(s.getBytes());
		bos.flush();
		bos.close();
		
		fos.close();
		
		System.out.println("Successfully Writtem");
		}catch(Exception e) 
		{
			e.printStackTrace();
		};
	}	
}

