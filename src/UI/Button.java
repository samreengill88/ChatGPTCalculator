package UI;

import javax.swing.*;

public class Button {
    JButton button;

    /**
     * Returns the JButton instance managed by this class.
     * @return The JButton instance.
     */
    public JButton getButton() {
        return button;
    }

    /**
     * Creates and configures a JButton with the specified text and bounds.
     * @param dialogBox  The JFrame dialog box to which the button will be added.
     * @param buttonText The text to be displayed on the button.
     * @param boundX     The X-coordinate of the button's position.
     * @param boundY     The Y-coordinate of the button's position.
     * @param boundWidth The width of the button.
     * @param boundHeight The height of the button.
     */
    public void createButtonWithIcon(JFrame dialogBox, String buttonText, int boundX,
                                     int boundY, int boundWidth, int boundHeight) {
        button = new JButton(buttonText);
        button.setBounds(boundX,boundY,boundWidth,boundHeight);
        dialogBox.add(button);
    }
}