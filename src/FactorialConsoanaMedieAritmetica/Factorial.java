package FactorialConsoanaMedieAritmetica;//Scrieti un program care sa calculeze n! (n factorial),
// unde n este un numar ales de voi.

public class Factorial {
    public static void main(String[] args) {
        int factorial = 5;
        calcFactorial(factorial);
        int factorial1 = 10;
        calcFactorial(factorial1);
    }
    static void calcFactorial(long factorial){
        long result = 1;
        for (long i = 2; i<= factorial; i++){
                result *= i;
        }
        System.out.println("factorial de: " + factorial+ " este: " + result);
    }
}
