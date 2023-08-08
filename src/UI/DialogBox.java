package UI;

import javax.swing.*;
import java.awt.*;

public class DialogBox {
    JFrame jframe;

    /**
     * Returns the JFrame instance managed by this class.
     * @return The JFrame instance.
     */
    public JFrame getJframe() {
        return jframe;
    }

    /**
     * Creates and configures a JFrame dialog box with the specified title, dimensions, and layout.
     * @param boxTitle The title of the dialog box.
     * @param width The width of the dialog box.
     * @param height The height of the dialog box.
     */
    public void createDialogBox(String boxTitle, int width, int height) {
        jframe = new JFrame("");
        jframe.setLayout(null);
        jframe.setTitle(boxTitle);
        jframe.setSize(width, height);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}