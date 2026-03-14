package doubleLinkedCircular;

import node.Node;

import java.util.Scanner;

public class CircularList {
    private NodeCircular head;
    private NodeCircular tail;
    private int quantity = 0;

    private boolean isEmpty(){
        return head == null;
    }

    private void printDats(){
        if (isEmpty()) {
            System.out.println("La lista esta vacia");
            return;
        }

        NodeCircular actual = head;

        do {
            System.out.println("anterior: " + actual.back.value + " actual: " + actual.value + " siguiente: " + actual.next.value);
            actual = actual.next;
        } while (actual != head);
    }

    private void insertOne(int value){
        NodeCircular newNode = new NodeCircular(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            head.next = head;
            head.back = head;
            quantity++;
            return;
        }

        tail.next = newNode;
        newNode.back = tail;
        newNode.next = head;
        head.back = newNode;
        tail = newNode;
        quantity++;
    }

    private void deleteOne(int value){
        NodeCircular deleteNode = new NodeCircular(value);

        if (isEmpty()   ) {
            System.out.println("La lista esta vacia");
            return;
        }

        if (quantity == 1){
            head = null;
            tail = null;
            quantity--;
            return;
        }

        if (value == head.value) {
            head = head.next;
            head.back = tail;
            tail.next = head;
            quantity--;
            return;
        }

        if (value == tail.value){
            tail = tail.back;
            tail.next = head;
            head.back = tail;
            quantity--;
            return;
        }

        NodeCircular actual = head.next;

        while (actual != head) {
            if (actual.value == value) {
                actual.back.next = actual.next;
                actual.next.back = actual.back;
                quantity--;
                return;
            }
            actual = actual.next;
        }

    }


    public void menuCircular(){
        Scanner sc = new Scanner(System.in);
        int selection;

        do {
            System.out.println("""
                    + + + Lista Circular enlaze doble + + +
                    1. Ver lista
                    2. Inserta numero
                    3. Eliminar numero
                    4. Salir
                    """);
            selection = sc.nextInt();

            switch (selection) {
                case 1:
                    printDats();
                    break;
                case 2:
                    System.out.println("Ingresa el valor");
                    int newNode = sc.nextInt();
                    insertOne(newNode);
                    break;
                case 3:
                    System.out.println("Ingresa el valor");
                    int deleteNOde = sc.nextInt();
                    deleteOne(deleteNOde);
                    break;
                default:
                    break;
            }
        } while (selection != 4);
    }
}
