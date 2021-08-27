package JavaP.ProblemaFirma;

public class FacturaEnel extends Factura{
    public FacturaEnel(int nrFactura, double sumaTotala) {
        super(nrFactura, sumaTotala);
    }

    @Override
    public String toString() {
         return "FacturaEnel cu: " + super.toString();
    }
}
