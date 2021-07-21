package Animale;

/*
4.Sa se creeze clasa abstracta Animal,cu atributul nrPicioare si un constructor cu parametrul nrPicioare. Clasa Animal va
defini o metoda abstracta:mananca()si o metoda concreta merge(),care afiseaza “Animalul merge cu<x> picioare”,unde x este valoarea atributului nrPicioare.
Sa se creeze interfata AnimalDeCompanie cu metodele abstracte getNume()returneaza String,si seJoaca()returneaza void.
Sa se creeze clasa Pisica,cu atributul nume si constructor cu un parametru.
Clasa Pisica extinde clasa Animal si implementeaza interfata AnimalDeCompanie.
Metoda mananca()va afisa “<x> mananca”,unde x este numele pisicii.La fel pentru seJoaca().Pisica are 4picioare.
Sa se creeze clasa Peste,fara atribute,cu un constructor fara parametri.
Clasa Peste extinde clasa Animal si implementeaza interfata AnimalDeCompanie.Metoda getNume()va returna “un peste”.
Metoda mananca()va afisa “<x> mananca”,unde x este valoarea returnata de getNume().La fel pentru seJoaca().
Metoda merge va returna “Pestele inoata”.Pestele are 0picioare.
Sa se creeze clasa Paianjen,fara atribute,cu un constructor fara parametri.
Clasa Paianjen extinde clasa Animal.Metoda mananca()va afisa “Paianjenul mananca”.

In metoda main din clasa DemoAnimale sa se creeze instante pentru fiecare animal si sa se apeleze metodele
disponibile, pentru a afisa cum mananca,merg si se joaca animalele.
*/
class DemoAnimale {
    public static void main(String[] args) {
        Pisica pisica = new Pisica("Nemo");
        pisica.mananca();
        pisica.getNume();
        pisica.seJoaca();


        Peste peste = new Peste();
        peste.getNume();
        peste.mananca();
        peste.seJoaca();
        peste.merge();
        Paianjen paianjen = new Paianjen();
        paianjen.mananca();
    }


}





