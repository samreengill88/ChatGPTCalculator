package UI;
import Controller.CalcTheoremUIControl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorBox implements ActionListener {
    DialogBox dialogBox;
    Label sideA, sideB, resultLabel, title;
    TextField sideATextField, sideBTextField;
    Button calculateButton;
    double sideAValue, sideBValue;

    /**
     * Creates and displays the Pythagorean Theorem calculator dialog box with input fields and buttons.
     */
    public void createCalculatorBox() {
        dialogBox = new DialogBox();
        dialogBox.createDialogBox("Pythogorean Theroem Calculator", 500, 400);

        Label title = new Label();
        title.createLabel(150, 60, 300, 20, dialogBox.getJframe(), "Solve for Hypotenuse:");

        sideA = new Label();
        sideA.createLabel(100, 110, 160, 20, dialogBox.getJframe(), "Enter length of side A:");
        sideATextField = new TextField();
        sideATextField.createTextField(dialogBox.getJframe(),245,110,60,30);

        sideB = new Label();
        sideB.createLabel(100, 150, 160, 20, dialogBox.getJframe(), "Enter length of side B:");
        sideBTextField = new TextField();
        sideBTextField.createTextField(dialogBox.getJframe(),245,150,60,30);

        calculateButton = new Button();
        calculateButton.createButtonWithIcon(dialogBox.getJframe(), "Calculate", 150,200,150,30);
        calculateButton.getButton().addActionListener(this);
    }

    /**
     * Sets the calculation result label with the provided result value.
     * @param resultText The result value to be displayed.
     */
    private void setResult(double resultText) {
        resultLabel = new Label();
        resultLabel.createLabel(140, 230, 250, 30, dialogBox.getJframe(), "result");
        resultLabel.getLabel().setText("Length of Hypotenuse: " + resultText);
    }

    /**
     * Handles the "Calculate" button click event. Parses  input values, performs the calculation, and displays result.
     * @param e The ActionEvent representing the button click event.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        sideAValue = Double.parseDouble(sideATextField.getTextField().getText());
        sideBValue = Double.parseDouble(sideBTextField.getTextField().getText());
        CalcTheoremUIControl calcTheoremUIControl = new CalcTheoremUIControl();
        calcTheoremUIControl.performCalculateTheorem(sideAValue, sideBValue);
        setResult(calcTheoremUIControl.getResult());
    }
}
