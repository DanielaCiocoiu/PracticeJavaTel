package Hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class Day_5_Loops {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        scanner.close();
    }
}


