package Interface;
/*
 * // Defining single own comparator 

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Product
{
	private String nm;
	private double price ;
	private int id;
	public Product(int id,String nm,double price)
	{
		this.id=id;
		this.nm=nm;
		this.price=price;
		
	}
	
	public String getString()
	{
		return nm;
	}
	public double GetPrice()
	{
		return price;
	}
	public int GetId()
	{
		return id;
	}
	
	public String toString()
	{
		return id+" - "+nm+" - "+price;
	}
	
}
public class ComparatorExample {

	public static void main(String[] args) {
		
		List<Product> lis = new ArrayList<>();
		lis.add(new Product(12 ,"Laptop" , 73468));
		lis.add(new Product(89 ,"HeadPhones" ,1200));
		lis.add(new Product(25 ,"tab" ,5000));
		lis.add(new Product(6 ,"SmartPhone" ,62000));
		
		System.out.println("Befor Sorting : "+lis);
		
		lis.sort(new ProductPriceComparator());
		
		System.out.println("After Sorting : "+lis);
	
		
	}
}
class ProductPriceComparator implements Comparator<Product>
{
	@Override
	public int compare(Product p1, Product p2) {
	return Double.compare(p1.GetPrice(),p2.GetPrice());
	}
}

Output:

Befor Sorting Price : [12 - Laptop - 73468.0, 89 - HeadPhones - 1200.0, 25 - tab - 5000.0, 6 - SmartPhone - 62000.0]
After Sorting Price : [89 - HeadPhones - 1200.0, 25 - tab - 5000.0, 6 - SmartPhone - 62000.0, 12 - Laptop - 73468.0]

//===========================================================================================================
 * 
*/
/*
//Defining Multiple own comparators

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Product
{
	private String nm;
	private double price ;
	private int id;
	public Product(int id,String nm,double price)
	{
		this.id=id;
		this.nm=nm;
		this.price=price;
		
	}
	
	public String getString()
	{
		return nm;
	}
	public double GetPrice()
	{
		return price;
	}
	public int GetId()
	{
		return id;
	}
	
	public String toString()
	{
		return id+" - "+nm+" - "+price;
	}
	
}
public class ComparatorExample {

	public static void main(String[] args) {
		
		List<Product> lis = new ArrayList<>();
		lis.add(new Product(12 ,"Laptop" , 73468));
		lis.add(new Product(89 ,"HeadPhones" ,1200));
		lis.add(new Product(25 ,"tab" ,5000));
		lis.add(new Product(6 ,"SmartPhone" ,62000));
		
		
		
		System.out.println("Befor Sorting Price : "+lis);
		lis.sort(new ProductPriceComparator());
		System.out.println("After Sorting Price : "+lis);
		
		
		
		System.out.println("\nBefor Sorting Id : "+lis);
		lis.sort(new ProductIdComparator());
		System.out.println("After Sorting Id : "+lis);
	
		
	}
}
class ProductPriceComparator implements Comparator<Product>
{
	@Override
	public int compare(Product p1, Product p2) {
	return Double.compare(p1.GetPrice(),p2.GetPrice());
	}
}

class ProductIdComparator implements Comparator<Product>
{
	@Override
	public int compare(Product p1, Product p2) {
	return Integer.compare(p1.GetId(),p2.GetId());
	}
}


----------------Output----------------------------

Befor Sorting Price : [12 - Laptop - 73468.0, 89 - HeadPhones - 1200.0, 25 - tab - 5000.0, 6 - SmartPhone - 62000.0]
After Sorting Price : [89 - HeadPhones - 1200.0, 25 - tab - 5000.0, 6 - SmartPhone - 62000.0, 12 - Laptop - 73468.0]

Befor Sorting Id : [89 - HeadPhones - 1200.0, 25 - tab - 5000.0, 6 - SmartPhone - 62000.0, 12 - Laptop - 73468.0]
After Sorting Id : [6 - SmartPhone - 62000.0, 12 - Laptop - 73468.0, 25 - tab - 5000.0, 89 - HeadPhones - 1200.0]
*/


