package ProblemaFirma;
/*
2. Client:
        - clasa ce mosteneste clasa Persoana si are ca atribute in plus: nrClient, listaFacturiPlatite (array de 5 elemente)
        - comportament platesteFactura(factura, platitDevreme)
        - cand un client realizeaza o plata prin apelul acestei metode se vor seta atributele corespunzatoare din factura ca fiind true,
        - de asemenea, se va adauga factura platita in listaFacturiPlatite
        - daca parametrul platitDevreme este true, atunci se va aplica un discount de 10% la totalul platit din factura.
*/

public class Client extends Persoana {
    public int nrClient;

    public Factura[] listaFacturiPlatite = new Factura[5];

    public Client(String nume, int varsta, String email, int nrClient) {
        super(nume, varsta, email);
        this.nrClient = nrClient;
    }

    public Factura platesteFactura(Factura factura, boolean platitDevreme) {
        factura.setPlatit(true);//initial pleaca de pe false si o setez pe true
        if (platitDevreme) {
            factura.setPlatitDevreme(true);
            double totalCurent = factura.getSumaTotala();
            factura.setSumaTotala(totalCurent * 0.90);
        }
        for (int i = 0; i < listaFacturiPlatite.length; i++) {
            if (listaFacturiPlatite[i] == null) {
                listaFacturiPlatite[i] = factura;
                break;
            }

        }

        return factura;

    }

}
