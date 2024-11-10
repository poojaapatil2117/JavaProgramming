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

@WebServlet("/ServletCRUDRegistration")
public class ServletCRUDRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Set The FilePath
		String filePath = getServletContext().getRealPath("WEB-INF/CRUDWithServletRegistraion");

		// String Data = data_name+","+data_email+","+data_contact+"\n";

		String option = request.getParameter("action");
		System.out.println("Action: " + option);

		if (option.equals("create")) {
			// get The data From Request
			String data_name = request.getParameter("name");
			String data_email = request.getParameter("email");
			String data_contact = request.getParameter("mobile");
			
			writeDataToFile(filePath, data_name, data_email, data_contact);
			displayRecords(out, filePath);
		}

		else if (option.equals("delete")) {
			String email = request.getParameter("email");
			deleteRecord(email, filePath);
			displayRecords(out, filePath);
		}
		
		else if(option.equals("update"))
		{
			String data = request.getParameter("oldrecord");
			updateRecord(out,data);
		}
		else if(option.equals("updateconfirm")) 
		{
			//olddata line
			String olddata = request.getParameter("oldrecord");
			
			String data_name = request.getParameter("name");
			String data_email = request.getParameter("email");
			String data_contact = request.getParameter("mobile");
			
			//get the NewData
			String newdata = data_name+","+data_email+","+data_contact;
			
			System.out.println("Update Data : "+olddata);
			System.out.println("updated Data : "+newdata);
			
			updateConfirm(filePath,olddata,newdata);
			displayRecords(out, filePath);
		}

	}

	private void updateConfirm(String filePath, String olddata, String newdata) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(filePath)))
		{
			String line = "";
			while((line=br.readLine())!=null)
			{
				if(line.equals(olddata))
				{
					list.add(newdata);
				}
				else
				{
					list.add(line);
				}
			}
		}
		
		try(FileWriter fw = new FileWriter(filePath))
		{
			for(String record:list)
			{
				fw.write(record+"\n");
			}
		}
	}

	private void updateRecord(PrintWriter out, String data) {
		// TODO Auto-generated method stub
		
		String record[] = data.split(",");
		
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head> <title> Registered Data </title> </head>");
		out.println("<body>");
		out.println("<h1>Enter The New Data</h1>");
		out.println("<form action='ServletCRUDRegistration' method='post'>");
		
		//hidden field for take olddata to update the fields
		out.println("<input type='hidden' name='action' value='updateconfirm'>");
		out.println("<input type='hidden' name='oldrecord' value='"+data+"'>");
		
		//take field and fill with old data using value
		out.println("Name: <input type='text' name='name' value='"+record[0]+"'><br><br>");
		out.println("Email: <input type ='email' name='email' value='"+record[1]+"'><br><br>");
		out.println("Contact: <input type='text' name='mobile' value='"+record[2]+"'><br><br<>");
		
		out.println("<input type='submit' value='Update'>");
		
		out.println("</form>");
		out.println("</body></html>");	
	}

	private void deleteRecord(String email, String filePath) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = "";
			while ((line = br.readLine()) != null) {
				String fields[] = line.split(",");
				if (!fields[1].equals(email)) {
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

	private void displayRecords(PrintWriter out, String filePath) throws IOException {
		// Read The data from file
		out.println("<! Doctype html>");
		out.println("<html>");
		out.println("<head><title>CRUD Read From File</title></head>");
		out.println("<body>");
		out.println("<h1> Regitration Details </h1>");
		out.println("<table border='1'>");
		out.println("<tr> <th>Name</th> <th>Email</th> <th>Contact</th> <th>Action</th> </tr>");

		int recordcnt = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line = "";
			while ((line = br.readLine()) != null) {
				recordcnt++;
				String fields[] = line.split(",");

				out.println("<tr>");
				for (String field : fields) {
					out.println("<td> " + field + "</td>");
				}

				// For Delete
				out.println("<td>");
				out.println("<form action ='ServletCRUDRegistration' method='post' style='display:inline;'>");
				out.println("<input type='hidden' name='action' value='delete'>");
				out.println("<input type='hidden' name='email' value='" + fields[1] + "'>");
				out.println("<input type='submit' value='Delete'>");
				out.println("</form>");

				// for update
				out.println("<form action='ServletCRUDRegistration' method ='post' style='display:inline'>");
				out.println("<input type='hidden' name='action' value='update'>");
				out.println("<input type='hidden' name='oldrecord' value='" + line + "'>");
				
				out.println("<input type='submit' value='Update'>");
				out.println("</form>");

				out.println("</td>");
				out.println("</tr>");
			}
		}

		out.println("</table>");
		out.println("<br><a href='index.html'>Insert Another Record</a> <br><br>");
		out.println("<h3> Total Record Count = " + recordcnt + "</h3>");
		// out.println("<a href='search.html'>Serch The Record</a>");
		// out.println("<input type='submit' value='search'>");
		out.println("</body></html>");
	}

	private void writeDataToFile(String filePath, String data_name, String data_email, String data_contact)
			throws IOException {
		// write the Data to file
		try (FileWriter fw = new FileWriter(filePath, true)) {
			fw.write(data_name + "," + data_email + "," + data_contact + "\n");
		}
	}

}
