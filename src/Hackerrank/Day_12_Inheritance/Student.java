package Hackerrank.Day_12_Inheritance;

public class Student extends Person {

/*    Sample Input

    Heraldo Memelli 8135627
            2
            100 80

    Sample Output

    Name: Memelli, Heraldo
    ID: 8135627
    Grade: O*/


    private int[] scores;
    private int avg;

    public Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(firstName, lastName, idNumber);
        this.scores = scores;
    }

    public char calculate() {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        int avg = (sum) / scores.length;
        if (90 <= avg && avg <= 100) {
            return 'O';
        } else if (80 <= avg && avg < 90) {
            return 'E';
        } else if (70 <= avg && avg < 80) {
            return 'A';
        } else if (55 <= avg && avg < 70) {
            return 'P';
        } else if (40 <= avg && avg < 55) {
            return 'D';
        } else {
            return 'T';
        }
    }
}




/*
 * HackerRank 30 Days of Code
 * ========== Day 12 Inheritance ===========
 * You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed
 * code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the
 * properties of Person.
 * Complete the Student class by writing the following:
 * - A Student class constructor, which has 4 parameters:
 * 	1. A string firstName.
 * 	2. A string lastName.
 * 	3. An integer, id.
 * 	4. An integer array (or vector) of test scores, scores.
 * - A char calculate() method that calculates a Student object's average and returns the grade character representative
 * 	of their calculated average:
 * 	Grading Scale
 * 	Letter  | Average
 * 		O	| 90<=a<=100
 * 		E	| 80<=a<90
 * 		A	| 70<=a<80
 * 		p	| 55<=a<70
 * 		D	| 40<=a<55
 * 		T	| a<40
 */