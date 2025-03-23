package org.ejercicio58;

public class App {

    public static double aproximarIterativo(double x, int n) {
        double suma = 1.0;
        double termino = 1.0;
        for (int k = 1; k <= n; k++) {
            termino = termino * x / k;
            suma += termino;
        }
        return suma;
    }

    public static double aproximarRecursivo(double x, int n) {
        return aproximarRecursivoAux(x, n, 1.0, 1.0, 1);
    }

    private static double aproximarRecursivoAux(double x, int n, double suma, double termino, int k) {
        if (k > n) return suma;
        termino = termino * x / k;
        return aproximarRecursivoAux(x, n, suma + termino, termino, k + 1);
    }
}
