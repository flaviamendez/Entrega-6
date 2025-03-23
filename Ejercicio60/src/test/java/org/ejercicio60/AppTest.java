package org.ejercicio60;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testMediaArmonicaCorrecta() {
        List<Double> datos = Arrays.asList(1.0, 2.0, 4.0);
        double resultado = App.mediaArmonica(datos);
        assertEquals(12.0 / 7.0, resultado, 0.0001);
    }

    @Test
    void testConCero() {
        List<Double> datos = Arrays.asList(1.0, 0.0, 3.0);
        assertThrows(ArithmeticException.class, () -> App.mediaArmonica(datos));
    }

    @Test
    void testListaVacia() {
        assertThrows(ArithmeticException.class, () -> App.mediaArmonica(Arrays.asList()));
    }

    @Test
    void testSumaInversosCero() {
        List<Double> datos = Arrays.asList(1.0, -1.0);
        assertThrows(ArithmeticException.class, () -> App.mediaArmonica(datos));
    }
}