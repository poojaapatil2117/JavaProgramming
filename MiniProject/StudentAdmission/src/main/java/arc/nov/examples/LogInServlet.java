package arc.nov.examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogInServlet")
public class LogInServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Set response content type to HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Start HTML
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Admin & Student Login</title>");
        
        // Link Bootstrap CSS
        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css' rel='stylesheet'>");

        out.println("<style>");
        out.println("body { background-color: #f4f4f4; }");  // Light background color for the page
        out.println(".card { background-color: #333; }");    // Dark background for the card
        out.println(".card-header { background-color: #555; }"); // Dark header
        out.println(".btn-dark { background-color: #444; border-color: #333; }"); // Custom button color
        out.println("</style>");

        out.println("<link rel='stylesheet' href='CSS/logincss.css'>");
        out.println("</head>");
        out.println("<body>");

        // Start container div
        out.println("<div class='container mt-5'>");
        out.println("<div class='row justify-content-center'>");
        out.println("<div class='col-md-6'>");

        // Start the login card
        out.println("<div class='card shadow'>");
        out.println("<div class='card-header text-white text-center'>");
        out.println("<h3>Login</h3>");
        out.println("</div>");
        out.println("<div class='card-body'>");

        // Start the form
        out.println("<form action='LogInServlet' method='post'>");

        // User Type dropdown
        out.println("<div class='mb-3'>");
        out.println("<label for='userType' class='form-label'>Select User Type</label>");
        out.println("<select class='form-select' id='userType' name='action' required>");
        out.println("<option value='' disabled selected>Choose...</option>");
        out.println("<option value='admin'>Admin</option>");
        out.println("<option value='student'>Student</option>");
        out.println("</select>");
        out.println("</div>");

        // Email input
        out.println("<div class='mb-3'>");
        out.println("<label for='email' class='form-label'>Email Address</label>");
        out.println("<input type='email' class='form-control' name='emaill' id='email' placeholder='Enter your email' required>");
        out.println("</div>");

        // Password input
        out.println("<div class='mb-3'>");
        out.println("<label for='password' class='form-label'>Password</label>");
        out.println("<input type='password' class='form-control' name='pass' id='password' placeholder='Enter your password' required>");
        out.println("</div>");

        // Submit button and forgot password link
        out.println("<div class='text-center'>");
        out.println("<button type='submit' class='btn btn-dark'>Login</button>");
        out.println("<a href='#' class='btn btn-link text-white'>Forgot Password?</a>");
        out.println("</div>");

        out.println("</form>"); // End the form
        out.println("</div>"); // End card-body

        // Register link
        out.println("<div class='text-center mt-3'>");
        out.println("<p>Don't have an account? <a href='index.html'>Register Here</a></p>");
        out.println("</div>");

        // End the card
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");

        // Bootstrap JS
        out.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js'></script>");
        // End HTML
        out.println("</body>");
        out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		//System.out.println(email + pass + action);
		if (action == null) {
		    // Handle the error when action is null
		    System.out.println("No action parameter provided.");
		    return;
		}
		
		if(action.equals("admin"))
		{
			System.out.println("Admin");
			String email = request.getParameter("emaill");
			String pass= request.getParameter("pass");
			System.out.println("Email And Pass"+email+pass);
			
//			DatabaseConnector connector = new DatabaseConnector();
//			try(Connection conn = connector.getConnection())
//			{
//				String query = "select * from admin where email = ? and password = ?";
//				PreparedStatement stmt = conn.prepareStatement(query);
//				stmt.setString(1, email);
//				stmt.setString(2, pass);
//				
//				ResultSet rs = stmt.executeQuery();
//				
//				if(rs.next())
//				{
//					HttpSession session = request.getSession();
//					session.setAttribute("emaill", email);
//					session.setAttribute("action", action);
//					response.sendRedirect("AdminDashBoard");
//					return;
//				}
//			}
//			catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			//If Above comment Code Is Written it Will Not Pass TO The Admin DashBoard..
			
			response.sendRedirect("AdminDashBoard");
		}
		else if(action.equals("student"))
		{
			String email = request.getParameter("emaill");
			String pass= request.getParameter("pass");
			
			DatabaseConnector connector = new DatabaseConnector();
			try(Connection conn = connector.getConnection())
			{
				String query = "select * from student where email = ? and password = ?";
				PreparedStatement stmt = conn.prepareStatement(query);
				stmt.setString(1, email);
				stmt.setString(2, pass);
				
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
				{
					HttpSession session = request.getSession();
					session.setAttribute("emaill", email);
					session.setAttribute("action", action);
					response.sendRedirect("AdmissionForm");	
					return;
				}
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else
		{
			response.getWriter().println("Error!!!!!!!");
		}
	}
}
