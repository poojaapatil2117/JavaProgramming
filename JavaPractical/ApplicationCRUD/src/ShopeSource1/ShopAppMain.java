package ShopeSource1;

//Create Feilds

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
	private static final long serialVersionUID = 1L;
	private int ItemCode;
	private double ItemPrice;
	private String Itemname;
	private int ItemCount;
	private double ItemMRP;
	
	public Items(int ItemCode,double ItemPrice,String Itemname,double ItemMRP,int ItemCount)
	{
		this.ItemCode=ItemCode;
		this.ItemPrice=ItemPrice;
		this.Itemname=Itemname;
		this.ItemMRP=ItemMRP;
		this.ItemCount=ItemCount;
	}
	
	public int GetItemCode()
	{
		return ItemCode;
	}
	public double GetItemPrice()
	{
		return ItemPrice;
	}
	public String GetName()
	{
		return Itemname;
	}
	public double GetMRP()
	{
		return ItemMRP;
	}
	
	public int ItemCount()
	{
		return ItemCount;
	}
	
	public void SetName(String Itemname)
	{
		this.Itemname=Itemname;
	}
	
	public String toString()
	{
		return "Items { Name : "+ Itemname + "\tItemCode : " + ItemCode  +"\tItemPrice : "+ItemPrice+"\tItemMRP : "+ItemMRP+"\tItemCount : "+ItemCount +"}";
	}
}

class FileUtil
{
	private static final String FileName1 = "shopitems.txt";
	
	public static void SaveItems(List<Items> items) throws IOException
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FileName1));)
		{	
			oos.writeObject(items);
		}
	}
	public static List<Items> loadItems() throws IOException,ClassNotFoundException 
	{
		File file = new File(FileName1);
		if(!file.exists())
		{
			return new ArrayList<>();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FileName1));)
		{
			return (List<Items>) ois.readObject();
		}
	}
}
public class ShopAppMain
{
	public static void main(String[] args)
	{
		try
		{
			List<Items> items = FileUtil.loadItems();
			Scanner sc = new Scanner(System.in);
		
			while(true)
			{
				
				System.out.println("Enter Your Operation :create , read , update , delete , exit");
				String Operation = sc.nextLine();
			
				switch(Operation.toLowerCase())
				{
					case "create":
						Create.CreateItems(sc, items);
						break;
						
					case "read":
						Read.readItems(items);
						break;
						
					case "update":
						Update.UpdateItems(sc, items);
						break;
						
					case "delete":
						Delete.DeleteItems(sc, items);
						break;
						
					case "exit":
						System.exit(0);
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
		}
	}
}
