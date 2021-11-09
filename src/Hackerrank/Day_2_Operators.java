package Hackerrank;
import java.util.Scanner;

public class Day_2_Operators {
    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double totalCost = 0.0;

        totalCost += meal_cost;
        totalCost += (meal_cost*tip_percent)/100;
        totalCost += (meal_cost*tax_percent)/100;
        System.out.println((int)Math.round(totalCost));

/*        double tip = (meal_cost * tip_percent) / 100;
        double tax = (meal_cost * tip_percent) / 100;
        double totalCost = meal_cost + tip + tax;

        System.out.println((int)Math.round(totalCost));*/
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
/*
       Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. Round the result to the nearest integer.

        Example:   A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. Print the value  and return from the function.

        Function Description:   Complete the solve function in the editor below.

        solve has the following parameters:

        int meal_cost: the cost of food before tip and tax
        int tip_percent: the tip percentage
        int tax_percent: the tax percentage
        Returns The function returns nothing. Print the calculated value, rounded to the nearest integer.

        Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result.

        Input Format

        There are  lines of numeric input:
        The first line has a double,  (the cost of the meal before tax and tip).
        The second line has an integer,  (the percentage of  being added as tip).
        The third line has an integer,  (the percentage of  being added as tax).

        Sample Input

        12.00
        20
        8
        Sample Output

        15
        Explanation

       .*/
