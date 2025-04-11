package org.example.Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Pila pila = new Pila();
        Cola cola = new Cola();

        pila.apilar(5);
        pila.apilar(11);
        pila.apilar(7);
        pila.apilar(188);
        pila.apilar(15);
        pila.apilar(31);


        Nodo actual = pila.getCima();
        while (actual != null) {
            cola.encolar(actual.getValor());
            actual = actual.getSiguiente();
        }

        System.out.println("Elementos de la cola:");
        cola.mostrar();
    }
}