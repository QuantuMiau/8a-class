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
        qty++;
    }

    /**
     * Inserta un nodo al inicio de la lista doble (antes de la cabeza actual).
     */
    private void insertBeforeData(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("Error: no hay nodos");
            return;
        }

        newNode.next = head;
        head.back = newNode;
        head = newNode;
        qty++;
    }

    /**
     * Inserta un nodo en una posición específica (1-indexada).
     * Si la posición es 1 se delega a insertBeforeData, si es mayor que
     * la cantidad de nodos +1 se imprime un mensaje de error.
     */
    private void newNodePosition(int position, int data) {
        if (position < 1 || position > qty + 1) {
            System.out.println("La posicion no existe, nodos disponibles " + qty);
            return;
        }

        if (position == 1) {
            if (head == null) {
                // lista vacía, simplemente insertar al final
                head = new Node(data);
                qty++;
            } else {
                insertBeforeData(data);
            }
            return;
        }

        Node temp = head;
        int count = 1;
        while (count < position - 1 && temp != null) {
            temp = temp.next;
            count++;
        }

        // temp ahora apunta al nodo anterior a la posición deseada
        if (temp == null) {
            // posición fuera de rango, pero ya fue validada
            return;
        }

        if (temp.next == null) {
            insertData(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.back = temp;
        temp.next.back = newNode;
        temp.next = newNode;
        qty++;
    }

    /**
     * Elimina un nodo con el valor especificado.
     */
    private void deleteNode(int data) {
        if (head == null) {
            System.out.println("No hay nodos disponibles");
            return;
        }
        if (head.data == data) {
            head = head.next;
            if (head != null) {
                head.back = null;
            }
            qty--;
            System.out.println("Nodo eliminado");
            return;
        }

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("No se encontro el valor en la lista");
            return;
        }

        if (current.next != null) {
            current.next.back = current.back;
        }
        if (current.back != null) {
            current.back.next = current.next;
        }
        qty--;
        System.out.println("Nodo eliminado");
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
                    2. Agregar un nuevo nodo (final).
                    3. Agregar al inicio (cabeza).
                    4. Insertar en posicion.
                    5. Eliminar un nodo.
                    6. Salir.
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
                    System.out.println("Ingrese el valor del nodo");
                    int headValue = sc.nextInt();
                    insertBeforeData(headValue);
                    break;
                case 4:
                    System.out.println("Ingrese la posicion donde insertar");
                    int pos = sc.nextInt();
                    System.out.println("Ingrese el valor del nuevo nodo");
                    int val = sc.nextInt();
                    newNodePosition(pos, val);
                    break;
                case 5:
                    System.out.println("Ingrese el valor a eliminar");
                    int del = sc.nextInt();
                    deleteNode(del);
                    break;
                case 6:
                    System.out.println("Adioooooooooos!! ww");
                    break;
                default:
                    break;
            }
        } while (menuSelection != 6);
    }
}

