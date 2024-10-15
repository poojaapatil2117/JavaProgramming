import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainAppFrame3 extends JFrame {

	private JPanel cardpanel;
	private CardLayout cardLayout;

    public MainAppFrame3() {

        super("Main Application");

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a simple label for demonstration purposes
        //JLabel label = new JLabel("Welcome to the Main Application", JLabel.CENTER);
        //add(label, BorderLayout.CENTER);

		//-------------------------------------------------------------------------

			// Create and add menubar to frame
			 // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the "File" menu
        JMenu fileMenu = new JMenu("File");

        // Create menu items for the "File" menu
        JMenuItem asItem = new JMenuItem("Add-Show Items");
        JMenuItem asstock = new JMenuItem("Add-Show Stocks");
        JMenuItem sellItem = new JMenuItem("Sell");
        JMenuItem sacarts = new JMenuItem("Show All Carts");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add menu items to the "File" menu
        fileMenu.add(asItem);
        fileMenu.add(asstock);
        fileMenu.add(sellItem);
        fileMenu.add(sacarts);
        fileMenu.addSeparator();  // Add a separator line
        fileMenu.add(exitItem);

        // Add the "File" menu to the menu bar
        menuBar.add(fileMenu);

        // Create the "Edit" menu
        JMenu helpMenu = new JMenu("Help");

        // Create menu items for the "Edit" menu
        JMenuItem producthelp = new JMenuItem("Product Help");
        JMenuItem Apphelp = new JMenuItem("Application Help");

        // Add menu items to the "Edit" menu
        helpMenu.add(producthelp);
        helpMenu.add(Apphelp);

        // Add the "Edit" menu to the menu bar
        menuBar.add(helpMenu);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        // Add event listeners for the menu items
        asItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardpanel,"Add -show Items clicked");
                //JOptionPane.showMessageDialog(MainAppFrame.this, "Add -show Items clicked");
            }
        });

        asstock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardpanel,"Add-Show Stocks ");
                //JOptionPane.showMessageDialog(MainAppFrame.this, "Add-Show Stocks clicked");
            }
        });

        sellItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // JOptionPane.showMessageDialog(MainAppFrame.this, "Sell clicked");
				cardLayout.show(cardpanel,"Sell clicked");
            }
        });
	
		sacarts.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // JOptionPane.showMessageDialog(MainAppFrame.this, "Show All Carts clicked");
				cardLayout.show(cardpanel,"Show All Carts clicked");
            }
        });
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        producthelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(MainAppFrame.this, "Product item clicked");
				cardLayout.show(cardpanel,"Product item clicked");
            }
        });

        Apphelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // JOptionPane.showMessageDialog(MainAppFrame.this, "Appication Help item clicked");
				cardLayout.show(cardpanel,"Appication Help item");
            }
        });

		//-----------------------------------------------------------------
		
		   // Create a Panel with CardLayout
			
		   cardLayout= new CardLayout();
		   cardpanel= new JPanel(cardLayout);

		   //create diffrent panel for each card.

		   JPanel addShowItems = new JPanel();
		   addShowItems.add(new JLabel("in Add_Show_Items"));
		   
		   JPanel addShowStocks = new JPanel();
		   addShowStocks.add(new JLabel("in Add_Show_Stocks"));

		   JPanel sell= new JPanel();
		   sell.add(new JLabel("in Sell"));

		   JPanel showAllCarts = new JPanel();
		   showAllCarts.add(new JLabel("in Show_All_Carts"));
		   
		   JPanel productHelp = new JPanel();
		   productHelp.add(new JLabel("in Product_Help"));

		   JPanel applicationHelp = new JPanel();
		   applicationHelp.add(new JLabel("in Application_Help"));
		   
        // Add the panels to the cardPanel

		cardpanel.add(addShowItems,"Add_Show_Items");
		cardpanel.add(addShowStocks,"Add_Show_Stocks");
		cardpanel.add(sell,"Sell");
		cardpanel.add(showAllCarts,"Show_All_Carts");
		cardpanel.add(productHelp,"Product_Help");
		cardpanel.add(applicationHelp,"Application_Help");

        add(cardpanel, BorderLayout.CENTER);

		//-----------------------------------------------------------
    }

    public static void main(String[] args) {
        // This is where the main application starts
        MainAppFrame3 app = new MainAppFrame3();
        app.setVisible(true);
    }
}
