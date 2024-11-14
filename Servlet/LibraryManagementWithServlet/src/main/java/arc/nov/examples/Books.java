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

//Execution Of Program Start from here.
@WebServlet("/Books")
public class Books extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private static final String URL = "jdbc:mysql://localhost:3306/book_library_servlete";
	private static final String USER="root";
	private static final String PASSWORD="Root";
	
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
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	
		
		
		//For Books Details..
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head><title> Books Records </title></head>");
		out.println("<h3>Add Books Records : </h3>");
		out.println("<body>");
		out.println("<form action='Books' method='post'>");
		out.println("Book Name: <input type='text' name='name' placeholder='Enter The Book Name'> <br><br>");
		out.println("Book Count: <input type='text' name='bookcnt' placeholder='Enter The Book Count''><br><br>");
		out.println("<input type='submit' value='Add'>");
		out.println("<a href='Users'>&nbsp;&nbsp;Register User</a>");
		out.println("</form><br><br>");
		
		//Table to Display The Records
		try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD))
		{
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM books");
			
			out.println("<table border='1'>");
			out.println("<tr> <th>ID</th> <th>Name</th> <th>BookCount</th> </tr>");
			while(rs.next())
			{
				out.println("<tr>");
				out.println("<td> "+rs.getString(1)+"</td>");
				out.println("<td> "+rs.getString(2)+"</td>");
				out.println("<td> "+rs.getInt(3)+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In doPost() : to check if i enter in doPost method when i click on Add");
	
		
		String name = request.getParameter("name");
		int cnt = Integer.parseInt(request.getParameter("bookcnt"));
		System.out.println("Book Details "+name+","+cnt+"TO check The Name And Count of is Taken or not");
		
		
		//Insert The Book Records In books table
		try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD))
		{
			PreparedStatement preparedStatement =null;
			String sqlQuery = "INSERT INTO books (name,bookcount) values(?,?)";
			preparedStatement=conn.prepareStatement(sqlQuery);
			
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, cnt);
			preparedStatement.executeUpdate();
			
			System.out.println("Data Inserted Successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("Books");
	}
}
