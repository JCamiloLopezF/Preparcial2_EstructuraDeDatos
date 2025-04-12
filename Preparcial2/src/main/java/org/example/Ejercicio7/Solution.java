package org.example.Ejercicio7;

public class Solution {
    public void insertAfterSum(ListNode head) {
        if (head == null) return;

        // Primero calculamos la suma
        int sum = calculateSum(head);
        System.out.println("Suma total: " + sum);

        // Luego insertamos el 2 después de los nodos que son iguales a la suma
        insertAfterSumRecursive(head, sum);
    }

    private int calculateSum(ListNode node) {
        if (node == null) return 0;
        return node.val + calculateSum(node.next);
    }

    private void insertAfterSumRecursive(ListNode node, int targetSum) {
        if (node == null) return;

        if (node.val == targetSum) {
            // Crear nuevo nodo con valor 2
            ListNode newNode = new ListNode(2);
            // Guardar el siguiente nodo
            ListNode temp = node.next;
            // Insertar el nuevo nodo
            node.next = newNode;
            // Conectar el resto de la lista
            newNode.next = temp;
            // Continuar la recursión desde el nodo después del insertado
            insertAfterSumRecursive(temp, targetSum);
        } else {
            // Si no es igual a la suma, continuar con el siguiente
            insertAfterSumRecursive(node.next, targetSum);
        }
    }
}