package org.example.Ejercicio1;

public class ListaEnlazada {
    private Nodo cabeza;

    public void invertir() {
        Nodo anterior = null;
        Nodo actual = cabeza;
        Nodo siguiente = null;

        while (actual != null) {
            siguiente = actual.getSiguiente(); // Guardar el siguiente nodo
            actual.setSiguiente(anterior); // Invertir el enlace
            anterior = actual; // Mover el puntero anterior hacia adelante
            actual = siguiente; // Mover el puntero actual hacia adelante
        }
        cabeza = anterior; // Actualizar la cabeza de la lista
    }

    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            return;
        }

        Nodo actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }

        actual.setSiguiente(nuevoNodo);
    }

    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getValor() + " -> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }
}
