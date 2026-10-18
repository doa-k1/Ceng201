/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Your Name:        Doğa Kasaplı
 * Your Student ID:  240444403
 * Your Date:        12.10.2026
 */
public class SinglyLinkedList {

    // Instance variable
    private Node head;

    //Constructor
    public void add(int data) {
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

    // -------------------------------------------------------
    // Display the linked list

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // -------------------------------------------------------
    // Find the middle node

    public Node findMiddle() {
        if (head == null) {
            return null;
        }

        // Step 1: Count total nodes
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        // Step 2: Calculate target middle index
        int targetIndex = count / 2;

        // Step 3: Traverse to the middle node
        current = head;
        for (int i = 0; i < targetIndex; i++) {
            current = current.next;
        }

        return current;
    }

    //Delete the middle node
    public void deleteMiddle(){
        //Count the number of nodes
        int count = 0;
        Node current = head;

        //Found the number of node inside the list
        while (current != null){
            count++;
            current = current.next;
        }
        //Empty list
        if (count == 0){
            return;
        }
        //One-node list
        if (count==1){
            head = null;
            return;
        }
        //Calculate middle index
        int targetIndex = count / 2;

        // Traverse to the node just BEFORE the middle node
        current = head;
        for (int i = 0; i < targetIndex - 1; i++) {
            current = current.next;
        }

        // Skip the middle node
        current.next = current.next.next;
    }

    // -------------------------------------------------------
    // Get the head
    public Node getHead(){
        return head;
    }
}

