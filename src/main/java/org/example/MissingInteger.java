package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MissingInteger {
    public static void main(String[] args) {
     //Write an initial value for and array and run solution method, make sure that you can print the result
        int[] A = {1, 3, 6, 4, 1, 2};
        //Print the result of the solution method
        System.out.println("The missing integer is: " + solution(A));
        System.out.println("The missing integer is: " + solutionWithHashSet(A));





    }
    public static int solution(int[] A) {
        int missingInteger = 0;
        //Write code to sort the array A
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            int nextIndex = (i + 1);
            if ( nextIndex < A.length ) {
                if (A[i] + 1 != A[nextIndex]) {
                    if ((A[i] < 0)) {
                        missingInteger = 1;
                    } else if (i == A.length - 1) {
                        missingInteger = A[i] + 1;
                    } else {
                        missingInteger = A[i] + 1;
                    }
                }
            }
        }
        return missingInteger;
    }

    public static int solutionWithHashSet(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int num : A) {
            if (num > 0) {
                set.add(num);
            }
        }
        for (int i = 1; i <= set.size() + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 1; // This line is a fallback, though logically it might not be needed.
    }
}