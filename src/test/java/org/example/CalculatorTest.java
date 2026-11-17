package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Guillermo
 * @created 20/10/2026
 *
 */
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSquare() {
        System.out.println("Square algorithm test");

        short expected;
        assertEquals(6, calculator.sum(4, 2));
    }
}
