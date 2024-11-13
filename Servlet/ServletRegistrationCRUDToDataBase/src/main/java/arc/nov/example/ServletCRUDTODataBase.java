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


@WebServlet("/ServletCRUDTODataBase")
public class ServletCRUDTODataBase extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private static final String URL ="jdbc:mysql://localhost:3306/registrationwithservlet";
	private static final String USER="root";
	private static final String PASSWORD="Root";

	Connection con=null ;
	
	@Override
	public void init() throws ServletException {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("Connection Successfully");
			
		}catch(Exception e)
		{
			throw new ServletException("Ubable to Load Driver");
		}
	}

	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		
		try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD))
		{
			int id = Integer.parseInt(request.getParameter("id"));
			PreparedStatement  pstmt = conn.prepareStatement("DELETE FROM users WHERE id = ?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String action = request.getParameter("action");
		if("delete".equals(action))
		{
			doDelete(request,response);
		}
		
		try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD))
		{
			Statement stmt = con.createStatement();
			ResultSet rs =  stmt.executeQuery("select * from users");
			

			out.println("<!Doctype html>");
			out.println("<html>");
			out.println("<head><title> Registration Form </title></head>");
			out.println("<body>");
			
			//Tabel to Display Inserted Data.
			out.println("<table border='1'>");
			out.println("<tr> <th>Name</th> <th>Email</th> <th>Contact</th> <th>Action</th> </tr>");
			
			try 
			{
				while(rs.next())
				{
					out.println("<tr>");
					out.println("<td>"+rs.getString(1)+"</td>");
					out.println("<td>"+rs.getString(2)+"</td>");
					out.println("<td>"+rs.getString(3)+"</td>");
					
					out.println("<td>");
					out.println("<a href='UpdateServlet?action=edit&id="+rs.getInt("id")+"'>Edit</a>");
					out.println("<a href='ServletCRUDTODataBase?action=delete&id="+rs.getInt("id")+"'>Delete </a>");
					out.println("</td>");
					
					out.println("</tr>");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			out.println("</table>");
			
			//Form to Insert Data To Database.
			out.println("<br><br><form action='ServletCRUDTODataBase' method='post'>");
			out.println("Name: <input type='text' name='name' placeholder='Enter Your Name'> <br><br>");
			out.println("Email: <input type='email' name='email' placeholder='Enter Your Email'><br><br>");
			out.println("Contact: <input type='text' name='mobile' placeholder='Enter Your Contact'> <br><br>");
			out.println("<input type='submit' value='submit'>");
			out.println("</form>");
			
			out.println("</body></html>");	
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
		
		PreparedStatement preaparestatment=null;
		
		System.out.println("In doPost()");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("mobile");
		
		System.out.println(name+","+email+","+contact+"\n");
	
		
		//For Insert The Records.
		String sqlQuery = "insert into users(name,email,contact) values(?,?,?)";
		
		try {
			preaparestatment= con.prepareStatement(sqlQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try 
		{		
			preaparestatment.setString(1, name);
			preaparestatment.setString(2, email);
			preaparestatment.setString(3, contact);
			preaparestatment.executeUpdate();
				
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

		System.out.println("Data Inserted Successfully");
		response.sendRedirect("ServletCRUDTODataBase");
	}
}
