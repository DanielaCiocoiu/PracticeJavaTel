package TemperaturaNonStatic;/*2. Sa se creeze o clasa Temperatura cu atributele temperaturaActuala si temperaturaMaxima.
In metoda main dintr-o clasa DemoTemperatura setati temperaturaMaxima pentru o  locuinta,
apoi instantiati mai multe obiecte temperaturaDormitor, temperaturaBucatarie, temperaturaSufragerie,
temperaturaBaie pe care le salvati intr-un array.
Apoi, parcurgeti array-ul si afisati un mesaj de tip “Alerta!
        Temperatura prea mare in …
        " (… = dormitor/baie etc.), daca temperaturaActuala este mai mare sau egala cu temperaturaMaxima*/

import org.junit.rules.TemporaryFolder;

import java.util.Arrays;
import java.util.Calendar;

class DemoTemperatura {

    public static void main(String[] args) {
        int temperaturaMaxima = 30;

        Temperatura temperaturaDormitor = new Temperatura(15, "Dormitor");
        Temperatura temperaturaBucatarie = new Temperatura(35, "Bucatarie");
        Temperatura temperaturaSufragerie = new Temperatura(30, "Sufragerie");
        Temperatura temperaturaBaie = new Temperatura(20, "Baie");
        Temperatura[] temp = {temperaturaDormitor, temperaturaBucatarie, temperaturaSufragerie, temperaturaBaie};

        for (Temperatura temperatura : temp) {
            if (temperatura.ePreaCald(temperaturaMaxima)) {
                System.out.println("DANGER pentru incaperea " + temperatura.camera);
            } else {
                System.out.println("ok: " + temperatura.getTemperaturaActuala() +" " + temperatura.camera);
            }
        }

    }
}





