package Animale;

public class Peste extends Animal implements AnimalDeCompanie{
    /*Sa se creeze clasa Peste,fara atribute,cu un constructor fara parametri.
Clasa Peste extinde clasa Animal si implementeaza interfata AnimalDeCompanie.Metoda getNume()va returna “un peste”.
Metoda mananca()va afisa “<x> mananca”,unde x este valoarea returnata de getNume().La fel pentru seJoaca().
Metoda merge va returna “Pestele inoata”.Pestele are 0picioare.*/
    public Peste() {
    }

    @Override
    public void mananca() {
        System.out.println(this.getNume() + " mananca.");
    }

    @Override
    public String getNume() {
        String nume = "Un peste";
        return nume;
    }

    @Override
    public void seJoaca() {
        System.out.println(this.getNume() + " se joaca.");
    }
    @Override
    public void merge(){
        System.out.println("Pestele inoata. Pestele are  " + this.nrPicioare + " picioare.");
    }

}
