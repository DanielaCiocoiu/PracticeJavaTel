package Hackerrank;

import java.util.Scanner;

public class Day_14_Scope {

    public int maximumDifference;
    public int[] elements;

    public Day_14_Scope(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int maxNum = elements[0];

        int minNum = maxNum;

        for (int i = 1; i < elements.length; i++) {

            maxNum = elements[i] > maxNum ? elements[i] : maxNum;
            minNum = elements[i] > minNum ? minNum : elements[i];

        }
        maximumDifference = Math.abs(maxNum - minNum);
    }

    static class Solution {
/*
3
        1 2 5
        */
        //out 4

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            sc.close();

            Day_14_Scope difference = new Day_14_Scope(a);

            difference.computeDifference();

            System.out.print(difference.maximumDifference);
        }
    }
}