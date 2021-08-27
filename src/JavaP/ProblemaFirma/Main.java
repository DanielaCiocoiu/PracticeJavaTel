package JavaP.ProblemaFirma;
/*
Implementati urmatoarele clase:
1. Persoana:
    - clasa abstracta cu atributele: nume, email, varsta
2. Client:
    - clasa ce mosteneste clasa Persoana si are ca atribute in plus: nrClient, listaFacturiPlatite (array de 5 elemente)
    - comportament platesteFactura(factura, platitDevreme)
                 - cand un client realizeaza o plata prin apelul acestei metode se vor seta atributele corespunzatoare din factura ca fiind true,
                 - de asemenea, se va adauga factura platita in listaFacturiPlatite
                 - daca parametrul platitDevreme este true, atunci se va aplica un discount de 10% la totalul platit din factura.


3. Angajat - va implementa Builder Design Pattern
- clasa ce mosteneste clasa Persoana si are atribut in plus: nrAngajat
- comportament - emiteFactura - returneaza o instanta a clasei Factura

3. Factura:
- clasa cu atributele: sumaTotala, nrFactura, platitDevreme, platit
- metoda ce afiseaza datele tuturor facturilor ce au fost emise

4, 5. FacturaEnel, FacturaDigi

6. Firma - adresa, array angajati - SingletonPattern
- metoda angajeaza care adauga o instanta de Angajat in array-ul de angajati doar daca el nu exista deja in firma

Pentru toate clasele definiti atributele ca fiind private si realizat incapsularea acestora.

Definiti o clasa DemoFirma in cadrul careia sa:
- creati 3 instante ale clasei Angajat
- creati 5 instante ale clasei Client
- emiteti 5 facturi si platiti 3 dintre ele devreme si 2 la timp.
- afisati toate instantele de factura ce au fost emise

! Atentie - pentru indeplinirea cerintelor sunt necesare si alte elemente adaugate in cadrul claselor, pe langa cele enumerate mai sus
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Angajat angajat = new Angajat.Builder()
                .setNrAngajat(1)
                .setNume("Maia")
                .setVarsta(18)
                .setEmail("Maia@gmail.com")
                .build();
        Angajat angajat1 = new Angajat.Builder()
                .setNrAngajat(2)
                .setNume("Mircea")
                .setVarsta(28)
                .setEmail("Mircea@gmail.com")
                .build();
        Angajat angajat2 = new Angajat.Builder()
                .setNrAngajat(3)
                .setNume("Ion")
                .setVarsta(23)
                .setEmail("Ion@gmail.com")
                .build();
        Angajat angajat3 = new Angajat.Builder()
                .setNrAngajat(3)
                .setNume("Ion")
                .setVarsta(23)
                .setEmail("Ion@gmail.com")
                .build();

        System.out.println("************************* Lista angajati: *************************");
        Firma firmaSingleton = Firma.getInstance();
        firmaSingleton.angajeaza(angajat);
        firmaSingleton.angajeaza(angajat1);
        firmaSingleton.angajeaza(angajat2);
        firmaSingleton.angajeaza(angajat3);

        firmaSingleton.getAngajati().stream()
                .forEach(System.out::println);

        List<Client> clients = new ArrayList<>();
        Client client = new Client("Ion", 56, "Ion@gmail.com", 1);
        Client client1 = new Client("Maia", 23, "Maia@gmail.com", 2);
        Client client2 = new Client("Maria", 34, "Maria@gmail.com", 3);
        Client client3 = new Client("Nicu", 56, "Nicu@gmail.com", 4);
        Client client4 = new Client("Irina", 67, "Irina@gmail.com", 5);
        clients.add(client);
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);

        List<Factura> list = new ArrayList<>();
        Factura factura1 = new FacturaDigi(1, 100);
        Factura factura2 = new FacturaEnel(2, 200);
        Factura factura3 = new FacturaApaNova(3, 300);
        Factura factura4 = new FacturaApaNova(4, 400);
        Factura factura5 = new FacturaApaNova(5, 500);
        Factura factura6 = new FacturaApaNova(5, 500);
        list.add(factura1);
        list.add(factura2);
        list.add(factura3);
        list.add(factura4);
        list.add(factura5);
        list.add(factura6);

        System.out.println("************************* Afiseaza toate facturile fara discount din lista: *************************");
        Factura.afiseazaToateFacturile();

        // emiteti 5 facturi si platiti 3 dintre ele devreme si 2 la timp
        System.out.println("************************* Lista angajati si facturile emise fara discount din map: ************************* ");
        Map<Angajat, Factura> f = new HashMap<>();
        f.put(angajat, angajat.emiteFactura(factura1));
        f.put(angajat1, angajat1.emiteFactura(factura2));
        f.put(angajat2, angajat2.emiteFactura(factura3));
        f.put(angajat, angajat.emiteFactura(factura4));
        f.put(angajat2, angajat2.emiteFactura(factura5));
        f.put(angajat1, angajat2.emiteFactura(factura6));
        f.forEach((k,v) -> System.out.println(k + ", a emis " + v));

            // afisati toate instantele de factura ce au fost emise

        Map<Client, Factura> clientFacturaMap = new LinkedHashMap<>();
        System.out.println("************************* Lista clienti  si facturi: **********************");
       clientFacturaMap.put(client, client.platesteFactura(list.get(0),  true));
        clientFacturaMap.put(client1, client1.platesteFactura(list.get(1), true));
        clientFacturaMap.put(client2, client2.platesteFactura(list.get(2), false));
        clientFacturaMap.put(client3, client3.platesteFactura(list.get(3), false));
        clientFacturaMap.put(client4, client4.platesteFactura(list.get(4), false));

        clientFacturaMap.forEach((k,v) -> System.out.println(k + ", a platit " + v));



              /*  List<Factura> afiseazaClienti = new ArrayList<>();
        client.platesteFactura(factura.get(0), true);
        client1.platesteFactura(factura.get(1),true );
        client2.platesteFactura(factura.get(2),false );
        client3.platesteFactura(factura.get(3),false );
        client4.platesteFactura(factura.get(4),false );
        afiseazaClienti.addAll(factura);
        System.out.println("*********** Lista facturi cu discount: ");
        afiseazaClienti.stream()
                .forEach(System.out::println);*/
    }

}