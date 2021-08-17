package JavaA.Cursuri;

import java.util.ArrayList;
import java.util.List;

/*Într-o instituție se oferă două tipuri de cursuri: cursuri de programare și cursuri de limbi străine.
        Orice curs are un id, o denumire și un preț. Id-ul este un număr care corespunde numărului de ordine al
        cursului adăugat.
        Instituția poate oferi maxim 30 de cursuri (de programare și de limbi straine)
        și are următoarele
        comportamente:
        - adaugăCurs – care adaugă un nou curs în oferta de cursuri (daca mai exista spatiu, în caz contrar
        se va arunca o excepție de tipul PreaMulteCursuriException – definită de programator);
        - afișeazăCursuri – afișează toată oferta de cursuri disponibile (cu toate detaliile acestora);
        - afișeazăCursuriProgramare – afișeaza doar cursurile de programare  disponibile (cu toate
        caracteristicile acestora);
        - stergeCurs – sterge un curs identificat prin id-ul primit ca parametru.
  */
public class Institutie {

    public static int nrCursuriExistente = 0;
    private static Institutie SINGLETON;
    List<Curs> cursuri = new ArrayList<>();

    private int cursuriCreate = 0;

    private Institutie() {

    }

    public static final Institutie getSingleton() {
        if (SINGLETON == null) {
            SINGLETON = new Institutie();
        }
        return SINGLETON;
    }
/*        - adaugăCurs – care adaugă un nou curs în oferta de cursuri (daca mai exista spatiu, în caz contrar
            se va arunca o excepție de tipul PreaMulteCursuriException – definită de programator);*/

    public void adaugăCurs(char tip, int id, String denumire, int pret) throws PreaMulteCursuriException {
        if (cursuri.size() == 30) {
            try {
                throw new PreaMulteCursuriException("Prea multe cursuri!");
            } catch (PreaMulteCursuriException e) {
                e.printStackTrace();

            }

        } else {
            if (tip == 'P') {
                cursuri.add(new CursProgramare(1, "Java", 1000));
            } else if (tip == 'L') {
                cursuri.add(new CursLimbaStraina(1, "Engleza", 1000));
            }
            cursuriCreate++;
            nrCursuriExistente++;
        }
    }

    /* - afișeazăCursuri – afișează toată oferta de cursuri disponibile (cu toate detaliile acestora);
       - afișeazăCursuriProgramare – afișeaza doar cursurile de programare  disponibile (cu toate
         caracteristicile acestora);*/

    public void afisareCursuri() {
        if (cursuri.size() == 0) {
            System.out.println("Nu avem cursuri in acest moment!");
        }
        cursuri.forEach(System.out::println);
        //cursuri.stream().forEach(curs -> System.out.println(cursuri));
    }


    public void afisareCursuriDeProgramare() {
        for (Curs c : cursuri) {
            if (c instanceof CursProgramare) {
                System.out.println(c);
                System.out.println("Afisez cursurile de Programare");
            } else {
                System.out.println("Momentan nu avem cursuri de programare");
            }
        }
    }

    public void stergeCurs(int id) {
        for (Curs c : cursuri) {
            if (c.getId() == id) {
                cursuri.remove(c);
                System.out.println("A fost sters cursul: " + c.getId());
                nrCursuriExistente--;
                return;
            }
        }
        System.out.println("Cursul cautat nu exista!");

    }
}

