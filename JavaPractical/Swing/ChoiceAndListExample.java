//Using Choice And List

import java.awt.*;
import java.awt.event.*;

public class ChoiceAndListExample {
    private Frame frame;
    private Choice choice;
    private List list;

    public ChoiceAndListExample() {
        frame = new Frame("Choice and List Example");

        // Create Choice
        choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        // Create List
        list = new List(3); // Maximum visible rows in the list
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");
        list.add("Item 6");
        list.add("Item 7");
        list.add("Item 8");
        list.add("Item 9");

        // Create Label to display selection
        Label selectionLabel = new Label("Selected item: ");

        // Add ItemListener to Choice
        choice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                selectionLabel.setText("Selected item: " + choice.getSelectedItem());
            }
        });

        // Add ItemListener to List
        list.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                selectionLabel.setText("Selected item: " + list.getSelectedItem());
            }
        });

        // Create Panels for Choice, List, and Label
        Panel choicePanel = new Panel(new BorderLayout());
        choicePanel.add(choice, BorderLayout.NORTH);

        Panel listPanel = new Panel(new BorderLayout());
        listPanel.add(list, BorderLayout.CENTER);

        Panel labelPanel = new Panel(new FlowLayout());
        labelPanel.add(selectionLabel);

        // Add Panels to the Frame
        frame.setLayout(new GridLayout(1, 3));
        frame.add(choicePanel);
        frame.add(listPanel);
        frame.add(labelPanel);

        // Add window listener to handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Set the frame size and make it visible
        frame.setSize(400, 150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ChoiceAndListExample();
    }
}