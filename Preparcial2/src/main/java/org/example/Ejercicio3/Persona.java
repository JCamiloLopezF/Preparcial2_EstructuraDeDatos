package org.example.Ejercicio3;

import java.util.Queue;

public class Persona {
    public String nombre;
    public String sexo; //M para masculino, F para femenino
    public int edad;

    public Persona(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " " + sexo + " " + edad;
    }
}
