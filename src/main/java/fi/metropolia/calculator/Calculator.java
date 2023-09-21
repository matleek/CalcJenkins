package fi.metropolia.calculator;

/**
 * Calculator
 * @author Matleena Kankaanpää
 */

public class Calculator {

    /**
     * Calculates the Euclidean distance between two points
     */
    public double calculateDistance(int x1, int x2, int y1, int y2) {
        int width = Math.abs(x1-x2);
        int height = Math.abs(y1-y2);
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
