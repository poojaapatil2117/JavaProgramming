
import java.awt.*;
import java.awt.event.*;

public class CheckboxExample {
    private Frame frame;
    private CheckboxGroup checkboxGroup;

    public CheckboxExample() {
        frame = new Frame("Checkbox Example");

        // Create Checkboxes
        Checkbox checkbox1 = new Checkbox("Option 1",  false);
        Checkbox checkbox2 = new Checkbox("Option 2",  false);
        Checkbox checkbox3 = new Checkbox("Option 3",  false);

        // Create a Label to display selected option
        Label selectionLabel = new Label("Selected option: ");

        // Add ItemListener to handle checkbox selection change
        ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                Checkbox selectedCheckbox = (Checkbox)e.getSource();
                if (selectedCheckbox != null) {
                    selectionLabel.setText("Selected option: " + selectedCheckbox.getLabel());
                }
            }
        };

        checkbox1.addItemListener(itemListener);
        checkbox2.addItemListener(itemListener);
        checkbox3.addItemListener(itemListener);

        // Create a Panel for checkboxes
        Panel checkboxPanel = new Panel();
        checkboxPanel.setLayout(new FlowLayout());
        checkboxPanel.add(checkbox1);
        checkboxPanel.add(checkbox2);
        checkboxPanel.add(checkbox3);

        // Create a Panel for selection label
        Panel labelPanel = new Panel();
        labelPanel.setLayout(new FlowLayout());
        labelPanel.add(selectionLabel);

        // Add panels to the frame
        frame.add(checkboxPanel, BorderLayout.CENTER);
        frame.add(labelPanel, BorderLayout.SOUTH);

        // Add window listener to handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Set frame size and make it visible
        frame.setSize(300, 150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckboxExample();
    }
}


