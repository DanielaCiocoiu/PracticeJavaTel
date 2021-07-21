package Animale;
//Sa se creeze clasa Pisica,cu atributul nume si constructor cu un parametru.
//        Clasa Pisica extinde clasa Animal si implementeaza interfata AnimalDeCompanie.
public class Pisica extends Animal implements AnimalDeCompanie {
    public String nume;

    public Pisica(String nume){
        super(4);
        this.nume = nume;
    }
    //Metoda mananca()va afisa “<x> mananca”,unde x este numele pisicii.La fel pentru seJoaca().Pisica are 4picioare.
    @Override
    public void mananca() {
        System.out.println(nume + " mananca");
    }

    @Override
    public String getNume() {

        System.out.println("Pisica " + nume + " merge agale.");
        return nume;
    }

    @Override
    public void seJoaca() {
        System.out.println("Pisica " + nume+ " are " + nrPicioare + " picioare");
    }
}
