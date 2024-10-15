package FileIO;

import java.io.*;

public class FileReaderWritterExample {

	public static void main(String[] args) {
		
		String filename = "myfile.txt";
		String Data = "Hello World in the File Read And Write";
		
		try(FileWriter writer = new FileWriter(filename)) {
			
			writer.write(Data);
			System.out.println("Data Writtern to File :"+filename);		
		}catch(Exception e) {e.printStackTrace();}
		
		
		
		
		try (FileReader fileRead = new FileReader(filename)){
			int ch;
			System.out.println("Data Read From File ");
			while((ch = fileRead.read())!=-1)
			{
				System.out.print((char)ch);
			}
			
		}catch(Exception e) {e.printStackTrace();}
	}

}