//============================================================================================================
/*

//Trying to use compareTo() for same - analyze the change 


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Product implements Comparable
{
	private String nm;
	private double price ;
	private int id;
	public Product(int id,String nm,double price)
	{
		this.id=id;
		this.nm=nm;
		this.price=price;
		
	}
	
	public String getString()
	{
		return nm;
	}
	public double GetPrice()
	{
		return price;
	}
	public int GetId()
	{
		return id;
	}
	
	public String toString()
	{
		return id+" - "+nm+" - "+price;
	}

	@Override
	public int compareTo(Object ob) {
		// TODO Auto-generated method stub
		return this.id-((Product)ob).GetId();
	}
	
}
public class ComparatorExample {

	public static void main(String[] args) {
		
		List<Product> lis = new ArrayList<>();
		lis.add(new Product(12 ,"Laptop" , 73468));
		lis.add(new Product(89 ,"HeadPhones" ,1200));
		lis.add(new Product(25 ,"tab" ,5000));
		lis.add(new Product(6 ,"SmartPhone" ,62000));
		
		
		
		System.out.println("Befor Sorting Price : "+lis);
		lis.sort(new ProductPriceComparator());
		System.out.println("After Sorting Price : "+lis);
		
		
		
		System.out.println("\nBefor Sorting Id : "+lis);
		lis.sort(new ProductIdComparator());
		System.out.println("After Sorting Id : "+lis);
	}
	
}
class ProductPriceComparator implements Comparator<Product>
{
	@Override
	public int compare(Product p1, Product p2) {
	return Double.compare(p1.GetPrice(),p2.GetPrice());
	}
}

class ProductIdComparator implements Comparator<Product>
{
	@Override
	public int compare(Product p1, Product p2) {
	return p1.compareTo(p2); //Integer.compare(p1.GetId(),p2.GetId());
	}
}

Befor Sorting Price : [12 - Laptop - 73468.0, 89 - HeadPhones - 1200.0, 25 - tab - 5000.0, 6 - SmartPhone - 62000.0]
After Sorting Price : [89 - HeadPhones - 1200.0, 25 - tab - 5000.0, 6 - SmartPhone - 62000.0, 12 - Laptop - 73468.0]

Befor Sorting Id : [89 - HeadPhones - 1200.0, 25 - tab - 5000.0, 6 - SmartPhone - 62000.0, 12 - Laptop - 73468.0]
After Sorting Id : [6 - SmartPhone - 62000.0, 12 - Laptop - 73468.0, 25 - tab - 5000.0, 89 - HeadPhones - 1200.0]



//====================================================================================
.

import java.util.*;

 class Product {
    private String name;
    private double price;
    private int id;

    public Product(int id, String name, double price) {
		this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+" - "+name + ":Rs." + price + "  ";
    }
}

public class ComparatorExample {

	public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product(12,"Laptop", 90999.99));
        products.add(new Product(89,"Smartphone", 64599.99));
        products.add(new Product(2,"Headphones", 1249.99));
        products.add(new Product(34,"Tablet", 8399.99));

        // Output the list before sorting
        System.out.println("Before sorting: " + products);

        // Sort the list based on product price
        products.sort(new ProductPriceComparator(){
		
			public int compare(Product p1, Product p2) {
				return Double.compare(p1.getPrice(), p2.getPrice());
			}

        });

        // Output the list after sorting
        System.out.println("After price sorting: " + products);
    }
}
*/
//=====================================================================================================================
/*

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Product
{
	private String nm;
	private double price ;
	private int id;
	public Product(int id,String nm,double price)
	{
		this.id=id;
		this.nm=nm;
		this.price=price;
		
	}
	
	public String getString()
	{
		return nm;
	}
	public double GetPrice()
	{
		return price;
	}
	public int GetId()
	{
		return id;
	}
	
	public String toString()
	{
		return id+" - "+nm+" - "+price;
	}
	
}
public class ComparatorExample {

	public static void main(String[] args) {
		
		List<Product> lis = new ArrayList<>();
		lis.add(new Product(12 ,"Laptop" , 73468));
		lis.add(new Product(89 ,"HeadPhones" ,1200));
		lis.add(new Product(25 ,"tab" ,5000));
		lis.add(new Product(6 ,"SmartPhone" ,62000));
		
		System.out.println("Befor Sorting : "+lis);
		
		lis.sort(new Comparator< Product>(){
			
			public int compare(Product p1,Product p2)
			{
				return Double.compare(p1.GetPrice(),p2.GetPrice());
			}
		});
		
		System.out.println("After Sorting : "+lis);
	}
}


 
//==============================================================================================


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Product
{
	private String nm;
	private double price ;
	private int id;
	public Product(int id,String nm,double price)
	{
		this.id=id;
		this.nm=nm;
		this.price=price;
		
	}
	
	public String getString()
	{
		return nm;
	}
	public double GetPrice()
	{
		return price;
	}
	public int GetId()
	{
		return id;
	}
	
	public String toString()
	{
		return id+" - "+nm+" - "+price;
	}
	
}
public class ComparatorExample {

	public static void main(String[] args) {
		
		List<Product> lis = new ArrayList<>();
		lis.add(new Product(12 ,"Laptop" , 73468));
		lis.add(new Product(89 ,"HeadPhones" ,1200));
		lis.add(new Product(25 ,"tab" ,5000));
		lis.add(new Product(6 ,"SmartPhone" ,62000));
		
		System.out.println("Befor Sorting : "+lis);
		
		lis.sort((Product p1,Product p2)->{
			return Double.compare(p1.GetPrice(),p2.GetPrice());
			});
		
		System.out.println("After Sorting : "+lis);
	}
}


//==========================================================================


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Product
{
	private String nm;
	private double price ;
	private int id;
	public Product(int id,String nm,double price)
	{
		this.id=id;
		this.nm=nm;
		this.price=price;
		
	}
	
	public String getString()
	{
		return nm;
	}
	public double GetPrice()
	{
		return price;
	}
	public int GetId()
	{
		return id;
	}
	
	public String toString()
	{
		return id+" - "+nm+" - "+price;
	}
	
}
public class ComparatorExample {

	public static void main(String[] args) {
		
		List<Product> lis = new ArrayList<>();
		lis.add(new Product(12 ,"Laptop" , 73468));
		lis.add(new Product(89 ,"HeadPhones" ,1200));
		lis.add(new Product(25 ,"tab" ,5000));
		lis.add(new Product(6 ,"SmartPhone" ,62000));
		
		System.out.println("Befor Sorting : "+lis);
		
		lis.sort(( p1,p2)-> Double.compare(p1.GetPrice(),p2.GetPrice()));
		
		System.out.println("After Sorting : "+lis);
	}
}


//=====================================================================================================

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Product
{
	private String nm;
	private double price ;
	private int id;
	public Product(int id,String nm,double price)
	{
		this.id=id;
		this.nm=nm;
		this.price=price;
		
	}
	
	public String getString()
	{
		return nm;
	}
	public double GetPrice()
	{
		return price;
	}
	public int GetId()
	{
		return id;
	}
	
	public String toString()
	{
		return id+" - "+nm+" - "+price;
	}
	
}
public class ComparatorExample {

	public static void main(String[] args) {
		
		List<Product> lis = new ArrayList<>();
		lis.add(new Product(12 ,"Laptop" , 73468));
		lis.add(new Product(89 ,"HeadPhones" ,1200));
		lis.add(new Product(25 ,"tab" ,5000));
		lis.add(new Product(6 ,"SmartPhone" ,62000));
		
		System.out.println("Befor Sorting : "+lis);
	
		//lis.sort(( p1,p2)-> Double.compare(p1.GetPrice(),p2.GetPrice()));
		Collections.sort(lis,(p1,p2)->Double.compare(p1.GetPrice(),p2.GetPrice()));
		System.out.println("After Sorting : "+lis);
	}
}

//=================================================================================================

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparatorExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(12);
		arr.add(24);
		arr.add(30);
		arr.add(19);
		arr.add(17);
		arr.add(21);
		arr.add(25);
		
		System.out.println("Array Elements Are :"+arr);
		
		arr.sort((x,y)->Integer.compare(x,y));
		System.out.println("Array Elements After Sort Acending Order : "+arr);
		
		arr.sort((x,y)->Integer.compare((int)y, (int)x));
		System.out.println("Array Elements After Sort Decending Order"+arr);
		
		//Using Collection
		
		Collections.sort(arr);
		System.out.println("");
		System.out.println("Arralist(Acending) : "+arr);
		
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println("ArrayList(Decending) : "+arr);
		
		
		
	}
}
*/

