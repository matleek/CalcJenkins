package fi.metropolia;

import fi.metropolia.calculator.Calculator;

/**
 * @author Matleena Kankaanpää
 */

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.calculateDistance(12, 7, 10, 38));
    }
}