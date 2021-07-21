package AnBisect;

public class AnBisect {
    /*    1. Scrieti un program care sa determine si afiseze daca un an este bisect
    (variabila in care va fi stocat anul va fi declarata si initializata la inceputul programului, cu o valoare aleasa de voi)
        Aici o sa te rog sa tii cont de regulile care determina un an bisect/nebisect:
        Un an bisect se divide cu 4 (se împarte fără rest la 4)
        Însă dacă se divide cu 100 atunci nu e an bisect
        Însă dacă se divide cu 400, atunci e an bisect*/
    public static void main(String[] args) {
        int an = 2024;
        System.out.println("2024 este an bisect: " + anBisect(an));
        int an1 = 1700;
        System.out.println("2021 nu este an bisect: " + anBisect(an1));
        int an2 = 2012;
        System.out.println("2020 este an bisect: " + anBisect(an2));
        int an3 = 1900;
        System.out.println("1700 este an bisect: " + anBisect(an3));
        int an4 = 2100;
        System.out.println("2100 este an bisect: " + anBisect(an4));
    }

    public static boolean anBisect(int an) {

        if (an % 4 == 0 && an % 100 != 0 || an % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

