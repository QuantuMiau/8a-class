package simpleList;

public class MainSimpleList {
    public static void main(String[] args) {
        Node nodo1 = new Node(31);
        Node nodo2 = new Node(32);
        Node nodo3 = new Node(33);
        Node nodo4 = new Node(33);
        Node nodo5 = new Node(34);

        nodo1.puntero = nodo2;
        nodo2.puntero = nodo3;
        nodo3.puntero = nodo4;
        nodo4.puntero = nodo5;

        Node temp = nodo1;
        while (temp.puntero != null) {
            System.out.println(temp.data);
            temp = temp.puntero;
        }

    }
}
//
//  /\_/\
// ( x.o )