package JavaA.Cursuri;

import java.util.Scanner;
/*    Aplicația primește următoarele comenzi din consolă și lucrează cu o singură instituție:
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

public class DemoCurs {
    public static void main(String[] args) {

        System.out.println("Introduceti comanda:");
        System.out.println("AFISARE");
        System.out.println("AFISARE_CURS_PROGRAMARE");
        System.out.println("ADAUGARE_CURS L 1 ENGLEZA 3  sau ADAUGARE_CURS P 1 JAVA 3");
        System.out.println("STERGERE_CURS");

        Scanner s = new Scanner(System.in);
        Institutie institutie = Institutie.getSingleton();
        while (true) {

       /*     ThreadPeriodic t = new ThreadPeriodic();
            t.start();*/

            String citire = s.nextLine();
            String[] stringSplit = citire.split(" ");

            if (stringSplit[0].equals("EXIT")) {
                System.exit(0);
            }
            if (stringSplit[0].equals("ADAUGARE_CURS")) {
                // String tip = stringSplit[1];
                int id = 0;
                try {
                    id = Integer.parseInt(stringSplit[2]);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

                String denumire = stringSplit[3];
                int pret = 0;
                try {
                    pret = Integer.parseInt(stringSplit[4]);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

                if ("P".equals(stringSplit[1])) {

                    try {
                        institutie.adaugăCurs('P', id, denumire, pret);
                    } catch (PreaMulteCursuriException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Am adaugat un curs de Programare");

                } else if ("L".equals(stringSplit[1])) {
                    try {
                        institutie.adaugăCurs('L', id, denumire, pret);
                    } catch (PreaMulteCursuriException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Am adaugat un curs de Engleza");
                }

            }
            if (stringSplit[0].equals("AFISARE")) {
                institutie.afisareCursuri();
            }
            if (stringSplit[0].equals("AFISARE_CURS_PROGRAMARE")) {
                institutie.afisareCursuriDeProgramare();
            }
            if (stringSplit[0].equals("STERGERE_CURS")) {
                institutie.stergeCurs(Integer.parseInt(s.next()));
            }
        }
    }
}