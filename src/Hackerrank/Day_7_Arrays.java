package Hackerrank;

import java.util.Scanner;

public class Day_7_Arrays {

    public static void main(String[] args) {
        int arrayElemets = 0;

        Scanner scanner = new Scanner(System.in);

        //input array size
        arrayElemets = scanner.nextInt();
        //array declaration
        int numbersArray[] = new int[arrayElemets];

        //Input numbers to array
        for (int i = 0; i < arrayElemets; i++) {
            numbersArray[i] = scanner.nextInt();
        }

        //Output reverse array
        for (int i = arrayElemets - 1; i >= 0; i--) {
            System.out.print(numbersArray[i] + " ");
        }

        scanner.close();

/*        // with method call
        int[] arr = {1, 4, 3, 2};
        arr = reverse(arr);*/
    }

/*    public static int[] reverse(int[] arrayElemets) {
        int end = arrayElemets.length - 1;
        for (int i = end; i >= 0; i--) {
            System.out.print(arrayElemets[i] + " ");
        }
        return arrayElemets;
    }*/
}
