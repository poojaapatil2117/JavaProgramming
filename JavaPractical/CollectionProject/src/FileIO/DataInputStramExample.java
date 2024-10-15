package FileIO;

import java.io.*;
/*
public class DataInputStramExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter Any String :");
		
		String str = dis.readLine();
		System.out.println("String is :"+str);
		
		System.out.println("\nEnter Any Integer");
		int integer=Integer.parseInt(dis.readLine());
		System.out.println("Integer val is :"+integer);
		
		System.out.println("Enter any Double Value");
		double DoubleVal=Double.parseDouble(dis.readLine());
		System.out.println("Double Value is :"+DoubleVal);
	}
}

*/

//===============================================================================

public class DataInputStramExample {
	public static void main(String[] args) throws IOException {
		
		String Path = "E:\\MyFILE.txt";
		
		FileOutputStream fos = new FileOutputStream(Path);
		DataOutputStream dos = new DataOutputStream(fos);

		dos.writeUTF("Hello");
		dos.writeInt(45);
		dos.writeDouble(264.37647);
		dos.writeBoolean(true);
		dos.writeChar('c');
		
		dos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(Path);
		
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readUTF());
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		
		fis.close();
		dis.close();
		
		
	}
}