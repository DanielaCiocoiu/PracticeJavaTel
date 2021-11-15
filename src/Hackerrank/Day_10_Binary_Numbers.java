package Hackerrank;

import java.util.Scanner;

public class Day_10_Binary_Numbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int inputNumar = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        int restulImp, contor = 0, limitaMin = 0;

        String s = "";

        while (inputNumar > 0) {                                            //input 6       5
            restulImp = inputNumar % 2;                                     //6 3 1         5 2 1
            if (restulImp == 1) {                                           //0 0 1         1 1
                contor ++; //daca este impar, add +                         //0 0 2         1
                if (contor > limitaMin) { //daca contorul  > 0
                       limitaMin = contor;  //lim = contor                       0 1 2      1 1
                }

            } else {
                contor = 0;                                                 //0 1 2         1 1
            }
            s = restulImp + s; // concatenez restul impartirii                1 1 0         1 0 1
            inputNumar = inputNumar / 2; //6 3 1                                            5 2 1
        }
        System.out.println("Binary number for: " + inputNumar + " este: " + limitaMin); //rezultat pt 6 = 2  pt 5 =  1
    }
}
