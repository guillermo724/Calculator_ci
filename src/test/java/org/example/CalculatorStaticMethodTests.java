package org.example;

/**
 * @author Guillermo
 * @created 17/11/2026
 *
 */
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorStaticMethodTests {

    @Test
    void testMetodoEstatico() {
        // Se llama con el nombre de la clase, sin "new Calculator()"
        short valorEsperado;
        assertEquals(valorEsperado, Calculator.nombreMetodo(argumentos));
    }
}
