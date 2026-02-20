package simpleList;

public class MainLinked {
    public static void main(String[] args) {
        SimpleLinkedList linkedList = new SimpleLinkedList();

        linkedList.insertBeforeData(10);
        linkedList.getHead();

        linkedList.insertData(31);
        linkedList.insertData(32);
        linkedList.insertData(33);
        linkedList.insertData(34);
        linkedList.insertData(35);
        linkedList.insertData(36);
        linkedList.insertData(37);

        linkedList.insertBeforeData(15);

        linkedList.printDats();
        System.out.println("cabeza " + linkedList.getHead().data);
    }
}
//
//  /\_/\
// ( x.o )