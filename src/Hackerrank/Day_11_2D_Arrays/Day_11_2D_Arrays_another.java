package Hackerrank.Day_11_2D_Arrays;

import java.util.Scanner;

public class Day_11_2D_Arrays_another {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final int MAX_ROW_EVALUATE = 4;
        final int MAX_COL_EVALUATE = 4;

        int[][] arr = new int[6][6];

        int maxHourglass = 0;

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        for (int i = 0; i < MAX_ROW_EVALUATE; i++) {

            for (int j = 0; j < MAX_COL_EVALUATE; j++) {
                int temSum = 0;
                // top hourglass
                temSum += arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                // middle hourglass
                temSum += arr[i + 1][j + 1];
                // botton hourglass
                temSum += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (temSum > maxHourglass || i == 0 && j == 0) {
                    maxHourglass = temSum;
                }
            }
        }
        System.out.println(maxHourglass);
        scanner.close();
    }

    /*          1 1 1 0 0 0
            0 1 0 0 0 0
            1 1 1 0 0 0
            0 0 2 4 4 0
            0 0 0 2 0 0
            0 0 1 2 4 0

            */
}
