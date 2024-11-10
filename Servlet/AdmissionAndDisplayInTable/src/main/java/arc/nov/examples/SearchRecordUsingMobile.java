package arc.nov.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchRecordUsingMobile")
public class SearchRecordUsingMobile extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SearchRecordUsingMobile() {
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		//To search the Person using Mobile
		String searchperson = request.getParameter("searchperson");

		String filePath = getServletContext().getRealPath("WEB-INF/Registration.txt");
		
		out.println("<html><body>");
		out.println("<table border='1'>");
		out.println("<tr> <th>Name</th> <th>Email</th>  <th>Contact</th> </tr>");
		try(BufferedReader br = new BufferedReader(new FileReader(filePath)))
		{
			String line ="";
			int flag=0;
			while((line = br.readLine()) != null)
			{
				String fileds[] = line.split(",");
				
				
				for(String filed : fileds)
				{
					if(filed.contains(searchperson))
					{
						out.println("<tr>");
						flag=1;
						for(String fil :fileds)
						{
							out.println("<td>"+fil+"</td>");
						}
					}
					out.println("</tr>");
				}
				out.println("</p>");
			}
			if(flag==0)
			{
				out.println("<td>No Record</td>");
			}
		}
		out.println("</table>");
		out.println("</body></html>");
	}
}
