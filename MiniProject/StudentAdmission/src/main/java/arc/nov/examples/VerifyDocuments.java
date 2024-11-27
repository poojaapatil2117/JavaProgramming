package arc.nov.examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VerifyDocuments")
public class VerifyDocuments extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userId = request.getParameter("stid");
		String action = request.getParameter("action");
		
		System.out.println("User Id :"+userId + "Action :"+action);

		if ("degree".equals(action)) {
			
			DatabaseConnector connector = new DatabaseConnector();
			try (Connection conn = connector.getConnection()) {
				// Update the verification status to 'Verified'
				String query = "UPDATE degree_details SET verify_status = 'Verified' WHERE stid = ?";
				PreparedStatement stmt = conn.prepareStatement(query);
				stmt.setString(1, userId);
				query = "UPDATE degree_details SET verify_status = 'Verified' WHERE stid = ?";
				stmt = conn.prepareStatement(query);
				stmt.setString(1, userId);
				int result = stmt.executeUpdate();
				//out.println("Documents Verified Successfully .....");
				
				if (result > 0) {
					out.println("Documents Verified Successfully .....");
					//response.sendRedirect("AdminDashBoard"); // Redirect to the admin dashboard
				} else {
					response.getWriter().println("Error: Unable to verify document.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
