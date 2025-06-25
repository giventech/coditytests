package org.example;

import java.util.Scanner;

public class BinaryGap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its binary gap: ");
        int number = scanner.nextInt();
        int result = binaryGap(number);
        System.out.println("The longest binary gap is: " + result);
        scanner.close();
    }

    public static int binaryGap(int N) {
        String binary = Integer.toBinaryString(N);
        Boolean newGap = false;
        Integer currentGap = 0;
        Integer maxGap = 0;
        // Iterate through the binary
        for (int i = 0; i < binary.length(); i++) {
            // Identify the first '1'
            if (binary.charAt(i) == '1') {
                newGap = true;
                maxGap = Math.max(currentGap,maxGap);
                currentGap = 0;

            } else if (newGap && binary.charAt(i) == '0') { // Start counting from 0
                currentGap += 1;
            }

        }
        return maxGap;
    }
}




