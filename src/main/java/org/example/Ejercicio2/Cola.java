package org.example.Ejercicio2;

public class Cola {
    protected Nodo inicial;
    protected Nodo fin;
    protected int tamanio;

    public Cola() {
        inicial = null;
        fin = null;
        tamanio = 0;

    }

    public boolean estaVacia() {
        return inicial == null;
    }
    public void mostrar() {
        Nodo actual = inicial;
        while (actual != null) {
            System.out.println(actual.getValor());
            actual = actual.getSiguiente();
        }}

    public void encolar(Integer valor) {
        Nodo newnodo = new Nodo(valor);
        if (newnodo.esPrimo()) {
            if (estaVacia()) {
                inicial = newnodo;
                fin = newnodo;
            } else {
                fin.setSiguiente(newnodo);
                fin = newnodo;
            }
            tamanio++;
        }
    }



}
