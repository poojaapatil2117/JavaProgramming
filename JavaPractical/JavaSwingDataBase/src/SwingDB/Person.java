package SwingDB;

import java.io.Serializable;

/**
 * class That provide Or represent main entity of Items from application
 */
public class Person  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String email;
	private String MobilNo;
	
	//constructer to intialize fiels.
	public Person(int code,String name,String email,String MobilNo)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.MobilNo=MobilNo;
	}
	 
	/**
	 * Setters and Getters.
	 * @return
	 */
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilNo() {
		return MobilNo;
	}

	public void setMobilNo(String mobilNo) {
		MobilNo = mobilNo;
	}
	
	public String toString()
	{
		return "ItemsList { id :"+id+"\tname :"+name+"\temail :"+email+ "\tMobileNo:"+MobilNo+"}";
	}

}
