package Hackerrank;

import java.io.IOException;

public class Day_9_Recursion_3 {

    public static void main(String[] args) throws IOException {
        int result = Result.factorial(3);
        System.out.println(result);
    }
}

class Result {
// factorial(3) = 3 X factorial(2) = 3 x 2 = 6
// factorial(2) = 2 X factorial(1) = 2 x 1 = 2
// factorial(1) = 1

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }
}
