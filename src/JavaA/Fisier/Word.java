package Ex2Fisier;

public class Word extends Fisier{

    public Word(){
        super("Word", ".word", 10);
    }

    public Word(String nume, int dimensiune){
        super(nume,".doc", dimensiune);
    }

    @Override
    public void salveaza(){

        if (super.verificaDimensiunea())
            System.out.printf("Fisierul Word \"%s%s\" a fost salvat\n", this.nume, this.extensie);

        //   sau -  System.out.println("Fisierul pdf: \"" + this.nume + this.extensie +  "\" a fost salvat");
    }
}
