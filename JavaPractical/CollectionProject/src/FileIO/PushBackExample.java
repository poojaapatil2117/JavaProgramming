package FileIO;

import java.io.*;
public class PushBackExample {

	public static void main(String[] args)throws Exception{
		
		String filepath = "myfileout.txt";
		
		FileInputStream fis = new FileInputStream(filepath);
		
		PushbackInputStream pbis = new PushbackInputStream(fis);
		
		byte bytedata;
		
		while((bytedata=(byte)pbis.read())!=-1)
		{
			System.out.println((char)bytedata);
			
			pbis.unread(bytedata);
			
			bytedata = (byte)pbis.read();
			
			System.out.print((char)bytedata);
		}
	}

}
