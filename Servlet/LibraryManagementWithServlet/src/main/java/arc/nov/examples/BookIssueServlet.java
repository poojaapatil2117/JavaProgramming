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

@WebServlet("/BookIssueServlet")
public class BookIssueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String URL = "jdbc:mysql://localhost:3306/book_library_servlete";
	private static final String USER = "root";
	private static final String PASSWORD = "Root";

	@Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("User Issue Servlet Connection Sucssfully ");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		super.init();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM bookissuedata");

			out.println("<!doctype html>");
			out.println("<html>");
			out.println("<head><title>Issue Record Of Users</title></head>");
			out.println("<body>");
			out.println("<table border='1'>");
			out.println(
					"<tr> <th>ID</th> <th>Name</th> <th>Email</th> <th>Contact</th> <th>Book Name</th> <th>ISBN</th><th>Issue Date</th> <th>End Date</th></tr>");

			while (rs.next()) {
				out.println("<tr>");
				out.println("<td> " + rs.getInt(1) + "</td>");
				out.println("<td> " + rs.getString(2) + "</td>");
				out.println("<td> " + rs.getString(3) + "</td>");
				out.println("<td> " + rs.getString(4) + "</td>");

				out.println("<td> " + rs.getString(5) + "</td>");
				out.println("<td> " + rs.getString(6) + "</td>");
				out.println("<td> " + rs.getString(7) + "</td>");
				out.println("<td> " + rs.getString(8) + "</td>");

				
				out.println("</tr>");
			}

			out.println("</table>");

			// For Data Input
			out.println("<h3>Isssue Details Of Users</h3>");
			out.println("<form action='BookIssueServlet' method='post'>");

			int id = Integer.parseInt(request.getParameter("id"));
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM users WHERE id = ?");

			pstmt.setInt(1, id);
			System.out.println("Updated id :" + id);

			ResultSet rst = pstmt.executeQuery();
			System.out.println("Result set is :" + rst);

			while (rst.next()) {
				out.println("<input type='hidden' name='id' value='" + id + "'>");
				out.println("Name : <input type='text' name='name' value='" + rst.getString("name") + "'><br><br>");
				out.println("Email : <input type='email' name='email' value='" + rst.getString("email") + "'><br><br>");
				out.println(
						"Contact : <input type='text' name='mobile' value='" + rst.getString("contact") + "'><br><br>");
			}

			out.println("Book Name:<input type='text' name='bookname' placeholder='Enter The Book Name'><br><br>");
			out.println("ISBN Number:<input type='text' name='isbn' placeholder='Enter The ISBN Number'><br><br>");
			out.println("Issued Date:<input type='text' name='issuedate' placeholder='Enter The issue Date'><br><br>");
			out.println(
					"Return Date:<input type='text' name='returndate' placeholder='Enter The Return Date'><br><br>");
			out.println("<input type='submit' value='Confirm'>");
			out.println("</form>");

			out.println("</body>");
			out.println("</html>");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("In Book Issue doPost()");

		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("mobile");
		String bookname = request.getParameter("bookname");
		String isbnnum = request.getParameter("isbn");
		String issuedate = request.getParameter("issuedate");
		String returndate = request.getParameter("returndate");

		System.out.println(name + email + contact + bookname + isbnnum + issuedate + returndate);

		// insert the records in bookissued table

		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

			PreparedStatement pstmt = conn.prepareStatement(
					"INSERT INTO bookissuedata(id,name,email,contact,bookname,isbn,issuedate,submitddate) values(?,?,?,?,?,?,?,?)");
			// pstmt = conn.prepareStatement(returndate)

			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, contact);
			pstmt.setString(5, bookname);
			pstmt.setString(6, isbnnum);
			pstmt.setString(7, issuedate);
			pstmt.setString(8, returndate);
			// pstmt.setInt(8, id);

			System.out.println("Data Inserted To Issued table");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM bookissuedata");

			out.println("<!doctype html>");
			out.println("<html>");
			out.println("<head><title>Issue Record Of Users</title></head>");
			out.println("<body>");
			out.println("<table border='1'>");
			out.println(
					"<tr> <th>ID</th> <th>Name</th> <th>Email</th> <th>Contact</th> <th>Book Name</th> <th>ISBN</th><th>Issue Date</th> <th>End Date</th></tr>");

			while (rs.next()) {
				out.println("<tr>");
				out.println("<td> " + rs.getInt(1) + "</td>");
				out.println("<td> " + rs.getString(2) + "</td>");
				out.println("<td> " + rs.getString(3) + "</td>");
				out.println("<td> " + rs.getString(4) + "</td>");

				out.println("<td> " + rs.getString(5) + "</td>");
				out.println("<td> " + rs.getString(6) + "</td>");
				out.println("<td> " + rs.getString(7) + "</td>");
				out.println("<td> " + rs.getString(8) + "</td>");

				out.println("</tr>");
			}
			out.println("</table><br>");
			out.println("<a href='Books'>Return to HomePage</a>");
			out.println("</body>");
			out.println("</html>");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
