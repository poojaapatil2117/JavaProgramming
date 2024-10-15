//Using Scrollbar, TextArea, and TextField

import java.awt.*;
import java.awt.event.*;

public class ScrollbarTextAreaTextFieldExample {
    private Frame frame;
    private Scrollbar scrollbar;
    private TextArea textArea;
    private TextField textField;

    public ScrollbarTextAreaTextFieldExample() {
        frame = new Frame("Scrollbar, TextArea, and TextField Example");

        // Create Scrollbar
        scrollbar = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 100);

        // Create TextArea
        textArea = new TextArea(10, 30);

        // Create TextField
        textField = new TextField(30);

        // Add AdjustmentListener to Scrollbar
        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                textArea.setFont(new Font("Arial", Font.PLAIN, e.getValue()));
            }
        });

        // Add ActionListener to TextField
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                textArea.append(text + "\n");
                textField.setText("");
            }
        });

        // Create Panels for Scrollbar, TextArea, and TextField
        Panel scrollbarPanel = new Panel();
        scrollbarPanel.add(scrollbar);

        Panel textAreaPanel = new Panel();
        textAreaPanel.add(textArea);

        Panel textFieldPanel = new Panel();
        textFieldPanel.add(textField);

        // Add Panels to the Frame
        frame.setLayout(new BorderLayout());
        frame.add(scrollbarPanel, BorderLayout.EAST);
        frame.add(textAreaPanel, BorderLayout.CENTER);
        frame.add(textFieldPanel, BorderLayout.SOUTH);

        // Add window listener to handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Set the frame size and make it visible
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ScrollbarTextAreaTextFieldExample();
    }
}

