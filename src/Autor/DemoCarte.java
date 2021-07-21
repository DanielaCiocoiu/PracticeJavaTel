/*5.Sa se creeze o clasa Autor cu atributele nume,prenume.Clasa va avea un constructor cu 2parametri
        (nume si prenume).Clasa va defini metoda getNumeComplet care va returna un String cu numele complet al autorului.
        Sa se creeze o clasa Carte cu atributele titlu,autor,pret.
        Clasa va avea un constructor cu 3parametri(titlu,autor,pret).
        Clasa va defini o metoda toString care returneze un String dupa urmatorul format:
        The Return of Sherlock Holmes,de Arthur Conan Doyle,pret 47.2RON
        Folositi metoda toString in metoda main a unei clase DemoCarte pentru a afisa detaliile acesteia.*/


package Autor;

import java.util.Arrays;

public class DemoCarte {

    public static void main(String[] args) {
//The Return of Sherlock Holmes,de Arthur Conan Doyle,pret 47.2RON
        Autor a = new Autor("Arthur", "Conan Doyle");
        Carte c = new Carte("The Return of Sherlock Holmes", a, 47.2);
        Carte[] carti = {c};

        for (Carte inFor : carti) {

            System.out.println(Arrays.toString(carti));

        }
    }
}
