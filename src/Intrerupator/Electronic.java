package Ex4Intrerupator;

/*a se creeze clasa Electronic care implementeaza interfata IntrerupatorOnOff,
are atributul boolean on si constructorul fara parametri atribuie valoarea false atributului on.
 Pentru a afisa tipul obiectului electronic, suprascrieti metoda toString() din fiecare clasa.*/
public class Electronic implements IntrerupatorOnOff {

    public boolean on;

    public Electronic() {
        this.on = false;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


    /*    Metoda turnOff va verifica valoarea lui on: daca este true, ii va atribui valoarea false si
        va afisa mesajul “Am oprit<x>”  (x va fi tipul obiectului electronic), iar daca este false,
        va arunca AlreadyOffException.*/
    @Override
    public void turnOff() throws AlreadyOffException {
        if (on) {
            on = false;
            System.out.println("" + this.toString());
        } else {
            try {
                throw new AlreadyOffException("Lumina este deja oprita");
            } catch (AlreadyOffException e) {
                e.printStackTrace();

            }
        }

    }

    /*    Metoda turnOn va verifica valoarea lui on: daca este false, ii va atribui valoarea true si
        va afisa mesajul “Am pornit <x>”  (x va fi tipul obiectului electronic), iar daca este true,
        va arunca AlreadyOnException.*/
    @Override
    public void turnOn() throws AlreadyOnException {
        if (!on) {
            on = true;
            System.out.println(" " + this.toString());

        } else {
            try {
                throw new AlreadyOnException("(Electronic) Lumina este deja pornita");
            } catch (AlreadyOnException e) {
                e.printStackTrace();

            }
        }
    }

    @Override
    public String toString() {
        return "Am pornit: " ;
    }
}
