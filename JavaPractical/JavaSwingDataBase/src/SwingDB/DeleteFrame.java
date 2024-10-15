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

public class DeleteFrame extends JFrame implements ActionListener, ListSelectionListener {

	private static final long serialVersionUID = 1L;

	private JTable table1;
	private JTextField Didtext, Dnametext, Demailtext, DmMoNo;
	private JButton delete;
	public DefaultTableModel model1;
	MainFrame mainframe;

	public DeleteFrame(MainFrame mainframe) {

		super("Delete Frame");
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
		Didtext = new JTextField();
		Didtext.setEditable(false);
		Dnametext = new JTextField();
		Demailtext = new JTextField();
		DmMoNo = new JTextField();
		delete = new JButton("Delete");
		delete.addActionListener(this);
		delete.setEnabled(false);

		leftPanel.add(Didtext);
		leftPanel.add(Dnametext);
		leftPanel.add(Demailtext);
		leftPanel.add(DmMoNo);
		leftPanel.add(delete);
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

	public void ShowDetails() throws SQLException, ClassNotFoundException {
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
		if (command.equals("Delete")) {
			int id = Integer.parseInt(Didtext.getText());
			String deleteQuery = "delete from personinfo where id  =?";
			try {
				PreparedStatement deleteStatement = mainframe.con.prepareStatement(deleteQuery);
				deleteStatement.setInt(1, id);
				int deleteRow = deleteStatement.executeUpdate();

				if (deleteRow > 0) {
					System.out.println("Record Deleted Successfully");
				} else {
					System.out.println("Person code is Not Found");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			Didtext.setText("");
			Dnametext.setText("");
			Demailtext.setText("");
			DmMoNo.setText("");
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

		delete.setEnabled(true);

		if (!e.getValueIsAdjusting()) {
			int selectedRow = table1.getSelectedRow();
			if (selectedRow != -1) {
				int id = (int) table1.getValueAt(selectedRow, 0);
				String name = (String) table1.getValueAt(selectedRow, 1);
				String email = (String) table1.getValueAt(selectedRow, 2);
				String mobile = (String) table1.getValueAt(selectedRow, 3);

				Didtext.setText("" + id);
				Dnametext.setText(name);
				Demailtext.setText(email);
				DmMoNo.setText(mobile);

				System.out.println(" Row is Selected");
			}
		}
	}
}
