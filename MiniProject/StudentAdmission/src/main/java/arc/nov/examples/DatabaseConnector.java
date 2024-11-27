package arc.nov.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnector {
    private static final String URL = "jdbc:mysql://localhost:3306/addmission_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Root";
    
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }


    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Load the JDBC driver (optional for modern Java versions)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the connection
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
