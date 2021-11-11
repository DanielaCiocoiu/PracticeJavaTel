package Hackerrank.Day_4_Class_vs_Instance;

import java.util.Scanner;

public class Person {
    private int age;

    public Person(int initialAge) {
        this.age = initialAge;
        if (age <= 0) {
            System.out.println("Age is not valid, setting age to 0");
        }
    }
        public void yearPasses (){  //yearPasses() should increase the  instance variable by .
            this.age += 1;
        }

        public void amIOld (){
            if (age < 13) {
                System.out.println("You are to young");
            } else if (age >= 13 && age < 18) {
                System.out.println("You are a teenager..");
            } else {
                System.out.println("You are old..");
            }
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberAge = sc.nextInt();

        for (int i = 0; i < numberAge; i++) {
            int age = sc.nextInt();
            Person person = new Person(age);
            person.amIOld();
            for (int j = 0; j < 3; j++) {
                person.yearPasses();
            }
            person.amIOld();
            System.out.println();
        }

        sc.close();
/*        4
        -1
        10
        16
        18*/
    }
}

