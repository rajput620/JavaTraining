class Node{
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;

    }
}


class SLLInsertionAtBeginning {
    static Node insertionAtFront(Node head, int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        return newNode;
    }

    static void printList(Node head) {
        Node curr = head;
        while(curr!=null) {
            System.out.println(curr.data);
            if(curr.next!=null) {
                System.out.println("->");
            }
            curr = curr.next;
        }
        System.out.println();
    }
        public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        int x = 1;
        head = insertionAtFront(head, x);

        printList(head);
    }
}
