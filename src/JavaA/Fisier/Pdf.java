package Ex2Fisier;

public class Pdf extends Fisier {

    public Pdf(){
        super("Pdf",".pdf",10);
    }
    public Pdf(String nume, int dimensiune){
        super(nume, ".pdf", dimensiune);
    }

    @Override
    public void salveaza(){

   if (super.verificaDimensiunea())
       System.out.printf("Fisierul Pdf \"%s%s\" a fost salvat\n", this.nume, this.extensie);

    //   sau -  System.out.println("Fisierul pdf: \"" + this.nume + this.extensie +  "\" a fost salvat");
    }

}
