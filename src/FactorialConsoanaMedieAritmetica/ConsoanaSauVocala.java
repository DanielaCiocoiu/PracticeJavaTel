package FactorialConsoanaMedieAritmetica;//Scrieti un program care sa determine si afiseze daca un caracter este vocala sau
// consoana (variabila in care va fi stocat caracterul va fi declarata si initializata la
// inceputul programului, cu o valoare aleasa de tine).

public class ConsoanaSauVocala {
    public static void main(String[] args) {
        char caracter = 'a';
        char caracter1 = 'b';
        verificCaracter(caracter);
        verificCaracter(caracter1);
        verificCaracter1(caracter);
        verificCaracter1(caracter1);
    }

    public static void verificCaracter(char caracter) {
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            System.out.println("Din If: Caracterul verificat este o vocala: ");
        } else {
            System.out.println("Din If: Caracterul verificat este o consoana: ");
        }
    }

    public static void verificCaracter1(char caracter) {
        switch (caracter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(caracter + " este vocala");
                break;
            default:
                System.out.println(caracter + " consoana");
        }
    }
}