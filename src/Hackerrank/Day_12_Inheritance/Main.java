package Hackerrank.Day_12_Inheritance;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
/*    Sample Input

    Heraldo Memelli 8135627
            2
            100 80

    Sample Output

    Name: Memelli, Heraldo
    ID: 8135627
    Grade: O
    */

    public static void main(String[] args) {

        String firstName = scanner.next();
        String lastName = scanner.next();
        int id = scanner.nextInt();
        int numScores = scanner.nextInt();

        int[] testScores = new int[numScores];

        for (int i = 0; i < numScores; i++) {
            testScores[i] = scanner.nextInt();
        }
        scanner.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
