package org.example;

/**
 * @author Guillermo
 * @created 17/11/2026
 *
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorStaticMethodTests {

    // ---------- sum(int, int) ----------
    @Test
    void sumIntPositivos() {
        assertEquals(5, Calculator2.sum(2, 3));
    }

    @Test
    void sumIntNegativos() {
        assertEquals(-5, Calculator2.sum(-2, -3));
    }

    @Test
    void sumIntConCero() {
        assertEquals(7, Calculator2.sum(7, 0));
    }

    // ---------- sum(double, double) ----------
    @Test
    void sumDoublePositivos() {
        assertEquals(5.5, Calculator2.sum(2.5, 3.0), 0.0001);
    }

    @Test
    void sumDoubleNegativos() {
        assertEquals(-1.0, Calculator2.sum(-3.5, 2.5), 0.0001);
    }

    // ---------- square(int) ----------
    @Test
    void squareIntPositivo() {
        assertEquals(9, Calculator2.square(3));
    }

    @Test
    void squareIntNegativo() {
        assertEquals(16, Calculator2.square(-4));
    }

    @Test
    void squareIntCero() {
        assertEquals(0, Calculator2.square(0));
    }

    // ---------- square(float) ----------
    @Test
    void squareFloatPositivo() {
        assertEquals(6.25f, Calculator2.square(2.5f), 0.0001f);
    }

    @Test
    void squareFloatNegativo() {
        assertEquals(2.25f, Calculator2.square(-1.5f), 0.0001f);
    }

    // ---------- exponential(float, int) ----------
    @Test
    void exponentialBasePositiva() {
        assertEquals(8f, Calculator2.exponential(2f, 3), 0.0001f);
    }

    @Test
    void exponentialExponenteCero() {
        assertEquals(1f, Calculator2.exponential(5f, 0), 0.0001f);
    }

    @Test
    void exponentialBaseNegativa() {
        assertEquals(-8f, Calculator2.exponential(-2f, 3), 0.0001f);
    }

    @Test
    void exponentialBaseDecimal() {
        assertEquals(2.25f, Calculator2.exponential(1.5f, 2), 0.0001f);
    }


    @Test
    void testMetodoEstatico() {
        // Se llama con el nombre de la clase, sin "new Calculator()"
        short valorEsperado = 0;
        assertEquals(valorEsperado, Calculator2.sum
                (1));
    }
}
