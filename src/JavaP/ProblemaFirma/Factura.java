package JavaP.ProblemaFirma;

import java.util.ArrayList;
import java.util.Objects;

/*3. Factura:
        - clasa cu atributele: sumaTotala, nrFactura, platitDevreme, platit
        - metoda ce afiseaza datele tuturor facturilor ce au fost emise*/
public class Factura {

    static ArrayList<Factura> toateFacturile = new ArrayList<>();
    private int nrFactura;
    private static int _nrFactura = 1;
    private double sumaTotala;
    private boolean platitDevreme = false;
    private boolean platit = false;

    public Factura(int nrFactura, double sumaTotala) {
        this.nrFactura = Factura._nrFactura;
        this.sumaTotala = sumaTotala;
        Factura._nrFactura++;
    }

    public static ArrayList<Factura> getToateFacturile() {
        return toateFacturile;
    }

    public static void setToateFacturile(ArrayList<Factura> toateFacturile) {
        Factura.toateFacturile = toateFacturile;
    }

    public int getNrFactura() {
        return nrFactura;
    }

    public void setNrFactura(int nrFactura) {
        this.nrFactura = nrFactura;
    }

    public double getSumaTotala() {
        return sumaTotala;
    }

    public void setSumaTotala(double sumaTotala) {
        this.sumaTotala = sumaTotala;
    }

    public boolean isPlatitDevreme() {
        return platitDevreme;
    }

    public void setPlatitDevreme(boolean platitDevreme) {
        this.platitDevreme = platitDevreme;
    }

    public boolean isPlatit() {
        return platit;
    }

    public void setPlatit(boolean platit) {
        this.platit = platit;
    }

    public static void afiseazaToateFacturile() {
        toateFacturile.stream()
                .forEach(System.out::println);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return nrFactura == factura.nrFactura && Double.compare(factura.sumaTotala, sumaTotala) == 0 && platitDevreme == factura.platitDevreme && platit == factura.platit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrFactura, sumaTotala, platitDevreme, platit);
    }

    @Override
    public String toString() {
        return " factura cu " +
                "numarul: " + nrFactura +
                ", sumaTotala: " + sumaTotala +
                ", platit devreme: " + platitDevreme +
                ", platit: " + platit;
    }
}
