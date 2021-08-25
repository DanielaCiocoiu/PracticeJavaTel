package JavaA.Cinematograf;

import JavaP.ProblemaFirma.Factura;

public class FacturaDigi extends Factura {

    public FacturaDigi(int nrFactura, double sumaTotala) {
        super(nrFactura, sumaTotala);
    }

    @Override
    public String toString() {
        return "FacturaDigi{}";
    }
}
