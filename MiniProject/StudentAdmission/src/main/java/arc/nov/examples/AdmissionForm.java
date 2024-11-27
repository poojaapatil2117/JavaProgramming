package arc.nov.examples;

import java.io.File;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.multipart.Part;

@WebServlet("/AdmissionForm")

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
		maxFileSize = 1024 * 1024 * 10, // 10 MB
		maxRequestSize = 1024 * 1024 * 100 // 100 MB
)
public class AdmissionForm extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		// Get the PrintWriter object to write the response
		PrintWriter out = response.getWriter();

		String email = null;
		String name = null;
		String contact = null;
		int sid = 0 ;

		HttpSession session = request.getSession();
		String email1 = (String) session.getAttribute("emaill");

		System.out.println("Email1 Is :" + email1);

		DatabaseConnector connector = new DatabaseConnector();
		try (Connection conn = connector.getConnection()) {
			// Prepare the SQL query
			String sql = "SELECT * FROM student WHERE email = ?";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, email1); // Use the id passed in the request
			ResultSet resultset = statement.executeQuery();

			if (resultset.next()) {
				sid = resultset.getInt("id");
				name = resultset.getString("name");
				email = resultset.getString("email");
				contact = resultset.getString("contact");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Start the HTML content
		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("<title>Admission Form</title>");
        out.println("<link rel='stylesheet' href='CSS/admission.css'>");
//		out.println("<style>");
//		out.println("body { font-family: 'Arial', sans-serif; margin: 0; padding: 0; background-color: #f5f5f5; }");
//		out.println(
//				".container { max-width: 800px; margin: 20px auto; background-color: #fff; box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1); border-radius: 10px; padding: 30px; }");
//		out.println(".header { text-align: center; margin-bottom: 30px; }");
//		out.println(".header h1 { font-size: 24px; margin: 0; }");
//		out.println(".form-group { margin-bottom: 20px; }");
//		out.println(".form-group label { display: block; font-size: 14px; margin-bottom: 5px; font-weight: bold; }");
//		out.println(
//				".form-group input, .form-group select, .form-group button { width: 100%; padding: 10px; font-size: 14px; border: 1px solid #ddd; border-radius: 5px; outline: none; }");
//		out.println(
//				".form-group input:focus, .form-group select:focus { border-color: #007bff; box-shadow: 0 0 5px rgba(0, 123, 255, 0.25); }");
//		out.println(
//				".form-group button { background-color: #007bff; color: #fff; border: none; cursor: pointer; font-size: 16px; font-weight: bold; }");
//		out.println(".form-group button:hover { background-color: #0056b3; }");
//		out.println(".form-title { font-size: 18px; margin-bottom: 20px; font-weight: bold; color: #333; }");
//		out.println(".form-section { margin-bottom: 30px; }");
//		out.println(".hidden { display: none; }");
//		out.println("</style>");
		out.println("<script>");
		out.println("function toggleFileUploads() {");
		out.println("    var course = document.getElementById('course').value;");
		out.println("    if (course == 'diploma') {");
		out.println("        document.getElementById('degree-files').classList.add('hidden');");
		out.println("        document.getElementById('diploma-files').classList.remove('hidden');");
		out.println("    } else if (course == 'degree') {");
		out.println("        document.getElementById('diploma-files').classList.add('hidden');");
		out.println("        document.getElementById('degree-files').classList.remove('hidden');");
		out.println("    }");
		out.println("}");
		out.println("</script>");
		out.println("</head>");
		out.println("<body>");

		// Start container div
		out.println("<div class='container'>");

		// Header section
		out.println("<div class='header'>");
		out.println("<h1>Admission Form</h1>");
		out.println("</div>");

		// Form Section
		out.println("<form action='AdmissionForm' method='POST' enctype='multipart/form-data'>");

		// Personal Details Section
		out.println("<div class='form-section'>");
		out.println("<h2 class='form-title'>Personal Details</h2>");
		out.println("<input type = 'hidden' name='studentID' value ="+sid+">");
		out.println("<div class='form-group'>");
		out.println("<label for='full-name'>Full Name</label>");
		out.println("<input type='text' id='full-name' name='full-name' value=" + name + " required>");
		out.println("</div>");
		out.println("<div class='form-group'>");
		out.println("<label for='email'>Email Address</label>");
		out.println("<input type='email' id='email' name='email' value=" + email + " required>");
		out.println("</div>");
		out.println("<div class='form-group'>");
		out.println("<label for='contact'>Contact Number</label>");
		out.println("<input type='tel' id='contact' name='contact' value=" + contact + " required>");
		System.out.println("Name is :" + name);

		out.println("</div>");

		// Educational Details Section
		out.println("<div class='form-section'>");
		out.println("<h2 class='form-title'>Educational Details</h2>");
		out.println("<div class='form-group'>");
		out.println("<label for='course'>Select Course</label>");
		out.println("<select id='course' name='course' onchange='toggleFileUploads()' required>");
		out.println("<option value='' disabled selected>-- Select Course --</option>");
		out.println("<option value='diploma'>Diploma</option>");
		out.println("<option value='degree'>Degree</option>");
		out.println("</select>");
		out.println("</div>");

		// Document Upload Section for Diploma
		out.println("<div id='diploma-files' class='form-section hidden'>");
		out.println("<h2 class='form-title'>Document Upload (Diploma)</h2>");
		out.println("<div class='form-group'>");
		out.println("<label for='hsc-marksheet'>Upload HSC Marksheet</label>");
		out.println("<input type='file' id='hsc-marksheet' name='hsc-marksheet' accept='.pdf,.jpg,.jpeg,.png'>");
		out.println("</div>");
		out.println("<div class='form-group'>");
		out.println("<label for='ssc-marksheet'>Upload SSC Marksheet</label>");
		out.println("<input type='file' id='ssc-marksheet' name='ssc-marksheet' accept='.pdf,.jpg,.jpeg,.png'>");
		out.println("</div>");
		out.println("<div class='form-group'>");
		out.println("<label for='government-id'>Upload Government ID (Aadhaar)</label>");
		out.println("<input type='file' id='government-id' name='government-id' accept='.pdf,.jpg,.jpeg,.png'>");
		out.println("</div>");
		out.println("</div>");

		// Document Upload Section for Degree
		out.println("<div id='degree-files' class='form-section hidden'>");
		out.println("<h2 class='form-title'>Document Upload (Degree)</h2>");
		out.println("<div class='form-group'>");
		out.println("<label for='hsc-marksheet'>Upload HSC Marksheet</label>");
		out.println(
				"<input type='file' id='hsc-marksheet-degree' name='hsc-marksheet-degree' accept='image/*'>");
		out.println("</div>");
		out.println("<div class='form-group'>");
		out.println("<label for='ssc-marksheet'>Upload SSC Marksheet</label>");
		out.println(
				"<input type='file' id='ssc-marksheet-degree' name='ssc-marksheet-degree' accept='.pdf,.jpg,.jpeg,.png'>");
		out.println("</div>");
		out.println("<div class='form-group'>");
		out.println("<label for='cet-marksheet'>Upload CET Marksheet</label>");
		out.println("<input type='file' id='cet-marksheet' name='cet-marksheet' accept='.pdf,.jpg,.jpeg,.png'>");
		out.println("</div>");
		out.println("<div class='form-group'>");
		out.println("<label for='government-id'>Upload Government ID (Aadhaar)</label>");
		out.println(
				"<input type='file' id='government-id-degree' name='government-id-degree' accept='.pdf,.jpg,.jpeg,.png'>");
		out.println("</div>");
		out.println("</div>");

		// Submit Button
		out.println("<div class='form-group'>");
		out.println("<button type='submit'>Submit</button>");
		out.println("</div>");
		
	//	out.println("<input type='hidden' value='" + sid + "' name='studentId'>");
		// End the form
		out.println("</form>");
		// End container div
		out.println("</div>");
		
		// Close HTML tags
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cource = request.getParameter("course");
		System.out.println("Cource Is :"+cource);

		if(cource.equals("diploma"))
		{
			String sid = request.getParameter("studentId");
			System.out.println("Student id is :" + sid);
			
			//get The Uploaded Path
			javax.servlet.http.Part hscPart = request.getPart("hsc-marksheet");
			javax.servlet.http.Part sscPart = request.getPart("ssc-marksheet");
			javax.servlet.http.Part adharPart = request.getPart("government-id");
	
			String dir = "C:/Users/USER/eclipse-workspace/StudentAdmission/src/main/webapp/StudentDocuments/";
			String studentFolder = dir + sid + "/";
	
			File userFolder = new File(studentFolder);
	
			if (!userFolder.exists()) {
				userFolder.mkdir();
			}
	
			// Save the files to the custom path
			String hscImagePath = studentFolder + "hsc_image_" + hscPart.getSubmittedFileName();
			String sscImagePath = studentFolder + "ssc_image_" + sscPart.getSubmittedFileName();
			String adharImagePath = studentFolder + "adhar_image_" + adharPart.getSubmittedFileName();
	
			// Save the files
			hscPart.write(hscImagePath);
			sscPart.write(sscImagePath);
			adharPart.write(adharImagePath);
	
			// Now store the relative paths in the database (relative to the custom folder)
			String hscImageUrl = "StudentDocuments/" + sid + "/hsc_image_" + hscPart.getSubmittedFileName();
			String sscImageUrl = "StudentDocuments/" + sid + "/ssc_image_" + sscPart.getSubmittedFileName();
			String adharImageUrl = "StudentDocuments/" + sid + "/adhar_image_" + adharPart.getSubmittedFileName();
			DatabaseConnector connector = new DatabaseConnector();
		
			System.out.println("HSC Image URL "+hscImageUrl);
			try (Connection conn = connector.getConnection()) {
				String query = "INSERT INTO deploma_details (stid, hsc, ssc, adhar) VALUES (?, ?, ?, ?)";
				PreparedStatement preparedStatement = conn.prepareStatement(query);
				System.out.println("In Connection");
				preparedStatement.setInt(1, Integer.parseInt(sid));
				preparedStatement.setString(2, hscImageUrl);
				preparedStatement.setString(3, sscImageUrl);
				preparedStatement.setString(4, adharImageUrl);
				preparedStatement.executeUpdate();
				response.getWriter().println("Files uploaded successfully!");
				System.out.println("Files uploaded successfully!");
				//response.sendRedirect("PaymentServlet");
			}	
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(cource.equals("degree"))
		{
			String sid = request.getParameter("studentId");
			System.out.println("Student id is :" + sid);
			
			//get The Uploaded Path
			javax.servlet.http.Part hscPart = request.getPart("hsc-marksheet-degree");
			javax.servlet.http.Part sscPart = request.getPart("ssc-marksheet-degree");
			javax.servlet.http.Part cetPart = request.getPart("cet-marksheet");
			javax.servlet.http.Part adharPart = request.getPart("government-id-degree");
	
			String dir = "C:/Users/USER/eclipse-workspace/StudentAdmission/src/main/webapp/StudentDocumentsDegree/";
			String studentFolder = dir + sid + "/";
	
			File userFolder = new File(studentFolder);
	
			if (!userFolder.exists()) {
				userFolder.mkdir();
			}
	
			// Save the files to the custom path
			String hscImagePath = studentFolder + "hsc_image_" + hscPart.getSubmittedFileName();
			String sscImagePath = studentFolder + "ssc_image_" + sscPart.getSubmittedFileName();
			String cetImagePath = studentFolder + "cet_image_" + cetPart.getSubmittedFileName();
			String adharImagePath = studentFolder + "adhar_image_" + adharPart.getSubmittedFileName();
			
	
			// Save the files
			hscPart.write(hscImagePath);
			sscPart.write(sscImagePath);
			cetPart.write(cetImagePath);
			adharPart.write(adharImagePath);
	
			// Now store the relative paths in the database (relative to the custom folder)
			String hscImageUrl = "StudentDocumentsDegree/" + sid + "/hsc_image_" + hscPart.getSubmittedFileName();
			String sscImageUrl = "StudentDocumentsDegree/" + sid + "/ssc_image_" + sscPart.getSubmittedFileName();
			String cetImageUrl = "StudentDocumentsDegree/" + sid + "/cet_image_" + cetPart.getSubmittedFileName();
			String adharImageUrl = "StudentDocumentsDegree/" + sid + "/adhar_image_" + adharPart.getSubmittedFileName();
			DatabaseConnector connector = new DatabaseConnector();
		
			System.out.println("HSC Image URL "+hscImageUrl);
			try (Connection conn = connector.getConnection()) {
				String query = "INSERT INTO degree_details (stid, hsc, ssc,cet,adhar) VALUES (?,?, ?, ?, ?)";
				PreparedStatement preparedStatement = conn.prepareStatement(query);
				System.out.println("In Connection");
				preparedStatement.setInt(1, Integer.parseInt(sid));
				preparedStatement.setString(2, hscImageUrl);
				preparedStatement.setString(3, sscImageUrl);
				preparedStatement.setString(4, cetImageUrl);
				preparedStatement.setString(5, adharImageUrl);
				preparedStatement.executeUpdate();
				response.getWriter().println("Files uploaded successfully!");
				
				System.out.println("Files uploaded successfully!");
				//response.sendRedirect("PaymentServlet");
			}	
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	       // request.setAttribute("course", cource);
		try 
		{
		     RequestDispatcher dispatcher = request.getRequestDispatcher("/PaymentServlet");
		     dispatcher.forward(request, response);
		}catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "An error occurred during file upload. Please try again.");
            RequestDispatcher errorDispatcher = request.getRequestDispatcher("/errorPage.jsp");
            errorDispatcher.forward(request, response);
        }
	}
}
