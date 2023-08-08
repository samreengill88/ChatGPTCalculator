package UI;
import javax.swing.*;

public class TextField {
    JTextField textField;

    /**
     * Returns the JTextField instance managed by this class.
     * @return The JTextField instance.
     */
    public JTextField getTextField() {
        return textField;
    }

    /**
     * Creates and configures a JTextField according to the specified criteria and adds
     * it to the given JFrame dialog box.
     *
     * @param dialogBox The JFrame dialog box to which the JTextField will be added.
     * @param boundX    The X-coordinate of the JTextField's position.
     * @param boundY    The Y-coordinate of the JTextField's position.
     * @param boundWidth The width of the JTextField.
     * @param boundHeight The height of the JTextField.
     */
    public void createTextField(JFrame dialogBox, int boundX, int boundY, int boundWidth, int boundHeight) {
        textField = new JTextField();
        textField.setBounds(boundX,boundY,boundWidth,boundHeight);
        dialogBox.add(textField);
    }
}
