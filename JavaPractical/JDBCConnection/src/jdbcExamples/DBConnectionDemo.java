package jdbcExamples;

/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/contactinfo";
		String username="root";
		String password="Root";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection Successfully");
		
		Statement stm = con.createStatement();
		
		ResultSet rs = stm.executeQuery("select * from contacts");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3));
		}
		con.close();
	}
}
*/
//=====================================================================
