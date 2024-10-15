package ShopeSource2;

import java.util.List;

public class Bill {

	double Individial_Tot;
	{
		Individial_Tot = 0;
	}
	
	public  Bill(int code,List<Items> item,int cnt)
	{
		for(Items it : item)
		{
			if(code==it.GetItemCode())
			{
				Individial_Tot = cnt*it.GetMRP();
			}
		}
	}
}
