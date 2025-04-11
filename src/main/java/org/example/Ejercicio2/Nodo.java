package org.example.Ejercicio2;

public class Nodo {
    private  Integer valor;
    private Nodo siguiente;

    public Nodo(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
    public  boolean esPrimo() {
        if (valor <= 1) return false;
        for (int i = 2; i <= Math.sqrt(valor); i++) {
            if (valor % i == 0) return false;
        }
        return true;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
