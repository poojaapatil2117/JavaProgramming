package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Example 3: Inserting the data in to table and display that data.

public class InsertAndReadDB {
	
	private static final String db_url="jdbc:mysql://localhost/contactinfo";
	private static final String username="root";
	private static final String password="Root";
	
	public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		PreparedStatement preparedstatment = null;
		
		con = DriverManager.getConnection(db_url,username,password);
		
		String sqlQuery= "insert into contacts(id,name,email)value(?,?,?)";
		
		preparedstatment=con.prepareStatement(sqlQuery);
		
		int id[]= {3,4,5};
		String name[]= {"Shubman","Virat","Mahi"};
		String email[]= {"Shubman@gmail.com","Virat@gmail.com","mahi@gmail.com"};
		
		for(int i=0;i<id.length;i++)
		{
			preparedstatment.setInt(1, id[i]);
			preparedstatment.setString(2, name[i]);
			preparedstatment.setString(3, email[i]);
			preparedstatment.executeUpdate();
		}
		System.out.println("Data Inserted Successfully");
		
		Statement stmt = con.createStatement();
		ResultSet rs =  stmt.executeQuery("select * from contacts");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3));
		}
		
		con.close();
	}
}
