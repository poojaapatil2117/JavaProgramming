package ShopSource3;

import java.util.List;
import java.util.Scanner;

/*
 Sell Class 
 */
public class Sell {

	public static void SellItems(Scanner sc,List<Items> items,List<Cart> carts)
	{
		Cart cart = new Cart();
		int code,count;
		String opt;
		do
		{
			System.out.println("Enter The ItemCode Do You Want");
			code = Integer.parseInt(sc.nextLine());
			System.out.println("Enter The Item Count");
			count = Integer.parseInt(sc.nextLine());
			
			cart.AddItems(new Bill(CartUtil.GetItemsByCode(items,code),count));
			
			System.out.println("Press 'yes' to Continue And 'no' for Strop");
			opt= sc.nextLine();
		
		}while(opt.equals("yes"));
		
		carts.add(cart);
	}
}
