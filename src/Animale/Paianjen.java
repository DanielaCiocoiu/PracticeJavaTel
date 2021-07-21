package Animale;

public class Paianjen extends Animal{
      /*  Sa se creeze clasa Paianjen,fara atribute,cu un constructor fara parametri.
    Clasa Paianjen extinde clasa Animal.Metoda mananca()va afisa “Paianjenul mananca”.*/

    public Paianjen() {
    }

    @Override
    void mananca() {
        System.out.println("Paianjenul mananca");
    }
}
