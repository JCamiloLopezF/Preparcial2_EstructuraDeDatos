package org.example.Ejercicio2;

public class Pila {
    private Nodo inicial;
    private Nodo fin;
    private int tamanio;

    public Pila() {
        inicial = null;
        fin = null;
        tamanio = 0;

    }

    public boolean estaVacia() {
        return inicial == null;
    }

    public void apilar(Integer valor) {
        Nodo newnodo = new Nodo(valor);
        if (estaVacia()) {
            inicial = newnodo;
            fin = newnodo;
        } else {
            newnodo.setSiguiente(inicial);
            inicial = newnodo;
        }
        tamanio++;
    }
    public Nodo getCima() {
        return inicial;
    }

}

