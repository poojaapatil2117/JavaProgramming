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

class Cart implements Serializable
{
	static int BillNumber=0;
	private static final long serialVersionUID = 1L;
	private int Icode;
	private String Itemname;
	private double MRPPrice;
	private double IndiviTot;
	private int ItemCout;
	
	public Cart(Items i,Bill bill,int cnt)
	{
		Icode = i.GetItemCode();
		Itemname=i.GetName();
		MRPPrice=i.GetMRP();
		IndiviTot=bill.Individial_Tot;
		ItemCout=cnt;
	}
	public double GetMRP()
	{
		return MRPPrice;
	}
	
	public String toString()
	{
		return "ICode: "+Icode+"\tItemName: "+Itemname+"\tMrpPrice: "+MRPPrice+"\tItemCount: "+ItemCout+"\tTot = "+IndiviTot;
	}
	
	public static void FinalTotal(List<Cart> Cartitems)
	{
		Scanner sc = new Scanner(System.in);
		double FinalTot = 0;
		for(Cart i : Cartitems)
		{
			FinalTot = FinalTot+i.GetMRP();
		}
		System.out.println("FinalTotal = "+FinalTot);
		System.out.println("Is Your Bill Clear?");
		String billclear = sc.nextLine();
		BillNumber++;
		System.out.println("BillNumber = "+BillNumber);
	}
}
class CartUtil
{
	private static final String cartfile ="cartfile1.txt";
	
	public static void SaveCart(List<Cart> cartitem) throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(cartfile));)
		{
			oos.writeObject(cartitem);
		}
	}
	
	public static List<Cart> LoadCart() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		File file1 = new File(cartfile);
		if(!file1.exists())
		{
			return new ArrayList<>();
		}
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(cartfile));)
		{
			return (List<Cart>) ois.readObject();
		}
	}
}

public class SelItems{

	public static void Sell(Scanner sc, List<Items> ob) throws FileNotFoundException, ClassNotFoundException, IOException
	{
		String opt;
		List<Cart> cart = CartUtil.LoadCart();
		
		System.out.println("-----------Items List-------------");
		for(Items i : ob)
		{
			System.out.print("\n"+i);
		}
		
		do
		{
			System.out.println("\nEnter ItemCode You Want To Purchase :");
			int code = Integer.parseInt(sc.nextLine());
			
			for(Items i:ob)
			{
				if(code==i.GetItemCode())
				{
					System.out.println("Enter The ItemCount You Want");
					int cnt=Integer.parseInt(sc.nextLine());
					
					Bill bill = new Bill(code,ob,cnt);	
					FileUtil.addItems(bill);
				
					cart.add(new Cart(i,bill,cnt));
				}
			}
			
			System.out.println("Yes To Continue Shopping OtherWise No ");
			opt = sc.nextLine();
			
		}while(opt.equals("Yes"));
		CartUtil.SaveCart(cart);
		
		for(Cart cartitem:cart)
		{
			System.out.println("\n"+cartitem);
		}
		
		Cart.FinalTotal(cart);
	}
}
