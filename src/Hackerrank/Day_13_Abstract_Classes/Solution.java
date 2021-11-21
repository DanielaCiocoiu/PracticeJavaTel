package Hackerrank.Day_13_Abstract_Classes;

import java.util.Scanner;

public class Solution {

/*    The Alchemist
      Paulo Coelho
      248

*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }


/*
    Your Output (stdout)
    Title: The Alchemist
    Author: Paulo Coelho
    Price: 248

    */
}
