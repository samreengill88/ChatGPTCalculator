package UI;

import javax.swing.*;
import java.awt.*;

public class Label {
    JLabel label;

    /**
     * Returns the JLabel instance managed by this class.
     * @return The JLabel instance.
     */
    public JLabel getLabel() {
        return label;
    }

    /**
     * Creates and configures a JLabel with the specified text and bounds.
     * @param boundX     The X-coordinate of the label's position.
     * @param boundY     The Y-coordinate of the label's position.
     * @param boundWidth The width of the label.
     * @param boundHeight The height of the label.
     * @param dialogBox  The JFrame dialog box to which the label will be added. (Can be null if not needed)
     * @param labelText  The text to be displayed on the label.
     */
    public void createLabel(int boundX, int boundY, int boundWidth, int boundHeight, JFrame dialogBox, String labelText) {
        label = new JLabel(labelText);
        label.setBounds(boundX, boundY, boundWidth, boundHeight);
        if (dialogBox != null) {
            dialogBox.add(label);
        }
    }
}
