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

@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("studentID");
		String name = request.getParameter("full-name");
        PrintWriter out = response.getWriter();
        System.out.println("Student Id :"+id+"Student Name:"+name);

        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Student Admission Payment</title>");
        out.println("<style>");
        out.println("body {");
        out.println("    font-family: Arial, sans-serif;");
        out.println("    margin: 0;");
        out.println("    padding: 0;");
        out.println("    background-color: #f4f4f9;");
        out.println("}");
        out.println(".container {");
        out.println("    max-width: 600px;");
        out.println("    margin: 50px auto;");
        out.println("    background: #fff;");
        out.println("    border-radius: 8px;");
        out.println("    box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);");
        out.println("    padding: 20px;");
        out.println("}");
        out.println("h1 {");
        out.println("    text-align: center;");
        out.println("    color: #333;");
        out.println("}");
        out.println(".form-group {");
        out.println("    margin-bottom: 15px;");
        out.println("}");
        out.println("label {");
        out.println("    display: block;");
        out.println("    font-weight: bold;");
        out.println("    color: #555;");
        out.println("    margin-bottom: 5px;");
        out.println("}");
        out.println("input[type='text'], input[type='email'], input[type='number'] {");
        out.println("    width: 100%;");
        out.println("    padding: 10px;");
        out.println("    border: 1px solid #ddd;");
        out.println("    border-radius: 5px;");
        out.println("    font-size: 16px;");
        out.println("}");
        out.println(".btn {");
        out.println("    display: block;");
        out.println("    width: 100%;");
        out.println("    padding: 10px;");
        out.println("    background: #28a745;");
        out.println("    color: #fff;");
        out.println("    border: none;");
        out.println("    border-radius: 5px;");
        out.println("    font-size: 18px;");
        out.println("    cursor: pointer;");
        out.println("    text-align: center;");
        out.println("}");
        out.println(".btn:hover {");
        out.println("    background: #218838;");
        out.println("}");
        out.println(".note {");
        out.println("    margin-top: 10px;");
        out.println("    font-size: 14px;");
        out.println("    color: #888;");
        out.println("    text-align: center;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>Admission Payment</h1>");
        
        
        out.println("<form action='PaymentServlet' method='post'>");

        out.println("<input type='hidden' id='studentID' name='studentID' value='"+id+"'>");
        //out.println("<input type='hidden' id='full-name' name='full-name' value='"+id+"'>");
       	out.println("<div class='form-group'>");
        out.println("<label for='amount'>Payment Amount</label>");
        out.println("<input type='number' id='amount' name='amount' placeholder='Enter payment amount' required>");
        out.println("</div>");
        out.println("<button type='submit' class='btn'>Pay Now</button>");
        out.println("</form>");
        
        
        out.println("</body>");
        out.println("</html>");

		String payment = request.getParameter("amount");
		System.out.println("Amount :"+payment);
		
		String stid = request.getParameter("studentID");
		System.out.println("Student ID :"+stid);
		
		if(payment!=null && !payment.isEmpty())
		{
			int studentPaymet = 45000-Integer.parseInt(payment);
			System.out.println("Student Pending Fees"+studentPaymet);
			
			DatabaseConnector connector = new DatabaseConnector();
			try(Connection conn = connector.getConnection())
			{
				String query = "UPDATE degree_details SET fees_status = ? WHERE stid = ?";
				PreparedStatement stmt = conn.prepareStatement(query);
				stmt.setInt(1, studentPaymet); // Update the payment status
			    stmt.setString(2, stid);  
				stmt.executeUpdate();
				System.out.println("Data Inserted Successfully:");
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

        out.println("<h1>Payment Submitted Sucessfully</h1>");
		
	}
}
