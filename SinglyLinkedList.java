public class SinglyLinkedList {
    
    
    private Node head;


    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public void append(int data) {
        Node newNode = new Node(data);

        
        if (head == null) {
            head = newNode;
            return;
        }

        
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        
        current.next = newNode;
    }

    
    public void display() {
        Node current = head;
        
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next; 
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

       
        list.display(); 
    }
}