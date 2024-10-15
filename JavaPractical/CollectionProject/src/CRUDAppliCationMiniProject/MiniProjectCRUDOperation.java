package CRUDAppliCationMiniProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Items implements Serializable
{
	private static final long SerialUID = 1L;
	private int id;
	private String name;
	
	public Items(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public int GetId()
	{
		return id;
	}
	
	public String GetName()
	{
		return name;
	}
	
	public void SetName(String name)
	{
		this.name=name;
	}
	
	public String toString()
	{
		return "Items { Name : "+ name + "\tid : " + id  + "}";
	}
}

class FileUtil
{
	private static final String FileName = "items.txt";
	
	public static void SaveItems(List<Items> items) throws IOException
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FileName));)
		{	
			oos.writeObject(items);
		}
	}
	public static List<Items> loadItems() throws IOException,ClassNotFoundException 
	{
		File file = new File(FileName);
		if(!file.exists())
		{
			return new ArrayList<>();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FileName));)
		{
			return (List<Items>) ois.readObject();
		}
	}
	
}

public class MiniProjectCRUDOperation {

	public static void main(String[] args) {
		try
		{
			List<Items> items = FileUtil.loadItems();
			Scanner sc = new Scanner(System.in);
			boolean running = true;
			
			while(running)
			{
				//sc.nextLine();
				System.out.println("Choose An Operation : create , read , update , delete , exit");
				String Opration = sc.nextLine();
				
				switch(Opration.toLowerCase())
				{
					case "create":
						CreateItems(sc,items);
						break;
						
					case "read":
						readItems(items);
						break;
						
					case "update":
						UpdateItems(sc,items);
						break;
						
					case "delete":
						DeleteItems(sc,items);
						break;
						
					case "exit":
						running = false;
						break;
					
					default :
						System.out.println("Wrong Choice");
				}
				
				FileUtil.SaveItems(items);
			}
		}
		catch(IOException  | ClassNotFoundException e) 
		{
			System.err.println("Error :"+e.getMessage());
		};
	}
	
	//For Create Items
	public static void CreateItems(Scanner sc,List<Items> items)
	{
		
		//sc.nextLine();

		System.out.println("Enter Your Name:");
		String name = sc.nextLine();
		

		System.out.println("Enter Your Id:");
		int id=Integer.parseInt(sc.nextLine());
		
		
		items.add(new Items(id,name));
		System.out.println("Item is Created ");	
	}
	
	//For Read Items
	
	public static void readItems(List<Items> items)
	{
		if(items.isEmpty())
		{
			System.out.println("Items Not Foound ");
		}
		else
		{
			for(Items item:items)
			{
				System.out.println(item);
			}
		}
	}
	
	//For Update Items
	
	public static void UpdateItems(Scanner sc ,List<Items> items)
	{
		System.out.println("Enter The Item Id For Update :");
		int id  = Integer.parseInt(sc.nextLine());
		for(Items item :items)
		{
			if(item.GetId()==id)
			{
				System.out.println("Enter New Items Name :");
				String nName = sc. nextLine();
				item.SetName(nName);
				System.out.println("Items Updated");
				return;
			}
		}
		System.out.println("Item Not Found ");
	}
	
	//For Delete Items
	
	public static void DeleteItems(Scanner sc , List<Items> items)
	{
		System.out.println("Enter The Item Id You Want TO delete");
		int id = Integer.parseInt(sc.nextLine());
		
		items.removeIf( item -> item.GetId() == id);
		System.out.println("Item is Removed ");
	}
}

