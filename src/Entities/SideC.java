    package Entities;

    public class SideC extends SidesTriangle{
        double sideCVal;
        CalculatorTheorem calculatorTheorem = new CalculatorTheorem();

        /**
         * Calculates the value of the hypotenuse (Side C) of a right-angled triangle using the Pythagorean theorem.
         * @param sideAVal The value of Side A of the triangle.
         * @param sideBVal The value of Side B of the triangle.
         * @return The calculated value of the hypotenuse (Side C).
         */
        public double calcSideValue(double sideAVal, double sideBVal){
            sideCVal =  calculatorTheorem.computeSideValue(sideAVal, sideBVal );
            setSideValue(sideCVal);
            return sideCVal;
        }
    }
