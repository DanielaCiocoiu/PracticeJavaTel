package Animale;
/*Sa se creeze clasa abstracta Animal,cu atributul nrPicioare si un constructor cu parametrul nrPicioare.
Clasa Animal va  defini o metoda abstracta:mananca()si o metoda concreta merge(),care afiseaza “Animalul merge cu<x> picioare”,unde x este valoarea atributului nrPicioare.*/
public abstract class Animal {
    public int nrPicioare;

    public Animal(int nrPicioare) {
        this.nrPicioare = nrPicioare;
    }

    public Animal() {
    }

    abstract void mananca();
    public void merge(){
        System.out.println("Animalul merge cu " + nrPicioare + " picioare.");
    }
}
