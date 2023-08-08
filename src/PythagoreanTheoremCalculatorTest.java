import Entities.CalculatorTheorem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PythagoreanTheoremCalculatorTest {

    /**
     * Test case to verify the calculation of the hypotenuse using the Pythagorean theorem.
     */
    @Test
    public void testCalculateHypotenuse() {
        CalculatorTheorem calculatorTheorem = new CalculatorTheorem();

        // Test with a 3-4-5 triangle
        double hypotenuse = calculatorTheorem.computeSideValue(3, 4);
        assertEquals(5.0, hypotenuse);

        // Test with a degenerate triangle (side lengths are both 0)
        double hypotenuse2 = calculatorTheorem.computeSideValue(0, 0);
        assertEquals(0.0, hypotenuse2);

        // Test with a 7-24-25 triangle
        double hypotenuse3 = calculatorTheorem.computeSideValue(7, 24);
        assertEquals(25.0, hypotenuse3);
    }
}