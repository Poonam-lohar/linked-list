package linkedlist;
 class MyLinkedList {
     Node head;
     Node tail;

     public void add(int data) {
         Node newNode = new Node(data);
         if (head == null) {
             head = newNode;
             tail = newNode;
             return;
         } else {
             tail.next = newNode;
             tail = newNode;
         }
     }

     public void print() {
         Node temp = head;
         while (temp != null) {
             System.out.print(temp.data + " ");
             temp = temp.next;
         }
     }
 }