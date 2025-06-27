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


}