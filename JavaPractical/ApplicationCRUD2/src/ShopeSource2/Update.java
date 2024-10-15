package ShopeSource2;

import java.util.List;
import java.util.Scanner;

public class Update {

	public static void UpdateItems(Scanner sc ,List<Items> items)
	{
		System.out.println("Enter The Item_Code For Update :");
		int GetItemCode  = Integer.parseInt(sc.nextLine());
		for(Items item :items)
		{
			if(item.GetItemCode()==GetItemCode)
			{
				System.out.println("Enter New Items Name :");
				String nName = sc. nextLine();
				item.SetName(nName);
				System.out.println("Items Updated");
				
				return;
			}
		}
		System.out.println("Item Not Found ");
	}

}
