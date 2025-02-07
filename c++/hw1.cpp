#include <iostream>
using namespace std;

// Function that returns the minimum element in the array A of size n.
int findMin(int A[], int n) {
    // Initialize tmp with the first element of A.
    int tmp = A[0];

    // Loop from the second element to the end of the array.
    for (int i = 1; i < n; i++) {
        // If the current element is less than tmp, update tmp.
        if (A[i] < tmp) {
            tmp = A[i];
        }
    }

    // Return the smallest element found.
    return tmp;
}

int main() {
    // Example array.
    int arr[] = {5, 3, 8, 1, 4};
    // Calculate the number of elements in arr.
    int n = sizeof(arr) / sizeof(arr[0]);

    // Output the minimum value in the array.
    cout << "The minimum value in the array is: " << findMin(arr, n) << endl;

    return 0;
}
