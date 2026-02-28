package node;

import java.util.Scanner;

public class DoubleLinkedList {
    private Node head;
    private int qty;

    public DoubleLinkedList() {
        this.head = null;
        this.qty = 0;
    }

    private void printNodes(){
        Node temp = head;
        if (head == null) {
            System.out.println("No hay nodos");
            return;
        }

        while (temp != null){
            System.out.println(
                    temp.data +
                    " Siguiente: " + (temp.next != null ? temp.next.data : "null") +
                    " Atras: " + (temp.back != null ? temp.back.data : "null"));
            temp = temp.next;
        }

    }

    private void insertData(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            qty++;
            return;
        }

        Node tempNode = head;
        while (tempNode.next != null){
            tempNode = tempNode.next;
        }

        tempNode.next = newNode;
        newNode.back = tempNode;
    }

    public void doubleLinkMenu(){
        Scanner sc = new Scanner(System.in);
        int menuSelection;

        do {
            System.out.println("""
                        ++ Nodos Doblemente enlazados ++
                    ----------------------------------------
                    Selecione una de opcion disponibles
                    1. Mostrar nodos.
                    2. Agregar un nuevo nodo.
                    3. Salir.
                    """);
            menuSelection = sc.nextInt();

            switch (menuSelection) {
                case 1:
                    printNodes();
                    break;
                case 2:
                    System.out.println("Ingrese el valor del nodo");
                    int newNode = sc.nextInt();

                    insertData(newNode);
                    break;
                case 3:
                    System.out.println("Adioooooooooos!! ww");
                    break;
                default:
                    break;
            }

        } while (menuSelection != 3);
    }
}
