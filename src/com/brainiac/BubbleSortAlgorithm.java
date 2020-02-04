package com.brainiac;

/**
 * Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through the list,
 * compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.
 *
 * Side notes:
 *  - Has a time complexity of O(n^2) which is quadratic
 *  - Bubble sort is a stable sort algorithm
 */

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
       int[] intArray = { 10, 20, 45, -7, -22, 35, 55, 1 };

       for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
         for (int i = 0; i < lastUnsortedIndex; i++) {
            if ( intArray[i] > intArray[i + 1])  {
                swap(intArray, i, i +1);
            }
         }
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
