package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TapeEquilibrium {
    public static void main(String[] args) {
        //Write an initital velue for and array and run solution method, make sure that you can print the result
        int[] A = {8, 1, 2, 4, 3};
        //Print the result of the solution method
        System.out.println("The minimal difference is: " + solution(A));
    }



             static  int solution(int[] A) {


                int N = A.length;
                if (N < 2 || N > 100000) {
                    throw new IllegalArgumentException("Array size must be between 2 and 100,000");
                }

                //edge cases
                

                // for each indice in the array calculate the sum of first half and second half
                int currentSumFirstHalf = 0;
                int currentSumSecondHalf = 0;
                int currentDifference = 0;
                int minimalDifference =  0;

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < i+1; j++) {
                        currentSumFirstHalf += A[j];
                    }
                    for (int j = i+1; j < N; j++) {
                        currentSumSecondHalf += A[j];
                    }
                    if (currentSumFirstHalf != currentSumSecondHalf) {
                        currentDifference = currentSumFirstHalf - currentSumSecondHalf;
                    }
                    minimalDifference = Math.min(currentDifference, minimalDifference);
                    currentSumSecondHalf = 0;
                    currentSumFirstHalf = 0;
                }

                return minimalDifference;
            }

}