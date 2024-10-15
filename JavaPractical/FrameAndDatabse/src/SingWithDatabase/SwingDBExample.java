package SingWithDatabase;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class SwingDBExample extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private static final String url="jdbc:mysql://loaclhost:3306/DBSwing";
	private static final String username="root";
	private static final String password="Root";
	private Connection con;
	
	private JTextField idtext,nametext,emailtext;
	private JButton additem,deleteitem,display,update;
	private JPanel cardPanel;
	
	public SwingDBExample() throws SQLException
	{
		setTitle("MainFrame");
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());	
		
		con = DriverManager.getConnection(url,username,password);
		
	}
	public static void main(String[] args) {
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
