package ProblemaFirma;
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


import java.util.ArrayList;
import java.util.List;

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

        Client client = new Client("Ion", 56, "Ion@gmail.com", 1);
        Client client1 = new Client("Maia", 23, "Maia@gmail.com", 2);
        Client client2 = new Client("Maria", 34, "Maria@gmail.com", 3);
        Client client3 = new Client("Nicu", 56, "Nicu@gmail.com", 4);
        Client client4 = new Client("Irina", 67, "Irina@gmail.com", 5);

        // emiteti 5 facturi si platiti 3 dintre ele devreme si 2 la timp



        List<Angajat> afiseazaAngajati = new ArrayList<>();
        afiseazaAngajati.add(angajat);
        afiseazaAngajati.add(angajat1);
        afiseazaAngajati.add(angajat2);
        afiseazaAngajati.add(angajat3);

        for (Angajat angajatDeAfisat : afiseazaAngajati) {
            System.out.println(angajatDeAfisat);
        }

//        angajat.emiteFactura(100, 1);
//        angajat1.emiteFactura(50, 2);
//        angajat2.emiteFactura(12, 3);
//        angajat3.emiteFactura(34, 4);
//        angajat3.emiteFactura(56, 5);

        List<Factura> afiseazaFactura = new ArrayList<>();
        afiseazaFactura.add(angajat.emiteFactura(100, 1));
       afiseazaFactura.add(angajat1.emiteFactura(50, 2));
       afiseazaFactura.add(angajat2.emiteFactura(12, 3));
       afiseazaFactura.add(angajat3.emiteFactura(34, 4));
       afiseazaFactura.add(angajat3.emiteFactura(56, 5));
//        for (Factura facturaDeAfisat : afiseazaFactura) {
//            System.out.println(facturaDeAfisat);
//        }

        Factura.afiseazaToateFacturile();
    }
}
