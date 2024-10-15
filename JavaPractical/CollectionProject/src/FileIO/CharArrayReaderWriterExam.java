package FileIO;

import java.io.*;
public class CharArrayReaderWriterExam {

	public static void main(String[] args) {
		CharArrayWriter charArrayW = new CharArrayWriter();
		
		String data = "Hello World !";
		
		try {
			
			charArrayW.write(data);
			
			char[] charArray = charArrayW.toCharArray();
			
			System.out.println("Wittern To char array : "+new String(charArray));
			
			CharArrayReader charArrayR = new CharArrayReader(charArray);
			
			//Read And Print The Data From CharArray:
			
			int i;
			System.out.println("Read The Data FromChar Array:");
			
			while((i=charArrayR.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			charArrayW.close();
			charArrayR.close();
		}catch(Exception e) 
		{e.printStackTrace();}
	}

}
