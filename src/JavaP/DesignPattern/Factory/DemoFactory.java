package JavaP.DesignPattern.Factory;

public class DemoFactory {

    public static void main(String[] args) {
        // pot folosi Factory pe facturile din ProblemaFirma ...factDigi...


        Forma forma  = FormaFactory.get(FormaFactory.Forme.CERC);
        //sau
        Dreptunghi dreptunghi = (Dreptunghi) FormaFactory.get(FormaFactory.Forme.DREPTUNGHI);

        forma.deseneaza();
        dreptunghi.deseneaza();


    }

}
