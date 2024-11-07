package arc.nov.examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String data_name = request.getParameter("name");
		String data_email=request.getParameter("email");
		String data_pass = request.getParameter("password");
		String data_gender = request.getParameter("gender");
		
		String skills[]=request.getParameterValues("skill");
		String country=request.getParameter("country");
		String languages[]=request.getParameterValues("language");
		String userid=request.getParameter("userid");
		String comments = request.getParameter("comments");
		String dob = request.getParameter("dob");
		
		
		System.out.println("Name: "+data_name+"\t Email: "+data_email+"\tPass"+data_pass);
		System.out.println("Gender:"+data_gender);
		//----------------
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("Data Submitted Successfully");
		out.print("<p>Data Is: <br><b>Name:</b> "+data_name+"<br><b>Email:</b> "+data_email+"</p>");
		out.print("<br><p><b>Password:</b> "+data_pass);
		out.print("<br><b>Gender:</b>"+data_gender);
		out.print("<br><b>Skills:</b>");
		if(skills!=null)
		{
			for(String skill : skills)
			{
				out.print("<br>"+skill);
			}
			out.print("<br>");
		}
		out.print("<br><b>Countries:  </b>"+country);
		
		out.print("<br><b>Languages:  </b>");
		if(languages!=null)
		{
			for(String lang:languages)
			{
				out.print(lang);
			}
			out.print("<br>");
		}
		
		out.print("<br><b>UserId:</b> "+userid);
		out.print("<br><b>Comments:</b> "+comments);
		out.print("<b>Date Of Birt:</b>"+dob);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
