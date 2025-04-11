package org.example.Ejercicio1;

public class Main {
    // Código de prueba
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        // Agregar elementos: 1->2->3->4->5
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(5);

        System.out.println("Lista original:");
        lista.imprimir();

        lista.invertir();

        System.out.println("Lista invertida:");
        lista.imprimir();
    }
}