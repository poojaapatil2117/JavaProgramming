package arc.nov.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterAndDisplay")
public class RegisterAndDisplay extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//get The Data From Request
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("mobile");
		
		//created the Single String With All values separeted by comma and end with new line
		String data = name + " , " + email + " , "+contact + "\n";
		//System.out.println(data);
		
		//get The Path To Store The File 
		String filePath = getServletContext().getRealPath("WEB-INF/Registration.txt");
		//System.out.println(filePath);
		
		//Creating the file and Keep on Appending
		try(FileWriter fw = new FileWriter(filePath,true))
		{
			fw.write(data);
		}
		
		//Read All The Records
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head><title> Registration Data</title></head>");
		out.println("<body>");
		out.println("<h1>All Registration Records</h1>");
		
		out.println("<table border='1'>");
		out.println("<tr> <th>Name</th> <th>Email</th>  <th>Contact</th> </tr>");
		
		int totalRecord =0;
		try(BufferedReader br = new BufferedReader(new FileReader(filePath)))
		{
			String line ="";
			while((line = br.readLine()) != null)
			{
				totalRecord++;
				String fileds[] = line.split(",");
				
				out.println("<tr>");
				for(String filed : fileds)
				{
					out.println("<td>"+filed+"</td>");
				}
				out.println("</tr>");
			}
		}
		
		out.println("</table>");
		out.println("<p>Total Record Count : "+totalRecord+"</p>");
		out.println("<a href='index.html'>Register Another Record </a> <br><br>");
		out.println("<a href='SerchPersonUsingContact.html'>Search The Person Using Mobile</a><br><br>");
		out.println("<a href='SortRecords.html'>sort the record</a>");
		
		out.println("</body></html>");
	}
}
