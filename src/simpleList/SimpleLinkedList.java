package simpleList;

import java.util.Scanner;

public class SimpleLinkedList {
    Node head;
    int quantity;

    public Node getHead() {
        return head;
    }

    public SimpleLinkedList() {
        this.head = null;
    }

    private void insertData(int data){
        Node input  = new Node(data);
        if(head == null) {
            head = input;
            quantity++;
        }else {

            Node temporal = head;
            while(temporal.puntero != null) {
                temporal = temporal.puntero;
            }

            temporal.puntero  =  input;
            quantity++;
        }
    }

    private void printDats(){
        Node temp = head;
        if (temp == null){
            System.out.println("No hay nodos");
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.puntero;
            }
        }

    }

    private void insertBeforeData(int data){
        Node input = new Node(data);
        if (head != null) {
            input.puntero = head;
            head = input;
            quantity++;
        } else {
            System.out.println("Error: no hay nodos");
        }
    }

    private void searchNode(int nodeValue){
        Node temp = head;
        int count = 1;
        boolean found = false;
        while (temp != null) {
            if (temp.data == nodeValue){
                found = true;
                break;
            }
            count++;
            temp = temp.puntero;
        }

        if (!found){
            System.out.println("No se encontro el nodo");
            return;
        }

        System.out.println("El nodo del valor " + nodeValue);
        System.out.println("Esta en " + count);

    }

    private void averageNode(){
        Node temp = head;
        int countItems = 1;
        int totalData = 0;
        float averageData;

        if (head == null) {
            System.out.println("No hay elementos en la lista");
            return;
        }

        while (temp != null) {
            totalData += temp.data;
            countItems++;
            temp = temp.puntero;
        }

        averageData = (float) totalData / countItems;
        System.out.println("El promedio de los nodos es " + averageData);

    }

    private void deleteNode(int data){
        if (head == null){
            System.out.println("No hay nodos disponibles");
            return;
        }

        if (head.data == data) {
            head = head.puntero;
            quantity--;
            return;
        }

        Node actual = head;
        Node lastNode = null;

        while (actual != null && actual.data != data){
            lastNode = actual;
            actual = actual.puntero;
        }

        if (actual == null) {
            System.out.println("No se encontro el valor en la lista");
            return;
        }

        lastNode.puntero  = actual.puntero;
        quantity--;
        System.out.println("Nodo eliminado");
    }

    private void editNodeData(int data, int newData){
        if (head == null){
            System.out.println("No hay nodos disponibles");
            return;
        }

        if (head.data == data) {
            head.data = newData;
            return;
        }

        Node actual = head;

        while (actual != null && actual.data != data){
            actual = actual.puntero;
        }

        if (actual == null) {
            System.out.println("Nodo no encontrado");
            return;
        }

        actual.data = newData;
        System.out.println("Nodo actualizado :D");

    }
    private void newNodePosition(int position, int data){
        Node temp = head;
        Node newNode = new Node(data);
        int count = 1;

        if (position > quantity + 1) {
            System.out.println("La posicion no existe, nodos disponibles" + quantity);
            return;
        }

        if (head == null){
            System.out.println("No hay nodos disponibles");
            return;
        }

        if (position == 1) {
            insertBeforeData(data);
            return;
        }

        while (count < position - 1) {
            temp = temp.puntero;
            count++;
        }


        if(temp.puntero == null) {
            insertData(data);
            return;
        }

        newNode.puntero = temp.puntero;
        temp.puntero = newNode;
        quantity++;

    }

    public void linkedListMenu(){
        Scanner sc = new Scanner(System.in);
        int menuSelection;

        do {
            System.out.println("qty " + quantity);
            System.out.println("""
                    +++ Nodos +++
                    Seleccione una de las siguiente opciones.
                    1. Mostrar todos los nodos.
                    2. Agregar un nodo.
                    3. Eliminar un nodo.
                    4. Buscar el nodo de un numero.
                    5. Cambiar el valor de un nodo.
                    6. Promedio de los nodos.
                    7. Insertar en posicion.
                    8. Salir.
                    """);
             menuSelection = sc.nextInt();

             switch (menuSelection) {
                 case 1:
                     printDats();
                     break;
                 case 2:
                     int newNodeMenu;
                     do {
                        System.out.println("""
                             Selecione una opcion disponible
                             1. Agregar un nuevo nodo en lista
                             2. Agregar un nuevo nodo cabeza
                             3. Regresar.""");
                        newNodeMenu = sc.nextInt();

                        switch (newNodeMenu) {
                            case 1:
                                System.out.println("Ingrese en valor del nodo");
                                int newNodeValue = sc.nextInt();
                                insertData(newNodeValue);
                                break;
                            case 2:
                                System.out.println("Ingrese en valor del nodo");
                                int newHeadNode = sc.nextInt();
                                insertBeforeData(newHeadNode);
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    } while (newNodeMenu != 3);
                     break;
                 case 3:
                     System.out.println("""
                             Eliminar el nodo de un valor
                             Ingrese en valor a eliminar.""");
                     int nodeDelete = sc.nextInt();
                     deleteNode(nodeDelete);
                     break;
                 case 4:
                     System.out.println("""
                             Buscar el nodo de un valor
                             Ingrese en valor a buscar.""");
                     int nodeSearch = sc.nextInt();
                     searchNode(nodeSearch);
                     break;
                 case 5:
                     System.out.println("Ingrese el valor del nodo que va a buscar");
                     int nodeValue = sc.nextInt();
                     System.out.println("Ingrese el nuevo valor del nodo");
                     int newNodeValue = sc.nextInt();

                     editNodeData(nodeValue, newNodeValue);
                     break;
                 case 6:
                     averageNode();
                     break;
                 case 7:
                     System.out.println("Ingrese el valor la posicion donde se insertara");
                     int nodePosition = sc.nextInt();
                     System.out.println("Ingrese el valor del nuevo nodo");
                     int newNode = sc.nextInt();

                     newNodePosition(nodePosition, newNode);

                     break;
                 case 8:
                     System.out.println("Adioooooooooooos!!! ");
                     break;
                 default:
                     break;
             }
        } while (menuSelection != 8);
    }
}
//
//  /\_/\
// ( x.o )