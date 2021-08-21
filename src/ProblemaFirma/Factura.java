package ProblemaFirma;
import java.util.ArrayList;
/*3. Factura:
        - clasa cu atributele: sumaTotala, nrFactura, platitDevreme, platit
        - metoda ce afiseaza datele tuturor facturilor ce au fost emise*/
public class Factura {

    static ArrayList<Factura> toateFacturile = new ArrayList<>();
    private double sumaTotala;
    private int nrFactura;
    private boolean platitDevreme = false;
    private boolean platit = false;

    public Factura(int nrFactura, double sumaTotala) {
        this.nrFactura = nrFactura;
        this.sumaTotala = sumaTotala;

    }

    public static ArrayList<Factura> getToateFacturile() {
        return toateFacturile;
    }

    public static void setToateFacturile(ArrayList<Factura> toateFacturile) {
        Factura.toateFacturile = toateFacturile;
    }

    public double getSumaTotala() {
        return sumaTotala;
    }

    public void setSumaTotala(double sumaTotala) {
        this.sumaTotala = sumaTotala;
    }

    public int getNrFactura() {
        return nrFactura;
    }

    public void setNrFactura(int nrFactura) {
        this.nrFactura = nrFactura;
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
    public String toString() {
        return "Factura{" +
                "sumaTotala=" + sumaTotala +
                ", nrFactura=" + nrFactura +
                ", platitDevreme=" + platitDevreme +
                ", platit=" + platit +
                '}';
    }
}
