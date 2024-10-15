package SwingDB;

import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.*;

public class MainFrame extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JButton addButton, deleteButton, updateButton, showButton;
	AddFrame addFrame;
	DeleteFrame deleteFrame;
	UpdateFrame updateFrame;
	ShowFrame showFrame;

	private static final String url = "jdbc:mysql://127.0.0.1:3306/swinganddb";
	private static final String username = "root";
	private static final String password = "Root";

	protected Connection con;

	public MainFrame(String title) {
		super(title);
		setLayout(new FlowLayout());
		int width = 600;
		int height = 500;
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screen.width - width) / 2;
		int y = (screen.height - height) / 2;
		setBounds(x, y, width, height);

		try {

			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// createTable(con);

		addButton = new JButton("Add Item");
		addButton.addActionListener(this);
		deleteButton = new JButton("Delete Item");
		deleteButton.addActionListener(this);
		updateButton = new JButton("Update Item");
		updateButton.addActionListener(this);
		showButton = new JButton("Show Item");
		showButton.addActionListener(this);

		add(addButton);
		add(deleteButton);
		add(updateButton);
		add(showButton);
	}

	public void actionPerformed(ActionEvent ae) {
		String command = ae.getActionCommand();
		if (command.equals("Add Item")) {
			System.out.println("Add Item is selected");
			addFrame = new AddFrame(this);
		} else if (command.equals("Delete Item")) {
			System.out.println("Delete Item is selected");
			deleteFrame = new DeleteFrame(this);
			try {
				deleteFrame.ShowDetails();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (command.equals("Update Item")) {
			System.out.println("Update Item is selected");
			updateFrame = new UpdateFrame(this);
			try {
				updateFrame.ShowDetailsForUpdate();
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		else if (command.equals("Show Item")) {
			System.out.println("Show Item is selected");
			showFrame = new ShowFrame(this);
			try {
				showFrame.ShowTable();
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
