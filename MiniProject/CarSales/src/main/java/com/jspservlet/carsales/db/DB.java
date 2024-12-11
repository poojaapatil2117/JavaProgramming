package com.jspservlet.carsales.db;

import java.sql.Connection;

import java.sql.DriverManager;

public class DB {
    private static Connection con = null;

    public static Connection getCon() throws Exception {
    	
        if (con == null || con.isClosed()) { 
            Class.forName("com.mysql.cj.jdbc.Driver");
        	String url ="jdbc:mysql://localhost:3306/carsalesystem";
        	String userName = "root";
        	String pass ="Root";
            con = DriverManager.getConnection(url, userName, pass);
            System.out.println("Connection Succurssfully...");
        }
        else
        {
        	 System.out.println("Access Denied...");
        }
        return con; 
    }
}
