import javax.swing.*;
import java.awt.*;

public class FormLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a panel with a GridLayout of 4 rows and 2 columns
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10)); // 10px horizontal and vertical gaps

        // Add labels and text fields to the panel
        panel.add(new JLabel("First Name:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Last Name:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Email:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Phone:"));
        panel.add(new JTextField());

        // Add the panel to the frame
        frame.add(panel);

        frame.setVisible(true);
    }
}
