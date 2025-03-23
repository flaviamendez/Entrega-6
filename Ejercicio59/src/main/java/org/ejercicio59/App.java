package org.ejercicio59;

import java.math.BigDecimal;
import java.util.Stack;

public class App{

    public static BigDecimal sumaIterativa(Stack<BigDecimal> pila) {
        BigDecimal suma = BigDecimal.ZERO;
        while (!pila.isEmpty()) {
            suma = suma.add(pila.pop());
        }
        return suma;
    }

    public static BigDecimal sumaRecursiva(Stack<BigDecimal> pila) {
        if (pila.isEmpty()) return BigDecimal.ZERO;
        return pila.pop().add(sumaRecursiva(pila));
    }
}

