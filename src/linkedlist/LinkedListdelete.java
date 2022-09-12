package linkedlist;

public class LinkedListdelete {
    public static void main(String[] args) {
        System.out.println("welcome to linked list program");

        LinkedList list = new LinkedList();
        list.append(56);
        list.append(70);
        System.out.println();
        list.insertAtMiddle(30);
        list.show();
        System.out.println();
        list.pop();
        list.show();
    }
}

