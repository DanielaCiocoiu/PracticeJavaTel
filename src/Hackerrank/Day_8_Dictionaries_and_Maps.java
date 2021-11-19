package Hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day_8_Dictionaries_and_Maps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> myMap = new HashMap<>();

        int inputNumber = scanner.nextInt();

        for (int i = 0; i < inputNumber; i++) { //pun in map numele si nr. de telefon
            String name = scanner.next();
            int phone = scanner.nextInt();

            myMap.put(name, phone);
        }
        while (scanner.hasNext()) {
            String nameSearched = scanner.next();
            if (myMap.containsKey(nameSearched)) {
                System.out.println(nameSearched + " = " + myMap.get(nameSearched));
            } else {
                System.out.println("Not found");
            }

        }
        scanner.close();
    }

}

/*  3
    sam 99912222
    tom 11122222
    harry 12299933
    sam
    edward
    harry

    */





