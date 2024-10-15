package ShopeSource1;

import java.util.List;

public class Read {

	//For Read Items
	
		public static void readItems(List<Items> items)
		{
			if(items.isEmpty())
			{
				System.out.println("Items Not Foound ");
			}
			else
			{
				for(Items item:items)
				{
					System.out.println(item);
				}
			}
		}
}
