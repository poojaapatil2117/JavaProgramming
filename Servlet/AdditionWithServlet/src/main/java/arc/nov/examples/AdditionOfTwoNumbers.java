package arc.nov.examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdditionOfTwoNumbers")
public class AdditionOfTwoNumbers extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public AdditionOfTwoNumbers() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Addition Of Two Numbers </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action='AdditionOfTwoNumbers' method='post'>");
		out.println("<input type='text' name='no1' placeholder='Enter Number 1:'> <br><br>");
		out.println("<input type='text' name='no2' placeholder='Enter Number 2:'> <br><br>");
		out.println("<input type='submit' value='add'><br><br>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		int x = Integer.parseInt(request.getParameter("no1"));
		int y= Integer.parseInt(request.getParameter("no2"));
		
		int z = x+y;
		
		PrintWriter out = response.getWriter();
		out.println("<h2>Addition is " + z +"</h2>");
		
	}

}
