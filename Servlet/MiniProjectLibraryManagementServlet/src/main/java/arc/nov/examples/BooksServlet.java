package arc.nov.examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BooksServlet")
public class BooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String URL = "jdbc:mysql://localhost:3306/library_db";
	private static final String USER = "root";
	private static final String PASSWORD = "Root";

	@Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connection Successfully: (To Cheak My Application Is connected With Database)");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Table to Display The Records
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM books");

			out.println("<table border='1'>");
			out.println("<tr> <th>ID</th> <th>Name</th> <th>ISBN</th> <th>Author</th> <th>Publisher</th> <th>BookCount</th> <th>Available Count</th> </tr>");
			while (rs.next()) {
				out.println("<tr>");
				out.println("<td> " + rs.getInt(1) + "</td>");
				out.println("<td> " + rs.getString(2) + "</td>");
				out.println("<td> " + rs.getString(3) + "</td>");
				out.println("<td> " + rs.getString(4) + "</td>");
				out.println("<td> " + rs.getString(5) + "</td>");
				out.println("<td> " + rs.getInt(6) + "</td>");
				out.println("<td> " + rs.getInt(7) + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		out.println("</body>");
		out.println("</html>");

		// For Books Details..
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head><title> Books Records </title></head>");
		out.println("<h3>Add Books Records : </h3>");
		out.println("<body>");
		out.println("<form action='BooksServlet' method='post'>");
		out.println("Book Name: <input type='text' name='name' placeholder='Enter The Book Name'> <br><br>");
		out.println("ISBN :<input type='text' name='isbn' placeholder='Enter ISBN Number'><br><br>");
		out.println("Author :<input type='text' name='author' placeholder='Enter Author Name'><br><br>");
		out.println("Publisher :<input type='text' name='publisher' placeholder='Enter Publisher Name'><br><br>");
		out.println("Book Count: <input type='text' name='bookcnt' placeholder='Enter The Book Count''><br><br>");
		out.println(
				"Available Count: <input type='text' name='avlcnt' placeholder='Enter The Available Count''><br><br>");

		out.println("<input type='submit' value='Add'><br><br>");
		out.println("<a href='UserServlet'>&nbsp;&nbsp;Register User</a> <br><br>");
		out.println("<a href='IssueBook'>&nbsp;&nbsp;Issue here</a>");
		out.println("</form><br><br>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("In doPost() : to check if i enter in doPost method when i click on Add");
		
		String name = request.getParameter("name");
		String isbn = request.getParameter("isbn");
		String author = request.getParameter("author");		
		String publisher = request.getParameter("publisher");
		int cnt = Integer.parseInt(request.getParameter("bookcnt"));
		int avlcount = Integer.parseInt(request.getParameter("avlcnt"));
		
		System.out.println("Book Details "+name+","+isbn+","+author+","+publisher+","+cnt+","+avlcount+","+"TO check The Name And Count of is Taken or not");
		
		
		//Insert The Book Records In books table
		try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD))
		{
			PreparedStatement preparedStatement =null;
			String sqlQuery = "INSERT INTO books (name,isbn,author,publication,quantity,avlquanti) values(?,?,?,?,?,?)";
			preparedStatement=conn.prepareStatement(sqlQuery);
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, isbn);
			preparedStatement.setString(3, author);
			preparedStatement.setString(4, publisher);
			preparedStatement.setInt(5, cnt);
			preparedStatement.setInt(6, avlcount);
			
			preparedStatement.executeUpdate();
			
			System.out.println("Data Inserted Successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("BooksServlet");
	}

}
