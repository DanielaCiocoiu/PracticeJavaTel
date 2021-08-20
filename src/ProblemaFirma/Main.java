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


public class Main {
}
