package ShopeSource4;

import java.util.List;
import java.util.Scanner;

/*
 Sell Class 
 */
public class Sell {

	public static void SellItems(Scanner sc,List<Items> items,List<Cart> carts,List<Stock> stocks)
	{
		Cart cart = new Cart();
		Stock stock = new Stock();
		
		System.out.println("List Of Items");
		for(Items i:items)
		{
			System.out.println("\n"+i);
		}
		
		int code,count;
		String opt;
		do
		{
			System.out.println("Enter The ItemCode Do You Want");
			code = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter The Item Count");
			count = Integer.parseInt(sc.nextLine());
			
			for(Items i:items)
			{
				if(code == i.GetItem_Code())
				{
					if(count<=i.GetCout())
					{
						int StockCount = i.GetCout()-count;
						i.SetCount(StockCount);
					}
					else
					{
						System.out.println("Sorry! We have Insufficeint Stock");
					}
				}
			}
			
			cart.AddItems(new Bill(CartUtil.GetItemsByCode(items,code),count));

			System.out.println("Press 'yes' to Continue And 'no' for Strop");
			opt= sc.nextLine();
		
		}while(opt.equals("yes"));
		
		carts.add(cart);
		stocks.add(stock);
		
	}
}
