package node;

import java.util.Scanner;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int qty;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
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

    private void insertBeforeData(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.back = newNode;
        head = newNode;
        qty++;
    }

    private void newNodePosition(int position, int data) {
        Node newNode = new Node(data);

        if (position < 1 || position > qty + 1) {
            System.out.println("La posicion no existe, nodos disponibles " + qty);
            return;
        }

        if (position == 1) {
            if (head == null) {
                head = newNode;
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

        if (temp == null) {
            return;
        }

        if (temp.next == null) {
            insertData(data);
            return;
        }

        newNode.next = temp.next;
        newNode.back = temp;
        temp.next.back = newNode;
        temp.next = newNode;
        qty++;
    }

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

    private void nextOne(){
        if (head.next == null) {
            System.out.println("fin de la lista");
            return;
        }
        head = head.next;
        System.out.println(head.data);
    }

    private void backOne(){
        if (head.back == null) {
            System.out.println("Estas en el inicio de la lista");
            return;
        }
        head = head.back;
        System.out.println(head.data);
    }

    private void deleteFirst(){
        head = head.next;
        head.back = null;
    }

    private void deleteLast(){
        Node temp = head;
        int count = 1;
        while (count < qty - 1 && temp != null) {
            temp = temp.next;
            count++;
        }

        temp.next.back = null;
        temp.next = null;
        qty--;
    }

    private void deleteAll(){
        head = null;
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
                    3. Agregar al inicio.
                    4. Insertar en posicion.
                    5. Eliminar un nodo.
                    6. Avanzar 1
                    7. Retroceder 1
                    8. Borrar todo
                    9. Borrar el primero
                    10. Borrar el ultimo
                    11. Salir.
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
                    nextOne();
                    break;
                case 7:
                    backOne();
                    break;
                case 8:
                    deleteAll();
                    break;
                case 9:
                    deleteFirst();
                    break;
                case 10:
                    deleteLast();
                    break;
                case 11:
                    System.out.println("Adioooooooooos!! ww");
                    break;
                default:
                    break;
            }
        } while (menuSelection != 11);
    }
}
//
//  /\_/\
// ( x.o )
