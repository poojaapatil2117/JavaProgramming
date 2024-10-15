package FileIO;

import java.io.*;

/*
class Person implements Serializable
{

	private String nm;
	private int age;
	
	public Person(String name,int age)
	{
		this.nm = name;
		this.age=age;
	}
	public String toString() 
	{
		return " Name = " + nm + " age = " + age ;
	}
}


public class ObjectOutputStreamExample {

	public static void main(String[] args) {
		
		Person person = new Person ("Hopper",35);
		
		String filename = "New.txt";
		
		try {
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
			oos.writeObject(person);
			System.out.println("Serialization Successfully :"+person);
			
		}
		
		catch(Exception e) {e.printStackTrace();};
		
		//Deserialization :
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
			
			Person Deserialization = (Person)ois.readObject();
			System.out.println("Deserialization Successfully :"+Deserialization);
			
		}catch(Exception e) {e.printStackTrace();};
	}

}

//===============================-

//Example 2:


class Person implements Serializable
{

	private String nm;
	private int age;
	
	public Person(String name,int age)
	{
		this.nm = name;
		this.age=age;
	}
	public String toString() 
	{
		return " Name = " + nm + " age = " + age ;
	}
}


public class ObjectOutputStreamExample {

	public static void main(String[] args) {
		
		Person person = new Person ("Hopper",35);
		Person person1 = new Person("Jane ",34);
		
		String filename = "New.txt";
		
		try {
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
			oos.writeObject(person);
			oos.writeObject(person1);
			System.out.println("Serialization Successfully For Person1 :"+person);
			System.out.println("Serialization Successfully For Person1 :"+person1);
			
		}
		
		catch(Exception e) {e.printStackTrace();};
		
		//Deserialization :
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
			
			Person Deserialization = (Person)ois.readObject();
			Person Deseri =(Person)ois.readObject();
			System.out.println("Deserialization Successfully Person1:"+Deserialization);
			System.out.println("Deserialization Successfully person2:"+Deseri);
			
		}catch(Exception e) {e.printStackTrace();};
	}
}
*/
//=============================================================================

//Example 3:  Transient :
class User implements Serializable
{
	private static final long SerialVersionUID = 1L;
	private String Uname ;
	private transient int pass;
	
	public User(String Uname ,int pass)
	{
		this.Uname=Uname;
		this.pass=pass;
	}
	
	public String toString()
	{
		return "Uname :"+ Uname+"\tPassWord :"+pass;
	}
	
}
public class ObjectOutputStreamExample {

	public static void main(String[] args) {
		
		User user = new User("Steve",30);
		String fileName ="USER.txt";
		
		//Serialization
		try {
			
			ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(fileName));
			OOS.writeObject(user);
			System.out.println("Serialization Successfully : "+user);
			
		}catch(Exception e) {e.printStackTrace();};
		
		//Deserialization
		
		try {
			ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(fileName));
			
			User deseri = (User) OIS.readObject();
			
			System.out.println("Derialization Successfully :"+deseri);
			
		}catch(Exception e) {e.printStackTrace();};
		
	}
}
