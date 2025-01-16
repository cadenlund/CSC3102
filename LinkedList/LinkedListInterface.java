/**
 * This interface defines the operations for a linked list-like data structure.
 * It supports adding, inserting, removing, finding, and retrieving elements.
 *
 * @param <T> The type of elements stored in the data structure.
 */
public interface ListInterface<T> {

    /**
     * Appends an element to the end of the list.
     *
     * @param data The element to append.
     */
    void append(T data);

    /**
     * Inserts an element at the specified index in the list.
     *
     * @param index The position where the element should be inserted.
     * @param data The element to insert.
     * @throws IndexOutOfBoundsException if the index is invalid.
     */
    void insert(int index, T data);

    /**
     * Erases the element at the specified index.
     *
     * @param index The position of the element to erase.
     * @throws IndexOutOfBoundsException if the index is invalid.
     */
    void erase(int index);

    /**
     * Retrieves the element at the specified index.
     *
     * @param index The position of the element to retrieve.
     * @return The element at the specified index.
     * @throws IndexOutOfBoundsException if the index is invalid.
     */
    T index(int index);

    /**
     * Returns the size of the list (number of elements).
     *
     * @return The number of elements in the list.
     */
    int size();

    /**
     * Finds the first occurrence of the specified element in the list.
     *
     * @param data The element to find.
     * @return The index of the element if found, or -1 if not found.
     */
    int find(T data);
}
