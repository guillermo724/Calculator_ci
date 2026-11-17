package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


private Calculator calculator;

// ---------- sum(int, int) ----------
@Test
void sumIntPositivos() {
    assertEquals(5, calculator.sum(2, 3));
}

@Test
void sumIntNegativos() {
    assertEquals(-5, calculator.sum(-2, -3));
}

@Test
void sumIntConCero() {
    assertEquals(7, calculator.sum(7, 0));
}

// ---------- sum(double, double) ----------
@Test
void sumDoublePositivos() {
    assertEquals(5.5, calculator.sum(2.5, 3.0), 0.0001);
}

@Test
void sumDoubleNegativos() {
    assertEquals(-1.0, calculator.sum(-3.5, 2.5), 0.0001);
}

// ---------- square(int) ----------
@Test
void squareIntPositivo() {
    assertEquals(9, calculator.square(3));
}

@Test
void squareIntNegativo() {
    assertEquals(16, calculator.square(-4));
}

@Test
void squareIntCero() {
    assertEquals(0, calculator.square(0));
}

// ---------- square(float) ----------
@Test
void squareFloatPositivo() {
    assertEquals(6.25f, calculator.square(2.5f), 0.0001f);
}

@Test
void squareFloatNegativo() {
    assertEquals(2.25f, calculator.square(-1.5f), 0.0001f);
}

// ---------- exponential(float, int) ----------
@Test
void exponentialBasePositiva() {
    assertEquals(8f, calculator.exponential(2f, 3), 0.0001f);
}

@Test
void exponentialExponenteCero() {
    assertEquals(1f, calculator.exponential(5f, 0), 0.0001f);
}

@Test
void exponentialBaseNegativa() {
    assertEquals(-8f, calculator.exponential(-2f, 3), 0.0001f);
}

@Test
void exponentialBaseDecimal() {
    assertEquals(2.25f, calculator.exponential(1.5f, 2), 0.0001f);
}

