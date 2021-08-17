package JavaA.Cinematograf;

import java.util.ArrayList;
import java.util.List;

public class Cinematograf {

    private static Cinematograf SINGLETON;

    List<Film> filme = new ArrayList<>();

    private Cinematograf() {

    }

    public static final Cinematograf getSingleton() {
        if (SINGLETON == null) {
            SINGLETON = new Cinematograf();
        }
        return SINGLETON;
    }

    public void addFilm(Film f) {
        filme.add(f);
    }

    public void afisareFilm() {
        for (Film f : filme) {
            System.out.println(f);
        }
    }

    public void afisareAnimatii() {
        for (Film f : filme) {
            if (f instanceof Animatii) {
                System.out.println(f);
            }
        }
    }

/*    public Film stergeFilm(String titlu) {
        int i = 0;
        for (Film film : filme) {
            if (film.getTitlu().equals(titlu)) {
                i = filme.indexOf(film);
            }
        }
        return filme.remove(i);
    }*/

    //varianta cu id

       /* public void stergeFilm(int id) {
        for (Film f : filme) {
            if (f.getId() == id) {
                filme.remove(f);
                System.out.println("Filmul cu id: " + " " + f.getId() + " " + "a fost sters1");
                nrFilmeExistente++;
                return;
            }
        }
        System.out.println("Filmul cautat nu exista!");
    }*/


     public void stergeFilm(int id) {
        for (Film f : filme) {
            if (f.getId() == id) {
                filme.remove(f);
                return;
            }
        }
        System.out.println("Filmul cautat nu exista!");
    }
}

