package arc.nov.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SortTheRecords
 */
@WebServlet("/SortTheRecords")
public class SortTheRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String filePath = getServletContext().getRealPath("WEB-INF/Registration.txt");
		
		List<String> arraylist = new ArrayList<>();
		
		out.println("<!doctype html>");
		out.println("<html><body>");
		out.println("<head><title>Sorted data</title></head>");
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath)))
		{
			String line="";
			
			while( (line = br.readLine() )!=null)
			{
				arraylist.add(line);
			}
		}
		
		Collections.sort(arraylist);
		
		out.println("<h1> Sorted Data </h1>");
		for(String s:arraylist)
		{
			out.println("<h3>"+s+"</h3>");
		}

		out.println("</body></html>");
	}
}
