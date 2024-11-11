package arc.nov.examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletCRUDRegistrationOne")
public class ServletCRUDRegistrationOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String filePath = getServletContext().getRealPath("WEB-INF/CRUDRegistrationOne.txt");

		String option = request.getParameter("action");

		if (option.equals("create")) {
			// get the record from request
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String contact = request.getParameter("mobile");

			writeToFile(filePath, name, email, contact);
			displayRecords(filePath, out);
		} else if (option.equals("update")) {
			String oldemail = request.getParameter("oldemail");

			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String contact = request.getParameter("mobile");

			String newrecord = name + "," + email + "," + contact;

			UpdateWrite(newrecord, oldemail, filePath);
			displayRecords(filePath, out);
		}
		else if(option.equals("delete"))
		{
			String email = request.getParameter("email");
			deleteRecord(email,filePath);
			displayRecords(filePath, out);
		}
		else if(option.equals("search"))
		{
			String searchfield = request.getParameter("search");
			searchTheRecord(out,searchfield,filePath);
		}

	}

	private void deleteRecord(String email, String filePath) throws FileNotFoundException, IOException {
		
		List<String> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath)))
		{
			String line="";
			while((line=br.readLine()) != null)
			{
				String fields[] = line.split(",");
				
				if(!fields[1].equals(email))
				{
					list.add(line);
				}
			}
		}
		try(FileWriter fw = new FileWriter(filePath)){
			
			for(String record:list)
			{
				fw.write(record+"\n");
			}
		}
	}

	private void searchTheRecord(PrintWriter out, String searchfield, String filePath) throws FileNotFoundException, IOException {
		
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head><title>Registered Record</title></head>");
		out.println("<body>");
		out.println("<table border='1'>");
		out.println("<tr> <th>Name</th> <th>Email</th> <th>Contact</th>  <th>Action</th> </tr>");
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath)))
		{
			String line="";
			while((line=br.readLine())!=null)
			{
				if(line.toLowerCase().contains(searchfield.toLowerCase()))
				{
					String[] fields = line.split(",");
					out.println("<tr>");
					for(String field:fields)
					{
						out.println("<td>"+field+"</td>");
					}
					
					out.println("<td>");
					out.println("<form action='' method='post' style='display:inline-block;'> ");
					out.println("<input type='hidden' name='action' value='delete'>");
					out.println("<input type='hidden' name='email' value='"+fields[1]+"'>");
					out.println("<input type='submit' value='Delete'>");
					out.println("</form>");
					
					
					// for update
					out.println("<button onclick=\"showUpdateForm('" + fields[0] + "','" + fields[1] + "','" + fields[2]
							+ "')\" style='display:inline-block;' >Update</button>");
					out.println("</td>");
					out.println("</tr>");
					
					//out.println("</tr>");
				}
			}
		}
		
		out.println("</table>");
		out.println("</body></html>");
	}

	private void UpdateWrite(String newrecord, String oldemail, String filePath) throws IOException {

		List<String> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = "";
			while ((line = br.readLine()) != null) {
				if (line.split(",")[1].equals(oldemail)) {
					list.add(newrecord);
				} else {
					list.add(line);
				}
			}
		}

		try (FileWriter fw = new FileWriter(filePath)) {
			for (String record : list) {
				fw.write(record + "\n");
			}
		}
	}

	private void displayRecords(String filePath, PrintWriter out) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head><title>Registered Record</title></head>");
		out.println("<body>");
		out.println("<table border='1'>");
		out.println("<tr> <th>Name</th> <th>Email</th> <th>Contact</th>  <th>Action</th> </tr>");

		int recordcnt = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = "";

			while ((line = br.readLine()) != null) {
				recordcnt++;
				String[] fields = line.split(",");

				out.println("<tr>");
				for (String field : fields) {
					out.println("<td>" + field + "</td>");
				}
				System.out.println(line);
				
				
				out.println("<td>");
				//for delete
				
				out.println("<form action='' method='post' style='display:inline-block;'> ");
				out.println("<input type='hidden' name='action' value='delete'>");
				out.println("<input type='hidden' name='email' value='"+fields[1]+"'>");
				out.println("<input type='submit' value='Delete'>");
				out.println("</form>");
				
				
				// for update
				out.println("<button onclick=\"showUpdateForm('" + fields[0] + "','" + fields[1] + "','" + fields[2]
						+ "')\" style='display:inline-block;' >Update</button>");
				out.println("</td>");
				out.println("</tr>");
			}
		}

		out.println("</table>");

		out.println("<h4>The Record Count is : " + recordcnt + "</h4>");
		out.println("<br><a href='index.html'>Insert Another Record</a> <br><br>");
		

		//For Search
		out.println("<form = action ='ServletCRUDRegistrationOne' method='post'>");
		out.println("<input type='hidden'  name='action' value='search' >");
		out.println("<input type='text'");
		out.println("Search : <input type='text' name='search' placeholder='Enter The SearName' >");
		out.println("<input type='submit' value='search'>");
		out.println("</form>");
		
		
		// For Update Record -hidden-byDefault
		out.println("<div style = 'display:none;' id='updateForm'>");
		out.println("<h3> Update Records </h3>");
		out.println("<form action='ServletCRUDRegistrationOne' method='post'>");
		// hidden field
		out.println("<input type='hidden' name = 'action' value='update'> ");
		out.println("<input type='hidden' name='oldemail' id='oldemail'> ");

		// Update Fields
		out.println("Name: <input type='text' name='name' id='updateName'> <br><br>");
		out.println("Email: <input type='text' name='email' id='updateEmail'> <br><br>");
		out.println("Contact: <input type='text' name='mobile' id='updateMobile'> <br><br>");
		out.println("<input type='submit' value='Update'>");

		out.println("</form>");
		out.println("</div>");

		// Script For Update Optration
		out.println("<script type='text/javascript'>");
		out.println("function showUpdateForm(name,email,mobile){");
		out.println("document.getElementById('updateForm').style.display='block';");
		out.println("document.getElementById('updateName').value = name;");
		out.println("document.getElementById('updateEmail').value = email;");
		out.println("document.getElementById('updateMobile').value = mobile;");
		out.println("document.getElementById('oldemail').value = email;");

		out.println("}");
		out.println("</script>");
		out.println("</body></html>");

	}

	// Write The Data TO File
	private void writeToFile(String filePath, String name, String email, String contact) throws IOException {

		try (FileWriter fw = new FileWriter(filePath, true)) {
			fw.write(name + "," + email + "," + contact + "\n");
		}
	}

}
