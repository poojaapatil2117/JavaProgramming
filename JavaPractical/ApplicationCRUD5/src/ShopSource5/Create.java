package ShopSource5;

import java.util.List;
import java.util.Scanner;


public class Create {

	public static void CreateItems(Scanner sc,List<Items> items)
	{
		System.out.println("Enter Item_Code");
		int code = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Item_Name");
		String name = sc.nextLine();
		
		System.out.println("Enter Item_Price");
		double price = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter Item_MRPPrice");
		double mrpprice=Double.parseDouble(sc.nextLine());
		
//		System.out.println("Enter Item_Count");
//		int count = Integer.parseInt(sc.nextLine());
		
		items.add(new Items(code,name,price,mrpprice));
	}
}
