package Elev;

import java.util.Arrays;

public class DemoElev {

    public static void main(String[] args) {

        Elev elev1 = new Elev("Marian", 8, 8, 8);
        int medie1 = elev1.getMedie();
        Elev elev2 = new Elev("Irina", 10, 10, 10);
        int medie2 = elev2.getMedie();
        Elev elev3 = new Elev("Ion", 6, 6, 6);
        int medie3 = elev3.getMedie();
//Folositi aceasta metoda intr-un program pentru a afisa numele elevului cu cea mai mare medie dintre 3 elevi definiti de voi.

        int[] medieArray = {medie1, medie2, medie3};
        int min = medieArray[0];
        int medie = medieArray[0];
        int max = medieArray[0];
        for (int i = 0; i < medieArray.length; i++) {
            if ((medieArray[i] < min) && (medieArray[i] < medie) && (medieArray[i] < max)) {
                min = medieArray[i];
                System.out.println("min: " + min);
            }
            if ((medieArray[i] > min) && (medieArray[i] < max)) {
                medie = medieArray[i];
                System.out.println("medie: " + medie);

            } else if ((medieArray[i] > min) && (medieArray[i] > medie)) {
                max = medieArray[i];
                System.out.println("max: " + max);
            }
        }
        System.out.println("Situatie elev 2: " + elev2 + ", " + "media max: " + max);
        System.out.println("Situatie elev 1: " + elev1 + ", " + "media medie: " + medie);
        System.out.println("Situatie elev 3: " + elev3 + ", " + "media minima: " + min);
    }
}