package Hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class Day_6_Let_s_Review {
/*    print its even-indexed and odd-indexed
    characters as space-separated strings on a single line (see the Sample below for more detail).
    Note: is considered to be an even index.*/

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String par = " ", impar = " ";

        for (int i = 0; i < n; i++) {

            String input = scanner.next();

            char[] myCharArray = input.toCharArray();

            for (int j = 0; j < myCharArray.length; j++) {

                if (j % 2 == 0) {
                    par = par + myCharArray[j];

                } else {
                    impar = impar + myCharArray[j];
                }
            }
            System.out.println(par + "  " + impar + " ");
            par = impar = "";
        }
        scanner.close();
    }
}
/*
        2
        Hacker
        Rank

        */
