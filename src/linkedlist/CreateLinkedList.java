package linkedlist;

public class CreateLinkedList {
    Node head;

    public static void main(String[] args) {
        CreateLinkedList createLinkedList = new CreateLinkedList();//instance banaya createlinkedlist ka
        createLinkedList.head = new Node(56);
        Node second = new Node(30);
        Node third = new Node(70);
        createLinkedList.head.next = second;
        second.next = third;
        System.out.println(createLinkedList.head);
    }
}
