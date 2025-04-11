package org.example.Ejercicio5;

/*Escriba un método que reciba como parámetro una cadena de caracteres y que
usando una Pila determine si sus paréntesis, llaves y corchetes están balanceados.
Debe retornar un boolean. Ejemplo: “(6-7)/4]” está mala. “[(1+2)*4]+5” está bien
 */
import java.util.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String cadena1 = "[(1+2)*3]";  // Debe mostrar true
        String cadena2 = "[1+2)*3]";   // Debe mostrar false

        System.out.println(cadena1 + " → " + Balanceo.isBalanceo(cadena1));
        System.out.println(cadena2 + " → " + Balanceo.isBalanceo(cadena2));
    }
}

class Balanceo {
    static boolean isBalanceo(String cadena) {
        Stack<Character> caracteres = new Stack<>();

        for (char c : cadena.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                caracteres.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (caracteres.isEmpty()) return false;

                char apertura = caracteres.pop();
                if ((c == ')' && apertura != '(') || (c == ']' && apertura != '[') || (c == '}' && apertura != '{')) {return false;}
            }
        }
        return caracteres.isEmpty();
    }
}

