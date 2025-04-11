package ConversorBinario;

import org.example.Ejercicio2.Nodo;
import org.example.Ejercicio2.Pila;

public class ConversorBinario {

    public static int convertirABinario(int numero) {
        if (numero <= 0) {
            System.out.println("Debe ingresar un número entero positivo.");
            return -1;
        }

        Pila pila = new Pila();
        int original = numero;

        while (numero > 0) {
            int resto = numero % 2;
            pila.apilar(resto);
            numero /= 2;
        }

        Nodo actual = pila.getCima();
        StringBuilder binario = new StringBuilder();
        while (actual != null) {
            binario.append(actual.getValor());
            actual = actual.getSiguiente();
        }

        System.out.println("El número " + original + " en binario es: " + binario);

        return Integer.parseInt(binario.toString());
    }
}
