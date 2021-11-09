package JavaP.DesignPattern.Factory;

public class FormaFactory {

    private FormaFactory() {

    }
    //returnez mereu instante noi spre deosebire de Registry unde am un nr fix de instante
    //static pt ca e o clasa utilitara, nu pot instantia

    public static Forma get(Forme forme) {
        switch (forme) {
            case CERC:
                return new Cerc();
            case DREPTUNGHI:
                return new Dreptunghi();
            default:
                throw new IllegalArgumentException();
        }

        //sau din Java 12

/*          return switch (forme){
            case CERC -> new Cerc();
            case DREPTUNGHI -> new Dreptunghi();
            default -> throw new IllegalArgumentException();
        };              */
    }

    public enum Forme {
        CERC, DREPTUNGHI;
    }
}
