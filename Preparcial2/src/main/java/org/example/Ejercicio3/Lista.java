package org.example.Ejercicio3;

/*Dada una Cola de Personas (nombre, edad, sexo), escribir un método que quite de la cola a
los hombres cuya edad está entre los 30 y 50 años, los demás elementos de la Cola deben quedar
en el mismo orden en el que estaban originalmente.
*/

import org.example.Ejercicio1.Nodo;

import java.util.LinkedList;
import java.util.Queue;

public class Lista{
    public Queue<Persona> listaPersonas;

    static void eliminarPersona(Queue<Persona> personas){
        Queue<Persona> aux = new LinkedList<Persona>();
        while(!personas.isEmpty()) {
            Persona persona = personas.poll();
            if (!(persona.sexo.equals("M") && persona.edad >= 30 && persona.edad <= 50)){
                aux.add(persona);
            }
        }
        personas.addAll(aux);
    }
}
