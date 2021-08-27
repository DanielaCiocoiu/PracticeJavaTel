package JavaP.ProblemaFirma;

public class FacturaApaNova extends Factura{
    public FacturaApaNova(int nrFactura, double sumaTotala) {
        super(nrFactura, sumaTotala);
    }

    @Override
    public String toString() {
        return "FacturaApaNova cu: " + super.toString();
    }
}
