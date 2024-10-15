package ShopeSource2;

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
import java.util.Date;

class CartItems implements Serializable
{

	static int BillNumber = 0;
	
	private static final long serialVersionUID = 1L;
	private int ICode;
	private double IPrice;
	private String Iname;
	private int ICount;
	private double IMRP;
	private int count;
	
	public CartItems (Items i,int cnt)
	{
			ICode = i.GetItemCode();
			IPrice= i.GetItemPrice();
			Iname=i.GetName();
			ICount=i.ItemCount();
			IMRP=i.GetMRP();
			count = cnt;
	}
	public double GetMrpPrice()
	{
		return IMRP;
	}
	public int GetIcode()
	{
		return ICode;
	}
	
	public String toString()
	{
		return "Icode : "+ICode+"\tIName : "+Iname+"\tIcount : "+count+"\tIMRP :"+IMRP;
	}
	
	public void SetCountCart(int ICount)
	{
		this.ICount=ICount;
	}
	
	public static void UserCartTot(List<CartItems> cartitems)
	{
		Scanner sc = new Scanner(System.in);
		double TotBill=0;
		
		int NN=BillNumber;
		TotBill=0;
		System.out.println("User Cart :");	
		
		for(CartItems i:cartitems)
		{
			TotBill = TotBill+i.GetMrpPrice();
			 System.out.println(i);
		}
		
		System.out.println("TotBill = "+TotBill);
		BillNumber++;
		System.out.println("BillNumber : "+BillNumber);
	}
}

class CartItemsUtil
{
	private static final String fileCart = "Cartitems.txt";
	
	public static void SaveCartItem(List<CartItems> cartItem) throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream oosCart = new ObjectOutputStream(new FileOutputStream(fileCart));)
		{
			oosCart.writeObject(cartItem);
		}
	}
	public static List<CartItems> LoadItemsCart() throws  IOException, ClassNotFoundException
	{
		File file= new File(fileCart);
		if(!file.exists())
		{
			return new ArrayList<>();
		}
		try(ObjectInputStream oiscart = new ObjectInputStream(new FileInputStream(fileCart));)
		{
			return (List<CartItems>) oiscart.readObject();
		}
	}
}

public class Cart {
	
			public static void CartItem(Scanner sc , List<Items> items) throws NumberFormatException, IOException, ClassNotFoundException
			{	
				List<CartItems> cartitems = CartItemsUtil.LoadItemsCart();
				
				Date currentDate = new Date();
				
				boolean running = true;
				int cnt=0;
				int GetItemCode;
				double TotBill=0;
		
				for(Items i :items)
				{
					System.out.print("\n"+i);
				}
		
				outer:do
				{
					System.out.println("\nEnter The Element Icode You Want :");
					GetItemCode = Integer.parseInt(sc.nextLine());
					for(Items i : items)
					{
						if(i.GetItemCode()==GetItemCode)
						{
							System.out.println("Enter The Count you Want :");
							cnt = Integer.parseInt(sc.nextLine());
					
							if(i.ItemCount()>cnt)
							{
								cartitems.add(new CartItems(i,cnt));
								cnt = i.ItemCount()- cnt;
								i.SetCount(cnt);
								
								FileUtil.SaveItems(items);	
								CartItemsUtil.SaveCartItem(cartitems);
							}
							else
							{
								System.out.println("Not Available");
							}
						}
					}
					
					System.out.println("Do You Want To Purchase More :");
					boolean purchase = Boolean.parseBoolean(sc.nextLine());
					
					if(purchase==true)
					{
						continue outer;
					}
					else
					{
						running =false;
					}
				}while(running);
				
		
				CartItems.UserCartTot(cartitems);
				
				System.out.println(currentDate);
				
				System.out.println("------------------------------------------------------");
			}
}