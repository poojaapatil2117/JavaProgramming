import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanelExample extends JFrame {
    public MenuPanelExample() {
        // Set the title of the frame
        setTitle("Menu Panel Example");

        // Set the size of the frame
        setSize(400, 300);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the menu panel
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS)); // Vertical layout

        // Create menu buttons
        JButton menuItem1 = new JButton("Menu Item 1");
        JButton menuItem2 = new JButton("Menu Item 2");
        JButton menuItem3 = new JButton("Menu Item 3");

        // Add action listeners to menu items
        menuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu Item 1 clicked");
            }
        });

        menuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu Item 2 clicked");
            }
        });

        menuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu Item 3 clicked");
            }
        });

        // Add menu items to the menu panel
        menuPanel.add(menuItem1);
        menuPanel.add(menuItem2);
        menuPanel.add(menuItem3);

        // Add the menu panel to the frame
        add(menuPanel, BorderLayout.WEST); // Add to the left side of the frame

        // Set the frame layout
        setLayout(new BorderLayout());

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create the frame
        new MenuPanelExample();
    }
}
