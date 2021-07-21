package StranutException;

//Clasa Om va avea metodele:
public class Om {
    public String nume;

    public Om(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
//• aStranutat(String cuvant) care arunca StranutException daca valoarea cuvantului este “hapciu”
//Mesajul exceptiei va fi “<x> a stranutat”, unde x este numele instantei de Om

    public void aStranutat(String cuvant) {
        if (cuvant.equals("hapciu")) {
            try {
                throw new StranutException(this.nume + " a stranutat");
            } catch (StranutException e) {
                e.printStackTrace();
            }
        }
    }
/*      vorbeste(String[] cuvinte) care va afisa “<x> spune:”, unde x este numele instantei de Om
    Apoi pentru fiecare cuvant din array va apela metoda aStranutat() pentru a verifica daca omul a stranutat,
    iar daca nu, atunci va afisa cuvantul pe un rand separat. Daca a stranutat,
    se va afisa mesajul exceptiei. (“<x> a stranutat”)*/

    public void vorbeste(String[] cuvinte) throws StranutException {
        cuvinte = new String[]{"Buna", "ziua", "ce", "mai", "hapciu", "faceti"};
        System.out.println(this.nume + " spune: ");
        for (int i = 0; i < cuvinte.length; i++) {
            if (cuvinte[i].equals("hapciu")) {
                aStranutat("hapciu");
            } else {
                System.out.println(cuvinte[i] + '\n');
            }

        }
    }
}