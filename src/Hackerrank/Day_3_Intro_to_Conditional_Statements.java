package Hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class Day_3_Intro_to_Conditional_Statements {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && (N >= 2) && (N <= 5)) {
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && (N >= 6) && (N <= 20)) {
            System.out.println("6 Weird");
        } else if (N % 2 == 0 && (N >= 20)) {
            System.out.println(" 20 Not Weird");
        }
        scanner.close();

    }
    //-----------
  /*  Objective
    In this challenge, we learn about conditional statements. Check out the Tutorial tab for learning materials and an instructional video.

    Task
    Given an integer, , perform the following conditional actions:

    If  is odd, print Weird

    If  is even and in the inclusive range of 2  to 5, print Not Weird
    If  is even and in the inclusive range of 6 to 20, print Weird
    If  is even and greater than 20 , print Not Weird
    Complete the stub code provided in your editor to print whether or not  is weird.

            Input Format

    A single line containing a positive integer, .

    Constraints

    Output Format

    Print Weird if the number is weird; otherwise, print Not Weird.

    Sample Input 0

            3
    Sample Output 0

    Weird
    Sample Input 1

            24
    Sample Output 1

    Not Weird
    Explanation

    Sample Case 0:
    is odd and odd numbers are weird, so we print Weird.

    Sample Case 1:
    and  is even, so it is not weird. Thus, we print Not Weird.*/
}

