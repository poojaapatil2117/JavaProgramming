package ShopSource3;

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

class CartUtil
{

	public static final String CartFile = "cartitems.txt";
	
	public static void WriteCart(List<Cart> cart) throws  IOException
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CartFile));)
		{
			oos.writeObject(cart);
		}
	}
	
	public static List<Cart> LoadCart() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		File FileC = new File(CartFile);
		if(!FileC.exists())
		{
			return new ArrayList<>();
		}
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CartFile));)
		{
			return (List<Cart>) ois.readObject();
		}
	}

	public static Items GetItemsByCode(List<Items> items, int code) 
	{
		for(Items i:items)
		{
			if(code==i.GetItem_Code())
			{
				return i;
			}
		}
		return null;
	}
	public static void Showbills(Cart c)
	{
		c.ShowBillItems();
	}
}

public class Cart implements Serializable{

	private static final long serialVersionUID = 1L;
	
	List<Bill> list = new ArrayList<Bill>();
	
	public void AddItems(Bill bill)
	{
		list.add(bill);
	}	
	
	public void ShowBillItems()
	{
		for(int i=0;i<list.size();i++) 
		{
			list.get(i).ShowBilledItems();
		}
	}
}
