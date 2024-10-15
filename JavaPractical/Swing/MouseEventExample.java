// Using MouseEvents

import java.awt.*;
import java.awt.event.*;

public class MouseEventExample extends Frame implements MouseListener, MouseMotionListener {
    private Label statusLabel;

    public MouseEventExample() {
        setTitle("Mouse Events Example");

        // Create a label to display mouse event status
        add(statusLabel, BorderLayout.SOUTH);
        statusLabel = new Label("Mouse status will be displayed here.");

        // Add mouse listeners to the frame
        addMouseListener(this);
        addMouseMotionListener(this);

        // Add window listener to handle window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setSize(400, 300);
        setVisible(true);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        statusLabel.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
		System.out.println("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        statusLabel.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseReleased(MouseEvent e) {
        statusLabel.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {
        statusLabel.setText("Mouse Entered at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseExited(MouseEvent e) {
        statusLabel.setText("Mouse Exited at (" + e.getX() + ", " + e.getY() + ")");
    }

    // MouseMotionListener methods
    public void mouseDragged(MouseEvent e) {
        statusLabel.setText("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e) {
        statusLabel.setText("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        new MouseEventExample();
    }
}
