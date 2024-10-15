package FileIO;

import java.io.*;
/*
public class InputStreamReaderExample {

	public static void main(String[] args) {
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("Example.txt"),"UTF-8"))
		{
			int data;
			while( (data = isr.read()) != -1)
			{
				System.out.print((char)data);
			}
			
		}catch(Exception e){e.printStackTrace();}
	}

}
*/
//========================================================

//Output Stream Writer


public class InputStreamReaderExample {

	public static void main(String[] args) {
		
		try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("output.txt"),"UTF-8"))
		{
			osw.write("Hello World !");
			osw.write("\n This is The Example Of OutputStream ");
			
		}catch(Exception e){e.printStackTrace();}
	}

}