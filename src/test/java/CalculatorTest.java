import fi.metropolia.calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for the Calculator class
 * @author Matleena Kankaanpää
 */

public class CalculatorTest {
    private final Calculator calc = new Calculator();
    private final double DELTA = 0.001;

    /**
     * Distance when all coordinates are on positive axes
     */
    @Test
    public void calcTestPositive() {
        assertEquals(Math.sqrt(32), calc.calculateDistance(0,4,0,4), DELTA, "Result should be ~5.657");
    }

    /**
     * Distance when coordinates are on positive and negative axes
     */
    @Test
    public void calcTestNegative() {
        assertEquals(Math.sqrt(97), calc.calculateDistance(-3,6,3,-1), DELTA, "Result should be ~9.849");
    }

    /**
     * There is no distance between the points
     */
    @Test
    public void calcTestZero() {
        assertEquals(0, calc.calculateDistance(0,0,0,0), DELTA, "Result should be 0");
    }
}
