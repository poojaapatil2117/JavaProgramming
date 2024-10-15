package FileIO;

import java.io.*;
/*
public class ReaderAndWritterClassExamOfBufferReadAndWrite {

	public static void main(String[] args) {
		
		String InputFile = "New.txt";
		String OutputFile = "Destination.txt";
		
		try(BufferedReader  br = new BufferedReader(new FileReader(InputFile));
			BufferedWriter bw = new BufferedWriter (new FileWriter(OutputFile));)
		{
			String line;
			
			while((line = br.readLine())!=null)
			{
				bw.write(line);
				bw.newLine();
			}
		}catch(Exception e) {e.printStackTrace();}

	}
}
*/
//=============================================================
/*
public class ReaderAndWritterClassExamOfBufferReadAndWrite {

	public static void main(String[] args) {
		
		String filePath = "New.txt";
		
		int WordCnt =0;
		
		
		try(BufferedReader  br = new BufferedReader(new FileReader(filePath));)
		{
			String line;
			
			while((line = br.readLine())!=null)
			{
				String[] word = line.split("\\s+");
				WordCnt +=word.length;
			}
		}catch(Exception e) {e.printStackTrace();}
		
		System.out.println("Word COunt = "+ WordCnt);

	}
}
*/
//===========================================
public class ReaderAndWritterClassExamOfBufferReadAndWrite {

	public static void main(String[] args) {
		
		String filePath = "New.txt";		
		
		try(BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));)
		{
			String name;
			System.out.println("Enter Your Name :");
			name = br.readLine();
			System.out.println("Hello "+name +" !");
		}catch(Exception e) {e.printStackTrace();}
	}
}
