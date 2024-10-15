package ShopSource5;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sell {

	public static void SellItems(Scanner sc,List<Items> items,List<Cart> carts,List<StockItems> stockitems) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		Cart cart = new Cart();
		Stock stock = new Stock();
		
		
		System.out.println("List Of Items");
		for(Items i:items)
		{
			System.out.println(i);
		}

		System.out.println("List Of StockItems");
		for(StockItems si:stockitems)
		{
			System.out.println(si);
		}
		
		int code,count = 0,cntforbill = 0;
		String opt,havestack;
		do
		{
			System.out.println("Enter The ItemCode Do You Want");
			code = Integer.parseInt(sc.nextLine());

			for(StockItems i:stockitems)
			{
				if(code==i.GetCodeStock())
				{
					for(Items j :items)
					{
						if(code==j.GetItem_Code())
						{
							if(i.GetCountStock()==0)
							{
								System.out.println("Sorry we Dont Have That Stock");
								return ;
							}
							
							System.out.println("Enter The Item Count"); 
							count = Integer.parseInt(sc.nextLine()); 
							cntforbill=count;
							
							System.out.println("Have Sufficent Stock ?: 'yes' or 'no' ");
							havestack = sc.nextLine();
							
						
							if(havestack.equals("yes"))
							{
								count = i.GetCountStock()-count;
					 			//i.Setcount(count);
								System.out.println("Count is Updated");
								Bill.addBill(code,cntforbill,j.GetItem_MRP());
								StockUtil.WriteFileStock(stockitems);    
							}
							else
							{
								System.out.println("We Have That "+i.GetCountStock()+" Amount Do You Want:'yes' or 'no'");
								String a = sc.nextLine();
								if(a.equals("yes"))
								{
									count = i.GetCountStock()-count;
									Bill.addBill(code,i.GetCountStock(),j.GetItem_MRP());
									i.Setcount(0);
									StockUtil.WriteFileStock(stockitems); 
								}
							}
						} 
					}
				}
			}
			
			cart.AddItems(new Bill(CartUtil.GetItemsByCode(items,code),cntforbill));
			
			System.out.println("Do You Want surchase More :Press 'yes' to Continue And 'no' for Strop");
			opt= sc.nextLine();
		
		}while(opt.equals("yes"));
		
		carts.add(cart);
		
	}
}
