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
public class LinkedList<T> implements LinkedListInterface<T> {
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

    public void Append(T data) {
        Node node;
        node.next = null;
        if (head == null) {

        }
    }
}
