package Hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day_8_Dictionaries_and_Maps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> myMap = new HashMap<>();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int phone = scanner.nextInt();

            myMap.put(name, phone);
        }
        while (scanner.hasNext()) {
            String s = scanner.next();
            if (myMap.containsKey(s)) {
                System.out.println(s + " = " + myMap.get(s));
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
    harry*/





