package com.brainiac;

/**
 * Side notes:
 *   - Formula for accessing array values is start address + index * number of bytes taken up by the array data type)
 *   - Accessing array values with a known index has a time complexity of O(1) it takes three steps to retrieve an array value
 *   - Retrieving without known index has a complexity of O(n) - linear time
 *   - Add, instert, delete operations have a complexity of O(1)
 *   - Delete an element by shifting array elements has a complexity of O(n)
 *   - Any operation that requires a loop equals to linear time O(n), otherwise it's constant time O(1)
 */

public class Arrays {

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[3] = -15;
        intArray[4] = 7;
        intArray[5] = 55;
        intArray[6] = -22;

        int index = -1;
        for (int i =0; i < intArray.length; i++) {
            // Retrive without index
            if(intArray[i] == 7) {
                index = i;
                break;
            }
        }
        System.out.println("Index is = " + index);

    }
}
