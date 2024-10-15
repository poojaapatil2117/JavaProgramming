package ShopSource5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bill implements Serializable {

	private static final long serialVersionUID = 1L;
	private int Code;
	private String name;
	private double Price;
	private double MRP; 
	private double IndiviTot;   
	private  int count;   //---------------
	private double IndiviTotcart;
	private  double TotalBill=0;

	static List<Bill> billlist = new ArrayList<>();
	
	public Bill(Items items ,int count) 
	{
		this.count=count;
		this.Code=items.GetItem_Code(); 
		this.name=items.GetItem_Name();
		this.MRP=items.GetItem_MRP(); 
		this.IndiviTotcart=this.MRP*this.count; 
	}
	
	public Bill(int code2, int count2, double price2) {
		this.Code=code2;
		this.count=count2;
		this.Price=price2;
		this.IndiviTot=this.Price*this.count;  
		this.TotalBill=this.TotalBill+this.IndiviTot;
	} 

	
	public void SetCountforBill(int count1)
	{
		this.count=count1; 
		this.IndiviTot=Price*count1; 
		this.TotalBill=this.TotalBill+this.IndiviTot;  
	} 
	
	public void ShowBilledItems()
	{
		System.out.println("Code: "+Code+"\tName: "+name+"\tMRP: "+MRP+"\tCount: "+count+"\tTotal: "+IndiviTotcart);  
	}
	
	@Override
	public String toString()  
	{
		return "Bill {Code: "+Code+"\tCount: "+count+"\tTotalPrice: "+IndiviTot;    
	} 
	 
	public static void ShowBillList(List<StockItems> stockitems,List<Cart> cartitems,List<Items> items) throws IOException, ClassNotFoundException
	{ 
		Scanner sc = new Scanner(System.in); 
		String running;
		Cart cart = new Cart(); 
		double TotalBill=0;
		do
		{
			for(Bill i:billlist)
			{
				System.out.println(i);
				TotalBill=TotalBill+i.Price;
			}
			
		}while(true);
	}
	
	public static void addBill(int code , int count ,double price)
	{
		billlist.add(new Bill(code,count,price)); 
	}
}
