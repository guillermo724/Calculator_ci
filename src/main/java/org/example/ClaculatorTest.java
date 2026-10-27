package org.example;


/**
 * @author Guillermo
 * @created 20/10/2026
 *
 */
public class ClaculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSquare() {
        System.out.println("Square algorithm test");

        assertEquals(expected:3,calculator.square:(num:2));
    }
}
