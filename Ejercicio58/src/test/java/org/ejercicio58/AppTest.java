package org.ejercicio58;

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testIterativo() {
        double resultado = App.aproximarIterativo(1.0, 10);
        assertTrue(Math.abs(Math.E - resultado) < 0.001);
    }

    @Test
    void testRecursivo() {
        double resultado = App.aproximarRecursivo(1.0, 10);
        assertTrue(Math.abs(Math.E - resultado) < 0.001);
    }
}
