package JavaP.Ex;

public class FibonacciRecursiv {

    public static void main(String args[]) {
        //Fn = Fn-1 + Fn-2
int n = 7;
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
/*        fibTerm = fib(6) + fib(5); - 8 + 5 = 13
        > fib(6);                       8
        > i= 6;
        > fib(5) + fib(4);          - 5 + 3
        > fib(5); - 5
        > i =5;
        > fib(4) + fib(3);          - 3 +2
        > fib(4); - 3
        > i = 4;
        > fib(3) + fib(2)           - 2 + 1

        > fib(3);
        > i = 3;
        > fib(2) + fib(1);
        > 1 + 1
        > 2;
        */

}
