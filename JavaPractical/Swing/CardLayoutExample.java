import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public CardLayoutExample() {
        // Set the title of the frame
        setTitle("CardLayout Example");

        // Set the size of the frame
        setSize(400, 300);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create a JMenu
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        // Create JMenuItems for File menu
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add action listeners to menu items
        newItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "New Panel");
            }
        });

        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Open Panel");
            }
        });

        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Save Panel");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add JMenuItems to File JMenu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Adds a separator line
        fileMenu.add(exitItem);

        // Add JMenuItems for Edit menu
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        cutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Cut Panel");
            }
        });

        copyItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Copy Panel");
            }
        });

        pasteItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Paste Panel");
            }
        });

        // Add JMenuItems to Edit JMenu
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Create JMenuItems for Help menu
        JMenuItem aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "About Panel");
            }
        });

        // Add JMenuItems to Help JMenu
        helpMenu.add(aboutItem);

        // Add JMenu to JMenuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Set the JMenuBar to the frame
        setJMenuBar(menuBar);

        // Create a CardLayout and JPanel to hold the cards

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Create different panels for each card
        JPanel newPanel = new JPanel();
        newPanel.add(new JLabel("This is the New Panel"));
        
        JPanel openPanel = new JPanel();
        openPanel.add(new JLabel("This is the Open Panel"));
        
        JPanel savePanel = new JPanel();
        savePanel.add(new JLabel("This is the Save Panel"));
        
        JPanel cutPanel = new JPanel();
        cutPanel.add(new JLabel("This is the Cut Panel"));
        
        JPanel copyPanel = new JPanel();
        copyPanel.add(new JLabel("This is the Copy Panel"));
        
        JPanel pastePanel = new JPanel();
        pastePanel.add(new JLabel("This is the Paste Panel"));
        
        JPanel aboutPanel = new JPanel();
        aboutPanel.add(new JLabel("This is the About Panel"));

        // Add the panels to the cardPanel
        cardPanel.add(newPanel, "New Panel");
        cardPanel.add(openPanel, "Open Panel");
        cardPanel.add(savePanel, "Save Panel");
        cardPanel.add(cutPanel, "Cut Panel");
        cardPanel.add(copyPanel, "Copy Panel");
        cardPanel.add(pastePanel, "Paste Panel");
        cardPanel.add(aboutPanel, "About Panel");

        // Add the cardPanel to the frame
        add(cardPanel);
    }

    public static void main(String[] args) {
        // Create the frame
        CardLayoutExample frame = new CardLayoutExample();

        // Make the frame visible
        frame.setVisible(true);
    }
}
