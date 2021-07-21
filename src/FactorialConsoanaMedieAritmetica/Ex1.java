package FactorialConsoanaMedieAritmetica;

public class Ex1 {

    // 1. Scrieti un program care sa calculeze si afiseze media aritmetica a numerelor pare dintr-un array.

    //2. Scrieti un program care sa afiseze indexul la care se afla o anumita valoare intr-un array.

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       /* int count = 0;
        int sumPare = 0;

        for (int x : arr) {
            if (x % 2 == 0) {
                sumPare += x;
                count += 1;

            }

        }
        double medie = sumPare/count;
        System.out.println("Medie: " + medie);*/

        int nr = 7;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == nr) {

                System.out.println("Valoarea este pe pozitia, indexul: " + i);
            }


        }

    }
}