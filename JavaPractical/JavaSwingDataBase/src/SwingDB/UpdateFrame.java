package SwingDB;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.*;

public class UpdateFrame extends JFrame implements ActionListener, ListSelectionListener {

	private static final long serialVersionUID = 1L;
	private JTable table1;
	private JTextField Uidtext, Unametext, Uemailtext, UmMoNo;
	private JButton update;
	public DefaultTableModel model1;
	MainFrame mainframe;

	public UpdateFrame(MainFrame mainframe) {
		super("Update Frame");
		setLayout(new FlowLayout());
		int width = 450;
		int height = 300;
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screen.width - width) / 2;
		int y = (screen.height - height) / 2;
		setBounds(x, y, width, height);
		setVisible(true);

		this.mainframe = mainframe;
		setLayout(new GridLayout(1, 2));

		JPanel leftPanel = new JPanel(new GridLayout(20, 1));
		Uidtext = new JTextField();
		// Uidtext.setEditable(false);

		Unametext = new JTextField();
		Uemailtext = new JTextField();
		UmMoNo = new JTextField();

		update = new JButton("Update");
		update.addActionListener(this);
		update.setEnabled(false);

		leftPanel.add(Uidtext);
		leftPanel.add(Unametext);
		leftPanel.add(Uemailtext);
		leftPanel.add(UmMoNo);
		leftPanel.add(update);
		add(leftPanel);

		JPanel rightPanel = new JPanel(new BorderLayout());
		String[] columnNames = { "ID", "Name", "Email", "MobNo" };
		Object[][] data = {};
		model1 = new DefaultTableModel(data, columnNames);
		table1 = new JTable(model1);
		table1.getSelectionModel().addListSelectionListener(this);
		rightPanel.add(new JScrollPane(table1), BorderLayout.CENTER);
		add(rightPanel);
	}

	public void ShowDetailsForUpdate() throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		model1.setRowCount(0);

		String selectQuery = "select * from personinfo";

		Statement stmt = mainframe.con.createStatement();
		ResultSet rs = stmt.executeQuery(selectQuery);

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String mobileNo = rs.getString("mobile");

			Object row[] = { id, name, email, mobileNo };
			model1.addRow(row);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals("Update")) {
			int id = Integer.parseInt(Uidtext.getText());
			String name = Unametext.getText();
			String email = Uemailtext.getText();
			String mobile = UmMoNo.getText();
			String updateQuery = "update personinfo set name = ? ,email = ?,mobile = ? where id = ?";
			try {
				PreparedStatement updateStatement = mainframe.con.prepareStatement(updateQuery);
				updateStatement.setString(1, name);
				updateStatement.setString(2, email);
				updateStatement.setString(3, mobile);
				updateStatement.setInt(4, id);

				int deleteRow = updateStatement.executeUpdate();

				if (deleteRow > 0) {
					System.out.println("Record Updated Successfully");
				} else {
					System.out.println("Person code is Not Found");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			Uidtext.setText("");
			Unametext.setText("");
			Uemailtext.setText("");
			UmMoNo.setText("");
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		update.setEnabled(true);

		if (!e.getValueIsAdjusting()) {
			int selectedRow = table1.getSelectedRow();
			if (selectedRow != -1) {
				int id = (int) table1.getValueAt(selectedRow, 0);
				String name = (String) table1.getValueAt(selectedRow, 1);
				String email = (String) table1.getValueAt(selectedRow, 2);
				String mobile = (String) table1.getValueAt(selectedRow, 3);

				Uidtext.setText("" + id);
				Unametext.setText(name);
				Uemailtext.setText(email);
				UmMoNo.setText(mobile);

				System.out.println(" Row is Selected");
			}
		}
	}
}
