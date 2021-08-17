package Ex4Intrerupator;

/*Sa se creeze clasele Tv, Laptop, Boxa care mostenesc clasa Electronic.
In metoda main din clasa DemoOnOff, sa se creeze cate o instanta de Tv,
Laptop si Boxa si sa se porneasca si opreasca fiecare dintre ele,
        afisand mesaje corespunzatoare daca sunt deja pornite(on) sau oprite(off).*/

public class DemoOff {
    public static void main(String[] args) throws AlreadyOffException, AlreadyOnException {
        Electronic tv = new TV();
        //tv.turnOff();
        System.out.println(tv.toString());
        Boxa boxa = new Boxa();
        boxa.turnOff();
        System.out.println(boxa.toString());
        Electronic laptop = new Laptop();
        System.out.println(laptop.toString());

    }

}
 /*
       Aplicatie pentru un cinematograf

       Cinematograful ofera o lista de filme.
       Un film are precizate titlul sau si durata
    exprimata in minute.
       Filmele se impart in 2 categorii: drame si
    animatii. Dramele au specificata varsta minima
    a telespectatorilor.
        Cinematograful poate dubla filmele sale.
        Orice film care este dublat trebuie sa
    respecte o regula generala: trebuie sa specifice
    limba in care este dublat.
        In cazul nostru, doar animatiile sunt dublate.
    Ele au o metoda care ne specifica faptul ca dublarea
    se realizeaza in limba romana.

        Aplicatia lucreaza cu un singur cinematograf
    si are urmatoarele functionalitati:
    - adaugare film
    - afisare filme
    - afisare animatii

        Aplicatie primeste urmatoarele comenzi
    din consola:
    - adaugareDrama <titlul> <durata> <varsta>
    - adaugareAnimatie <titlul> <durata>
    - afisare
    - afisareAnimatii
    - exit: iesire din aplicatie
       */

/*
Într-o instituție se oferă două tipuri de cursuri: cursuri de programare și cursuri de limbi străine.
        Orice curs are un id, o denumire și un preț. Id-ul este un număr care corespunde numărului de ordine al
        cursului adăugat.
        Instituția poate oferi maxim 30 de cursuri (de programare și de limbi straine)
        și are următoarele
        comportamente:
        - adaugăCurs – care adaugă un nou curs în oferta de cursuri
        (daca mai exista spatiu, în caz contrar
        se va arunca o excepție de tipul PreaMulteCursuriException
        – definită de programator);
        - afișeazăCursuri – afișează toată oferta de cursuri disponibile
        (cu toate detaliile acestora);
        - afișeazăCursuriProgramare – afișeaza doar cursurile de programare
        disponibile (cu toate
        caracteristicile acestora);
        - stergeCurs – sterge un curs identificat prin id-ul primit ca parametru.
        Aplicația primește următoarele comenzi din consolă și lucrează cu o singură instituție:
        - exit – închide aplicația; (0.5p)
        - adauga_curs <tip> <denumire> <preț> - adaugă un curs de tipul corespunzător în oferta
        instituției; (1p)
        - afișare – afișează toate cursurile din instituție; (2p)
        - afisare_cursuri_programare – afișează toate cursurile de programare disponibile; (1p)
        - șterge_curs <id_curs> - sterge cursul al cărui id este trimis ca parametru. (1p)
        - În background va rula un fir de execuție care va afișa numărul total de cursuri. Acest thread se
        va actualiza o dată la 2 minute. (1.5p)
        Observații:
        1. Clasele vor respecta principiul de encapsulare. Realizarea corectă a arhitecturii claselor (3 p)
        2. Se va folosi Singleton Pattern acolo unde este necesar.
        3. Se vor folosi stream-uri și expresii lambda oriunde este posibil.(în funcțiile de afișare, precum
        și în realizarea firului de execuție)*/
