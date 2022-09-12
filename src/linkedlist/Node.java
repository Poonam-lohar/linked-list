package linkedlist;

public class Node {
    int data;
    Node next;

    //constructor int data pass kiya
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public String toString() {
        return "Node [data" + data + ",next=" + next + "]";
    }
}
