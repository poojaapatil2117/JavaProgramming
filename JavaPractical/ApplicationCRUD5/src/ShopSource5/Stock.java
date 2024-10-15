package ShopSource5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StockItems implements Serializable
{
	private int code;
	private int count;
	
	public StockItems(int code,int count)
	{
		this.code=code;
		this.count=count;
	}
	
	public int GetCodeStock()
	{
		return code;
	}
	
	public int GetCountStock() 
	{
		return count;
	}

	public void Setcount(int count)
	{
		this.count=count;
	}

	public String toString()
	{
		return "StockItems{ Code : "+code+"\tCount : "+count+"}";
	}
	
}

class StockUtil
{
	private static final String stockfile = "stockfile1";
	

	public static void WriteFileStock(List<StockItems> stockitems) throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(stockfile));)
		{
			oos.writeObject(stockitems);
		}
	}

	public static List<StockItems> LoadFileStock() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		File file = new File(stockfile);
		if(!file.exists())
		{
			return new ArrayList<>();
		}
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(stockfile));)
		{
			return (List<StockItems>) ois.readObject();
		}
	}
	
}
public class Stock {
	
	public static void StockMenu()
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			boolean running=true;
			String opt;
			
			List<StockItems> stockitems = StockUtil.LoadFileStock();
			List<Items> items = FileUtilItem.LoadFileItems();
			
			while(running)
			{
				System.out.println("Choose Operation on Stock : createstock,readstock,deletestock,updatestock,exit");
				opt = sc.nextLine();
				
				switch(opt.toLowerCase())
				{
					case "createstock":
						CreateStock(sc,stockitems,items);
						break;
						
					case "readstock":
						ReadStock(stockitems);
						break;
						
					case "updatestock":
						UodateStock(sc,stockitems);
						break;	
						
					case "deletestock":
						DeleteStock(sc,stockitems);
						break;
					
					case "exit":
						System.exit(0);
						
					default:
						System.out.println("Invalid Option");
				}
				StockUtil.WriteFileStock(stockitems);
			}
		}
		catch(Exception e) {}
	}
	 
	
	public static void CreateStock(Scanner sc , List<StockItems> stockitems,List<Items> items)
	{
		int count=0; 
		System.out.println("Enter The Code");
		int code = Integer.parseInt(sc.nextLine());
		  
		for(Items i : items)
		{
			if(code==i.GetItem_Code())
			{
				System.out.println("Enter Your Stock Count");
				count = Integer.parseInt(sc.nextLine());
				stockitems.add(new StockItems(code,count));
			}
		}
		
	}
	 
	public static void ReadStock(List<StockItems> stockitems)
	{
		if(stockitems.isEmpty())
		{ 
			System.out.println("List is Empty");
		}
		else
		{
			for(StockItems i:stockitems)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void UodateStock(Scanner sc , List<StockItems> stockitems)
	{
		int code,count,updatedcount;
		String addRemove;
		System.out.println("Enter The Code You Want to Update:");
		code = Integer.parseInt(sc.nextLine());
		
		
		for(StockItems i : stockitems)
		{
			if(code==i.GetCodeStock())
			{
				System.out.println("What Do you Want ? 'add' or 'remove' ");
				addRemove=sc.nextLine();
				
				if(addRemove.equals("add"))
				{
					System.out.println("Enter The Count You Want to Add");
					count = Integer.parseInt(sc.nextLine());
					updatedcount=count+i.GetCountStock();
					i.Setcount(updatedcount);
				}
				else
				{
					System.out.println("-------------------------------------");
				}
			}
		}
	}

	public static void DeleteStock(Scanner sc,List<StockItems> stockitems)
	{
		System.out.println("Enter The ItemCode You Want To Delete :");
		int DeleteCode = Integer.parseInt(sc.nextLine());
		stockitems.removeIf(stockitem->stockitem.GetCodeStock()==DeleteCode);
		System.out.println("Stock_Item is Removed");
	}
}
