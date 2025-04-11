package org.example.Ejercicio3;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Persona> cola = new LinkedList<>();
        cola.add(new Persona("Carlos", "M", 23));
        cola.add(new Persona("Ana", "F", 21));
        cola.add(new Persona("Luis", "M", 30));
        cola.add(new Persona("Marta", "F", 49));
        cola.add(new Persona("Pedro", "M", 32));

        Lista.eliminarPersona(cola);

        System.out.println("\nCola después de eliminar hombres entre 30 y 50 años:");
        for (Persona persona : cola) {
            System.out.println(persona);
        }
    }
}
