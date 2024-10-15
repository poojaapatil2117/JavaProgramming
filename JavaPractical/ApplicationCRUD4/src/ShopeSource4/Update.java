package ShopeSource4;
import java.util.List;
import java.util.Scanner;

public class Update {

	public static void UpdateItems(Scanner sc, List<Items> items)
	{
		System.out.println("Enter The Item_Code You Want To Update :");
		int UpdateCode = Integer.parseInt(sc.nextLine());
		
		for(Items i:items)
		{
			if(UpdateCode == i.GetItem_Code())
			{
				System.out.println("Enter The Name Of Item :");
				String name = sc.nextLine();
				i.SetItem_Name(name);
			}
		}
	}
}
