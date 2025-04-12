package org.example.Ejercicio7;


public class Main {
    public static void main(String[] args) {
        // Crear una lista de ejemplo: 1 -> 2 -> 3 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(6);

        System.out.println("Lista original:");
        printList(head);

        Solution solution = new Solution();
        solution.insertAfterSum(head);

        System.out.println("\nLista después de insertar 2 después de nodos con valor igual a la suma:");
        printList(head);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}