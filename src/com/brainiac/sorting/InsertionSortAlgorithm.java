package com.brainiac.sorting;

/**
 * Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time.
 *
 * Side notes:
 *  - In-place algorithm
 *  - Assumes element in index zero is already sorted
 *  - Stable sort algorithm since we pick elements from left to right which doesn't mess with the order
 *  - Time complexity of O(n^2) which is quadratic
 *
 */

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        int[] intArray = { 10, 20, 45, -7, -22, 35, 55, 1 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            // traverse sorted partition and look for correct position to insert new element
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                // shift element to the right
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
