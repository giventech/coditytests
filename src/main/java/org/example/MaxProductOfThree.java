package org.example;

import java.util.Arrays;


public class MaxProductOfThree {
    public static void main(String[] args) {
        //Write an initial value for and array and run solution method, make sure that you can print the result
        int[] A = {-100, -52, -3, 5, 4, 7};
        //Print the result of the solution method
        System.out.println("The maximum product is: " + solution(A));

    }

    public static int solution(int[] A) {
        //Write code to sort the array A
        Arrays.sort(A);
        //Given that we must use 3 numbers the principle is to figure out what multiplications
        //of which numbers would give us the maximum product.
        int maximumLastThree  = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        int maximumFirstTwo = A[0] * A[1] * A[A.length - 1];

        return Math.max(maximumLastThree, maximumFirstTwo);

    }
}