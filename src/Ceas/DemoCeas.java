package Ceas;

/*1. Sa se creeze o clasa Ceas cu urmatoarele atribute: ore, minute, secunde. Clasa va avea 3 constructori:

        - Unul fara parametri (initializeaza atributele astfel incat ora sa fie 12:0:0)
        - Unul cu 3 parametri (ore, minute, secunde)
        - Unul cu 1 parametru (secunde care vor fi transformate in ore minute si secunde pentru a
        initializa atributele)

        Clasa va defini urmatoarele metode:

        * adaugaCeas, va primi ca parametru un obiect de tip Ceas si va aduna orele, minutele si
        secundele instantei curente cu cele ale parametrului, returnand un obiect de tip Ceas
        in care se salveaza rezultatul adunarii
        * toString, metoda fara parametri care va afisa valorile atributelor instantei curente
        in formatul hh:mm:ss
        * adaugaSecunda, metoda fara parametri care adauga o secunda la secundele instantei curente
        (modificand si minutele si orele, daca este cazul)

        Folositi toate metodele si toti constructorii in metoda main a unei clase DemoCeas*/


public class DemoCeas {

    public static void main(String[] args) {

        Ceas ceasSecunde = new Ceas(4000);
        System.out.println("Ctor ceas secunde, instanta curenta: " + ceasSecunde);
        Ceas ceasCu3Parametri = new Ceas(1, 59, 59);
        System.out.println("Ctor ceas 3 parametri: " + ceasCu3Parametri);
        Ceas ceas2 = new Ceas();
        System.out.println("Ctor fara param: " + ceas2);


        System.out.println("Adunare ceas instanta curenta + ceasul primit ca parametru:  " + (ceasSecunde.adaugaCeas(ceasCu3Parametri)).toString());
        System.out.println("Instanta curenta:  " + ceasSecunde.toString());
        System.out.println("Ceasul primit ca parametru: " + ceasCu3Parametri.toString());


        System.out.println("Incrementez instanta curenta de 2 ori: ");
        for (int i = 0; i < 2; i++) {
            ceasSecunde.adaugaSecunda();
            System.out.println(ceasSecunde.toString());
        }


        System.out.println("Incrementez al doilea ceas de 2 ori: ");
        for (int i = 0; i < 2; i++) {
            ceasCu3Parametri.adaugaSecunda();
            System.out.println(ceasCu3Parametri.toString());
        }
    }
}
/*
- in metoda adaugaCeas - nu sunt sigur care e rolul liiilor 56-58. Cerinta spune sa adaugi 2 instante de Ceas
si sa returnezi o alta instanta. Prin aceste 3 linii tu modifici si una din iinstantele existente.

- in metoda adaugaSecunda() poti inlocui verificarile cu >= cu ==.

De asemenea, ca si observatie generala, foloseste this cand lucrezi cu atribute in cadrul metodelor dintr-o clasa.

Din restul exercitiilor mai sunt lucruri care nu ti-au fost clare sau mai au nevoie de lamuriri?*/
