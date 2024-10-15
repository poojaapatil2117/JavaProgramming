package SwingDB;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.*;

public class ShowFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private JTable table1;
	public DefaultTableModel model1;
	MainFrame mainframe;

	public ShowFrame(MainFrame mainframe) {
		super("Show Frame");
		setLayout(new FlowLayout());
		int width = 450;
		int height = 300;
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screen.width - width) / 2;
		int y = (screen.height - height) / 2;
		setBounds(x, y, width, height);
		setVisible(true);

		this.mainframe = mainframe;

		JPanel Panel = new JPanel(new BorderLayout());
		String[] columnNames = { "ID", "Name", "Email", "MobNo" };
		Object[][] data = {};
		model1 = new DefaultTableModel(data, columnNames);
		table1 = new JTable(model1);
		Panel.add(new JScrollPane(table1));
		add(Panel);
	}

	public void ShowTable() throws SQLException, ClassNotFoundException {

		//Class.forName("com.mysql.cj.jdbc.Driver");
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
}
