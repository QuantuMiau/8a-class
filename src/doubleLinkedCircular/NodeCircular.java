package doubleLinkedCircular;

public class NodeCircular {
    int value;
    NodeCircular next;
    NodeCircular back;

    public NodeCircular(int value) {
        this.value = value;
        this.next = null;
        this.back = null;
    }
}
