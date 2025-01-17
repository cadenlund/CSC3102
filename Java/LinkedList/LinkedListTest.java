package LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        // Create a new LinkedList instance.
        LinkedList list = new LinkedList();

        // 1. Test Append
        System.out.println("Testing Append:");
        list.Append(10);
        list.Append(20);
        list.Append(30);
        list.Append(40);
        // Expected output: 10 -> 20 -> 30 -> 40 -> null
        list.display();

        // 2. Test Insert
        System.out.println("\nTesting Insert:");
        // Insert 25 at index 2.
        // Expected list: 10 -> 20 -> 25 -> 30 -> 40 -> null
        list.insert(2, 25);
        list.display();

        // 3. Test Erase
        System.out.println("\nTesting Erase:");
        // Erase element at index 3. (The element 30 should be removed.)
        // Expected list: 10 -> 20 -> 25 -> 40 -> null
        list.erase(3);
        list.display();

        // 4. Test index (retrieve element at a given index)
        System.out.println("\nTesting index retrieval:");
        // Retrieve the element at index 2.
        // Expected: 25 (since after insertion and deletion the list is: 10, 20, 25, 40)
        int element = list.index(2);
        System.out.println("Element at index 2: " + element);

        // 5. Test find (locate the index of a given data value)
        System.out.println("\nTesting Find:");
        // Find the element 40; expected index: 3.
        int pos = list.find(40);
        System.out.println("Index of element 40: " + pos);
        // Attempt to find an element that does not exist (e.g., 100); expected: -1.
        pos = list.find(100);
        System.out.println("Index of element 100: " + pos);
    }
}
