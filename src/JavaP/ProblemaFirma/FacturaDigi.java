package JavaP.ProblemaFirma;

public class FacturaDigi extends Factura {


    public FacturaDigi(int nrFactura, double sumaTotala) {
        super(nrFactura, sumaTotala);
    }

    @Override
    public String toString() {
        return "FacturaDigi cu: " + super.toString();
    }
}
