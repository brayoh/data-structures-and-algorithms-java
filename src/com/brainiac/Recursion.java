package com.brainiac;

/**
 *
 */

public class Recursion {
    public static void main(String[] args) {
        System.out.println(iterativeFactorial(5));
        System.out.println(recursiveFactorital(5));
    }

    public static  int recursiveFactorital (int num) {
        // base case AKA breaking condition
        if(num == 0) {
            return 1;
        }

        // Factorial formula = n! = n * (n - 1)!
        return num * recursiveFactorital(num -1);
    }

    public static int iterativeFactorial(int num) {
        if(num == 0) {
            return 1;
        }

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            // get the product all integers less than or equal to num
            factorial *= i;
        }

        return factorial;
    }
}
