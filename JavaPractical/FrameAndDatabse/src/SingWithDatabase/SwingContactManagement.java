package SingWithDatabase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class SwingContactManagement extends JFrame {

    private static final String url = "jdbc:mysql://localhost/contactinfo";
    private static final String username = "root";
    private static final String password = "Root";
    private Connection con;

    private JTextField nameField, emailField, idField, newNameField, newEmailField;
    private JTextArea outputArea;

    public SwingContactManagement() {
        setTitle("Contact Management");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        try {
            con = DriverManager.getConnection(url, username, password);
            createTable(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Create UI Components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 2));

        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Contact ID:"));
        idField = new JTextField();
        panel.add(idField);

        panel.add(new JLabel("New Name:"));
        newNameField = new JTextField();
        panel.add(newNameField);

        panel.add(new JLabel("New Email:"));
        newEmailField = new JTextField();
        panel.add(newEmailField);

        JButton insertButton = new JButton("Insert Contact");
        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    insertContact(con);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        panel.add(insertButton);

        JButton updateButton = new JButton("Update Contact");
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    updateContact(con);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        panel.add(updateButton);

        JButton deleteButton = new JButton("Delete Contact");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    deleteContact(con);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        panel.add(deleteButton);

        JButton retrieveButton = new JButton("Retrieve Contacts");
        retrieveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    retrieveContacts(con);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        panel.add(retrieveButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);
    }

    private void createTable(Connection con) throws SQLException {
        Statement statement = con.createStatement();
        String createTableSQL = "CREATE TABLE IF NOT EXISTS contacts1 (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), email VARCHAR(100))";
        statement.executeUpdate(createTableSQL);
        System.out.println("Table Created Successfully");
    }

    private void insertContact(Connection con) throws SQLException {
        String name = nameField.getText();
        String email = emailField.getText();

        String insertQuery = "INSERT INTO contacts1 (name, email) VALUES (?, ?)";
        PreparedStatement insertStatement = con.prepareStatement(insertQuery);
        insertStatement.setString(1, name);
        insertStatement.setString(2, email);
        insertStatement.executeUpdate();

        outputArea.setText("Contact inserted successfully.");
    }

    private void updateContact(Connection con) throws SQLException {
        int id = Integer.parseInt(idField.getText());
        String newName = newNameField.getText();
        String newEmail = newEmailField.getText();

        String updateQuery = "UPDATE contacts1 SET name = ?, email = ? WHERE id = ?";
        PreparedStatement updateStatement = con.prepareStatement(updateQuery);
        updateStatement.setString(1, newName);
        updateStatement.setString(2, newEmail);
        updateStatement.setInt(3, id);

        int updatedRows = updateStatement.executeUpdate();

        if (updatedRows > 0) {
            outputArea.setText("Contact updated successfully.");
        } else {
            outputArea.setText("No such record found with this ID.");
        }
    }

    private void deleteContact(Connection con) throws SQLException {
        int id = Integer.parseInt(idField.getText());

        String deleteQuery = "DELETE FROM contacts1 WHERE id = ?";
        PreparedStatement deleteStatement = con.prepareStatement(deleteQuery);
        deleteStatement.setInt(1, id);
        int deletedRows = deleteStatement.executeUpdate();

        if (deletedRows > 0) {
            outputArea.setText("Record deleted successfully.");
        } else {
            outputArea.setText("No contact found with this ID.");
        }
    }

    private void retrieveContacts(Connection con) throws SQLException {
        String retrieveQuery = "SELECT * FROM contacts1";
        PreparedStatement retrieveStatement = con.prepareStatement(retrieveQuery);
        ResultSet rs = retrieveStatement.executeQuery();

        StringBuilder output = new StringBuilder();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            output.append("ID: ").append(id).append(", Name: ").append(name).append(", Email: ").append(email).append("\n");
        }

        outputArea.setText(output.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingContactManagement().setVisible(true);
            }
        });
    }
}
