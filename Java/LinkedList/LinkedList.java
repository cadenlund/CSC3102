package LinkedList;

/**
 * This class implements a singly linked list.
 * It supports basic operations like adding, removing,
 * and displaying nodes.
 *
 * Usage:
 * LinkedList list = new LinkedList();
 * list.add(10);
 * list.display();
 *
 * @author Caden Lund
 * @version 1.0
 */
public class LinkedList {
    Node head; //Defines An instance of the node class that is set to the head

    /**
     * Constructs a new LinkedList instance and
     * initializes a variable with type Node,
     * defined in our Node class. This variable will be
     * an instance of the Node class but is empty to start
     * and will get fufilled when we do the add method.
     *
     * @params None
     * @return None
     */
    public LinkedList() {
        head = null;
    }

    /**
     * Append method first creates a new node and passes data through it
     * creating the first instance of our Node Class with data
     * it also sets the next (this.next and this-data defined in the
     * node class) to null. It then checks if this is the first node
     * of the linked list, if so the first node becomes the head, if not
     * it defines Current as the head node(original node) and then it starts
     * a while loop which activates only when the current.next is not null.
     * this essentially will traverse down the linked list until it gets to the
     * last node. Once it gets to the last node, current is equal to
     * the last node, the while loop stops and the last node is linked to the node
     * created in the append method
     *
     * @param data
     * @return none
     */
    public void Append(int data) {
        Node node = new Node(data); // Create a new node with the given data
        node.next = null;           // Set its next pointer to null (not strictly necessary)

        if (head == null) {         // If the list is empty
            head = node;            // Set the new node as the head
        } else {                    // If the list is not empty
            Node current = head;    // Start at the head
            while (current.next != null) { // Traverse to the last node
                current = current.next;
            }
            current.next = node;    // Link the last node to the new node
        }
    }


    /**
     * Inserts an element at the specified index in the list.
     *
     * @param index The position where the element should be inserted.
     * @param data The element to insert.
     * @throws IndexOutOfBoundsException if the index is invalid.
     */
    void insert(int index, int data) {
        // First, count the number of nodes to determine the list size
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        // Validate index: valid indices are from 0 to size (inclusive)
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }

        // Create a new node for the data
        Node node = new Node(data);

        // Special case: Inserting at the beginning
        if (index == 0) {
            node.next = head;
            head = node;
            return;
        }

        // Otherwise, traverse to the node just before the insertion position
        current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        // Adjust pointers to insert the new node
        node.next = current.next;
        current.next = node;
    }
    /**
     * Erases the element at the specified index.
     *
     * @param index The position of the element to erase.
     * @throws IndexOutOfBoundsException if the index is invalid.
     */
    void erase(int index) {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        // Validate index: valid indices are from 0 to size-1
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }

        // Special case: remove the head node
        if (index == 0) {
            head = head.next;
            return;
        }

        // Traverse to the node before the one to be erased
        current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        // Delete the target node
        current.next = current.next.next;
    }
    /**
     * Retrieves the element at the specified index.
     *
     * @param index The position of the element to retrieve.
     * @return The element at the specified index.
     * @throws IndexOutOfBoundsException if the index is invalid.
     */

    int index(int index) {
        // First, compute the size of the list.
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        // Validate index: valid indices are from 0 to size-1
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }

        // Reset current to head to start the traversal for retrieval.
        current = head;

        // Traverse from the head to the node at the given index.
        // If index == 0, the loop won't run and current remains at head.
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        // Return the data from the node at the specified index.
        return current.data;
    }

    int find(int data) {
        int counter = 0;
        Node current = head;

        // Loop over all nodes in the list
        while (current != null) {
            if (current.data == data) { // Compare current node's data with input data
                return counter;         // Found, return its index
            }
            current = current.next;     // Move to the next node
            counter++;                  // Increment counter for each node
        }

        // Data was not found, return -1 to indicate this.
        return -1;
    }




    /**
     * Display method that sets the head to the current node
     * starts a while loop that stops when the current
     * nodes pointer (next) is null. The while loop
     * prints the value of the data point for current
     * and then attempts to set current to current.next
     * going down one node in the LinkedList, once thats
     * done then print null to show we made it to the
     * end of the linkedlist
     *
     *
     * @params None
     * @return None
     */
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null pointer, end of List");
    }

}
