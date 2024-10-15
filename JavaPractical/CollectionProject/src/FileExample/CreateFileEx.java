package FileExample;
import java.io.*;
/*
 * Create File
 
public class CreateFileEx {

	public static void main(String[] args) {

		File file = new File("myfile.txt");
		
		if(file.exists())
		{
			System.out.println("File is Exits ");
		}
		else
		{
			System.out.println("File Does Not Exits ");
		}
		
		try {
			
			boolean created = file.createNewFile();
			
			if(created)
			{
				System.out.println("File Created SUCCESSFULLY :");
			}
			else 
			{
				System.out.println("File Already Exits :");
			}	
		}catch(IOException e)
		{
			e.printStackTrace();
		};
		
		System.out.println("FIle Info :");
		
		System.out.println("File Name :"+file.getName());
		System.out.println("Asolute Path :"+file.getAbsolutePath());
		System.out.println("File canRead :"+file.canRead());
		System.out.println("File canWrite :"+file.canWrite());
		System.out.println("File Length :"+file.length());
	}
}

//================================================================================

//File Delete

public class CreateFileEx {

	public static void main(String[] args) {

		File file = new File("myfile.txt");
		
		if(file.exists())
		{
			System.out.println("File is Exits ");
		}
		else
		{
			System.out.println("File Does Not Exits ");
		}
		
		try {
			
			boolean created = file.createNewFile();
			
			if(created)
			{
				System.out.println("File Created SUCCESSFULLY :");
			}
			else 
			{
				System.out.println("File Already Exits :");
			}	
		}catch(IOException e)
		{
			e.printStackTrace();
		};
		
		System.out.println("FIle Info :");
		
		System.out.println("File Name :"+file.getName());
		System.out.println("Asolute Path :"+file.getAbsolutePath());
		System.out.println("File canRead :"+file.canRead());
		System.out.println("File canWrite :"+file.canWrite());
		System.out.println("File Length :"+file.length());
		
		if(file.delete())
		{
			System.out.println("File "+file.getName()+" File Deleted");
		}
		else
		{
			System.out.println("unable To Delete File "+file.getName());
		}
	}
}

//===============================================================================

//creating and deleting Directory

public class CreateFileEx {
	public static void main(String[] args) {
		
		String parentDire = "e:\\parentDire" ;
		File ParentDirec = new File(parentDire);
		
		if(!ParentDirec.exists()){
			if(ParentDirec.mkdir())
			{
				System.out.println("File Directory Created SuccessFully :"+ParentDirec.getAbsolutePath());
			}
			else
			{
				System.out.println("Failed TO create Directory :");
				return ;
			}
		}		
		
		String childFile = "ChiledFile.txt";
		
		File file = new File(ParentDirec,childFile);
		
		try {
			
			if(file.createNewFile())
			{
				System.out.println("File is Created "+file.getAbsolutePath());
			}
			else
			{
				System.out.println("File is already Exits :"+file.getAbsolutePath());
			}
		
			System.out.println("getAbsolutePath() "+file.getAbsolutePath());
			System.out.println("getParent() "+file.getParent());
			System.out.println("isDirectory() "+file.isDirectory());
			System.out.println("isFile() "+file.isFile());
			
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
		
		if(file.delete())
		{
			System.out.println("File is Deleted :"+file.getAbsolutePath());
		}
		else
		{
			System.out.println("Failed to delete File :");
		}
		
		if(ParentDirec.delete())
		{
			System.out.println("Parent Directory is Delete :"+ParentDirec.getAbsolutePath());
		}
		else
		{
			System.out.println("Fail To delete ParentDirec ");
		}
	}
}


//========================================================================

//dealing with multiple files


public class CreateFileEx {
	public static void main(String[] args) throws Exception {
		
		File directory = new File("exampleDir");
		
		if(directory.mkdir())
		{
			System.out.println("Directory Created :"+directory.getName());
		}
		else
		{
			System.out.println("Directory is already Exits or fail to create ");
		}
		
		for(int i=0;i<5;i++)
		{
			File file = new File("exampleDir , example "+i+".txt");
			
			if(file.createNewFile())
			{
				System.out.println("File is Created "+file.getName());
			}
			else
			{
				System.out.println("File Already Exits ");
			}
		}
		
		
		// List files in the directory
		
		System.out.println("Files in Dictionary :");
		File[] filelist = directory.listFiles();
		if(filelist!=null)
		{
			for(File f:filelist)
			{
				System.out.println(f.getName());
			}
		}
		
		// Delete the file and directory
		
		if(filelist!=null)
		{
			for(File f :filelist)
			{
				if(f.delete())
				{
					System.out.println("File Delete :"+f.getName());
				}
				else
				{
					System.out.println("fail to Delet File ");
				}
			}
		}
		
		
		if(directory.delete())
		{
			System.out.println("Directory Delete :"+directory.getName());
		}
		else
		{
			System.out.println("Fail to Delete Directory :");
		}
		
	}
}


//=======================================================================

public class CreateFileEx {
	public static void main(String[] args) {
		
		String filename = "example.txt" ;
		String contentToWrite = "Hello, World! This is an example of FileOutputStream and FileInputStream";
		
		FileOutputStream fos = new FileOutputStream(filename);
		
		try(fos)
		{
			fos.write(contentToWrite.getBytes());
			System.out.println("Content Written to file "+filename);
			
		}catch(IOException e)
		{
			System.out.println("Error While Writing Data :"+e.getMessage());
		}
		
		// Read content from file using FileInputStream
		try(FileInputStream fis = new FileInputStream(filename))
		{
			int Content;
			System.out.println("Data to be Read :");
			while((Content=fis.read())!=-1)
			{
				System.out.print((char)Content);
			}
			System.out.println();
		}
		catch(IOException e)
		{
			System.out.println("unable to read :"+e.getMessage());
		}
	}
}
*/
//====================================================================================


public class CreateFileEx {
	public static void main(String[] args) throws Exception {
		
		String Data ="This the data, that we have to write in to the file.";
		File filename = new File("demo.txt");
		FileOutputStream fos = new FileOutputStream(filename);
		
		byte b[]=Data.getBytes();
		fos.write(b);
		
		FileInputStream fis = new FileInputStream(filename);
		byte ba[] = new byte[fis.available()];
		fis.read(ba);
		
		System.out.println("Data read for :");
		for(byte t : ba)
		{
			System.out.print((char)t);
		}
		
		fis.close();
		
	}
}