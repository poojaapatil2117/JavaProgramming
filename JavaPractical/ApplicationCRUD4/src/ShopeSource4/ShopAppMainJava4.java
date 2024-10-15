package ShopeSource4;

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


class Items implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int ICode;
	private String IName;
	private double IPrice;
	private double IMRPPRice;
	private int ICount;
	private int StockCCount;
	
	public Items(int ICode,String IName,double IPrice,double IMRPPRice,int ICount)
	{
		this.ICode=ICode;
		this.IName=IName;
		this.IPrice=IPrice;
		this.IMRPPRice=IMRPPRice;
		this.ICount=ICount;
	}
	
	public int GetItem_Code()
	{
		return ICode;
	}
	
	public String GetItem_Name()
	{
		return IName;
	}
	
	public double GetItem_Price()
	{
		return IPrice;
	}
	
	public double GetItem_MRP()
	{
		return IMRPPRice;
	}
	public int GetCout()
	{
		return ICount;
	}
	
	public void SetCount(int cnt)
	{
		this.ICount=cnt;
	}
	
	public void SetItem_Name(String name)
	{
		this.IName = name;
	}

	List<Stock> stock = new ArrayList<Stock>();
	
	public String toString()
	{
		return "Items{Code : "+ICode+"\tName : "+IName+"\tPrice : "+IPrice+"\tMRPPrice : "+IMRPPRice+"\tCount : "+ICount+ "}";
	}
}

class FileUtilItem
{
	public static final String Items_File_Name = "items4.txt";
	
	public static void WriteFileItems(List<Items> items) throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Items_File_Name));)
		{
			oos.writeObject(items);
		}
	}
	
	public static List<Items> LoadFileItems() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		File file = new File(Items_File_Name);
		if(!file.exists())
		{
			return new ArrayList<>();
		}
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Items_File_Name));)
		{
			return (List<Items>) ois.readObject();
		}
	}
}

public class ShopAppMainJava4 {

	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			boolean running = true;
			
			List<Items> items = FileUtilItem.LoadFileItems();
			List<Cart> cartitems = CartUtil.LoadCart();
			List<Stock> stocksitems = StockUtil.LoadStock();
			
			while(running)
			{
				System.out.println("Choose Operation : create , read , update , delete , sell , allcart , stock , exit ");
				String Option = sc.nextLine();
				
				switch(Option.toLowerCase())
				{
					case "create":
						Create.CreateItems(sc, items,stocksitems);
						break;
						
					case "read":
						Read.ReadItems(items);
						break;
						
					case "update":
						Update.UpdateItems(sc, items);
						break;
						
					case "delete":
						Delete.DeleteItems(sc, items); 
						break;
						
					case "sell":
						Sell.SellItems(sc,items,cartitems,stocksitems);
						CartUtil.WriteCart(cartitems);
						break;
						
					case "allcart":
						
						List<Cart> list = CartUtil.LoadCart();
						for(int i=0;i<list.size();i++)
						{
							System.out.println("\n---------------Cart"+(i+1)+"-------------------");
							CartUtil.Showbills(list.get(i));
						}
						
					case "stock":
						List<Stock> stocklist = StockUtil.LoadStock();
						for(int i=0;i<stocklist.size();i++)
						{
							
						}
						break;
			
					case "exit":
						System.exit(0);
						break;
						
					default:
						System.out.println("Invalid Option");
				}
				FileUtilItem.WriteFileItems(items);
			}
		}
		catch(IOException | ClassNotFoundException e)
		{
			System.err.println("Error :"+e.getMessage());
		}
	}

}
