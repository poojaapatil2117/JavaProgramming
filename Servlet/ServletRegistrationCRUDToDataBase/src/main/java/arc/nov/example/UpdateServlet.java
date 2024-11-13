package arc.nov.example;

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


@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	private static final String URL ="jdbc:mysql://localhost:3306/registrationwithservlet";
	private static final String USER="root";
	private static final String PASSWORD="Root";
	
  
	@Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Drivers loaded Sucessfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD))
		{
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM users");
			
			out.println("<!doctype html>");
			out.println("<html> <head> <title> CRUD Registraton </title> </head>");
			out.println("<body>");
			
			//table
			out.println("<table border='1'>");
			
			out.println("<tr>");
			out.println("<th> Id </th> <th> Name </th> <th> Email </th> <th> Contact </th> <th> Action </th>");
			out.println("</tr>");
			while(rs.next()) {
				out.println("<tr>");		
				out.println("<td> "+rs.getInt("id")+" </td>");		
				out.println("<td> "+rs.getString("name")+" </td>");
				out.println("<td> "+rs.getString("email")+" </td>");
				out.println("<td> "+rs.getString("contact")+" </td>");
				
				out.println("<td> ");
				out.println("<a href='UpdateServlet?action=edit&id="+rs.getInt("id")+"'> Edit | </a> ");
				out.println("<a href='CRUDServlet?action=delete&id="+rs.getInt("id")+"'> Delete </a> ");
				out.println("</td>");				
				out.println("</tr>");
			}
					
			out.println("</table>");
			
			//Data Input
			out.println("<h1>Update the Details</h1>");
			out.println("<form action='UpdateServlet' method='post'>");
			
			int id = Integer.parseInt(request.getParameter("id"));
			
			System.out.println("Updated ID :"+id);
			
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM users WHERE id =?");
			pstmt.setInt(1,id);
			
			ResultSet rst = pstmt.executeQuery();
			
			System.out.println("ResultSet Ready :"+rst);
			
			while(rst.next())
			{
				out.println("<input type='hidden' name='id' value='"+id+"'>");
				out.println("Name : <input type='text' name='name' value='"+rst.getString("name")+"'>");
				out.println("Email : <input type='email' name='email' value='"+rst.getString("email")+"'>");
				out.println("Contact : <input type='text' name='mobile' value='"+rst.getString("contact")+"'>");
			}
			out.println("<input type='submit' value='Confirm'>");
			out.println("</form>");
			out.println("</body></html>");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("In Update DoPost()");
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("mobile");
		
		System.out.println("In Post() Method "+name+","+email+","+contact);
		
		try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
			PreparedStatement pstmt = conn.prepareStatement("UPDATE users SET name=?, email=?, contact=? WHERE id =?");
			

			System.out.println("Connection Of Update");
			
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, contact);
			pstmt.setInt(4, id);
		    
			pstmt.executeUpdate();
			System.out.println("Data Updated");
			response.sendRedirect("ServletCRUDTODataBase");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
