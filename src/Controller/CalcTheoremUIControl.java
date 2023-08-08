package Controller;
import UseCase.ComputeCalcTheorem;

public class CalcTheoremUIControl {
    double result;

    /**
     * Retrieves the calculated result of the missing side value.
     * @return The calculated missing side value.
     */
    public double getResult() {
        return result;
    }

    /**
     * Sets the calculated result of the missing side value.
     * @param result The calculated missing side value.
     */
    private void setResult(double result) {
        this.result = result;
    }

    /**
     * Performs the calculation of the missing side of a right-angled triangle using the Pythagorean theorem.
     * @param sideAValue The value of Side A of the triangle.
     * @param sideBValue The value of Side B of the triangle.
     */
    public void performCalculateTheorem(double sideAValue, double sideBValue) {
        ComputeCalcTheorem computeCalcTheorem = new ComputeCalcTheorem();
        computeCalcTheorem.computeTheorem(sideAValue, sideBValue);
        setResult(computeCalcTheorem.getCalcTheorem());
    }
}
