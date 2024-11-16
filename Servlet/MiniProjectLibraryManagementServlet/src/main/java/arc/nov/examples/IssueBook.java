package arc.nov.examples;

import java.io.IOException;

import java.sql.Date;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/IssueBook")
public class IssueBook extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final String URL = "jdbc:mysql://localhost:3306/library_db";
	private static final String USER = "root";
	private static final String PASSWORD = "Root";

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("In doGet() of IssueBook when I Click on Issue Link");
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD))
		{
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM users");

			out.println("<!doctype html>");
			out.println("<html>");
			out.println("<head><title>Issue Book</title></head>");
			out.println("<h3>Issue Book Table</h3>");
			out.println("<body>");
			
			//User table
			out.println("<h4>User Table</h4>");
			out.println("<table border='1'>");
			out.println("<tr> <th>User_ID</th> <th>User_Name</th> <th>User_Email</th> <th>User_Contact</th> </tr>");
			
			while(rs.next())
			{
				out.println("<tr>");

				out.println("<td> <a href='javascript:void(0)' onclick=\"userIDTake('" + rs.getInt(1) + "', '" + rs.getString(2) + "')\">" + rs.getInt(1) + "</a></td>");

				System.out.println("Ancher Tag Here");
				out.println("<td> " + rs.getString(2) + "</td>");
				out.println("<td> " + rs.getString(3) + "</td>");
				out.println("<td> " + rs.getString(4) + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			
			//div for user
			//out.println("<div style = 'display:none;' id='UserIdAndName'>");
			//out.println("<h5>User Fields</h5>");

			//Field Of User
		//out.println("</div>");
			
			// Script For User Optration
			out.println("<script type='text/javascript'>");
			out.println("function userIDTake(uid,uname){");
			out.println("alert('in function');");
			out.println("document.getElementById('displayDetails').style.display='block';");
			out.println("document.getElementById('userId').value = uid;");
			out.println("document.getElementById('userName').value = uname;");
			
			System.out.println("JS Function Tag Here");
			out.println("}");
			out.println("</script>");
			
			//Book Table
			Statement stmtb = conn.createStatement();
			ResultSet rsb = stmtb.executeQuery("SELECT * FROM books");
			
			out.println("<h4>Book Table</h4>");
			out.println("<table border='1'>");
			out.println("<tr> <th>Book_ID</th> <th>Book_Name</th> <th>ISBN</th> <th>Author</th> <th>Publisher</th> <th>Book Count</th> <th>Available Count</th> </tr>");
			
			while(rsb.next())
			{
				out.println("<tr>");
				out.println("<td> <a href='javascript:void(0)' onclick=\"bookIDTake('" + rsb.getInt(1) + "', '" + rsb.getString(2) + "','"+rsb.getString(7)+"')\">" + rsb.getInt(1) + "</a></td>");
				out.println("<td> " + rsb.getString(2) + "</td>");
				out.println("<td> " + rsb.getString(3) + "</td>");
				out.println("<td> " + rsb.getString(4) + "</td>");
				out.println("<td> " + rsb.getString(5) + "</td>");
				out.println("<td> " + rsb.getInt(6) + "</td>");
				out.println("<td> " + rsb.getInt(7) + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			
			
			// Script For Book Optration
			out.println("<script type='text/javascript'>");
			out.println("function bookIDTake(bid,bname,avlcnt){");
			out.println("alert('in function');");
			out.println("document.getElementById('displayDetails').style.display='block';");
			out.println("document.getElementById('BookId').value = bid;");
			out.println("document.getElementById('BookName').value = bname;");
			out.println("document.getElementById('AvailableCount').value = avlcnt;");

			
			out.println("if(avlcnt>0) {");
			out.println("document.getElementById('result1').innerText = 'Available';");
			out.println("} else {");
			out.println("document.getElementById('result2').innerText='NA';");
			out.println("}");
			
			System.out.println("JS Function Tag Here");
			out.println("}");
			out.println("</script>");
			
			out.println("<br>");
			
			
			//Input Fields Of Users And Books
			out.println("<div style='display:none;' id='displayDetails'>");
			
			out.println("<form action='IssueBook' method='post'>");
			
			out.println("<h5>User Fields</h5>");
			out.println("User Id: <input type='text' name='uid' id='userId'> <br><br>");
			out.println("User Name: <input type='text' name='uname' id ='userName'>");

			out.println("<h5>Books Fields</h5>");
			out.println("Book Id: <input type='text' name='bid' id='BookId'> <br><br>");
			out.println("Book Name: <input type='text' name='bname' id ='BookName'><br><br>");
			out.println("Available Count :<input type='text' name='avlcnt' id='AvailableCount'><br>");
			out.println("<h3 id ='result1' style='color:green;' ></h3>");
			out.println("<h3 id ='result2' style='color:red;' ></h3>");// placeholder for available or NA to display.
			out.println("<input type='submit' value='Issue'>");
			
			out.println("</form>");
			out.println("</div>");
			
			out.println("</body>");
			out.println("</html>");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			System.out.println("In doPost() of issue book");
			
			String uid = request.getParameter("uid");
			String uname = request.getParameter("uname");
			
			String bkid = request.getParameter("bid");
			String bookname = request.getParameter("bname");
			
			System.out.println("Uid = "+uid+" Uname ="+uname+" bkid = "+bkid+" bookname = "+bookname);
			
			LocalDate issuedate = LocalDate.now();
			Date issuedate1 = Date.valueOf(issuedate);
			
			LocalDate enddate = issuedate.plusDays(8);
			Date enddate1 = Date.valueOf(enddate);

			out.println("Issued Date:<input type='text' name='issuedate'  value='"+issuedate+"'><br><br>");
			out.println("Return Date:<input type='text' name='returndate' value='"+enddate+"'><br><br>");
			

			try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD))
			{
				PreparedStatement prepareStatment = null;
				String sqlQuery = "INSERT INTO issuebook(u_id,u_name,bk_id,b_name,issuedate,submitdate) values(?,?,?,?,?,?)";
				prepareStatment = conn.prepareStatement(sqlQuery);
				prepareStatment.setString(1, uid);
				prepareStatment.setString(2,uname);
				prepareStatment.setString(3,bkid);
				prepareStatment.setString(4,bookname);
				prepareStatment.setDate(5,issuedate1);
				prepareStatment.setDate(6,enddate1);
				
				prepareStatment.executeUpdate();
				System.out.println("Data Inserted To User Table SuccessFully");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD))
			{
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM issuebook");
				
				out.println("<!doctype html>");
				out.println("<html>");
				out.println("<head><title>Issue Record Of Users</title></head>");
				out.println("<body>");
				out.println("<table border='1'>");
				out.println("<tr> <th>ID</th> <th>User_Id</th> <th>User_Name</th> <th>Book_Id</th> <th>Book Name</th> <th>Issued Date</th> <th>Return Date</th> </tr>");
				while (rs.next()) {
					out.println("<tr>");
					out.println("<td> " + rs.getInt(1) + "</td>");
					out.println("<td> " + rs.getString(2) + "</td>");
					out.println("<td> " + rs.getString(3) + "</td>");
					out.println("<td> " + rs.getString(4) + "</td>");

					out.println("<td> " + rs.getString(5) + "</td>");
					out.println("<td> " + rs.getDate(6) + "</td>");
					out.println("<td> " + rs.getDate(7) + "</td>");

					out.println("</tr>");
				}

				out.println("</table>");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
