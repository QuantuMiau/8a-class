package simpleList;

public class SimpleLinkedList {
    Node head;

    public Node getHead() {
        return head;
    }

    public SimpleLinkedList() {
        this.head = null;
    }

    public void insertData(int data){
        Node input  = new Node(data);
        if(head == null) {
            head = input;
        }else {

            Node temporal = head;
            while(temporal.puntero != null) {
                temporal = temporal.puntero;
            }

            temporal.puntero  =  input;
        }
    }

    public void printDats(){
        Node temp = head;
        while (temp.puntero != null) {
            System.out.println(temp.data);
            temp = temp.puntero;
        }
    }

    public void insertBeforeData(int data){
        Node input = new Node(data);
        if (head != null) {
            input.puntero = head;
            head = input;
        } else {
            System.out.println("Error: no hay nodos");
        }
    }


}
//
//  /\_/\
// ( x.o )