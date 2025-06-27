package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PermCheck {
    public static void main(String[] args) {
        //Write an initial value for and array and run solution method, make sure that you can print the result
        int[] A = {4, 1, 3, 6};
        //Print the result of the solution method says it is a permutation or not
        System.out.println("The array is a permutation: " + solutionFab(A));
    }


    public static int solutionFab(int[] A){
        List<Integer> sortedArray = new ArrayList<>();
        for (int value : A) {
            sortedArray.add(value);
        }
        TreeSet<Integer> sortedTreeSet = new TreeSet<>(sortedArray);
        for (Integer value : sortedTreeSet) {
            Integer next = sortedTreeSet.higher(value);
            if (next != null && next != value + 1 ) {
                return 0;
            }
        }
        return 1;
    }



    ///  write another method based on the premise below
    //    A permutation of 1 to N has a unique mathematical property: its sum is always the same.
    //    The sum of numbers 1 + 2 + 3 + ... + N follows the formula:
    //    Sum = N × (N + 1) ÷ 2

    public static int solution(int[] A) {
        int N = A.length;
        long expectedSum = (long) N * (N + 1) / 2;
        long actualSum = 0;

        for (int value : A) {
            if (value < 1 || value > N) return 0;
            actualSum += value;
        }

        return actualSum == expectedSum ? 1 : 0;
    }



}