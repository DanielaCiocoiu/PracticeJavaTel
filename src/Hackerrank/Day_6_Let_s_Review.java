package Hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class Day_6_Let_s_Review {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String par = "", impar = "";

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
            System.out.print(par + "  " + impar);
            par = impar = "";
        }
        scanner.close();
    }
}
/*
        2
        Hacker
        Rank*/
