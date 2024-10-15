package ShopSource5;

import java.util.List;
import java.util.Scanner;

public class Delete {

	public static void DeleteItems(Scanner sc,List<Items> items)
	{
		System.out.println("Enter The ItemCode You Want To Delete :");
		int DeleteCode = Integer.parseInt(sc.nextLine());
		items.removeIf(item->item.GetItem_Code()==DeleteCode);
		System.out.println("List_Item is Removed");
	}
}
