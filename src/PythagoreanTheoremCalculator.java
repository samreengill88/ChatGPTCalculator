import UI.CalculatorBox;

public class PythagoreanTheoremCalculator {

    /**
     * Computes the missing side of a right-angled triangle using the Pythagorean theorem.
     * This method initializes a CalculatorBox instance to provide a graphical user interface
     */
        static void computeMissingSide(){
            CalculatorBox calculatorBox = new CalculatorBox();
            calculatorBox.createCalculatorBox();
        }

    /**
     * The main method of the application. Calls the computeMissingSide() method to start calculation process.
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        computeMissingSide();
    }
}
