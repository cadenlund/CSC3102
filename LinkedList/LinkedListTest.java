package LinkedList;
public class LinkedListTest {
    public static void main(String[] args) {
        // Create a new LinkedList instance
        LinkedList list = new LinkedList();

        // Add numbers to the LinkedList
        System.out.println("Appending numbers to the LinkedList:");
        list.Append(10);
        list.Append(20);
        list.Append(30);
        list.Append(40);

        // Display the LinkedList
        System.out.println("Displaying the LinkedList:");
        list.display(); // Expected Output: 10 -> 20 -> 30 -> 40 -> null

        // Test the find method
       // System.out.println("Testing the find method:");
      //  System.out.println("Find 20: " + list.find(20)); // Expected Output: true
      //  System.out.println("Find 50: " + list.find(50)); // Expected Output: false

        // Additional Tests
        System.out.println("Appending more numbers:");
        list.Append(50);
        list.Append(60);
        list.display(); // Expected Output: 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
    }
}
