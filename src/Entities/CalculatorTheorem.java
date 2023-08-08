package Entities;

public class CalculatorTheorem {
    double computeSideC;

    /**
     * Computes the value of the hypotenuse (Side C) of a right-angled triangle using the Pythagorean theorem.
     * @param sideAValue The value of Side A of the triangle.
     * @param sideBValue The value of Side B of the triangle.
     * @return The calculated value of the hypotenuse (Side C).
     */
    public double computeSideValue(double sideAValue, double sideBValue) {
        computeSideC = Math.sqrt(sideAValue * sideAValue + sideBValue * sideBValue);
        return computeSideC;
    }
}
