package JavaP.DesignPattern.Registry;

import java.util.HashMap;
import java.util.Map;

public class Curs {

    public enum Materie{
        JAVA, PYTHON;
    }

    private Curs(){}


   private static Map<Materie, Curs> materieCursMapRegistry = new HashMap<>();

   public static Curs getInstance(Materie materie){
       if (!materieCursMapRegistry.containsKey(materie)){    // nu am, creez
           materieCursMapRegistry.put(materie, new Curs());
       }
          return materieCursMapRegistry.get(materie);   //am, returnez
   }

}
