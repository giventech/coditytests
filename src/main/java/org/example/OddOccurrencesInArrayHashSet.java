package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
//
//        For example, in array A such that:
//
//A[0] = 9  A[1] = 3  A[2] = 9
//A[3] = 3  A[4] = 9  A[5] = 7
//A[6] = 9
//the elements at indexes 0 and 2 have value 9,
//the elements at indexes 1 and 3 have value 3,
//the elements at indexes 4 and 6 have value 9,
//the element at index 5 has value 7 and is unpaired.
//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
//
//        For example, given array A such that:
//
//A[0] = 9  A[1] = 3  A[2] = 9
//A[3] = 3  A[4] = 9  A[5] = 7
//A[6] = 9
//the function should return 7, as explained in the example above.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an odd integer within the range [1..1,000,000];
//each element of array A is an integer within the range [1..1,000,000,000];
//all but one of the values in A occur an even number of times.


import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArrayHashSet {
    public static void main(String[] args) {

        // Allow user to choose between XOR and HashSet solutions
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Choose solution type (1 for XOR, 2 for HashSet):");
        int choice = scanner.nextInt();

        int[] A = {9, 3, 9, 3, 9, 7, 9};
        int result = (choice == 1) ? solutionXOR(A) : solution(A);
        System.out.println("The unpaired element is: " + result);
        

    }
    



    public static  int solution(int[] A) {
        Set<Integer> toggle = new HashSet<>();

        for (int num : A) {
            if (toggle.contains(num)) {
                toggle.remove(num); // Paired - turn off
            } else {
                toggle.add(num);    // Unpaired - turn on
            }
        }

        return toggle.iterator().next(); // The remaining "on" element
    }

    public static int solutionXOR(int[] A) {
        int unpaired = 0;
        for (int num : A) {
            unpaired ^= num; // XOR all elements
        }
        return unpaired; // The remaining number is the unpaired one
    }
}