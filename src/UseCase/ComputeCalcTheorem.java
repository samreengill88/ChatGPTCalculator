package UseCase;

import Entities.SideA;
import Entities.SideB;
import Entities.SideC;

public class ComputeCalcTheorem {
    SideA sideA = new SideA();
    SideB sideB = new SideB();
    SideC sideC = new SideC();

    /**
     * Computes the missing side (Side C) of a right-angled triangle using the Pythagorean theorem.
     * @param sideAValue The value of Side A of the triangle.
     * @param sideBValue The value of Side B of the triangle.
     */
    public void computeTheorem(double sideAValue, double sideBValue) {
        sideA.setSideValue(sideAValue);
        sideB.setSideValue(sideBValue);
        sideC.calcSideValue(sideA.getSideValue(),sideB.getSideValue());
    }

    /**
     * Retrieves the computed missing side (Side C) value of the right-angled triangle.
     * @return The value of the computed missing side (Side C).
     */
    public double getCalcTheorem(){
         return sideC.getSideValue();
    }
}
