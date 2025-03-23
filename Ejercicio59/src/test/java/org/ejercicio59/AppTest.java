package org.ejercicio59;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testSumaIterativa() {
        Stack<BigDecimal> pila = new Stack<>();
        pila.push(new BigDecimal("1.0"));
        pila.push(new BigDecimal("2.5"));
        pila.push(new BigDecimal("1.5"));

        BigDecimal resultado = App.sumaIterativa(pila);
        assertEquals(new BigDecimal("5.0"), resultado);
    }

    @Test
    void testSumaRecursiva() {
        Stack<BigDecimal> pila = new Stack<>();
        pila.push(new BigDecimal("1.0"));
        pila.push(new BigDecimal("2.5"));
        pila.push(new BigDecimal("1.5"));

        BigDecimal resultado = App.sumaRecursiva(pila);
        assertEquals(new BigDecimal("5.0"), resultado);
    }
}
