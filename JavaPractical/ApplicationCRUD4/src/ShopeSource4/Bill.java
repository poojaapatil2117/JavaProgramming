package ShopeSource4;
import java.io.Serializable;

public class Bill implements Serializable{

	private int Code;
	private String name;
	private double Price;
	private double MRP;
	private double IndiviTot;
	private int count;
	
	public Bill(Items items ,int count)
	{
		this.count=count;
		this.Code=items.GetItem_Code();
		this.name=items.GetItem_Name();
		this.MRP=items.GetItem_MRP();
		this.IndiviTot=this.MRP*this.count;
	}

	public void ShowBilledItems()
	{
		System.out.println("Code: "+Code+"\tName: "+name+"\tMRP: "+MRP+"\tCount: "+count+"\tTotal: "+IndiviTot);
	}
}
