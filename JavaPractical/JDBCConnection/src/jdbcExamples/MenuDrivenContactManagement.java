package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//Example 4: Write a menu driven program to input and retrieve the contact information. 

public class MenuDrivenContactManagement {

	private static final String url = "jdbc:mysql://localhost/contactinfo";
	private static final String username = "root";
	private static final String password = "Root";

	private static void createTable(Connection con) throws SQLException {
		Statement statement = con.createStatement();
		String createTableSQL = "CREATE TABLE IF NOT EXISTS contacts1 (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), email VARCHAR(100))";
		statement.executeUpdate(createTableSQL);
		System.out.println("Table Created Successfully");
	}

	private static void insertTable(Connection con, Scanner sc) throws SQLException {

		sc.nextLine();

		System.out.println("Enter the Name");
		String name = sc.nextLine();

		System.out.println("Enter the Email");
		String email = sc.nextLine();

		String insetQuery = "insert into contacts1(name ,email) values (?,?)";

		PreparedStatement insertStatement = con.prepareStatement(insetQuery);
		insertStatement.setString(1, name);
		insertStatement.setString(2, email);
		insertStatement.executeUpdate();

		System.out.println("Contacts1 inserted Successfully");
	}

	private static void updateContact(Connection con, Scanner sc) throws SQLException {
		System.out.println("Enter the contact id");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter The New Name");
		String Nname = sc.nextLine();

		System.out.println("Enter The New Email");
		String Nemail = sc.nextLine();

		String updateQuery = "update contacts1 set name = ? , email = ? where id =?";
		PreparedStatement updateStatement = con.prepareStatement(updateQuery);

		updateStatement.setString(1, Nname);
		updateStatement.setString(2, Nemail);
		updateStatement.setInt(3, id);

		int UpdatedRows = updateStatement.executeUpdate();

		if (UpdatedRows > 0) {
			System.out.println("Contact Updated Successfully");
		} else {
			System.out.println("No such Record Found with this id");
		}
	}

	private static void deleteContacts(Connection con, Scanner sc) throws SQLException {
		System.out.println("Enter The Contatc id You Want to Delete");
		int id = sc.nextInt();
		sc.nextLine();

		String deleteQuery = "delete from Contacts1 where id = ?";
		PreparedStatement deleteStatement = con.prepareStatement(deleteQuery);
		deleteStatement.setInt(1, id);
		int deletedrow = deleteStatement.executeUpdate();

		if (deletedrow > 0) {
			System.out.println("Record Deleted Successfullt");
		} else {
			System.out.println("No Contacts Found With This Id");
		}
	}

	private static void retriveContacts(Connection con, Scanner sc) throws SQLException {

		String retriveQuery = "select * from contacts1";
		PreparedStatement retriveStatment = con.prepareStatement(retriveQuery);
		ResultSet rs = retriveStatment.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String email = rs.getString("email");
			System.out.println("Id " + id + "\tname: " + name + "\temail: " + email);

		}

		rs.close();
		retriveStatment.close();
	}

	public static void main(String[] args) throws SQLException {

		Connection con = null;

		con = DriverManager.getConnection(url, username, password);
		Scanner sc = new Scanner(System.in);
		int choise;

		while (true) {
			System.out.println("1.CreateContacts");
			System.out.println("2.InsertContacts");
			System.out.println("3.UpdateContacts");
			System.out.println("4.DeleteContacts");
			System.out.println("5.RetriveContacts");
			System.out.println("6.Exit");

			System.out.println("Enter Your Choise");
			choise = sc.nextInt();

			switch (choise) {
			case 1:
				createTable(con);
				break;

			case 2:
				insertTable(con, sc);
				break;

			case 3:
				updateContact(con, sc);
				break;

			case 4:
				deleteContacts(con, sc);
				break;

			case 5:
				retriveContacts(con, sc);
				break;

			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choise");
				break;
			}
		}
	}
}
