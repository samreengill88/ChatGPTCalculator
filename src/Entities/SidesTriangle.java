package Entities;

public abstract class SidesTriangle {
    double sideValue;

    /**
     * Returns the value of the triangle side.
     * @return The value of the triangle side.
     */
    public double getSideValue() {return sideValue;}

    /**
     * Sets the value of the triangle side.
     * @param sideVal The value to be set for the triangle side.
     */
    public void setSideValue(double sideVal) {
        this.sideValue = sideVal;
    }
}
