#include <iostream>

class Node {
public:
  int data;      // Value stored in the node
  Node* next;    // Pointer to the next node

  // Constructor for the Node class
  explicit Node(int value) : data(value), next(nullptr) {}
};

class LinkedList {
public:
  Node* head;    // Pointer to the head of the list

  // Constructor for the LinkedList class
  LinkedList() : head(nullptr) {}

  // Method to append a new node at the end of the list
  void append(int value) {
    Node* newNode = new Node(value); // Create a new node
    if (head == nullptr) { // Case 1: List is empty
      head = newNode;
    } else { // Case 2: List is not empty
      Node* current = head;
      // Traverse to the last node
      while (current->next != nullptr) {
        current = current->next;
      }
      current->next = newNode; // Link the new node
    }
  }

  void insert(int value, int index) {
    Node* newNode = new Node(value); // Create the new node
    int size = 0;
    Node* current = head;

    // Calculate the size of the list
    while (current != nullptr) {
      current = current->next;
      size++;
    }

    // Check for invalid index
    if (index < 0 || index > size) {
      throw std::out_of_range("Index out of range");
    }

    // Case 1: Insert at the head
    if (index == 0) {
      newNode->next = head;
      head = newNode;
      return;
    }

    // Case 2: Insert at a specific position
    current = head;
    for (int i = 0; i < index - 1; i++) {
      current = current->next; // Move to the node before the insertion point
    }
    newNode->next = current->next;
    current->next = newNode;
  }
  void erase(int index) {
    Node* current = head;
    int size = 0;
    while (current != nullptr) {
      current = current->next;
      size++;
    }

    if (index < 0 || index > size) {
      throw std::out_of_range("Index out of range");
    }

    if (index == 0) {
      head = head->next;
      delete current;
      return;
    }

    current = head;
    for (int i = 0; i < index - 1; i++) {
      current = current->next;
    }

    current->next = current->next->next;
  }

  // Method to print the list contents
   void printList() {
    Node* current = head;
    while (current != nullptr) {
      std::cout << current->data << " ";
      current = current->next;
    }
    std::cout << std::endl;
  }

};

int main() {
  LinkedList list;

  // Append initial values
  list.append(10);
  list.append(20);
  list.append(30);

  // Insert at various positions
  list.insert(5, 0);   // Insert at the head
  list.insert(15, 2);  // Insert in the middle
  list.insert(40, 5);  // Insert at the end

  // Print the updated list
  std::cout << "Updated Linked List: ";
  list.printList(); // Expected: 5 10 15 20 30 40

  return 0;
}

