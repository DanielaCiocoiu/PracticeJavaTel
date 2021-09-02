package JavaP.ProblemaFirma;
/*
2. Client:
        - clasa ce mosteneste clasa Persoana si are ca atribute in plus: nrClient, listaFacturiPlatite (array de 5 elemente)
        - comportament platesteFactura(factura, platitDevreme)
        - cand un client realizeaza o plata prin apelul acestei metode se vor seta atributele corespunzatoare din factura ca fiind true,
        - de asemenea, se va adauga factura platita in listaFacturiPlatite
        - daca parametrul platitDevreme este true, atunci se va aplica un discount de 10% la totalul platit din factura.
*/

import java.util.Arrays;
import java.util.Objects;

public class Client extends Persoana implements AfisareFacturi, PlatesteFactura {

    private int nrClient;

    private Factura[] listaFacturiPlatite = new Factura[5];

    public Client(String nume, int varsta, String email, int nrClient) {
        super(nume, varsta, email);
        this.nrClient = nrClient;
    }

    @Override
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

    /*   Creati o interfata functionala - AfisareFacturi cu metoda afiseazaFactura().
       Implementati aceasta interfata in cadrul clasei Client.
       La apelul acestei metodei vor putea fi afisate doar un anumit tip de facturi (Digi/Enel/ApaNova).
   */

    @Override
    public Factura afiseazaFactura(Factura factura) {
        if (factura instanceof FacturaDigi) {
        } else if (factura instanceof FacturaEnel) {
        } else if (factura instanceof FacturaApaNova) {
        }
        return factura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return nrClient == client.nrClient && Arrays.equals(listaFacturiPlatite, client.listaFacturiPlatite);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nrClient);
        result = 31 * result + Arrays.hashCode(listaFacturiPlatite);
        return result;
    }

    @Override
    public String toString() {
        return "Clientul " +
                "cu nr: " + nrClient +
                //", listaFacturiPlatite: " + Arrays.toString(listaFacturiPlatite) +
                ", nume: '" + nume + '\'' +
                ", varsta: " + varsta +
                ", email: '" + email + '\'';
    }
}
