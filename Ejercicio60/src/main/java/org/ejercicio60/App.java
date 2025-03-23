package org.ejercicio60;

import java.util.List;

public class App {

    public static double mediaArmonica(List<Double> datos) {
        if (datos == null || datos.isEmpty()) {
            throw new ArithmeticException("La lista está vacía.");
        }

        double sumaInversos = datos.stream()
            .mapToDouble(d -> {
                if (d == 0.0) throw new ArithmeticException("Elemento cero en la lista.");
                return 1.0 / d;
            })
            .sum();

        if (sumaInversos == 0.0) {
            throw new ArithmeticException("La suma de los inversos es cero.");
        }

        return datos.size() / sumaInversos;
    }
}
