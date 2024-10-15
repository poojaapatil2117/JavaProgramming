package SwingDB;

import javax.swing.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.*;

public class AddFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JButton saveData, cancelData;
	private JTextField idtext, nametext, emailtext, mobileNotext;

	MainFrame mainframe;

	public AddFrame(MainFrame mainframe) {
		super("ADD Frame");
		setLayout(new FlowLayout());
		int width = 450;
		int height = 300;
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screen.width - width) / 2;
		int y = (screen.height - height) / 2;
		setBounds(x, y, width, height);
		setVisible(true);

		this.mainframe = mainframe;

		JPanel panelfortextfields = new JPanel(new FlowLayout());
		JLabel label = new JLabel("Enter The Id Name Email And Mobile Number");

		idtext = new JTextField(10);
		nametext = new JTextField(10);
		emailtext = new JTextField(10);
		mobileNotext = new JTextField(10);

		panelfortextfields.add(idtext);
		panelfortextfields.add(nametext);
		panelfortextfields.add(emailtext);
		panelfortextfields.add(mobileNotext);

		add(label);
		add(panelfortextfields);
		// --------------------------------------------

		saveData = new JButton("Save");
		saveData.addActionListener(this);
		cancelData = new JButton("Cancel");
		cancelData.addActionListener(this);

		add(saveData);
		add(cancelData);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		PreparedStatement insertStatement;
		if (command.equals("Save")) {
			int id = Integer.parseInt(idtext.getText());
			String name = nametext.getText();
			String email = emailtext.getText();
			String MobileNo = mobileNotext.getText();

			Person person = new Person(id, name, email, MobileNo);

			String insertQuery = "insert into personinfo(id,name,email,mobile)values(?,?,?,?)";

			try {
				insertStatement = mainframe.con.prepareStatement(insertQuery);
				insertStatement.setInt(1, id);
				insertStatement.setString(2, name);
				insertStatement.setString(3, email);
				insertStatement.setString(4, MobileNo);
				insertStatement.executeUpdate();

				System.out.println("Data Inserted Successfully");

			} catch (SQLException e1) {
				e1.printStackTrace();
			}

			idtext.setText("");
			nametext.setText("");
			emailtext.setText("");
			mobileNotext.setText("");
		} else if (command.equals("Cancel")) {
			System.out.println("Cancel Clicked");
		}
	}
}
