package arc.nov.examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String action = request.getParameter("action");
		
		//out.println("<form method='' action=''>");
			
		//out.println("</form>");
		
		//To insert The Data In Admin
		if(action.equals("admin"))
		{
			DatabaseConnector connector = new DatabaseConnector();
			try(Connection conn = connector.getConnection())
			{
				String query = "insert into admin(name,email,contact,password,gender) values(?,?,?,?,?)";
				PreparedStatement stmt = conn.prepareStatement(query);
				stmt.setString(1,name);
				stmt.setString(2,email);
				stmt.setString(4,contact);
				stmt.setString(3,password);
				stmt.setString(5,gender);
				stmt.executeUpdate();
				System.out.println("Data Inserted Successfully:");
				
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(action.equals("student")) //Insert the Data Into Student Table
		{
			DatabaseConnector connector = new DatabaseConnector();
			try(Connection conn = connector.getConnection())
			{
				String query = "insert into student(name,email,contact,password,gender) values(?,?,?,?,?)";
				PreparedStatement stmt = conn.prepareStatement(query);
				stmt.setString(1,name);
				stmt.setString(2,email);
				stmt.setString(3,contact);
				stmt.setString(4,password);
				stmt.setString(5,gender);
				stmt.executeUpdate();
				System.out.println("Data Inserted Successfully:");
				
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		response.sendRedirect("LogInServlet");
	}
}
