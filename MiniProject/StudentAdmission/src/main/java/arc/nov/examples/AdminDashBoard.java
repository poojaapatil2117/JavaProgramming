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

@WebServlet("/AdminDashBoard")
public class AdminDashBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<h1>in Admisn DashBoard</h1>");
		// Link to trigger document verification section
		out.println(
				"<a href='javascript:void(0);' onclick='showDocumentVerification()'>Document Verification</a><br><br>");
		// Link to Payment Details page (You can implement it later)
		out.println("<a href='#'>Payment Details</a>");

		String action = request.getParameter("action");

		// Container for the document verification buttons (Initially hidden)
		 out.println("<!DOCTYPE html>");
	   out.println("<html lang='en'>");
	    out.println("<head>");
        out.println("<link rel='stylesheet' href='CSS/admin.css'>");
	    out.println("</head>");
	    out.println("<body>");
		out.println("<form action='AdminDashBoard' method='post'>");
		out.println("<div id='docVerification' style='display:none;' name='action'>");
		out.println("<h3>Document Verification</h3>");
		out.println("<button onclick='verifyDocument(\"diploma\")' name ='action' value='diploma' >Diploma</button>");
		out.println("<button onclick='verifyDocument(\"degree\")' name ='action' value='degree' >Degree</button>");
		out.println("</div>");
		out.println("</form>");

		// Add JavaScript for displaying the buttons dynamically
		out.println("<script>");
		out.println("function showDocumentVerification() {");
		out.println("  document.getElementById('docVerification').style.display = 'block';");
		out.println("}");

		out.println("function verifyDocument(docType) {");
		out.println("  alert('You have selected ' + docType + ' verification');");
		out.println("}");
		out.println("</script>");

		out.println("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String action = request.getParameter("action");
		
		if(action.equals("degree"))
		{
			DatabaseConnector connector = new DatabaseConnector();

			out.println("<!doctype html>");
			out.println("<html>");
			out.println("<head><title>Degree Admission Details</title>");
		    out.println("<link rel='stylesheet' href='CSS/admin.css'>");
			out.println("</head>");
			out.println("<body>");
			
			out.println("<table border = '1'>");
	        out.println("<tr><th>Student ID</th> <th>HSC Marksheet</th> <th>SSC Marksheet</th> <th>CET Marksheet</th> <th>Adhar</th> <th>Status</th></tr>");
			try(Connection conn = connector.getConnection())
			{
				String query = "SELECT stid,hsc,ssc,cet,adhar FROM degree_details";
				PreparedStatement stmt = conn.prepareStatement(query);
	            ResultSet rs = stmt.executeQuery();
	            
	            while(rs.next())
	            {
	            	int studentiId = rs.getInt("stid");
	            	String hsc_path = rs.getString("hsc");
	 	            String ssc_path = rs.getString("ssc");
	 	            String cet_path = rs.getString("cet");
	 	            String adhar_path = rs.getString("adhar");
	 	            
	            	 out.println("<tr>");
	                 out.println("<td>" + rs.getInt("stid") + "</td>");
	                 out.println("<td><a href='"+hsc_path+"' target='_blank'>View HSC</a></td>");
	                 out.println("<td><a href='"+ssc_path+"' target='_blank'>View SSC</a></td>");
	                 out.println("<td><a href='"+cet_path+"' target='_blank'>View CET</a></td>");
	                 out.println("<td><a href='"+adhar_path+"' target='_blank'>View Adhar</a></td>");
	                 //out.println("<td><a href='#' target='_blank'>Verify</a></td>");
	                 out.println("<td><a href='VerifyDocuments?stid=" + rs.getString("stid") + "&action=degree'>Verify</a></td>");
	                 out.println("</tr>");
	            }
				
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
		}
	}
}
