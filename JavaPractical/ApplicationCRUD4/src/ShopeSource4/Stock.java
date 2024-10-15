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

class StockUtil
{
	public static final String Stock_File = "stockfile";

	public static void WriteStock(List<Stock> stock) throws  IOException
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Stock_File));)
		{
			oos.writeObject(stock);
		}
	}
	
	public static List<Stock> LoadStock() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		File FileC = new File(Stock_File);
		if(!FileC.exists())
		{
			return new ArrayList<>();
		}
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Stock_File));)
		{
			return (List<Stock>) ois.readObject();
		}
	}

	public static Items GetItemsByCount(List<Items> items, int code) {

		for(Items i:items)
		{
			if(code==i.GetItem_Code())
			{
				return i;
			}
		}
		return null;
	}
}

public class Stock implements Serializable
{	
	public static void StockItems(List<Items> items)
	{
		
	}
}
