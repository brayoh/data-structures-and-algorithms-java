package com.brainiac.sorting;

/**
 *  Selection sort is a sorting algorithm, specifically an in-place comparison sort.
 *  It has O(n2) time complexity, making it inefficient on large lists, and generally performs worse than the similar insertion sort.
 *
 * Side notes:
 *  - Unstable sort algorithm since the order in position of duplicate elements is not maintained
 *  - Time complexity of O(n^2) which is quadratic
 */

public class SelectionSortAlgorithm {
    public static  void main(String[] args) {
        int[] intArray = { 10, 20, 45, -7, -22, 35, 55, 1 };

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] arrayToSwap, int currentIndex, int newIndex) {
        if(currentIndex == newIndex) {
            return;
        }

        int temp = arrayToSwap[currentIndex];
        arrayToSwap[currentIndex] = arrayToSwap[newIndex];
        arrayToSwap[newIndex] = temp;
    }
}
