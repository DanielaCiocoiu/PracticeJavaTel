package Hackerrank;

import java.util.Scanner;

public class Day_10_Binary_Numbers {
    /*
     * Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
     * Input Format:
     * - A single integer, n.
     * Output Format:
     * - Print a single base-10 integer denoting the maximum number of consecutive 1's in the binary representation of n.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        int restulImp, contor = 0, maxCount = 0;

        String s = "";

        while (number > 0) {

            //Get residue
            restulImp = number % 2;
            number /= 2;

            //Validate if residue is 1
            if (restulImp == 1) {

                contor++; //daca este impar, add +

                //Compare current count with max count
                if (contor > maxCount) { //daca contorul  > 0
                    maxCount = contor;  //lim = contor
                }
            } else {
                contor = 0;
            }
            s = restulImp + s; // concatenez restul impartirii
        }
        System.out.println("Binary number for: " + number + " este: " + maxCount); //rezultat pt 6 = 2  pt 5 =  1
    }
}
