package ShopeSource2;

import java.util.List;
import java.util.Scanner;

public class Create {

	//For Create Items
	public static void CreateItems(Scanner sc, List<Items> items)
	{
		//sc.nextLine();
		System.out.println("Enter Your ItemCode:");
		int ItemCode=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Your ItemPrice");
		double ItemPrice = Double.parseDouble(sc.nextLine());

		System.out.println("Enter Your Itemname:");
		String Itemname = sc.nextLine();
		
		System.out.println("Enter Your ItemMRP:");
		double ItemMRP = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter Your ItemCount:");
		int ItemCount = Integer.parseInt(sc.nextLine());
		
		items.add(new Items(ItemCode,ItemPrice,Itemname,ItemMRP,ItemCount));
		
		System.out.println("Item is Created ");	
	}
}
