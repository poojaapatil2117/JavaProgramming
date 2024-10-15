package ShopeSource1;

import java.util.List;
import java.util.Scanner;

public class Delete {


	public static void DeleteItems(Scanner sc , List<Items> items)
	{
		System.out.println("Enter The Item Id You Want TO delete");
		int GetItemCode = Integer.parseInt(sc.nextLine());
		
		items.removeIf( item -> item.GetItemCode() == GetItemCode);
		System.out.println("Item is Removed ");
	}
}
