package Hackerrank.Day_11_2D_Arrays;

import java.util.Scanner;

public class Day_11_2D_Arrays {
//calculeaza suma fiecarei clepsidre si apoi suma totala

/*          1 1 1 0 0 0                                             //arr[i+1]
            0 1 0 0 0 0                                             //arr[i]
            1 1 1 0 0 0
            0 0 2 4 4 0                                             //arr[i+2]
            0 0 0 2 0 0
            0 0 1 2 4 0

            */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) { //iterez fiecare rand
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) { //iterez fiecare nr de pe rand, ex: rand 1, nr 1, 2...
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();


        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 6; i++) { //iterez fiecare rand
            for (int j = 0; j < 6; j++) { //iterez fiecare item de pe rand
                if ((i + 2) < 6 && (j + 2) < 6) {
                    sum = arr[i][j] +
                            arr[i][j + 1] +
                            arr[i][j + 2] +
                            arr[i + 1][j + 1] +
                            arr[i + 2][j] +
                            arr[i + 2][j + 1] +
                            arr[i + 2][j + 2];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }

        }
        System.out.println(maxSum);
    }

 /*   We define an hourglass in A to be a subset of values with indices falling in
  this pattern in A's graphical representation:
    a b c
     d
    e f g
  There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.

    Task
  Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
            Input Format
  There are 6 lines of input, where each line contains 6 space-separated integers
  describing 2D Array A; every value in A will be in the inclusive range of -9 to 9.*/
}
