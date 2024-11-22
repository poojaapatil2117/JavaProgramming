package arc.nov.examples;

import java.io.IOException;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/Display_Users")

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
		maxFileSize = 1024 * 1024 * 10, // 10 MB
		maxRequestSize = 1024 * 1024 * 100 // 100 MB
)
public class Display_Users extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final String URL = "jdbc:mysql://localhost:3306/library_db";
	private static final String USER = "root";
	private static final String PASSWORD = "Root";

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>File Upload Form</title>");
		out.println("<link rel='stylesheet' type='text/css' href='CSS/Style.css'>"); // Relative to the context root
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Enter Books Details</h1>");

		// Table FOr Display Record
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
			String displayQuery = "select * from books";
			PreparedStatement stmt = conn.prepareStatement(displayQuery);
			ResultSet rs = stmt.executeQuery();
			out.println("<table border='1'>");
			out.println(
					"<tr> <th>ID</th> <th>Name</th> <th>ISBN</th> <th>Author</th> <th>Publisher</th> <th>BookCount</th> <th>Available Count</th> <th>Book Price</th> <th>Book Image</th> </tr>");
			while(rs.next())
			{
				out.println("<tr>");
				out.println("<td> " + rs.getInt(1) + "</td>");
				out.println("<td> " + rs.getString(2) + "</td>");
				out.println("<td> " + rs.getString(3) + "</td>");
				out.println("<td> " + rs.getString(4) + "</td>");
				out.println("<td> " + rs.getString(5) + "</td>");
				out.println("<td> " + rs.getInt(6) + "</td>");
				out.println("<td> " + rs.getInt(7) + "</td>");
				out.println("<td> " + rs.getString(8) + "</td>");
			    out.println("<td> <img src='"+rs.getString(9)+"' width='100' height='100' >"+"</td>");
			    
				out.println("</tr>");
			}
			out.println("</table>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		out.println("<br><br>");
		// ----------------------------------------------

		// Form To Fetch Column according to check Box

		String bookId = request.getParameter("id");
		String bookName = request.getParameter("bkname");
		String img = request.getParameter("bkimg");
		String author =request.getParameter("bkauthor");
		String publication = request.getParameter("bkpublication");

		out.println("<form action='Display_Users'>");

		out.println("<input type='checkbox' name='id' id='bookid'value='id'> Id");
		out.println("<input type='checkbox' name='bkname' id='bookname'value='bookname'> BookName");
		out.println("<input type='checkbox' name='bkimg' id='bookimg'value='bimage'>Image");
		out.println("<input type='checkbox' name='bkauthor' id='bookauthor'value='bauthor'> Author");
		out.println("<input type='checkbox' name='bkpublication' id='bookpublication'value='bpublication'> Publication");
		out.println("<input type='submit' value='Submit'>");
		out.println("</form><br>");

		// ---------------------------------------------------------------------------
		// To display The Records According to Checkbox..

		if (bookId != null || bookName != null || img != null || author!=null || publication!=null) {
			try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
				StringBuilder sql = new StringBuilder("SELECT id");
				if (bookName != null) {
					sql.append(",name");
				}
				if (img != null) {
					sql.append(",img");
				}
				if (author != null) {
					sql.append(",author");
				}
				if (publication != null) {
					sql.append(",publication");
				}
				
				sql.append(" FROM books");

				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql.toString());

				out.println("<h1>Book Details</h1>");
				out.println("<table border='1'>");
				out.println("<tr>");

				if (bookId != null) {
					out.println("<th>Book ID</th>");
				}
				if (bookName != null) {
					out.println("<th>Book Name</th>");
				}
				if (img != null) {
					out.println("<th>Book Image</th>");
				}
				if (author != null) {
					out.println("<th>Book Author</th>");
				}
				if (publication != null) {
					out.println("<th>Book Publication</th>");
				}
				out.println("</tr>");

				// Add Row To the Table....
				while (rs.next()) {
					out.println("<tr>");
					if (bookId != null) {
						out.println("<td>" + rs.getInt(1) + "</td>");
					}
					if (bookName != null) {
						out.println("<td> " + rs.getString(2) + "</td>");
					}
					if (img != null) {
						out.println("<td> <img src='" + rs.getString("img") + "' width='100' height='100'> " + "</td>");
					}
					if (author != null) {
						out.println("<td> " + rs.getString("author") + "</td>");
					}
					if (publication != null) {
						out.println("<td> " + rs.getString("publication") + "</td>");
					}
					out.println("</tr>");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			out.println("<p style='color:red; text-align:center;'>Please Select At Least One Colunm to Display..</p>");
		}

		// --------------------------------------------------------------------
		out.println("</body>");
		out.println("</html>");
	}

	// --------------------------------------------------------------------------------

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}
