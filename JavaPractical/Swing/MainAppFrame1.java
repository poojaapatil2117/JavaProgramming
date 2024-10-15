import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainAppFrame1 extends JFrame {

    private JPanel cardPanel;
    private CardLayout cardLayout;

    public MainAppFrame1() {

        super("Main Application");

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //-------------------------------------------------------------------------

        // Create and add menubar to frame
        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the "File" menu
        JMenu fileMenu = new JMenu("File");

        // Create menu items for the "File" menu
        JMenuItem asItem = new JMenuItem("Add-Show Items");
        JMenuItem asStock = new JMenuItem("Add-Show Stocks");
        JMenuItem sellItem = new JMenuItem("Sell");
        JMenuItem saCarts = new JMenuItem("Show All Carts");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add menu items to the "File" menu
        fileMenu.add(asItem);
        fileMenu.add(asStock);
        fileMenu.add(sellItem);
        fileMenu.add(saCarts);
        fileMenu.addSeparator();  // Add a separator line
        fileMenu.add(exitItem);

        // Add the "File" menu to the menu bar
        menuBar.add(fileMenu);

        // Create the "Help" menu
        JMenu helpMenu = new JMenu("Help");

        // Create menu items for the "Help" menu
        JMenuItem productHelp = new JMenuItem("Product Help");
        JMenuItem appHelp = new JMenuItem("Application Help");

        // Add menu items to the "Help" menu
        helpMenu.add(productHelp);
        helpMenu.add(appHelp);

        // Add the "Help" menu to the menu bar
        menuBar.add(helpMenu);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        // Add event listeners for the menu items
        asItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Add_Show_Items");
            }
        });

        asStock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Add_Show_Stocks");
            }
        });

        sellItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Sell");
            }
        });

        saCarts.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Show_All_Carts");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        productHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Product_Help");
            }
        });

        appHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Application_Help");
            }
        });

        //-----------------------------------------------------------------

        // Create a Panel with CardLayout
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Create different panels for each card
        JPanel addShowItems = new JPanel();
        addShowItems.add(new JLabel("in Add_Show_Items"));

        JPanel addShowStocks = new JPanel();
        addShowStocks.add(new JLabel("in Add_Show_Stocks"));

        JPanel sell = new JPanel();
        sell.add(new JLabel("in Sell"));

        JPanel showAllCarts = new JPanel();
        showAllCarts.add(new JLabel("in Show_All_Carts"));

        JPanel productHelpPanel = new JPanel();
        productHelpPanel.add(new JLabel("in Product_Help"));

        JPanel applicationHelpPanel = new JPanel();
        applicationHelpPanel.add(new JLabel("in Application_Help"));

        // Add the panels to the cardPanel
        cardPanel.add(addShowItems, "Add_Show_Items");
        cardPanel.add(addShowStocks, "Add_Show_Stocks");
        cardPanel.add(sell, "Sell");
        cardPanel.add(showAllCarts, "Show_All_Carts");
        cardPanel.add(productHelpPanel, "Product_Help");
        cardPanel.add(applicationHelpPanel, "Application_Help");

        // Add the cardPanel to the frame
        add(cardPanel, BorderLayout.CENTER);

        //-----------------------------------------------------------
    }

    public static void main(String[] args) {
        // This is where the main application starts
        MainAppFrame1 app = new MainAppFrame1();
        app.setVisible(true);
    }
}
