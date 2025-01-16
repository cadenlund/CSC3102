/**
 * This class represents a single node in a linked list.
 * Each node contains:
 * - Data: The value stored in the node.
 * - A reference to the next node in the sequence.
 *
 * This class is designed to be used as part of a linked list implementation.
 *
 * @author Caden Lund
 * @version 1.0
 * @since 2025-01-16
 */
public class Node {
    int data; //the Datapoint is stored in this int
    Node next; //Reference to next node to create linkedlist

    /**
     * Constructs a new node with the specified data.
     * The next reference is initialized to null.
     *
     * @param data The value to store in this node.
     */
    public Node(int data) {
        this.data = data;  // Assign the data
        this.next = null;  // Initialize next to null
    }

    /**
     * Returns a string representation of the node's data.
     * This is useful for debugging and printing the node.
     *
     * @return A string representation of the node's data.
     */
    @Override
    public String toString() {
        return Integer.toString(data);  // Convert data to a string
    }
}
