package ShopSource5;

import java.util.List;

public class Read {

	public static void ReadItems(List<Items> items)
	{
		if(items.isEmpty())
		{
			System.out.println("List is Empty");
		}
		else
		{
			for(Items i:items)
			{
				System.out.println(i);
			}
		}
	}
}
